package fr.vbe.android.base.extensions

import android.content.Context
import android.content.res.Resources

/**
 * Created by Vincent on 4/22/2018.
 */

/**
 * Retrieve a string from the resource, using the name of the resource.
 */
fun Context.getString(resName: String): String {
    val id = resources.getIdentifier(resName, "string", packageName)
    return try {
        if (id == 0) resName else resources.getString(id)
    }
    catch (ex: Resources.NotFoundException) {
        resName
    }
}