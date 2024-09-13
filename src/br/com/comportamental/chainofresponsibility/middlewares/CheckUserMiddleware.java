package br.com.comportamental.chainofresponsibility.middlewares;

import br.com.comportamental.chainofresponsibility.server.Server;

public class CheckUserMiddleware extends Middleware{
    private Server server;

    public CheckUserMiddleware(Server server){
        this.server = server;
    }

    @Override
    public boolean Check(String email, String password) {
        if(!server.hasEmail(email)){
            System.out.println("E-mail Inválido!");
            return false;
        }

        if(!server.isValidPassword(email, password)){
            System.out.println("E-mail ou Senha inválido!");
            return false;
        }

        return CheckNext(email, password);
    }
}
