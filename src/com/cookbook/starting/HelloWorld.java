package src.com.cookbook.starting;

public class HelloWorld {

    public static void main(String[] argv) {
        String a = "Java is great";
        //从第5位开始
        System.out.println(a.substring(5));
        //5到7
        System.out.println(a.substring(5,7));
        //5到字符串末尾
        System.out.println(a.substring(5,a.length()));
        //startIndex
        System.out.println();
        //indexof
        System.out.println("indexof i :"+a.indexOf("i"));

        //lastIndexof
        System.out.println("indexof a :"+a.lastIndexOf("a"));

        //substring 0
        System.out.println("substring 0: "+ a.substring(0));
    }
}
