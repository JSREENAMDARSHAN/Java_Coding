public class Reverse_string{

    public static void main(String[] args) {
        String str = "darshan";
        StringBuilder nstr = new StringBuilder();
        int length = str.length();
        for(int i = length - 1 ; i>=0 ; i--){
            nstr.append(str.charAt(i));
        }
        System.out.println("Original String: " + str);
        System.out.println("Reveresed String: " + nstr);
    }
    
}