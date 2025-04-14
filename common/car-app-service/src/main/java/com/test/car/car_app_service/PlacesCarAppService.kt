package com.test.car.car_app_service

import android.content.Intent
import android.util.Log
import androidx.car.app.CarAppService
import androidx.car.app.Screen
import androidx.car.app.Session
import androidx.car.app.validation.HostValidator
import com.test.car.car_app_service.screen.MainScreen


/**
 * @see
 * */

class PlacesCarAppService : CarAppService() {
    override fun createHostValidator(): HostValidator {
        return HostValidator.ALLOW_ALL_HOSTS_VALIDATOR
    }

    override fun onCreateSession(): Session {
        return PlacesSession()
    }
}

class PlacesSession: Session() {
    override fun onCreateScreen(intent: Intent): Screen {
        val apiLevel = carContext.carAppApiLevel
        Log.d("CarAPI", "호스트가 지원하는 API 수준 : ${apiLevel}")
        return MainScreen(carContext)
    }
}