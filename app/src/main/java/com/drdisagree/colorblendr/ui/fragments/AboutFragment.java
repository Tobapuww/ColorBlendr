package com.drdisagree.colorblendr.ui.fragments;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.drdisagree.colorblendr.BuildConfig;
import com.drdisagree.colorblendr.R;
import com.drdisagree.colorblendr.databinding.FragmentAboutBinding;

public class AboutFragment extends Fragment {

    private FragmentAboutBinding binding;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        binding = FragmentAboutBinding.inflate(inflater, container, false);

        binding.github.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/Mahmud0808/ColorBlendr"))));

        binding.versionCodes.setText(
                getString(
                        R.string.version_codes,
                        BuildConfig.VERSION_NAME,
                        BuildConfig.VERSION_CODE
                )
        );

        binding.developer.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/Mahmud0808"))));

        binding.buymeacoffee.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://buymeacoffee.com/drdisagree"))));

        return binding.getRoot();
    }
}