package strings;

public class StringOperations {
    public static void main(String[] args) {
//        reverseString("Hello World");
//        System.out.println(isPalindrome("ABDBA"));

        String s1 = "Meet";
        String s2 = "Meet";
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
        String s3 = "Meet";
        String s4 = new String(s3);
        System.out.println(s3 == s4);
        System.out.println(s3.equals(s4));

        boolean isMatch = s1.matches("[a-zA-Z]]+"); //matches the string with regular expression
        System.out.println(isMatch);

        s1.regionMatches(
                true, // ignore case
                2, // offset(starting point) of s1
                "MET", //second string
                0, // offset(starting point) of s2
                2 // how much character we want to match
        );



        //When we use new String("") to create string then it will create string object in heap each time
        //But when we create string using str1 = "ABCD", str2 = "ABCD" then it will not create different object for it instead it refer same string stored in string constant pool
        //When we call intern method for string s then it will first check whether it is available in string pool or no, if it is then return it otherwise create new string into string pool
        String str1 = new String("Hello"); // Creates a new object in the heap, not in the pool
        String str2 = "Hello";// Creates a string literal, automatically interned in the pool
        System.out.println(str1 == str2);// Output: false (different memory locations)
        String str3 = str1.intern();// Adds str1's content to the pool (if not present) and returns the pool reference
        System.out.println(str3 == str2);  // Output: true (both now reference the same object in the pool)

        //String subSequence -> return CharSequence
        //String subString -> return String


        String a = "A";
        String b = a+"B";
        String d = "A"+"B";
        String e = "A"+"B";
        String c = a.concat("B");
        System.out.println("IS b==c "+ (a==c)); // false
        System.out.println("IS b==c "+ (b==d)); // false
        System.out.println("IS b==c "+ (b==c)); // false
        System.out.println("IS b==c "+ (d==e)); // true


    }

    private static void reverseString(String str) {
        StringBuilder sb = new StringBuilder(str);
        for (int i = 0; i < sb.length() / 2; i++) {
            char temp = sb.charAt(i);
            sb.setCharAt(i, sb.charAt(sb.length() - i - 1));
            sb.setCharAt(sb.length() - i - 1, temp);
        }
        System.out.println(sb);
    }

    private static boolean isPalindrome(String str) {
        int st = 0;
        int en = str.length() - 1;

        while (st < en) {
            if (str.charAt(st++) != str.charAt(en--)) return false;
        }
        return true;
    }


}
