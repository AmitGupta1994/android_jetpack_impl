package com.amitgupta.android_jetpack_impl.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.amitgupta.android_jetpack_impl.R
import kotlinx.android.synthetic.main.fragment_login.*

class LoginFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_login, container, false)
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        listOf<View>(btn_login, tv_forgot_password, tv_signup).forEach {
            it.setOnClickListener(
                onClick
            )
        }

    }

    private val onClick = View.OnClickListener {
        when (it) {
            btn_login -> {
                val bundle = bundleOf(
                    "from" to javaClass.simpleName,
                    "message" to "LoginFragment to DashBoardActivity"
                )
                navigate(R.id.action_loginFragment_to_dashBoardActivity, bundle)
                activity?.finish()
            }
            tv_forgot_password -> {
                val bundle = bundleOf(
                    "from" to javaClass.simpleName,
                    "message" to "LoginFragment to ForgotPassword"
                )
                navigate(R.id.action_loginFragment_to_forgotPasswordFragment, bundle)
            }
            tv_signup -> {
                val bundle = bundleOf(
                    "from" to javaClass.simpleName,
                    "message" to "LoginFragment to SignUpFragment"
                )
                navigate(R.id.action_loginFragment_to_signUpFragment, bundle)
            }

        }
    }

    private fun navigate(resId: Int, bundle: Bundle) {
        view?.let { Navigation.findNavController(it).navigate(resId, bundle) }
    }

}
