package ielite.app.instaritto.ui.activeLists;

import android.app.Activity;
import android.view.View;
import android.widget.TextView;

import com.firebase.ui.FirebaseListAdapter;
import com.firebase.client.Query;

import ielite.app.instaritto.R;
import ielite.app.instaritto.model.ShoppingList;

/**
 * Created by Suraj on 12-04-2016.
 */
public class ActiveListAdapter extends FirebaseListAdapter<ShoppingList> {

    /**
     * Public constructor that initializes private instance variables when adapter is created
     */
    public ActiveListAdapter(Activity activity, Class<ShoppingList> modelClass, int modelLayout,
                             Query ref) {
        super(activity, modelClass, modelLayout, ref);
        this.mActivity = activity;
    }

    /**
     * Protected method that populates the view attached to the adapter (list_view_active_lists)
     * with items inflated from single_active_list.xml
     * populateView also handles data changes and updates the listView accordingly
     */
    @Override
    protected void populateView(View view, ShoppingList list) {

        /**
         * Grab the needed Textivews and strings
         */
        TextView textViewListName = (TextView) view.findViewById(R.id.text_view_list_name);
        TextView textViewCreatedByUser = (TextView) view.findViewById(R.id.text_view_created_by_user);


        /* Set the list name and owner */
        textViewListName.setText(list.getListName());
        textViewCreatedByUser.setText(list.getOwner());
    }
}
