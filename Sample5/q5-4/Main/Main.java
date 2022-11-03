public class Main {
  // 三角形の面積
  public static double calcTriangleArea(double bottom, double height) {
    double area = (bottom * height) / 2;
    return area;
  }

  // 円の面積
  public static double calcCircleArea(double radius) {
    double area = radius * radius * 3.14;
    return area;
  }

  public static void main(String[] args) {
    double triangleArea = calcTriangleArea(10.0, 5.0);
    System.out.println("三角形の底辺の長さが10.0cm、高さが5.0cmの場合、面積は" + triangleArea);
    double circleArea = calcCircleArea(5.0);
    System.out.println("円の半径が5.0cmの場合、面積は" + circleArea);
  }
}
