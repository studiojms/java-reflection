package br.com.jmsstudio.supply;

import br.com.jmsstudio.processor.Processor;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /*
         * Possible cases:
         * /controller/method
         * /controller/method?param1=value1&param2=value2
         */

        try (Scanner s = new Scanner(System.in)) {
            String url = s.nextLine();

            final Processor processor = new Processor("br.com.jmsstudio.supply.controller");
            while (!url.equals("exit") && url.trim().length() > 0) {
                Object response = processor.execute(url);

                System.out.println("Response: " + response);

                url = s.nextLine();
            }
        }

    }
}
