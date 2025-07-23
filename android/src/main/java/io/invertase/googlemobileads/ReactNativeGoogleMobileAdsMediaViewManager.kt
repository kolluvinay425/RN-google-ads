package io.invertase.googlemobileads

import com.facebook.react.uimanager.ViewGroupManager
import com.facebook.react.uimanager.ThemedReactContext

class ReactNativeGoogleMobileAdsMediaViewManager :
  ViewGroupManager<ReactNativeGoogleMobileAdsMediaView>() {

  override fun getName(): String {
    return "RNGoogleMobileAdsMediaView"
  }

  override fun createViewInstance(context: ThemedReactContext): ReactNativeGoogleMobileAdsMediaView {
    return ReactNativeGoogleMobileAdsMediaView(context)
  }
}