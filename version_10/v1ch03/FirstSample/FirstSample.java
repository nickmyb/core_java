/**
 * This is the first sample program in Core Java Chapter 3
 * @version 1.01 1997-03-22
 * @author Gary Cornell
 */
public class FirstSample  // 源代码文件名必须和公共类的名字相同, .java为拓展名
{
   /**
    * java ClassName运行编译的程序时,虚拟机将从ClassName的main方法开始执行, main方法必须声明public
    *
    * 数据类型:
    *     整型:
    *     byte short int long
    *     int [-2,147,483,648 - 2,147,483,647] 20亿
    *     4000000000L, 0XCA, 0101, 0B110, 1_000_000
    *
    *     浮点:
    *     float, double
    *     3.14F, 3.14D
    *     0X11.1p-3 = (1 * 16 ^ 1 + 1 * 16 ^ 0 + 1 * 16 ^ -1) * (2 ^ -3)
    *     16进制表示浮点数,系数采用16进制,指数以2为基数
    *
    *     Double.POSITIVE_INFINITY
    *     Double.NEGATIVE_INFINITY
    *     x == Double.NaN  // is never true
    *     Double.isNaN(x)
    *
    *     char:
    *     \\是因为Java字符串必须转义,其实我只想输入一个单独的反斜线
    *     'A' \\u0000 - \\uffff
    *     '\\uxxxx'代表一个可以打印的char, \\uxxxx会在解析代码前处理
    *     \\uxxxx代表直接的一个字符: public static void main(String\\u005B\\u005D args)
    *     最好不要使用char
    *
    *     boolean:
    *     Java 0 和 boolean 不能自动转换
    *
    *     常量:
    *     习惯全大写,只能被赋值一次,赋值后不能再更改
    *     final double PI = 3.14;
    *
    * 枚举
    *    Enum must not be local
    *    enum Size {S, M, L};
    *    Size s = Size.M;
    *
    */
   enum Size {S, M, L};

   public static void main(String[] args)
   {
      System.out.println("We will not use 'Hello, World!'");
      System.out.println("0X1.1p-3 = " + 0X11.1p-3 + " = " + (16 + 1 + 1.0 / 16) / 8);
      Size s = Size.M;
      System.out.println("Size.M = " + s);
   }
}
