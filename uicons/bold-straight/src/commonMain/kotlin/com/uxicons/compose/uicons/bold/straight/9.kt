package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _9: ImageVector? = null

val Icons.Bs.Nine: ImageVector
    get() = _9 ?: UXIcon(name = "9") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(20.0f, 8f)
            curveTo(19.86f, 3.74f, 16.48f, 0.18f, 12.35f, 0.01f)
            curveToRelative(-2.15f, -0.1f, -4.21f, 0.66f, -5.78f, 2.12f)
            curveToRelative(-1.58f, 1.46f, -2.49f, 3.44f, -2.56f, 5.59f)
            curveToRelative(-0.07f, 2.1f, 0.74f, 4.21f, 2.23f, 5.77f)
            curveToRelative(1.48f, 1.56f, 3.54f, 2.48f, 5.64f, 2.51f)
            curveToRelative(1.91f, 0.02f, 3.68f, -0.59f, 5.13f, -1.75f)
            verticalLineToRelative(1.25f)
            curveToRelative(0f, 3.03f, -2.47f, 5.5f, -5.5f, 5.5f)
            lineTo(6f, 21f)
            verticalLineToRelative(3.0f)
            horizontalLineToRelative(5.5f)
            curveToRelative(4.69f, -0.0f, 8.5f, -3.81f, 8.5f, -8.5f)
            lineToRelative(-0.0f, -7.5f)
            close()
            moveTo(12f, 13.01f)
            curveToRelative(-2.76f, 0f, -5f, -2.24f, -5f, -5f)
            reflectiveCurveToRelative(2.24f, -5f, 5f, -5f)
            reflectiveCurveToRelative(5f, 2.24f, 5f, 5f)
            reflectiveCurveToRelative(-2.24f, 5f, -5f, 5f)
            close()
        }
    }.also { _9 = it }
