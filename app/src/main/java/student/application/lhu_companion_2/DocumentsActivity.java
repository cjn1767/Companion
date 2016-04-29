package student.application.lhu_companion_2;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class DocumentsActivity extends Fragment {

    public DocumentsActivity() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.activity_documents, container, false);

        Button admissionsBtn = (Button) rootView.findViewById(R.id.admissionsBtn);

        admissionsBtn.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("http://www.lhup.edu/Admissions/applying-to-lhu.html"));
                startActivity(intent);
            }
        });

        Button generalBtn = (Button) rootView.findViewById(R.id.generalBtn);

        generalBtn.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("http://www.lhup.edu/students/Housing/housing_selection.html"));
                startActivity(intent);
            }
        });

        Button academicsBtn = (Button) rootView.findViewById(R.id.academicsBtn);

        academicsBtn.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://myhaven.lhup.edu/ICS/Registrar/Forms.jnz"));
                startActivity(intent);
            }
        });

        Button activitiesBtn = (Button) rootView.findViewById(R.id.activitiesBtn);

        activitiesBtn.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("http://www.lhup.edu/students/activities_council/resources_forms.html"));
                startActivity(intent);
            }
        });

        Button teachersEdBtn = (Button) rootView.findViewById(R.id.teachersEdBtn);

        teachersEdBtn.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("http://www.lhup.edu/students/student_resources/teacher_ed/requirements_forms_information.html"));
                startActivity(intent);
            }
        });

        Button financialAidBtn = (Button) rootView.findViewById(R.id.financialAidBtn);

        financialAidBtn.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("http://www.lhup.edu/students/financialaid/forms.html"));
                startActivity(intent);
            }
        });

        Button verteranBtn = (Button) rootView.findViewById(R.id.veteranBtn);

        verteranBtn.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("http://www.lhup.edu/Admissions/Veterans/index.html"));
                startActivity(intent);
            }
        });

        Button transferCreditsBtn = (Button) rootView.findViewById(R.id.tranferCreditsBtn);

        transferCreditsBtn.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("http://www.lhup.edu/students/Registrar/transfer_credit_approval_form.pdf"));
                startActivity(intent);
            }
        });

        Button transcriptBtn = (Button) rootView.findViewById(R.id.transcriptBtn);

        transcriptBtn.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("http://www.lhup.edu/students/Registrar/forms/transcript_request.html"));
                startActivity(intent);
            }
        });


        return rootView;

    }
}
