import java.lang.*;
class Rectangle{
  float l,w;
  public float findArea(float a,float b){
     l=a;
     w=b;
     float area=l*w;
     return area;
  }
}  
class Shape{
   public static void main(String[] args){
      Rectangle rect =new Rectangle();
      float myArea = rect.findArea(12,15.8f);
      System.out.println("Area of your Rectangle is"+myArea);
   }
}
