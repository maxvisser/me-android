package io.forus.me.android.presentation.navigation

import android.content.Context
import io.forus.me.android.domain.models.records.Record
import io.forus.me.android.domain.models.records.RecordCategory
import io.forus.me.android.domain.models.wallets.Wallet
import io.forus.me.android.presentation.view.screens.account.assigndelegates.AssignDelegatesAccountActivity
import io.forus.me.android.presentation.view.screens.account.newaccount.NewAccountActivity
import io.forus.me.android.presentation.view.screens.account.newaccount.pin.NewPinActivity
import io.forus.me.android.presentation.view.screens.account.restoreByEmail.RestoreByEmailActivity
import io.forus.me.android.presentation.view.screens.dashboard.DashboardActivity
import io.forus.me.android.presentation.view.screens.pinlock.PinLockActivity
import io.forus.me.android.presentation.view.screens.qr.QrScannerActivity
import io.forus.me.android.presentation.view.screens.records.item.RecordDetailsActivity
import io.forus.me.android.presentation.view.screens.records.list.RecordsActivity
import io.forus.me.android.presentation.view.screens.records.newrecord.NewRecordActivity
import io.forus.me.android.presentation.view.screens.vouchers.item.VoucherActivity
import io.forus.me.android.presentation.view.screens.wallets.item.WalletDetailsActivity
import io.forus.me.android.presentation.view.screens.welcome.WelcomeActivity
import javax.inject.Inject
import javax.inject.Singleton

/**
 * Class used to navigate through the application.
 */
@Singleton
class Navigator @Inject
constructor()//empty
{

    fun navigateToDashboard(context: Context?, locked: Boolean) {
        if (context != null) {
            val intentToLaunch = DashboardActivity.getCallingIntent(context)
            if(locked){
                val lockIntent = PinLockActivity.getCallingIntent(context, intentToLaunch)
                context.startActivity(lockIntent)
            }
            else context.startActivity(intentToLaunch)
        }
    }


    fun navigateToWelcomeScreen(context: Context?) {
        if (context != null) {
            val intentToLaunch = WelcomeActivity.getCallingIntent(context)
            context.startActivity(intentToLaunch)
        }
    }


    fun navigateToAccountRestore(context: Context?) {
        if (context != null) {
            val intentToLaunch = AssignDelegatesAccountActivity.getCallingIntent(context)
            context.startActivity(intentToLaunch)
        }
    }


    fun navigateToQrScanner(context: Context?) {
        if (context != null) {
            val intentToLaunch = QrScannerActivity.getCallingIntent(context)
            context.startActivity(intentToLaunch)
        }
    }

    fun navigateToAccountNew(context: Context?) {
        if (context != null) {
            val intentToLaunch = NewAccountActivity.getCallingIntent(context)
            context.startActivity(intentToLaunch)
        }
    }

    fun navigateToPinNew(context: Context?, accessToken: String){
        if (context != null) {
            val intentToLaunch = NewPinActivity.getCallingIntent(context, accessToken)
            context.startActivity(intentToLaunch)
        }
    }

    fun navigateToAccountRestoreByEmail(context: Context?) {
        if (context != null) {
            val intentToLaunch = RestoreByEmailActivity.getCallingIntent(context)
            context.startActivity(intentToLaunch)
        }
    }

    fun navigateToWallet(context: Context?, wallet: Wallet) {
        if (context != null) {
            val intentToLaunch = WalletDetailsActivity.getCallingIntent(context, wallet)
            context.startActivity(intentToLaunch)
        }
    }

    fun navigateToVoucher(context: Context?, id: String) {
        if (context != null) {
            val intentToLaunch = VoucherActivity.getCallingIntent(context, id)
            context.startActivity(intentToLaunch)
        }
    }

    fun navigateToNewRecord(context: Context?) {
        if (context != null) {
            val intentToLaunch = NewRecordActivity.getCallingIntent(context)
            context.startActivity(intentToLaunch)
        }
    }

    fun navigateToRecordsList(context: Context?, recordCategory: RecordCategory) {
        if (context != null) {
            val intentToLaunch = RecordsActivity.getCallingIntent(context, recordCategory)
            context.startActivity(intentToLaunch)
        }
    }

    fun navigateToRecordDetails(context: Context?, record: Record) {
        if (context != null) {
            val intentToLaunch = RecordDetailsActivity.getCallingIntent(context, record)
            context.startActivity(intentToLaunch)
        }
    }
}
