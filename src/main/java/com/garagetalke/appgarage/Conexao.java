package com.garagetalke.appgarage;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;

public class Conexao {

    public static String postDados(String urlUsuario, String parametrosusuario) {

        URL url;
        HttpURLConnection connection = null;

        try {

            url = new URL(urlUsuario);
            //abrir a conexao atraves da url
            connection = (HttpURLConnection)url.openConnection();

            connection.setRequestMethod("POST");

            connection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");

            connection.setRequestProperty("Content-Lenght", "" + Integer.toString(parametrosusuario.getBytes().length));

            connection.setRequestProperty("Content-Language", "pt-BR");

            connection.setUseCaches(false);
            connection.setDoInput(true);
            connection.setDoOutput(true);

            /*
            DataOutputStream dataOutputStream = new DataOutputStream(connection.getOutputStream());
            dataOutputStream.writeBytes(parametrosusuario);
            dataOutputStream.flush();
            dataOutputStream.close();
            */
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(connection.getOutputStream(),"UTF-8");
            outputStreamWriter.write(parametrosusuario);
            outputStreamWriter.flush();


            InputStream inputStream =  connection.getInputStream();

            BufferedReader bufferReader = new BufferedReader( new InputStreamReader(inputStream, "UTF-8"));
            String linha ;
            StringBuffer resposta = new StringBuffer();

            while ((linha = bufferReader.readLine()) != null){
                resposta.append(linha);
                resposta.append('\r');
            }

            bufferReader.close();
            return resposta.toString();

        } catch (Exception erro) {
            return null;
        } finally {

            if (connection != null) {

                connection.disconnect();
            }
        }
    }
}



