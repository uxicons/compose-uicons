package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Check: ImageVector? = null

val Icons.Rs.Check: ImageVector
    get() = _Check ?: UXIcon(name = "Check") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(7.8f, 20.53f)
                arcToRelative(2.99f, 2.99f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.12f, -0.88f)
                lineTo(0.09f, 14.06f)
                lineTo(1.5f, 12.65f)
                lineToRelative(5.59f, 5.59f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.41f, 0f)
                lineTo(22.5f, 4.25f)
                lineTo(23.91f, 5.66f)
                lineTo(9.92f, 19.65f)
                arcTo(2.99f, 2.99f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.8f, 20.53f)
                close()
            }
        }.also { _Check = it}
