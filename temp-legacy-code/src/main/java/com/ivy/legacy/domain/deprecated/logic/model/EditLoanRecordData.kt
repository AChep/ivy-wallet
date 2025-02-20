package com.ivy.wallet.domain.deprecated.logic.model

import com.ivy.core.data.model.LoanRecord

data class EditLoanRecordData(
    val newLoanRecord: LoanRecord,
    val originalLoanRecord: LoanRecord,
    val createLoanRecordTransaction: Boolean = false,
    val reCalculateLoanAmount: Boolean = false
)
