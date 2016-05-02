package student.application.lhu_companion_2;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.androidannotations.annotations.AfterInject;
import org.androidannotations.annotations.Background;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EFragment;
import org.androidannotations.annotations.UiThread;
import org.androidannotations.annotations.ViewById;
import org.androidannotations.rest.spring.annotations.RestService;
import org.springframework.web.client.RestClientException;

import student.application.lhu_companion_2.models.Events;
import student.application.lhu_companion_2.rest.Data;


@EFragment(R.layout.activity_events)
public class EventsActivity extends Fragment {

    Events [] events;

    @ViewById
    TextView cosTitle, txt_cos_info, deadTitle, txt_dead_info, danceTitle, txt_dance_info;


//    final TextView cosTitle = (TextView)rootView.findViewById(R.id.cosTitle);
//    final TextView cosInformation = (TextView)rootView.findViewById(R.id.txt_cos_info);
//    final TextView deadTitle = (TextView)rootView.findViewById(R.id.deadTitle);
//    final TextView deadInformation = (TextView)rootView.findViewById(R.id.txt_dead_info);
//    final TextView danceTitle = (TextView)rootView.findViewById(R.id.danceTitle);
//    final TextView danceInformation = (TextView)rootView.findViewById(R.id.txt_dance_info);


    @RestService
    Data restService;

    @Background
    void loadInitialData(){
        try{
            events = restService.loadInitialData();
        }catch (RestClientException e){
            Log.d("DashboardMain Error", e.getMessage());
        }
        if (events != null){
            populateViews();

        }

    }


    public EventsActivity() {
    }


    @AfterInject
    void AfterInject(){
        loadInitialData();
    }

    @UiThread(propagation = UiThread.Propagation.REUSE)
    void populateViews(){
        cosTitle.setText(String.valueOf(events[0].getEventName()));
        txt_cos_info.setText(String.valueOf(events[0].getDescription()));

    }


    @Click(R.id.cosTitle)
    void cosInfoClicked(){
        if(txt_cos_info.isShown()){
                    txt_cos_info.setVisibility(View.GONE);
                }else{
                    txt_cos_info.setVisibility(View.VISIBLE);
                }
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        View rootView = inflater.inflate(R.layout.activity_events, container, false);

//        final TextView cosTitle = (TextView)rootView.findViewById(R.id.cosTitle);
//        final TextView cosInformation = (TextView)rootView.findViewById(R.id.txt_cos_info);
//        final TextView deadTitle = (TextView)rootView.findViewById(R.id.deadTitle);
//        final TextView deadInformation = (TextView)rootView.findViewById(R.id.txt_dead_info);
//        final TextView danceTitle = (TextView)rootView.findViewById(R.id.danceTitle);
//        final TextView danceInformation = (TextView)rootView.findViewById(R.id.txt_dance_info);




//        cosTitle.setOnClickListener(new TextView.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                if(txt_cos_info.isShown()){
//                    txt_cos_info.setVisibility(View.GONE);
//                }else{
//                    txt_cos_info.setVisibility(View.VISIBLE);
//                }
//            }
//        });
//
//
//
//        deadTitle.setOnClickListener(new TextView.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                if(txt_dead_info.isShown()){
//                    txt_dead_info.setVisibility(View.GONE);
//                }else{
//                    txt_dead_info.setVisibility(View.VISIBLE);
//                }
//            }
//        });
//
//        danceTitle.setOnClickListener(new TextView.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                if(txt_dance_info.isShown()){
//                    txt_dance_info.setVisibility(View.GONE);
//                }else{
//                    txt_dance_info.setVisibility(View.VISIBLE);
//                }
//            }
//        });



        return rootView;

    }

}
