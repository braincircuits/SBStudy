import com.m20891.controller.DController;
import org.springframework.core.annotation.AnnotatedElementUtils;
import org.springframework.core.annotation.AnnotationAttributes;
import org.springframework.transaction.annotation.Transactional;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Set;

public class Tet {
    public static void main(String[] args) throws NoSuchMethodException {
        Method get = DController.class.getMethod("get");
        AnnotationAttributes mergedAnnotationAttributes = AnnotatedElementUtils.findMergedAnnotationAttributes(get, Transactional.class, false, false);
        Transactional annotation = get.getAnnotation(Transactional.class);
        annotation.timeout();
        System.out.println(mergedAnnotationAttributes);
    }
}
