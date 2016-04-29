package student.application.lhu_companion_2;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Derp on 4/5/2016.
 */
public class InformationActivity extends Fragment {

    public InformationActivity() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        final View rootView = inflater.inflate(R.layout.activity_information, container, false);

        final TextView bentleyTitle = (TextView)rootView.findViewById(R.id.bentleyTitle);
        final TextView bentleyInformation= (TextView)rootView.findViewById(R.id.txt_bentley_hours);

        final TextView glennonTitle = (TextView)rootView.findViewById(R.id.glennonTitle);
        final TextView glennonInformation = (TextView)rootView.findViewById(R.id.txt_glennon_hours);

        final TextView recTitle = (TextView)rootView.findViewById(R.id.recTitle);
        final TextView recInformation = (TextView)rootView.findViewById(R.id.txt_rec_hours);

        final TextView bookStoreTitle = (TextView)rootView.findViewById(R.id.bookStoreTitle);
        final TextView bookStoreInformation = (TextView)rootView.findViewById(R.id.txt_bookStore_hours);

        final TextView starbucksTitle = (TextView)rootView.findViewById(R.id.starbucksTitle);
        final TextView starbucksInformation = (TextView)rootView.findViewById(R.id.txt_starbucks_hours);

        final TextView akeleyTitle = (TextView)rootView.findViewById(R.id.akeleysTitle);
        final TextView akeleyInformation = (TextView)rootView.findViewById(R.id.txt_akeley_hours);


        bentleyTitle.setOnClickListener(new TextView.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(bentleyInformation.isShown()){
                    bentleyInformation.setVisibility(View.GONE);
                }else{
                    bentleyInformation.setVisibility(View.VISIBLE);
                }
            }
        });

        glennonTitle.setOnClickListener(new TextView.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(glennonInformation.isShown()){
                    glennonInformation.setVisibility(View.GONE);
                }else{
                    glennonInformation.setVisibility(View.VISIBLE);
                }
            }
        });

        recTitle.setOnClickListener(new TextView.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(recInformation.isShown()){
                    recInformation.setVisibility(View.GONE);
                }else{
                    recInformation.setVisibility(View.VISIBLE);
                }
            }
        });

        bookStoreTitle.setOnClickListener(new TextView.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(bookStoreInformation.isShown()){
                    bookStoreInformation.setVisibility(View.GONE);
                }else{
                    bookStoreInformation.setVisibility(View.VISIBLE);
                }
            }
        });

        starbucksTitle.setOnClickListener(new TextView.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(starbucksInformation.isShown()){
                    starbucksInformation.setVisibility(View.GONE);
                }else{
                    starbucksInformation.setVisibility(View.VISIBLE);
                }
            }
        });

        akeleyTitle.setOnClickListener(new TextView.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(akeleyInformation.isShown()){
                    akeleyInformation.setVisibility(View.GONE);
                }else{
                    akeleyInformation.setVisibility(View.VISIBLE);
                }
            }
        });

        return rootView;

    }
}
