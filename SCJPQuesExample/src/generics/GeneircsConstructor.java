package generics;




public class GeneircsConstructor<T>
{
   private T length;
   private T width;
   private T height;
 
   //Generic constructor
   public GeneircsConstructor(T length, T width, T height)
   {
      super();
      this.length = length;
      this.width = width;
      this.height = height;
   }
}