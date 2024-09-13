package br.com.comportamental.chainofresponsibility.middlewares;

public abstract class Middleware {
    private Middleware next;
    public Middleware linkWith(Middleware next){
        this.next = next;
        return next;
    }

    public abstract boolean Check(String email, String password);

    protected boolean CheckNext(String email, String password){
        if(next == null){
            return true;
        }
        return next.Check(email, password);
    };
}
