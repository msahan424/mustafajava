package Example1;

public class Example1 {
    public static void main(String[] args) {
        int x =1;
        System.out.println((x>4)&&(++x==4));
        System.out.println(x);
        System.out.println((x>4)&(++x==4));
        System.out.println(x);
          x=1;
        System.out.println((x>0)||(++x==4));
        System.out.println(x);
        System.out.println(x);
        System.out.println((x>0)|(++x==4));
        System.out.println(x);
        //true||true ->true
        //true||false->true
        //false||true->true
        //false ||true->false
        //true|true ->true
        //true|false->true
        //false|true->true
        //false|true->false
    }
}
