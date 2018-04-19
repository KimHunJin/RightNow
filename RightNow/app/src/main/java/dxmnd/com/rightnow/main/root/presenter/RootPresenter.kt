package dxmnd.com.rightnow.main.root.presenter

import dxmnd.com.rightnow.main.root.RootContract


class RootPresenter(rootView: RootContract.View) : RootContract.Presenter {
    init {
        rootView.presenter = this
    }
}