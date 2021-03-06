package com.luxoft.blockchainlab.poc.ssi.ssimobile.data

import com.luxoft.blockchainlab.poc.ssi.ssimobile.utils.InstantCompat

data class VerificationEvent(
    val verificationInstant: InstantCompat,
    val requestedAttributeNames: Set<String>,
    val verifier: VerifierInfo
)

data class VerifierInfo(
    val did: String,
    val name: String,
    val address: String,
    val contactPhone: String
)

fun verifierInfoFromDid(did: String) =
        VerifierInfo(did,
                name = "Cherry Hill Medical Center",
                address = "511 16th Ave, Seattle, WA 98122",
                contactPhone = "(206) 320-2000")

val dummyVerificationEvent = VerificationEvent(InstantCompat.now(), emptySet(), verifierInfoFromDid("???"))