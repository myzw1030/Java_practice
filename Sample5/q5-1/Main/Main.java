public class Main {
  public static void introduceOneself(String name, int age, double height, char zodiac) {
    System.out.println("私の名前は" + name + "です。" + age + "歳です。身長は、" + height + "cmで、干支は" + zodiac + "です。");
  }

  public static void main(String[] args) {
    introduceOneself("高野", 17, 167.8, '辰');
  }
}
