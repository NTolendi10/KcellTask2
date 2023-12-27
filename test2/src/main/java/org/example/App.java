package org.example;

import org.example.functions.FunctionManager;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);
        FunctionManager functionManager = context.getBean(FunctionManager.class);
        if (args.length == 3) {
            String name = args[0];
            double a = Double.parseDouble(args[1]);
            double b = Double.parseDouble(args[2]);
            System.out.println(functionManager.calculate(name, a, b));
        } else {
            System.out.println("Usage: java -jar target/<program-name>.jar <function> <a> <b>");
        }
        context.close();
    }
}
