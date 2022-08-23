package com.br.forrest.console;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

@SpringBootApplication
public class Nomes {
    
	public static void main(String[] args) throws IOException {
		
		BufferedReader reader = new BufferedReader(
            new InputStreamReader(System.in));
			
		System.out.println("Digite 5 nomes");
		
		System.out.println("Nome 1:");
		String nome1 = reader.readLine();

        System.out.println("Nome 2:");
		String nome2 = reader.readLine();

        System.out.println("Nome 3:");
		String nome3 = reader.readLine();

        System.out.println("Nome 4:");
		String nome4 = reader.readLine();

        System.out.println("Nome 5:");
		String nome5 = reader.readLine();

		System.out.println("Os nomes digitado foi:" 
        + "\n Nome 1: " + nome1 
        + "\n Nome 2: " + nome2
        + "\n Nome 3: " + nome3 
        + "\n Nome 4: " + nome4 
        + "\n Nome 5: " + nome5 );
		
		//SpringApplication.run(LogicaApplication.class, args);
	}   
}
