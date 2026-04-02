import com.sun.net.httpserver.*;
import java.io.*;
import java.net.InetSocketAddress;
import java.nio.file.*;
import java.sql.*;
import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        HttpServer server = HttpServer.create(new InetSocketAddress(8080), 0);

        // 1. Rota para mostrar o site (O que você vê no navegador)
        server.createContext("/", exchange -> {
            byte[] response = Files.readAllBytes(Paths.get("static/index.html"));
            exchange.sendResponseHeaders(200, response.length);
            OutputStream os = exchange.getResponseBody();
            os.write(response);
            os.close();
        });

        // 2. Rota de LOGIN (O que acontece quando clica no botão)
        server.createContext("/login", exchange -> {
            if ("POST".equals(exchange.getRequestMethod())) {
                // Lógica para ler o que você digitou no formulário
                InputStreamReader isr = new InputStreamReader(exchange.getRequestBody(), "utf-8");
                BufferedReader br = new BufferedReader(isr);
                String query = br.readLine(); // Pega "username=ryan&password=123"
                
                // Aqui você usaria a sua lógica de JDBC que já testamos!
                System.out.println("Tentativa de login recebida: " + query);
                
                String resposta = "<h1>Login Processado!</h1><p>Verifique o terminal para ver os dados.</p>";
                exchange.sendResponseHeaders(200, resposta.length());
                OutputStream os = exchange.getResponseBody();
                os.write(resposta.getBytes());
                os.close();
            }
        });

        System.out.println("--- SERVIDOR RODANDO NA PORTA 8080 ---");
        server.start();
    }
}