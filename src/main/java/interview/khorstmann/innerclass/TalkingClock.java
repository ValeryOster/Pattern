package interview.khorstmann.innerclass;

import com.profesorfalken.jpowershell.PowerShell;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class TalkingClock {
    private int interval;
    private boolean beep;

    public TalkingClock(int interval, boolean beep) {
        this.interval = interval;
        this.beep = beep;
    }

    public void start() {
        ActionListener listener = new TimePrinter();
        Timer t = new Timer(interval, listener);
        t.start();
    }

    public class TimePrinter implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            if (beep) {
                try {
                    sayIt(getSystemTime());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        private void sayIt(String systemTime) throws IOException {
            String command = "PowerShell -Command \"Add-Type –AssemblyName System.Speech; (New-Object" +
                    " System.Speech.Synthesis.SpeechSynthesizer).Speak('" + systemTime + "');\"";


            System.out.println("Ausgabe: "+ PowerShell.executeSingleCommand(command).getCommandOutput());
            System.out.println("Ausgabe: " + systemTime);
        }

        private String getSystemTime() {
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm");
            LocalDateTime now = LocalDateTime.now();
            return dtf.format(now);
        }
    }
}
