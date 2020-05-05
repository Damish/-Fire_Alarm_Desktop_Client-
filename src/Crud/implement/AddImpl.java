/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Crud.implement;

/**
 *
 * @author Damish
 */
import java.rmi.*;
import Add.Interface.AddInterface;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.rmi.server.UnicastRemoteObject;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import models.Sensor;
import org.json.JSONArray;
import org.json.JSONObject;

public class AddImpl extends UnicastRemoteObject implements AddInterface {

    public AddImpl() throws RemoteException {
    }

    int count = 0;

    @Override
    public boolean AddItem(int floor, int room) throws RemoteException {
        Boolean add = false;

        try {
            if (floor == 0 || room == 0) {
                return add = false;
            } else {
                count += 1;

                DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyyMMddHHmmss");
                LocalDateTime now = LocalDateTime.now();
                System.out.println("Current Date : " + dtf.format(now));

                String newSid = "S" + dtf.format(now);

                Sensor sensorEntry = new Sensor(newSid, 0, 0, floor, room);
                System.out.println("New Sensor Sid : " + sensorEntry.getId());

//////////////////////POST Method/////////////////////////
                URL urlForGetRequest = new URL("http://localhost:8080/SensorData_REST_API/rest/sensors/"
                        + sensorEntry.getId() + "/"
                        + sensorEntry.getCo2Level() + "/"
                        + sensorEntry.getSmokeLevel() + "/"
                        + sensorEntry.getFloor() + "/"
                        + sensorEntry.getRoom()
                );
                String readLine = null;
                HttpURLConnection conection = (HttpURLConnection) urlForGetRequest.openConnection();
                conection.setRequestMethod("POST");
                int responseCode = conection.getResponseCode();

                if (responseCode == HttpURLConnection.HTTP_OK) {
                    BufferedReader in = new BufferedReader(
                            new InputStreamReader(conection.getInputStream()));
                    StringBuffer response = new StringBuffer();
                    while ((readLine = in.readLine()) != null) {
                        response.append(readLine);
                    }
                    in.close();
                    // print result
                    System.out.println("JSON String Result " + response.toString());
                    //GetAndPost.POSTRequest(response.toString());

                } else {
                    System.out.println("POST NOT WORKED");
                }
/////////////////////end of POST method////////////////

                return add = true;

            }
        } catch (Exception e) {
            System.out.println("Registering new Sensor failed");

        }
        return add;

    }

   

}
