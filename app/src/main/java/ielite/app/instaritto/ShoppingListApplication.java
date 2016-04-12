package ielite.app.instaritto;

/**
 * Created by Suraj on 07-04-2016.
 */

import com.firebase.client.Firebase;

/**
 * Includes one-time initialization of Firebase related code
 */
public class ShoppingListApplication extends android.app.Application {

    @Override
    public void onCreate() {

        super.onCreate();
        Firebase.setAndroidContext(this);
        // other setup code
    }

}