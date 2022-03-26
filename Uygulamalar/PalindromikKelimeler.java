


public class PalindromikKelimeler {

    static boolean isPalindrome(String str) {
        int i = 0; //Başlangıç için index nuamrası
        int j = str.length() - 1; // index numarası olduğu için 1 eksiği
        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    //2. yol
    static boolean isPalindrome2(String str) {
        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) { //kelimenin tersini elde ettik bu şekilde
            reverse += str.charAt(i);
        }
        return str.equals(reverse);

    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("kayak"));
        System.out.println(isPalindrome2("kayak"));



    }
}
