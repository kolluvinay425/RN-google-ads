package io.invertase.googlemobileads

import com.facebook.react.uimanager.ViewGroupManager
import com.facebook.react.uimanager.ThemedReactContext

class ReactNativeGoogleMobileAdsNativeAdViewManager :
  ViewGroupManager<ReactNativeGoogleMobileAdsNativeAdView>() {

  override fun getName(): String {
    return "RNGoogleMobileAdsNativeAdView"
  }

  override fun createViewInstance(context: ThemedReactContext): ReactNativeGoogleMobileAdsNativeAdView {
    return ReactNativeGoogleMobileAdsNativeAdView(context)
  }
}