package com.uxicons.compose.uicons.brand

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Dropbox: ImageVector? = null

val Icons.Brand.Dropbox: ImageVector
    get() = _Dropbox ?: UXIcon(name = "Dropbox") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(12f, 5.63f)
            lineTo(6f, 9.46f)
            lineToRelative(6f, 3.82f)
            lineToRelative(-6f, 3.82f)
            lineToRelative(-6f, -3.82f)
            lineToRelative(6f, -3.82f)
            lineTo(0f, 5.63f)
            lineToRelative(6f, -3.82f)
            lineTo(12f, 5.63f)
            close()
            moveTo(5.98f, 18.37f)
            lineToRelative(6f, -3.82f)
            lineToRelative(6f, 3.82f)
            lineToRelative(-6f, 3.82f)
            lineTo(5.98f, 18.37f)
            close()
            moveTo(12f, 13.28f)
            lineToRelative(6f, -3.82f)
            lineToRelative(-6f, -3.82f)
            lineToRelative(6f, -3.82f)
            lineToRelative(6f, 3.82f)
            lineToRelative(-6f, 3.82f)
            lineToRelative(6f, 3.82f)
            lineToRelative(-6f, 3.82f)
            lineTo(12f, 13.28f)
            close()
        }
    }.also { _Dropbox = it }
