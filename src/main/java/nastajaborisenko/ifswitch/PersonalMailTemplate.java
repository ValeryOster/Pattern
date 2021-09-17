package nastajaborisenko.ifswitch;

public class PersonalMailTemplate implements MailTemplate{

    @Override
    public String getTemplate() {
        return "That is personal";
    }
}
