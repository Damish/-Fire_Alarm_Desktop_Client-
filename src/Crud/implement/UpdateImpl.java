/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Crud.implement;

import Update.Interface.UpdateInterface2;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import models.Sensor;

/**
 *
 * @author Damish
 */
public class UpdateImpl extends UnicastRemoteObject implements UpdateInterface2 {

    public UpdateImpl() throws RemoteException {
    }

    public boolean UpdateItem(String sid, int ufloor, int uroom) throws RemoteException {
        Boolean updated = false;

        try {
            if (ufloor == 0 || uroom == 0) {
                return updated = false;
            } else {

                Sensor sensorEntry = new Sensor(sid, 0, 0, ufloor, uroom);

//////////////////////PUT Method/////////////////////////
                URL urlForGetRequest = new URL("http://localhost:8080/SensorData_REST_API/rest/sensors/"
                        + sensorEntry.getId() + "/"
                        + sensorEntry.getCo2Level() + "/"
                        + sensorEntry.getSmokeLevel() + "/"
                        + sensorEntry.getFloor() + "/"
                        + sensorEntry.getRoom()
                );
                String readLine = null;
                HttpURLConnection conection = (HttpURLConnection) urlForGetRequest.openConnection();
                conection.setRequestMethod("PUT");
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
                    System.out.println("PUT Response: " + response.toString());
                    //GetAndPost.POSTRequest(response.toString());

                } else {
                    System.out.println("PUT NOT WORKED");
                }
/////////////////////end of POST method////////////////

                return updated = true;

            }
        } catch (Exception e) {
            System.out.println("Updating Sensor failed");

        }
        return updated;

    }

}
