package com.test.car.car_app_service

import android.content.Intent
import androidx.car.app.CarAppService
import androidx.car.app.Screen
import androidx.car.app.Session
import androidx.car.app.validation.HostValidator


/**
 * @see
 * */

class PlacesCarAppService : CarAppService() {
    override fun createHostValidator(): HostValidator {
        TODO("Not yet implemented")
    }

//    override fun onCreateSession(): Session {
////        return PlacesSession()
//    }
}
//
//class PlacesSession: Session() {
//    override fun onCreateScreen(intent: Intent): Screen {
////        return MainScreen(carContext)
//    }
//}