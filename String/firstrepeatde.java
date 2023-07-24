package Summer_DSA.String;

public class firstrepeatde {
    public static void main(String[] args) {
        String s = "hello";

        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            int count =0;
            for(int j=i;j>=0;j--){
                if(s.charAt(j)==c)
                count++;
            }
            if(count>=2){
                s=String.valueOf(c); //converting char to String
                System.out.println(s);
                break;
            }
        }

    }
}
