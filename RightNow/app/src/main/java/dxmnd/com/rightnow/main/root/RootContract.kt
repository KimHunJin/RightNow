package dxmnd.com.rightnow.main.root

import dxmnd.com.rightnow.base.BasePresenter
import dxmnd.com.rightnow.base.BaseView

interface RootContract {

    interface View : BaseView<Presenter> {

    }

    interface Presenter : BasePresenter {

    }

}