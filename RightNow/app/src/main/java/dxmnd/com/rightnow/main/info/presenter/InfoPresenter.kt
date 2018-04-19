package dxmnd.com.rightnow.main.info.presenter

import dxmnd.com.rightnow.main.info.InfoContract

class InfoPresenter(infoView : InfoContract.View) : InfoContract.Presenter {

    init {
        infoView.presenter = this
    }

}