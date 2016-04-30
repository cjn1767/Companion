package student.application.lhu_companion_2;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

import org.androidannotations.annotations.Background;
import org.androidannotations.annotations.EFragment;
import org.androidannotations.rest.spring.annotations.RestService;
import org.springframework.web.client.RestClientException;

import student.application.lhu_companion_2.responses.LoadInitialData;
import student.application.lhu_companion_2.rest.Data;


@EFragment
public class EventsActivity_ extends Fragment {

    LoadInitialData loadInitialData;

    @RestService
    Data restService;

    @Background
    void loadInitialData(){
        try{
            loadInitialData = restService.loadInitialData();
        }catch (RestClientException e){
            Log.d("DashboardMain Error", e.getMessage());
        }
        if (loadInitialData != null){
            loadInitialData.setEventName(loadInitialData.getEventName());
            loadInitialData.setHost(loadInitialData.getHost());
            loadInitialData.setLocation(loadInitialData.getLocation());
            loadInitialData.setTime(loadInitialData.getTime());
            loadInitialData.setWhen(loadInitialData.getWhen());
            loadInitialData.setDescription(loadInitialData.getDescription());

        }

    }


    public EventsActivity_() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.activity_events, container, false);

        final TextView cosTitle = (TextView)rootView.findViewById(R.id.cosTitle);
        final TextView cosInformation = (TextView)rootView.findViewById(R.id.txt_cos_info);
        final TextView deadTitle = (TextView)rootView.findViewById(R.id.deadTitle);
        final TextView deadInformation = (TextView)rootView.findViewById(R.id.txt_dead_info);
        final TextView danceTitle = (TextView)rootView.findViewById(R.id.danceTitle);
        final TextView danceInformation = (TextView)rootView.findViewById(R.id.txt_dance_info);

        cosTitle.setText(String.valueOf(loadInitialData.getEventName().length));
        cosInformation.setText(String.valueOf(loadInitialData.getDescription().length));



        cosTitle.setOnClickListener(new TextView.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(cosInformation.isShown()){
                    cosInformation.setVisibility(View.GONE);
                }else{
                    cosInformation.setVisibility(View.VISIBLE);
                }
            }
        });



        deadTitle.setOnClickListener(new TextView.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(deadInformation.isShown()){
                    deadInformation.setVisibility(View.GONE);
                }else{
                    deadInformation.setVisibility(View.VISIBLE);
                }
            }
        });

        danceTitle.setOnClickListener(new TextView.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(danceInformation.isShown()){
                    danceInformation.setVisibility(View.GONE);
                }else{
                    danceInformation.setVisibility(View.VISIBLE);
                }
            }
        });



        return rootView;

    }

}
