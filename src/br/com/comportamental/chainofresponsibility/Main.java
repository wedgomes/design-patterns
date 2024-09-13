package br.com.comportamental.chainofresponsibility;

import br.com.comportamental.chainofresponsibility.middlewares.CheckPersmissionMiddleware;
import br.com.comportamental.chainofresponsibility.middlewares.CheckUserMiddleware;
import br.com.comportamental.chainofresponsibility.middlewares.Middleware;
import br.com.comportamental.chainofresponsibility.server.Server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    private static final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private static Server server;

    public static void init(){
        server = new Server();
        server.registerUsar("wedson_mxt@hotmail.com", "12345678");
        server.registerUsar("user@gmail.com", "123");

        Middleware middleware = new CheckUserMiddleware(server);
        middleware.linkWith(new CheckPersmissionMiddleware());

        server.setMiddleware(middleware);
    }

    public static void main(String[] args) throws IOException {
        init();

        boolean done;

        do{
            System.out.println("Digite o e-mail: ");
            String email = reader.readLine();
            System.out.println("Digite a senha?: ");
            String password = reader.readLine();
            done = server.LogIn(email, password);
        }while(!done);
    }
}
