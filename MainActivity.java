package com.example.hwonejava;

import android.app.Activity;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.Gravity;
import android.widget.HorizontalScrollView;
import android.widget.GridLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.view.ViewGroup;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // background colors that will be used later
        int blue = Color.parseColor("#D4FCFE");
        int yellow = Color.parseColor("#FDFF9C");
        int orange = Color.parseColor("#FFCB94");

        // to make the entire view horizontal scroll
        HorizontalScrollView scroller = new HorizontalScrollView(this);
        ViewGroup.LayoutParams hsvParams = new ViewGroup.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.WRAP_CONTENT
        );
        scroller.setLayoutParams(hsvParams);

        // the entire table is in GridLayout, but each row of the table
        // will be formatted using LinearLayout
        GridLayout root = new GridLayout(this);
        ViewGroup.LayoutParams rParams = new ViewGroup.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.MATCH_PARENT
        );
        root.setLayoutParams(rParams);
        root.setOrientation(GridLayout.VERTICAL);
        root.setColumnCount(1);
        root.setRowCount(10);

        // each row is formatted using LinearLayout that is horizontal
        LinearLayout firstRow = new LinearLayout(this);
        firstRow.setOrientation(LinearLayout.HORIZONTAL);
        GridLayout.Spec row_spec = GridLayout.spec(0);
        GridLayout.Spec col_spec = GridLayout.spec(0);
        GridLayout.LayoutParams cParams = new GridLayout.LayoutParams(row_spec, col_spec);
        firstRow.setLayoutParams(cParams);

        TextView tv = new TextView(this);
        tv.setText("Rules void hello1(int hour)");
        tv.setTextSize(16);
        tv.setPadding(700, 0, 700, 0);
        tv.setTextColor(Color.WHITE);
        tv.setBackgroundColor(Color.BLACK);

        firstRow.addView(tv);
        root.addView(firstRow);

        // this is the second row
        LinearLayout secondRow = new LinearLayout(this);
        secondRow.setOrientation(LinearLayout.HORIZONTAL);
        row_spec = GridLayout.spec(1);
        col_spec = GridLayout.spec(0);
        cParams = new GridLayout.LayoutParams(row_spec, col_spec);
        secondRow.setLayoutParams(cParams);

        tv = new TextView(this);
        tv.setText("properties");
        tv.setTextSize(16);
        tv.setPadding(40, 0, 40, 0);
        tv.setGravity(Gravity.CENTER);
        tv.setTextColor(Color.BLACK);
        tv.setBackgroundColor(Color.WHITE);
        secondRow.addView(tv);

        // the second row's second column is formatted using LinearLayout again...
        // ...but it is vertical
        LinearLayout secondRowSecondColumn = new LinearLayout(this);
        secondRowSecondColumn.setOrientation(LinearLayout.VERTICAL);

        tv = new TextView(this);
        tv.setText("name");
        tv.setTextSize(16);
        tv.setPadding(302, 0, 302, 0);
        tv.setTextColor(Color.BLACK);
        tv.setBackgroundColor(Color.WHITE);
        secondRowSecondColumn.addView(tv);

        tv = new TextView(this);
        tv.setText("category");
        tv.setTextSize(16);
        tv.setPadding(270, 0, 270, 0);
        tv.setTextColor(Color.BLACK);
        tv.setBackgroundColor(Color.WHITE);
        secondRowSecondColumn.addView(tv);

        secondRow.addView(secondRowSecondColumn);

        // the second row's second column is formatted using LinearLayout again...
        // ...but it is vertical as well
        LinearLayout secondRowThirdColumn = new LinearLayout(this);
        secondRowThirdColumn.setOrientation(LinearLayout.VERTICAL);

        tv = new TextView(this);
        tv.setText("Day Hour Classification");
        tv.setTextSize(16);
        tv.setPadding(0, 0, 385, 0);
        tv.setTextColor(Color.BLACK);
        tv.setBackgroundColor(Color.WHITE);
        secondRowThirdColumn.addView(tv);

        tv = new TextView(this);
        tv.setText("Day and Time");
        tv.setTextSize(16);
        tv.setPadding(0, 0, 620, 0);
        tv.setTextColor(Color.BLACK);
        tv.setBackgroundColor(Color.WHITE);
        secondRowThirdColumn.addView(tv);

        secondRow.addView(secondRowThirdColumn);

        root.addView(secondRow);

        // this is the second row
        LinearLayout thirdRow = new LinearLayout(this);
        thirdRow.setOrientation(LinearLayout.HORIZONTAL);
        row_spec = GridLayout.spec(2);
        col_spec = GridLayout.spec(0);
        cParams = new GridLayout.LayoutParams(row_spec, col_spec);
        thirdRow.setLayoutParams(cParams);

        tv = new TextView(this);
        tv.setText("Rule");
        tv.setTypeface(null, Typeface.BOLD);
        tv.setTextSize(16);
        tv.setPadding(115, 0, 115, 0);
        tv.setTextColor(Color.BLACK);
        tv.setBackgroundColor(blue);
        thirdRow.addView(tv);

        tv = new TextView(this);
        tv.setText("C1");
        tv.setTypeface(null, Typeface.BOLD);
        tv.setTextSize(16);
        tv.setPadding(325, 0, 325, 0);
        tv.setTextColor(Color.BLACK);
        tv.setBackgroundColor(blue);
        thirdRow.addView(tv);

        tv = new TextView(this);
        tv.setText("A1");
        tv.setTypeface(null, Typeface.BOLD);
        tv.setTextSize(16);
        tv.setPadding(453, 0, 452, 0);
        tv.setTextColor(Color.BLACK);
        tv.setBackgroundColor(blue);
        thirdRow.addView(tv);

        root.addView(thirdRow);

        // this is the fourth row
        LinearLayout fourthRow = new LinearLayout(this);
        fourthRow.setOrientation(LinearLayout.HORIZONTAL);
        row_spec = GridLayout.spec(3);
        col_spec = GridLayout.spec(0);
        cParams = new GridLayout.LayoutParams(row_spec, col_spec);
        fourthRow.setLayoutParams(cParams);

        tv = new TextView(this);
        tv.setText("f");
        tv.setTextSize(16);
        tv.setPadding(170, 0, 170, 0);
        tv.setTextColor(blue);
        tv.setBackgroundColor(blue);
        fourthRow.addView(tv);

        tv = new TextView(this);
        tv.setText("min <= hour && hour <= max");
        tv.setTextSize(16);
        tv.setTextColor(Color.BLACK);
        tv.setBackgroundColor(blue);
        fourthRow.addView(tv);

        tv = new TextView(this);
        tv.setText(" System.out.println(greeting + \", World!\")");
        tv.setTextSize(16);
        tv.setPadding(0, 0, 15, 0);
        tv.setTextColor(Color.BLACK);
        tv.setBackgroundColor(blue);
        fourthRow.addView(tv);

        root.addView(fourthRow);

        // this is the fifth row
        LinearLayout fifthRow = new LinearLayout(this);
        fifthRow.setOrientation(LinearLayout.HORIZONTAL);
        row_spec = GridLayout.spec(4);
        col_spec = GridLayout.spec(0);
        cParams = new GridLayout.LayoutParams(row_spec, col_spec);
        fifthRow.setLayoutParams(cParams);

        tv = new TextView(this);
        tv.setText("f");
        tv.setTextSize(16);
        tv.setPadding(175, 0, 175, 0);
        tv.setTextColor(blue);
        tv.setBackgroundColor(blue);
        fifthRow.addView(tv);

        tv = new TextView(this);
        tv.setText("int min");
        tv.setTextSize(16);
        tv.setPadding(75, 0, 75, 0);
        tv.setTextColor(Color.BLACK);
        tv.setBackgroundColor(blue);
        fifthRow.addView(tv);

        tv = new TextView(this);
        tv.setText("int max");
        tv.setTextSize(16);
        tv.setPadding(75, 0, 75, 0);
        tv.setTextColor(Color.BLACK);
        tv.setBackgroundColor(blue);
        fifthRow.addView(tv);

        tv = new TextView(this);
        tv.setText("String greeting");
        tv.setTextSize(16);
        tv.setPadding(328, 0, 328, 0);
        tv.setTextColor(Color.BLACK);
        tv.setBackgroundColor(blue);
        fifthRow.addView(tv);

        root.addView(fifthRow);

        // this is the sixth row
        LinearLayout sixthRow = new LinearLayout(this);
        sixthRow.setOrientation(LinearLayout.HORIZONTAL);
        row_spec = GridLayout.spec(5);
        col_spec = GridLayout.spec(0);
        cParams = new GridLayout.LayoutParams(row_spec, col_spec);
        sixthRow.setLayoutParams(cParams);

        tv = new TextView(this);
        tv.setText("Rule");
        tv.setTypeface(null, Typeface.BOLD);
        tv.setTextSize(16);
        tv.setPadding(0, 0, 245, 0);
        tv.setTextColor(Color.BLACK);
        tv.setBackgroundColor(Color.WHITE);
        sixthRow.addView(tv);

        tv = new TextView(this);
        tv.setText("From");
        tv.setTypeface(null, Typeface.BOLD);
        tv.setTextSize(16);
        tv.setPadding(0, 0, 218, 0);
        tv.setTextColor(Color.BLACK);
        tv.setBackgroundColor(yellow);
        sixthRow.addView(tv);

        tv = new TextView(this);
        tv.setText("To");
        tv.setTypeface(null, Typeface.BOLD);
        tv.setTextSize(16);
        tv.setPadding(0, 0, 290, 0);
        tv.setTextColor(Color.BLACK);
        tv.setBackgroundColor(yellow);
        sixthRow.addView(tv);

        tv = new TextView(this);
        tv.setText("Greeting");
        tv.setTypeface(null, Typeface.BOLD);
        tv.setTextSize(16);
        tv.setPadding(0, 0, 775, 0);
        tv.setTextColor(Color.BLACK);
        tv.setBackgroundColor(orange);
        sixthRow.addView(tv);

        root.addView(sixthRow);

        // this is the seventh row
        LinearLayout seventhRow = new LinearLayout(this);
        seventhRow.setOrientation(LinearLayout.HORIZONTAL);
        row_spec = GridLayout.spec(6);
        col_spec = GridLayout.spec(0);
        cParams = new GridLayout.LayoutParams(row_spec, col_spec);
        seventhRow.setLayoutParams(cParams);

        tv = new TextView(this);
        tv.setText("R10");
        tv.setPadding(0, 0, 255, 0);
        tv.setTextSize(16);
        tv.setTextColor(Color.BLACK);
        tv.setBackgroundColor(Color.WHITE);
        seventhRow.addView(tv);

        tv = new TextView(this);
        tv.setText("  0 ");
        tv.setTextSize(16);
        tv.setPadding(0, 0, 300, 0);
        tv.setTextColor(Color.BLACK);
        tv.setBackgroundColor(yellow);
        seventhRow.addView(tv);

        tv = new TextView(this);
        tv.setText(" 11");
        tv.setTextSize(16);
        tv.setPadding(0, 0, 259, 0);
        tv.setTextColor(Color.BLACK);
        tv.setBackgroundColor(yellow);
        seventhRow.addView(tv);

        tv = new TextView(this);
        tv.setText("Good Morning");
        tv.setTextSize(16);
        tv.setPadding(0, 0, 639, 0);
        tv.setTextColor(Color.BLACK);
        tv.setBackgroundColor(orange);
        seventhRow.addView(tv);

        root.addView(seventhRow);

        // this is the eighth row
        LinearLayout eighthRow = new LinearLayout(this);
        eighthRow.setOrientation(LinearLayout.HORIZONTAL);
        row_spec = GridLayout.spec(7);
        col_spec = GridLayout.spec(0);
        cParams = new GridLayout.LayoutParams(row_spec, col_spec);
        eighthRow.setLayoutParams(cParams);

        tv = new TextView(this);
        tv.setText("R20");
        tv.setTextSize(16);
        tv.setPadding(0, 0, 255, 0);
        tv.setTextColor(Color.BLACK);
        tv.setBackgroundColor(Color.WHITE);
        eighthRow.addView(tv);

        tv = new TextView(this);
        tv.setText("12");
        tv.setTextSize(16);
        tv.setPadding(0, 0, 307, 0);
        tv.setTextColor(Color.BLACK);
        tv.setBackgroundColor(yellow);
        eighthRow.addView(tv);

        tv = new TextView(this);
        tv.setText(" 17");
        tv.setTextSize(16);
        tv.setPadding(0, 0, 260, 0);
        tv.setTextColor(Color.BLACK);
        tv.setBackgroundColor(yellow);
        eighthRow.addView(tv);

        tv = new TextView(this);
        tv.setText("Good Afternoon");
        tv.setTextSize(16);
        tv.setPadding(0, 0, 595, 0);
        tv.setTextColor(Color.BLACK);
        tv.setBackgroundColor(orange);
        eighthRow.addView(tv);

        root.addView(eighthRow);

        // this is the ninth row
        LinearLayout ninthRow = new LinearLayout(this);
        ninthRow.setOrientation(LinearLayout.HORIZONTAL);
        row_spec = GridLayout.spec(8);
        col_spec = GridLayout.spec(0);
        cParams = new GridLayout.LayoutParams(row_spec, col_spec);
        ninthRow.setLayoutParams(cParams);

        tv = new TextView(this);
        tv.setText("R30");
        tv.setTextSize(16);
        tv.setPadding(0, 0, 255, 0);
        tv.setTextColor(Color.BLACK);
        tv.setBackgroundColor(Color.WHITE);
        ninthRow.addView(tv);

        tv = new TextView(this);
        tv.setText("18");
        tv.setTextSize(16);
        tv.setPadding(0, 0, 307, 0);
        tv.setTextColor(Color.BLACK);
        tv.setBackgroundColor(yellow);
        ninthRow.addView(tv);

        tv = new TextView(this);
        tv.setText(" 21");
        tv.setTextSize(16);
        tv.setPadding(0, 0, 260, 0);
        tv.setTextColor(Color.BLACK);
        tv.setBackgroundColor(yellow);
        ninthRow.addView(tv);

        tv = new TextView(this);
        tv.setText("Good Evening");
        tv.setTextSize(16);
        tv.setPadding(0, 0, 645, 0);
        tv.setTextColor(Color.BLACK);
        tv.setBackgroundColor(orange);
        ninthRow.addView(tv);

        root.addView(ninthRow);

        // this is the tenth row
        LinearLayout tenthRow = new LinearLayout(this);
        tenthRow.setOrientation(LinearLayout.HORIZONTAL);
        row_spec = GridLayout.spec(9);
        col_spec = GridLayout.spec(0);
        cParams = new GridLayout.LayoutParams(row_spec, col_spec);
        tenthRow.setLayoutParams(cParams);

        tv = new TextView(this);
        tv.setText("R40");
        tv.setTextSize(16);
        tv.setPadding(0, 0, 255, 0);
        tv.setTextColor(Color.BLACK);
        tv.setBackgroundColor(Color.WHITE);
        tenthRow.addView(tv);

        tv = new TextView(this);
        tv.setText("22");
        tv.setTextSize(16);
        tv.setPadding(0, 0, 307, 0);
        tv.setTextColor(Color.BLACK);
        tv.setBackgroundColor(yellow);
        tenthRow.addView(tv);

        tv = new TextView(this);
        tv.setText(" 23");
        tv.setTextSize(16);
        tv.setPadding(0, 0, 260, 0);
        tv.setTextColor(Color.BLACK);
        tv.setBackgroundColor(yellow);
        tenthRow.addView(tv);

        tv = new TextView(this);
        tv.setText("Good Night");
        tv.setTextSize(16);
        tv.setPadding(0, 0, 709, 0);
        tv.setTextColor(Color.BLACK);
        tv.setBackgroundColor(orange);
        tenthRow.addView(tv);

        root.addView(tenthRow);

        scroller.addView(root);
        setContentView(scroller);
    }
}
