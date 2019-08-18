package me.jdvp.baseandroidapplication.viewmodel.impl

import dagger.Module
import me.jdvp.baseandroidapplication.service.ServiceModule

/**
 * Module that provides ViewModel dependencies. Also includes lower-level modules. In this case, we are including a module
 * for Services but if we wanted to also do caching, we might have another layer between the VM and services.
 */

@Module(includes = [ServiceModule::class])
class ViewModelModule {

}