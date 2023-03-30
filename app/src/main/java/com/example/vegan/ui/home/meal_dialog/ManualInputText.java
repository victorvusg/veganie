package com.example.vegan.ui.home.meal_dialog;

import android.app.Activity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;
import com.example.vegan.R;

public class ManualInputText extends Activity implements View.OnTouchListener {

    private TextView text;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dialog_meal);
        text = (TextView) findViewById(R.id.isManualInput);
        text.setOnTouchListener(this);
        Spinner spinner = (Spinner) findViewById(R.id.spinner);
        spinner.setVisibility(View.INVISIBLE);
    }


    @Override
    public boolean onTouch(View view, MotionEvent motionEvent) {
        return false;
    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {
        super.onPointerCaptureChanged(hasCapture);
    }

    public void onChangeManualInput(View view) {

    }
}
