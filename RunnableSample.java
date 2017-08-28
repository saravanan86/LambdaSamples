import java.lang.Runnable;
public class RunnableSample{

    public RunnableSample(){

        Runnable r1 = new Runnable(){

            @Override
            public void run(){

                System.out.println("Prior to Java 8");

            }

        };

        Runnable r2 = () -> System.out.println("With Java 8 Lambda Expression");

    }

}