public class DebugBox
{
   private int width;
   private int length;
   private int height;
   public void FixDebugBox()
   {
      length = 1;
      width = 1;
      height = 1;
   }
   public void FixDebugBox(int width, int length, int height)
   {
      this.width = width;
      this.length = length;
      this.height = height;
   }
   public void showData(int width, int length, int height)
   {
     System.out.println("Width: "  + width + "  Length: " +
       length + "  Height: " + height);
   }
   public double getVolume(double length, double width, double height)
   { 
     double vol = length * width * height;
     return vol;
   }
}
