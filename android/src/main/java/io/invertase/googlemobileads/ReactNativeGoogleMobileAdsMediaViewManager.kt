@ReactModule(name = ReactNativeGoogleMobileAdsMediaViewManager.NAME)
class ReactNativeGoogleMobileAdsMediaViewManager(
  private val reactContext: ReactApplicationContext
) : ViewGroupManager<ReactNativeGoogleMobileAdsMediaView>(),
  RNGoogleMobileAdsMediaViewManagerInterface<ReactNativeGoogleMobileAdsMediaView> {
  
  private val delegate: ViewManagerDelegate<ReactNativeGoogleMobileAdsMediaView> = RNGoogleMobileAdsMediaViewManagerDelegate(this)

  override fun getDelegate(): ViewManagerDelegate<ReactNativeGoogleMobileAdsMediaView> = delegate

  override fun getName(): String = NAME

  override fun createViewInstance(context: ThemedReactContext): ReactNativeGoogleMobileAdsMediaView =
    ReactNativeGoogleMobileAdsMediaView(context)

  @ReactProp(name = "responseId")
  override fun setResponseId(view: ReactNativeGoogleMobileAdsMediaView, responseId: String?) {
    view.setResponseId(responseId)
  }

  @ReactProp(name = "resizeMode")
  override fun setResizeMode(view: ReactNativeGoogleMobileAdsMediaView, resizeMode: String?) {
    view.setResizeMode(resizeMode)
  }

  companion object {
    const val NAME = "RNGoogleMobileAdsMediaView"
  }
}