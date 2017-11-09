package com.example.paras.internsinfo;

import android.graphics.Color;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ActionBarOverlayLayout;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

public class Tab4 extends Fragment {
    //   CardView cardview;
    TableLayout table;
    TableRow trow;
    TextView textview;
    ActionBarOverlayLayout.LayoutParams layoutparams;
    int i=0;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.activity_tab4, container, false);

        table=(TableLayout) rootView.findViewById(R.id.table);
        trow=new TableRow(getContext());
/*        cardview=new CardView(getContext());

        cardview.setRadius(15);
        cardview.setMinimumWidth(650);
        cardview.setMinimumHeight(150);

        cardview.setPadding(25, 25, 25, 25);

        cardview.setCardBackgroundColor(Color.TRANSPARENT);

        cardview.setMaxCardElevation(30);

        cardview.setMaxCardElevation(6);
*/
        textview = new TextView(getContext());

        textview.append("yo");

        textview.setTextColor(Color.WHITE);

        textview.setPadding(25,25,25,25);

        textview.setGravity(Gravity.CENTER);

        //       cardview.addView(textview);

        //      trow.addView(cardview);

        table.addView(trow);

        return rootView;
    }
}
