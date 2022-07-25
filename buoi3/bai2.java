package buoi3;
import java.lang.String;
public class bai2 {
    public static void main(String[] arg){
        String s = "    lam    lin3433h    ";
        s = s.replaceAll(" ","");
        s = s.replace('l','L');
        char s1 = ' ';
        int index = 3;
        String b,c,k = s.valueOf(s1);
        b = s.substring(0,index);
        c = s.substring(index,s.length());
        s = b+k+c;
        s = s.substring(0,7) + s.substring(11,12);
        System.out.println(s);

    }
}
