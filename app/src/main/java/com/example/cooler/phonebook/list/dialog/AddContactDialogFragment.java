package com.example.cooler.phonebook.list.dialog;

import android.app.Dialog;
import android.app.DialogFragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.EditText;

import com.example.cooler.phonebook.R;

/**
 * Created by cooler on 18.11.2017.
 */

public class AddContactDialogFragment extends DialogFragment implements View.OnClickListener {

    private EditText inputName;
    private EditText inputLastName;

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
        View view = inflater.inflate(R.layout.dialog_add_contact, container, false);
        assignView(view);
        return view;
    }

    private void assignView(View view) {
        view.findViewById(R.id.cancel).setOnClickListener(this);
        view.findViewById(R.id.add_contact).setOnClickListener(this);
        inputName = (EditText) view.findViewById(R.id.name);
        inputLastName = (EditText) view.findViewById(R.id.last_name);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.cancel:
                dismiss();
                break;
            case R.id.add_contact:
                if (iConfirmDialog != null) {
                    iConfirmDialog.onConfirm(inputName.getText().toString(),
                            inputLastName.getText().toString());
                    dismiss();
                }
                break;
        }
    }
}
