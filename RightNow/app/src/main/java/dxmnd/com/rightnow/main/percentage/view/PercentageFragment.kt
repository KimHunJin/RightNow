package dxmnd.com.rightnow.main.percentage.view

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import dxmnd.com.rightnow.main.percentage.PercentageContract

class PercentageFragment : Fragment(), PercentageContract.View {
    override lateinit var presenter: PercentageContract.Presenter

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return super.onCreateView(inflater, container, savedInstanceState)
    }

    companion object {
        fun newInstance() : PercentageFragment {
            return PercentageFragment()
        }
    }
}