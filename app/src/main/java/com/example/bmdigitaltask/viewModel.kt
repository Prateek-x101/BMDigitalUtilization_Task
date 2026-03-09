package com.example.bmdigitaltask

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

class viewModel : ViewModel() {

    private val _products = MutableLiveData<List<itemProducts>>(emptyList())
    val products: LiveData<List<itemProducts>> =  _products

    private val _loading = MutableLiveData<Boolean>(true)
    val loading: LiveData<Boolean> = _loading


    fun fetchProducts() {
        _loading.value = true
        viewModelScope.launch {
            try {
                val response = retrofitInstance.api.getProducts()
                _products.postValue(response)

            } catch(e: Exception) {

            } finally {
                _loading.postValue(false)

            }
        }

    }



}