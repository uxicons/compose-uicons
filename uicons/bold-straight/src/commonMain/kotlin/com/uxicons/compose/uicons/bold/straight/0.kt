package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _0: ImageVector? = null

val Icons.Bs.Zero: ImageVector
    get() = _0 ?: UXIcon(name = "0") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(12f, 24f)
            curveToRelative(-4.41f, 0f, -8f, -3.59f, -8f, -8f)
            lineTo(4f, 8f)
            curveTo(4f, 3.59f, 7.59f, 0f, 12f, 0f)
            reflectiveCurveToRelative(8f, 3.59f, 8f, 8f)
            verticalLineToRelative(8f)
            curveToRelative(0f, 4.41f, -3.59f, 8f, -8f, 8f)
            close()
            moveTo(12f, 3f)
            curveToRelative(-2.76f, 0f, -5f, 2.24f, -5f, 5f)
            verticalLineToRelative(8f)
            curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
            reflectiveCurveToRelative(5f, -2.24f, 5f, -5f)
            lineTo(17f, 8f)
            curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
            close()
        }
    }.also { _0 = it }
