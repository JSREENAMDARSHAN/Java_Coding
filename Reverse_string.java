public class Reverse_string{

    public static void main(String[] args) {
        String str = "darshan";
        String nstr = "";
        int length = str.length();
        for(int i = length - 1 ; i>=0 ; i--){
            nstr = nstr + str.charAt(i);
        }
        System.out.println("Original String: " + str);
        System.out.println("Reveresed String: " + nstr);
    }
    
}