package Day03;

import org.xml.sax.ext.Attributes2;

public class CodeBlock {
    public static void main(String[] args) {
        int outer = 100;
        {
            int inner = 10;
            System.out.println("outer变量的值是"+outer+",inner变量的值是:"+inner);
        }
        int a = 1;
        {
            int a1 = a + 1;
            {
                int a2 = a1 + 1;
                {
                    int a3 = a2 + 10;

                }
                {
                    int a3 = a2 + 1;

                }
                System.out.println(a2);
            }

        }
    }
}
