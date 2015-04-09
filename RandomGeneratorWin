//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

import java.util.GregorianCalendar;
import java.util.Random;

public class RandomGeneratorWin {
    public RandomGeneratorWin() {
    }

    public static String generateRandomString(int length, RandomGeneratorWin mode) {
        StringBuilder buffer = new StringBuilder();
        String characters = "";
        switch(RandomGeneratorWin.$SwitchMap$RandomGeneratorWin$Mode[mode.ordinal()]) {
        case 1:
            characters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
            break;
        case 2:
            characters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
            break;
        case 3:
            characters = "1234567890";
        }

        int charactersLength = characters.length();

        for(int i = 0; i < length; ++i) {
            double index = Math.random() * (double)charactersLength;
            buffer.append(characters.charAt((int)index));
        }

        return buffer.toString();
    }

    public static String generateRandomDOB() {
        GregorianCalendar gc = new GregorianCalendar();
        int year = randBetween(1900, 2010);
        gc.set(1, year);
        int dayOfYear = randBetween(1, gc.getActualMaximum(6));
        gc.set(6, dayOfYear);
        return gc.get(1) + "-" + gc.get(2) + "-" + gc.get(5);
    }

    public static int randBetween(int start, int end) {
        return start + (int)Math.round(Math.random() * (double)(end - start));
    }

    public static String generateRandomGender() {
        int randNum = (int)(Math.random() * 2.0D);
        return randNum == 0?"M":"F";
    }

    public static int generateRandomNum(int min, int max) {
        Random randy = new Random();
        return randy.nextInt(max - min) + 1;
    }

    public static enum Mode {
        ALPHA,
        ALPHANUMERIC,
        NUMERIC;

        private Mode() {
        }
    }
}
