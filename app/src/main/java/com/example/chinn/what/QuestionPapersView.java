package com.example.chinn.what;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.github.barteksc.pdfviewer.PDFView;

public class QuestionPapersView extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question_papers_view);



        Bundle extras = getIntent().getExtras();
        String qpName = extras.getString("qpPDF");
        String qpNamePdf = qpName + ".pdf";

        PDFView pdfView = (PDFView) findViewById(R.id.a1);
        pdfView.fromAsset(qpNamePdf).load();

        Toast.makeText(getApplicationContext(),qpName,Toast.LENGTH_LONG).show();
    }
}
