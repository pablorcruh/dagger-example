package ec.com.pablorcruh.dagger_example.di;


import dagger.Module;
import dagger.android.ContributesAndroidInjector;
import ec.com.pablorcruh.dagger_example.AuthActivity;

@Module
public abstract class ActivityBuildersModule {

    @ContributesAndroidInjector
    abstract AuthActivity contributeAuthActivity();
}
