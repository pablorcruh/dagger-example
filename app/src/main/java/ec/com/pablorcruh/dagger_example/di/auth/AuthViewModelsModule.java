package ec.com.pablorcruh.dagger_example.di.auth;

import androidx.lifecycle.ViewModel;

import dagger.Binds;
import dagger.Module;
import dagger.multibindings.IntoMap;
import ec.com.pablorcruh.dagger_example.di.ViewModelKey;
import ec.com.pablorcruh.dagger_example.ui.auth.AuthViewModel;

@Module
public abstract class AuthViewModelsModule {

    @Binds
    @IntoMap
    @ViewModelKey(AuthViewModel.class)
    public abstract ViewModel bindAuthviewModel(AuthViewModel viewModel);
}
