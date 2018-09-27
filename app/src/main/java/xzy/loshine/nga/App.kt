package xzy.loshine.nga

import dagger.android.AndroidInjector
import dagger.android.support.DaggerApplication
import xzy.loshine.nga.di.components.DaggerAppComponent

class App : DaggerApplication() {

    override fun applicationInjector(): AndroidInjector<out DaggerApplication> {
        return DaggerAppComponent.builder()
                .application(this)
                .build()
    }

}