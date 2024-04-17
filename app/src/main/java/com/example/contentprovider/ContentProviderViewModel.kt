package com.example.contentprovider

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel

class ContentProviderViewModel: ViewModel() {
    var imageState = mutableStateOf(emptyList<ContentProviderDataItem>())

    fun updateImages(images: List<ContentProviderDataItem>){
        imageState.value = images
    }
}

