package br.com.comportamental.chainofresponsibility.middlewares;

public class CheckPersmissionMiddleware extends Middleware{
    @Override
    public boolean Check(String email, String password) {
        if(email.equals("wedson_mxt@hotmail.com")){
            System.out.println("Bem-vindo Administrador");
            return true;
        }
        System.out.println("Bem-vindo!");
        return CheckNext(email, password);
    }
}
