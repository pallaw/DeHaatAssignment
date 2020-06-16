package com.dehaat.dehaatassignment.viewmodel;

import androidx.annotation.NonNull;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;

import com.dehaat.dehaatassignment.repository.AuthorRepo;

/**
 * Created by Pallaw Pathak on 16/06/20. - https://www.linkedin.com/in/pallaw-pathak-a6a324a1/
 */
class ViewModelFactory implements ViewModelProvider.Factory {

    private AuthorRepo authorRepo;

    public ViewModelFactory(AuthorRepo authorRepo) {
        this.authorRepo = authorRepo;
    }

    @NonNull
    @Override
    public <T extends ViewModel> T create(@NonNull Class<T> modelClass) {
        try {
            return modelClass.getConstructor(AuthorRepo.class).newInstance(authorRepo);
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("Can not create instance of " + e);
        }
    }
}
