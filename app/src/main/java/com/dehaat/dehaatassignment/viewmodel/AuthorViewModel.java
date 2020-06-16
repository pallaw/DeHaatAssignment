package com.dehaat.dehaatassignment.viewmodel;

import com.dehaat.dehaatassignment.repository.AuthorRepo;

/**
 * Created by Pallaw Pathak on 16/06/20. - https://www.linkedin.com/in/pallaw-pathak-a6a324a1/
 */
class AuthorViewModel {
    private AuthorRepo authorRepo;

    public AuthorViewModel(AuthorRepo authorRepo) {
        this.authorRepo = authorRepo;
    }
}
