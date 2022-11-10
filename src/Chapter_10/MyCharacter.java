package Chapter_10;

public class MyCharacter {

        private char ch;

        public MyCharacter(char ch) {
            this.ch = ch;
        }

        public char charValue() {
            return ch;
        }

        public static MyCharacter valueOf(char ch) {
            return new MyCharacter(ch);
        }

        public static int compare(char x, char y) {
            return x - y;
        }

        public int compareTo(MyCharacter c) {
            return charValue() - c.charValue();
        }

        public boolean equals(MyCharacter c) {
            return (compareTo(c) == 0);
        }


        public static boolean isLetter(char ch) {
            return ('A' <= ch && ch <= 'Z') || ('a' <= ch && ch <= 'z');
        }

        public static boolean isDigit(char ch) {
            return ('0' <= ch && ch <= '9');
        }

        public static boolean isLetterOrDigit(char ch){
            return isLetter(ch) || isDigit(ch);
        }

        public static char toUpperCase(char ch) {
            if (isLetter(ch)) {
                return (char) (ch - 32);
            } else
                return ch;
        }

        public static char toLowerCase(char ch) {
            if (isLetter(ch)) {
                return (char) (ch + 32);
            } else
                return ch;
        }

        public static boolean isLowerCase(char ch) {
            return ('a' <= ch && ch <= 'z');
        }

        public static boolean isUpperCase(char ch) {
            return ('A' <= ch && ch <= 'Z');
        }

    public static void main(String[] args) {
        MyCharacter a = new MyCharacter('a');
        MyCharacter b = MyCharacter.valueOf('z');

        System.out.println(MyCharacter.compare('z', 'a'));
        System.out.println(MyCharacter.compare('a', 'a'));
        System.out.println(MyCharacter.compare('a', 'z'));
        System.out.println(a.compareTo(b));
        System.out.println(a.equals(new MyCharacter('a')));
        System.out.println(a.equals(b));
        System.out.println(MyCharacter.isDigit('a'));
        System.out.println(MyCharacter.isDigit('0'));
        System.out.println(MyCharacter.isLetter('a'));
        System.out.println(MyCharacter.isDigit('0'));
    }
}
