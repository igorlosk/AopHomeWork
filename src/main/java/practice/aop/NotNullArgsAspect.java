package practice.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

import org.springframework.stereotype.Component;


@Component
@Aspect
public class NotNullArgsAspect {

    @Around("@annotation(notNullArgs)")
    public Object around(ProceedingJoinPoint pjp, NotNullArgs notNullArgs) throws Throwable {

        String method = pjp.getSignature().getName();
        Object[] args = pjp.getArgs();

        for (int i = 0; i < args.length; i++) {
            if (args[i] == null) {
                throw new IllegalArgumentException("В методе: " + method + " arg[" + i + "] is null");
            }
        }

        return pjp.proceed();
    }


}
