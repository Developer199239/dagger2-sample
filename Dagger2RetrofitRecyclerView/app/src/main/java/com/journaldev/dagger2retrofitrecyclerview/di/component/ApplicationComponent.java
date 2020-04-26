package com.journaldev.dagger2retrofitrecyclerview.di.component;

import android.content.Context;

import com.journaldev.dagger2retrofitrecyclerview.MyApplication;
import com.journaldev.dagger2retrofitrecyclerview.di.module.ContextModule;
import com.journaldev.dagger2retrofitrecyclerview.di.module.RetrofitModule;
import com.journaldev.dagger2retrofitrecyclerview.di.qualifier.ApplicationContext;
import com.journaldev.dagger2retrofitrecyclerview.di.scopes.ApplicationScope;
import com.journaldev.dagger2retrofitrecyclerview.retrofit.APIInterface;

import javax.inject.Named;

import dagger.Component;

@ApplicationScope
@Component(modules = {ContextModule.class, RetrofitModule.class})
public interface ApplicationComponent {
    @Named("auth")
    public APIInterface getApiInterfaceAuth();

    @Named("location")
    public APIInterface getApiInterfaceLocation();


    @ApplicationContext
    public Context getContext();

    public void injectApplication(MyApplication myApplication);
}
