package caculator;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args)
            throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException,
            SecurityException, IllegalArgumentException, InvocationTargetException, NoSuchFieldException {
        // forName 里面填写类的路径
        Class<?> cls = Class.forName("caculator.Caculator");
        // 创建一个类的对象, newInstance 调用类的无参构造函数
        Object o = cls.newInstance();

        // 类中函数的动态调用方式
        Method method = cls.getMethod("add", int.class, int.class);
        System.out.println(method.invoke(o, 1, 5));

        // 动态修改类中变量方式
        Field field = cls.getField("name");
        // 设置变量的值
        field.set(o, "My Calculator");
        // 获取变量的值
        System.out.println(field.get(o));

        // --------------------------------------------------
        // 对于有参构造函数
        Constructor<?> constructor = cls.getConstructor(String.class);
        Object newObject = constructor.newInstance("New Calculator!");
        System.out.println(newObject);
    }
}
