package com.example.user.currencyconverter;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomListAdapter extends ArrayAdapter {

    // to reference the Activity
    private  final Activity context;

    // to store the images
    private final Integer[] imageIDarray;

    // to store the text
    private final String[] nameArray;

    public CustomListAdapter(Activity context, String[] nameArrayParam, Integer[] imageIDarrayParam){
        super(context, R.layout.listview_row, nameArrayParam);

        this.context = context;
        this.imageIDarray = imageIDarrayParam;
        this.nameArray = nameArrayParam;
    }

    public View getView(int position, View view, ViewGroup parent){
        LayoutInflater inflater = context.getLayoutInflater();
        View rowView = inflater.inflate(R.layout.listview_row, null, true);

        // getting reference to the objects in the listview
        TextView nameTextField = (TextView) rowView.findViewById(R.id.textViewId);
        ImageView imageView = (ImageView) rowView.findViewById(R.id.imageViewId);

        // setting the values of the objects to the values of the array
        nameTextField.setText(nameArray[position]);
        imageView.setImageResource(imageIDarray[position]);

        return rowView;
    }
}
