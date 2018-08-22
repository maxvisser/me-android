package io.forus.me.android.presentation.view.screens.account.restoreByEmail


import com.ocrv.ekasui.mrm.ui.loadRefresh.PartialChange
import io.forus.me.android.domain.models.account.RequestDelegatesEmailModel

sealed class RestoreByEmailPartialChanges : PartialChange {

    class RestoreIdentity(): RestoreByEmailPartialChanges()

    class RestoreByEmailRequestStart() : RestoreByEmailPartialChanges()

    data class RestoreByEmailRequestEnd(val requestDelegatesEmailModel: RequestDelegatesEmailModel) : RestoreByEmailPartialChanges()

    data class RestoreByEmailRequestError(val error: Throwable) : RestoreByEmailPartialChanges()

}