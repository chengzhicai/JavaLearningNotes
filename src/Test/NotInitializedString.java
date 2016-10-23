package Test;

/**
 * Created by chengzhicai on 2016/10/20.
 */
public class NotInitializedString {
    String a;
}
class TestNotInitializedString{
    public static void main(String[] args) {
        NotInitializedString nis = new NotInitializedString();
        System.out.println("a="+nis.a);
    }
}

