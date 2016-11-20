package me.wilfredlemus.shoppinglist;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;

import java.util.List;


/**
 * Created by walr on 20/11/16.
 */

public class ShoppingListAdapter extends ArrayAdapter<Shoppingitem> {

    public ShoppingListAdapter(Context context, int resource, List objects) {
        super(context, resource, objects);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View result = convertView;
        if (result == null){
            LayoutInflater inflater = LayoutInflater.from(getContext());
            result = inflater.inflate(R.layout.shopping_item, null);
        }

        CheckBox checkbox = (CheckBox) result.findViewById(R.id.shopping_item);
        Shoppingitem item = getItem(position);
        checkbox.setText(item.getText());
        checkbox.setChecked(item.isChecked());
        return result;
    }
}
