package com.mirea.dialog;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.os.Bundle;
import android.widget.DatePicker;

import androidx.annotation.NonNull;
import androidx.fragment.app.DialogFragment;

import java.util.Calendar;

public class MyProgressDialogFragment extends DialogFragment {
    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle saveInstanceState) {
        ProgressDialog dialog = new ProgressDialog(getActivity());
        dialog.show();
        dialog.setMessage("mirea");
        return dialog;
    }
}
