public class Main {
  public static void main(String[] args) {
    System.out.println("メソッドを呼び出します");
    hello("湊");
    hello("加藤");
    hello("藤原");

    System.out.println("メソッドの呼び出し終了");
  }

  public static void hello(String name) {
    System.out.println(name + "さん、こんにちは");
  }

}
