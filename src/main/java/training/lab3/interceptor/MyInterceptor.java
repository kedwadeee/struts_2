package training.lab3.interceptor;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;
import training.web.hello.HelloAction;

public class MyInterceptor implements Interceptor {
    private static final long serialVersionUID = 1L;

    @Override
    public void destroy() {
        System.out.println("MyInterceptor : Destroy");
    }
    @Override
    public void init() {
        System.out.println("MyInterceptor : Init");
    }
    @Override
    public String intercept(ActionInvocation actionInvocation) throws Exception {

        long startTime = System.currentTimeMillis();

        Object targetAction = actionInvocation.getAction();
        System.out.println( "Action Name... " + actionInvocation.getInvocationContext().getName() );
        if( targetAction instanceof HelloAction) {
            HelloAction helloAction = (HelloAction)targetAction;
            System.out.println( "Before Invoke... Friend Name = " + helloAction.getFriendName() );
        }

        // Next Interceptor or Action will be invoked here.
        actionInvocation.invoke();
        if( targetAction instanceof HelloAction ) {
            HelloAction helloAction = (HelloAction)targetAction;
            System.out.println( "After Invoke... Friend Name = " + helloAction.getFriendName() );
        }

        long finishTime = System.currentTimeMillis();

        long processTime = finishTime - startTime;

        System.out.println(actionInvocation.getAction().getClass() + " Process time = " + processTime);

        return null;
    }


}
