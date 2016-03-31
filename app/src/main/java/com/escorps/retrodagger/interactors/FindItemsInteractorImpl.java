package com.escorps.retrodagger.interactors;

import com.escorps.retrodagger.api.MyApi;
import com.escorps.retrodagger.models.PetModel;
import com.escorps.retrodagger.ui.main.OnFinishedListener;

import java.util.List;

import javax.inject.Inject;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class FindItemsInteractorImpl implements FindItemsInteractor {

    MyApi getPetsApi;

    @Inject public FindItemsInteractorImpl(MyApi getPetsApi) {
        this.getPetsApi = getPetsApi;
    }

    @Override public void findItems(final OnFinishedListener listener) {


        getPetsApi.getPets(new Callback<List<PetModel>>() {
            @Override
            public void onResponse(Call<List<PetModel>> call, Response<List<PetModel>> response) {
                listener.onFinished(response.body());
            }

            @Override
            public void onFailure(Call<List<PetModel>> call, Throwable t) {

            }
        });

    }
}
