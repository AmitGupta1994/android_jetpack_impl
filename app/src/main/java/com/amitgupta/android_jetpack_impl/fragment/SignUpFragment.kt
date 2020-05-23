package com.amitgupta.android_jetpack_impl.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.amitgupta.android_jetpack_impl.R
import kotlinx.android.synthetic.main.fragment_signup.*

class SignUpFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_signup, container, false)

        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        Toast.makeText(activity,arguments?.get("message") as String, Toast.LENGTH_SHORT).show()

        signup.setOnClickListener {
            navigate(R.id.action_signUpFragment_to_profileFragment)
        }
    }

    private fun navigate(resId: Int, bundle: Bundle? = null) {
        view?.let { Navigation.findNavController(it).navigate(resId, bundle) }
    }
}
