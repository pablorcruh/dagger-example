package ec.com.pablorcruh.dagger_example;

import dagger.android.AndroidInjector;
import dagger.android.support.DaggerApplication;
import ec.com.pablorcruh.dagger_example.di.DaggerAppComponent;

public class BaseApplication extends dagger.android.support.DaggerApplication {

    @Override
    protected AndroidInjector<? extends DaggerApplication> applicationInjector(){
        return DaggerAppComponent.builder().application(this).build();
    }
}
