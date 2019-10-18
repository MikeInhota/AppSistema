package br.com.myapplication;

import android.app.Activity;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class CustomAdapter extends ArrayAdapter {

    private final Activity context;
    private final String[] nameArray;
    private final String[] infoArray;


    public CustomAdapter(Activity context, String[] nameArrayParam, String[] infoArrayParam){

        super(context,R.layout.listview_row, nameArrayParam);


        this.context = context;
        this.nameArray = nameArrayParam;
        this.infoArray = infoArrayParam;
    }


    public View getView (int position, View view, ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View rowView=inflater.inflate(R.layout.listview_row, null, true);

        TextView nameTextField = (TextView)
                rowView.findViewById(R.id.nameTextViewId);
        TextView infoTextField = (TextView)
                rowView.findViewById(R.id.infoTextViewId);

        nameTextField.setText(nameArray[position]);
        infoTextField.setText(infoArray[position]);

        return rowView;
    }

}
