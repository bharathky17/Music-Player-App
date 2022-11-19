// Generated by view binder compiler. Do not edit!
package com.Bharath.musicPlayer.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.Bharath.musicPlayer.R;
import com.google.android.material.button.MaterialButton;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class MoreFeaturesBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final MaterialButton AddToPNBtn;

  @NonNull
  public final MaterialButton infoBtn;

  private MoreFeaturesBinding(@NonNull LinearLayout rootView, @NonNull MaterialButton AddToPNBtn,
      @NonNull MaterialButton infoBtn) {
    this.rootView = rootView;
    this.AddToPNBtn = AddToPNBtn;
    this.infoBtn = infoBtn;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static MoreFeaturesBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static MoreFeaturesBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.more_features, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static MoreFeaturesBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.AddToPNBtn;
      MaterialButton AddToPNBtn = ViewBindings.findChildViewById(rootView, id);
      if (AddToPNBtn == null) {
        break missingId;
      }

      id = R.id.infoBtn;
      MaterialButton infoBtn = ViewBindings.findChildViewById(rootView, id);
      if (infoBtn == null) {
        break missingId;
      }

      return new MoreFeaturesBinding((LinearLayout) rootView, AddToPNBtn, infoBtn);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
