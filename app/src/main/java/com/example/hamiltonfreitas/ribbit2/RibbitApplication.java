package com.example.hamiltonfreitas.ribbit2;

import android.app.Application;

import com.parse.Parse;

/**
 * Created by hamilton.freitas on 2015-07-29.
 */
public class RibbitApplication extends Application{

    @Override
    public void onCreate(){
        super.onCreate();
        // Enable Local Datastore.
        Parse.enableLocalDatastore(this);

        Parse.initialize(this, "vgEnQe5mkye8HtUjYSnfhlkdOrA9lG5w8deJHoby", "mOgUu1lJGhde3VsnWqIyEQudqvrUO1i7yaTUYt6T");

    }
}
