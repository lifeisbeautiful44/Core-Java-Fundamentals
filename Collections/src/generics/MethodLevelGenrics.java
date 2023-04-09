package generics;

import java.util.ArrayList;


public class MethodLevelGenrics {

public <T> void method1(String s)
{

}


public <T extends ArrayList<String>> void method2(T t)
{
	
}

public <T extends ArrayList<String> & Runnable> void method3(T t)
{
	
}


}
