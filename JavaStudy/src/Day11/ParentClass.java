package Day11;

public class ParentClass {
   public int overrideValue;

   public ParentClass(){
       overrideValue = 5;
   }

   public void showOverrideValue(){
       System.out.println("overrideValue的值是:"+overrideValue);
   }

}
