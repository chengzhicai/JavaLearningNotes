package Test;

/**
 * Created by chengzhicai on 2016/10/20.
 */
public class InitializedString {
    String s1="帅哥程志才";
    String s2;
    InitializedString(){
        s2 = s1;
        System.out.print(s2);
    }
}
class TestInitializedString{
    public static void main(String[] args) {
        InitializedString is = new InitializedString();
        System.out.println(is.s1);
        new InitializedString();
    }
}