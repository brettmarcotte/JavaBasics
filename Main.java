public class Main {
    public class PerValueOrSum {
        public static boolean makesTen(int a, int b) {
            if(a + b == 10 || a == 10 || b == 10){
                return true;
            }
            return false;
        }
    }
    public class Challenge {
        public static int numberSyllables(String word) {
            int count = 1;
            for(int i = 0; i < word.length();i++){
                if(word.charAt(i) == '-') count++;
            }
            return count;
        }
    }
    public class Challenge {
        public static boolean match(String str1, String str2) {
            return str1.equalsIgnoreCase(str2);
        }
    }
    public class Challenge {
        public static String hackerSpeak(String str) {
            return str
                    .replace('a','4')
                    .replace('e','3')
                    .replace('i','1')
                    .replace('o','0')
                    .replace('s','5');
        }
    }

}
