import org.junit.Assert;
import org.junit.Test;

import java.util.regex.Pattern;

public class GiftigerRegex {

    @Test
    public void testRegexJDK8Only() {
        final Pattern pattern = Pattern.compile("(0*)*1");
        Assert.assertFalse(pattern.matcher("0000000000000000000000000000000000000000").matches());
    }

    @Test
    public void testRegexAnyJDK() {
        final Pattern pattern = Pattern.compile("([A-Za-z,.!?]+( |\\-|\\')?){1,10}");
        Assert.assertFalse(pattern.matcher("scUojcUOWpBImlSBLxoCTfWxGPvaNhczGpvxsiqagxdHPNTTeqkoOeL3FlxKROMrMzJDf7rvgvSc72kQ").matches());
    }
}
