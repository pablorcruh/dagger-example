package ec.com.pablorcruh.dagger_example.di;


import dagger.Module;
import dagger.android.ContributesAndroidInjector;
import ec.com.pablorcruh.dagger_example.di.auth.AuthViewModelsModule;
import ec.com.pablorcruh.dagger_example.ui.auth.AuthActivity;

@Module
public abstract class ActivityBuildersModule {

    @ContributesAndroidInjector(
            modules = {
                    AuthViewModelsModule.class
            }
    )
    abstract AuthActivity contributeAuthActivity();
}
