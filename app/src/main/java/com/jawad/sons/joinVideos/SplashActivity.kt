package com.jawad.sons.joinVideos

import android.Manifest
import android.content.Intent
import android.os.Bundle
import com.karumi.dexter.Dexter
import com.karumi.dexter.MultiplePermissionsReport
import com.karumi.dexter.PermissionToken
import com.karumi.dexter.listener.PermissionRequest
import com.karumi.dexter.listener.multi.MultiplePermissionsListener

class SplashActivity : BaseActivity() {

    private fun initPermission() {
        Dexter.withActivity(this)
            .withPermissions(
                Manifest.permission.READ_EXTERNAL_STORAGE,
                Manifest.permission.WRITE_EXTERNAL_STORAGE,
                Manifest.permission.RECORD_AUDIO,
                Manifest.permission.CAMERA
            )
            .withListener(object : MultiplePermissionsListener {
                override fun onPermissionsChecked(report: MultiplePermissionsReport?) {
                    if (report?.areAllPermissionsGranted() == true) {

                        val intent = Intent(this@SplashActivity, ComposerJoinActivity::class.java)
                        intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK
                        startActivity(intent)
                        finish()
//                        val fileBottomSheetFragmentDialog = FilePickerBottomSheetDialog()
//                        fileBottomSheetFragmentDialog.show(
//                            childFragmentManager,
//                            FilePickerBottomSheetDialog.AddBottomSheetFragmentDialog_Tag
//                        )

                    }
                }

                override fun onPermissionRationaleShouldBeShown(
                    permissions: MutableList<PermissionRequest>?,
                    token: PermissionToken?
                ) {
                    token?.continuePermissionRequest()
                }
            }).check()
    }

    override fun onBaseCreate(savedInstanceState: Bundle?) {
        initPermission()
    }
}