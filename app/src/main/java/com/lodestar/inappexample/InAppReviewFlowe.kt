package com.lodestar.inappexample

import android.app.Activity
import android.util.Log
import android.widget.Toast
//import com.google.android.play.core.review.ReviewManagerFactory
//import com.google.android.play.core.review.testing.FakeReviewManager

class InAppReviewFlowe() {
/*
    fun startInAppReviewFlow(rating: Float, context: Activity) {
        val manager = ReviewManagerFactory.create(context)
//        val manager = FakeReviewManager(context)
        val request = manager.requestReviewFlow()
        request.addOnCompleteListener {
            if (it.isSuccessful) {
                val reviewInfo = it.result
                val flow = manager.launchReviewFlow(context, reviewInfo)
                flow.addOnCompleteListener { _ ->
//                    sharedPrefUtil.putBoolean(AppConstants.RATING_DONE, true)
//                    sendFirebaseEvent(CTnFBPropertyConstants.RATING_POPUP_COMPLETED, "true", rating)
//                    ratingDialog.visibility = View.GONE
                    Log.d("999___", "review complete")
                    Toast.makeText(context, "Rating submitted successfully.", Toast.LENGTH_SHORT).show()
                    // The flow has finished. The API does not indicate whether the user
                    // reviewed or not, or even whether the review dialog was shown. Thus, no
                    // matter the result, we continue our app flow.
                }
            } else {
                Log.d("999___", "review in-complete")
                Toast.makeText(context, "Something went wrong. Please try again later.", Toast.LENGTH_SHORT).show()
            }
        }
    }
*/
}