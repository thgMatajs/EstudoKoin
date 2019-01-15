package com.thg.estudokoin

import com.google.gson.Gson
import com.thg.estudokoin.data.DataRepository
import com.thg.estudokoin.data.DataRepositoryFactory
import com.thg.estudokoin.data.LocalDataRepository
import com.thg.estudokoin.data.RemoteDataRepository
import com.thg.estudokoin.helper.UrlHelper
import com.thg.estudokoin.presentation.CurrenciesAdapter
import com.thg.estudokoin.presentation.CurrenciesViewModel
import org.koin.android.viewmodel.ext.koin.viewModel
import org.koin.dsl.module.module

val applicationModule = module {
    single { Gson() }
    single { UrlHelper() }

    factory { CurrenciesAdapter() }
    factory<DataRepository>("local") { LocalDataRepository(get()) }
    factory<DataRepository>("remote") { RemoteDataRepository() }

    factory { DataRepositoryFactory(get("local"), get("remote")) }
    viewModel { CurrenciesViewModel(get()) }
}