/*
 * Copyright © 2014-2024 The Android Password Store Authors. All Rights Reserved.
 * SPDX-License-Identifier: GPL-3.0-only
 */

package app.passwordstore.crypto

/**
 * A simple value class wrapping over a [ByteArray] that can represent a PGP key. The implementation
 * details of public/ private parts as well as identities are deferred to [PGPKeyManager].
 */
@JvmInline public value class PGPKey(public val contents: ByteArray)
