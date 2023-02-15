import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

public class Reflections {
    public static void main(String [] args){
        execute();
    }

    private static void execute() {
        System.out.println("****Reflections****");
        Ref ref = new Ref();
        Annotation[] annotations = ref.getClass().getAnnotations();
        for (Annotation an : annotations){
            System.out.println("Nome da anotação : "+an.toString());
        }
        for (Field field : ref.getClass().getDeclaredFields()){
            if (field.isAnnotationPresent(Chave.class)){
                Chave ano = field.getAnnotation(Chave.class);
                System.out.println("Nome da anotacao :" +ano.value());
            }
        }
    }
}
