public class atoi {
    public static void main(String[] args) {
        String s = "1337c0d3";
        int length = s.length(),i=0;
        if(s == null || length ==0 ){
            System.out.println(s);
            
        }
        while(i<length && s.charAt(i)==' '){
            i++;
        }
        int sign = 1;
        if(i<length && (s.charAt(i)=='+')|| (s.charAt(i)=='-')){
            // 42 and +42 are same, 42 and -42 are not same
            sign = (s.charAt(i) == '-')?-1:1;
            i++;
        }
        int res = 0;
        while(i<length && Character.isDigit(s.charAt(i))){
            res = res * 10 +(s.charAt(i) - '0');
            i++;
        }
        System.out.println(sign*res);
    }
}
