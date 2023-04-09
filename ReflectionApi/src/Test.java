import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class Test {

	public static void main(String[] args) {
		
     
		
		try {
//			System.out.println(Class.myClass(Calculator.class.getName()));
			
			Class<?> myClass = Class.forName(Calculator.class.getName());
			Constructor<?>[] constructors = myClass.getConstructors();
			
			System.out.println(Arrays.toString(constructors));
			System.out.println(Arrays.toString(myClass.getMethods()));
			
			Constructor<?> constructor = myClass.getConstructor(null);		
			System.out.println(constructor.newInstance(null));
			Constructor<?> constructorPara = myClass.getConstructor(double.class,double.class);		
			
			Object myObj = constructorPara.newInstance(4,8);  //?
			
		
			Method setNum1 = myClass.getMethod("setNum1", double.class);
			setNum1.invoke(myObj, 40);
			
			Method setNum2 = myClass.getMethod("setNum2", double.class);
			setNum2.invoke(myObj, 30);
			
			Field num1Field = myClass.getDeclaredField("num2");
			num1Field.setAccessible(true);
			
			num1Field.set(myObj, 80);
			
			
			Method getNum1 = myClass.getMethod("getNum1", null);
			System.out.println(getNum1.invoke(myObj, null));
			
			Method getNum2 = myClass.getMethod("getNum2", null);
			System.out.println(getNum2.invoke(myObj, null));
			
			
			Method result = myClass.getMethod("sum", int.class, int.class);
			System.out.println(result.invoke(myObj,2,5));
			
			Annotation[] annotations = myClass.getAnnotations();
			System.out.println(Arrays.toString(annotations));
			
			MyAnnonation anontation = (MyAnnonation)annotations[0];
			System.out.println(anontation.value1());
			System.out.println(anontation.value2());

			

			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		} catch (NoSuchFieldException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
