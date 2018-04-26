package fr.vbe.android.base.text

import android.content.Context

/**
 * Representing a label, that can either be coming from resources or custom.
 */
class VBELabel {
    val labelResId: Int?
    val label: String?

    private constructor(labelResId: Int?, label: String?) {
        this.labelResId = labelResId
        this.label = label
    }
    constructor(labelResId: Int) : this(labelResId, null)
    constructor(label: String) : this(null, label)

    fun hasLabelResId() = labelResId != null
    fun hasLabel() = label != null

    fun isNotEmpty() = hasLabel() || hasLabelResId()
    fun isEmpty() = !isNotEmpty()

    fun get(context: Context): String {
        return when {
            label != null -> label
            labelResId != null -> context.getString(labelResId)
            else -> ""
        }
    }
}