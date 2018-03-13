package nl.rocvantwente.rsk01.demolistview;

import android.content.Context;
import android.graphics.Color;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Gebruiker on 12-3-2018.
 */

public class GetalAdapter extends ArrayAdapter<Integer> {
    public GetalAdapter(@NonNull Context context, ArrayList<Integer> getallen) {
        super(context, 0, getallen);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(
                    R.layout.getal_layout, parent, false
            );


        }
        TextView tvGetal = convertView.findViewById(R.id.textViewGetal);
        tvGetal.setText("" + getItem(position));
        if (position % 2 == 0) {
            convertView.setBackgroundColor(Color.LTGRAY);
        } else {
            convertView.setBackgroundColor(Color.WHITE);
        }
        return convertView;
    }
}
