package com.example.cooler.phonebook.list.dialog;

import android.app.Dialog;
import android.app.DialogFragment;
import android.app.FragmentManager;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;

import com.example.cooler.phonebook.R;

/**
 * Created by cooler on 18.11.2017.
 */

public class DeleteContactDialogFragment extends DialogFragment implements View.OnClickListener {

    private IConfirmDialog iConfirmDialog;

    public void setConfirmDialog(IConfirmDialog iConfirmDialog) {
        this.iConfirmDialog = iConfirmDialog;
    }

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        Dialog dialog = super.onCreateDialog(savedInstanceState);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        return dialog;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.dialog_confirm_delete, container, false);
        assignView(view);
        return view;
    }

    private void assignView(View view) {
        view.findViewById(R.id.cancel).setOnClickListener(this);
        view.findViewById(R.id.delete_contact).setOnClickListener(this);
        String confirmText = getResources().getString(R.string.confirm_text) + " " + getTag();
        ((TextView)view.findViewById(R.id.confirm_text)).setText(confirmText);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.cancel:
                dismiss();
                break;
            case R.id.delete_contact:
                if (iConfirmDialog != null) {
                    iConfirmDialog.onConfirm();
                    dismiss();
                }
                break;
        }
    }
}
