package Translate;

import com.rmtheis.yandtran.detect.Detect;
import com.rmtheis.yandtran.language.Language;
import com.rmtheis.yandtran.translate.Translate;


public class test {
    public static void main(String[] args) throws Exception {
        Translate.setKey("<also snip>");

        String translatedText = Translate.execute("watashi wa potato desu", Language.ENGLISH, Language.JAPANESE);
        Language DetectedLang = Detect.execute("わたしはポテトです");

        System.out.println(translatedText);
        System.out.print(DetectedLang.toString());
    }
}