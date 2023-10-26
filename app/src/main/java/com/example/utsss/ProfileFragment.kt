package com.example.utsss

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.utsss.databinding.FragmentProfileBinding

class ProfileFragment : Fragment() {
    private var _binding: FragmentProfileBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentProfileBinding.inflate(inflater, container, false)
        val rootView = binding.root

        // Isi data pengguna sesuai kebutuhan
        binding.usernameTextView.text = "Username: John Doe"
        binding.githubUsernameTextView.text = "GitHub: johndoe"
        binding.nikTextView.text = "NIK: 123456789"
        binding.emailTextView.text = "Email: johndoe@example.com"

        // Atur OnClickListener untuk tombol logout
        binding.logoutButton.setOnClickListener {
            // Handle logout logic di sini
        }

        return rootView
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }