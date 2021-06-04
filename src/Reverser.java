public class Reverser {

    public static char[] reverse(char[] str) {

        for(int i=0; i<str.length/2; i ++) {

            char temp = str[i];
            str[i] = str[(str.length - 1) - i];
            str[(str.length - 1) - i] = temp;

        }
        return str;
    }

    public static void main(String[] args) {

        System.out.println("\"hello\" = " + new String(reverse("hello".toCharArray())));
        System.out.println("\"Bye\" = " + new String(reverse("BYE".toCharArray() )));
        System.out.println("\"WORD\" = " + new String(reverse("WORD".toCharArray() )));
        System.out.println("\"W\" = " + new String(reverse("W".toCharArray() )));
        System.out.println("\"123456\" = " + new String(reverse("123456".toCharArray() )));
        System.out.println("\"12345\" = " + new String(reverse("12345".toCharArray() )));
        System.out.println("\"123456789\" = " + new String(reverse("123456789".toCharArray() )));
        System.out.println("\"12345678\" = " + new String(reverse("12345678".toCharArray() )));
        System.out.println("\"0\" = " + new String(reverse("0".toCharArray() )));
        System.out.println("\"\" = " + new String(reverse("".toCharArray() )));
    }
}
