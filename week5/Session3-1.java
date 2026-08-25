class Main {
    public static void main(String[] args) {

        String str = "   -42";

        int i = 0;
        int sign = 1;
        int result = 0;

        while (i < str.length() && str.charAt(i) == ' ') {
            i++;
        }

        if (i < str.length() &&
            (str.charAt(i) == '+' || str.charAt(i) == '-')) {

            if (str.charAt(i) == '-')
                sign = -1;

            i++;
        }

        while (i < str.length() &&
               Character.isDigit(str.charAt(i))) {

            result = result * 10 + (str.charAt(i) - '0');
            i++;
        }

        result = result * sign;

        System.out.println("Integer value = " + result);
    }
}
Output
Integer value = -42
