import java.lang.reflect.Field;
import java.lang.reflect.Method;
public class Main {
    public static void main(String[] args) throws Exception {
        Class<?> clazz = BankAccount.class;
        System.out.println("类名：" + clazz.getName());
        Field[] fields = clazz.getDeclaredFields();
        System.out.println("字段信息：");
        for (Field field : fields) {
            System.out.println("类型：" + field.getType().getSimpleName() + "，名称：" + field.getName());
        }
        Method[] methods = clazz.getDeclaredMethods();
        System.out.println("方法信息：");
        for (Method method : methods) {
            System.out.print(method.getReturnType().getSimpleName() + " " + method.getName() + "(");
            Class<?>[] params = method.getParameterTypes();
            for (int i = 0; i < params.length; i++) {
                System.out.print(params[i].getSimpleName());
                if (i < params.length - 1) System.out.print(", ");
            }
            System.out.println(")");
        }
    }
}
