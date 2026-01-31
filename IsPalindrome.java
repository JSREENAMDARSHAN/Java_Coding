public class IsPalindrome{
    public static void main(String args[]){
        String str = "dad";
        StringBuilder nstr = new StringBuilder();
        for(int i = str.length() - 1 ; i>=0 ; i--){
            nstr.append(str.charAt(i));
        }
        System.out.println((nstr.toString().equalsIgnoreCase(str)) ? "Yes palindrome" : "Not a palindrome"); 

    }
}