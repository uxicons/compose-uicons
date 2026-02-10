package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MagnifyingGlassEye: ImageVector? = null

val Icons.Rs.MagnifyingGlassEye: ImageVector
    get() = _MagnifyingGlassEye ?: UXIcon(name = "MagnifyingGlassEye") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.96f, 22.54f)
                lineToRelative(-6.22f, -6.22f)
                curveToRelative(1.41f, -1.73f, 2.26f, -3.93f, 2.26f, -6.32f)
                curveTo(20f, 4.49f, 15.51f, 0f, 10f, 0f)
                reflectiveCurveTo(0f, 4.49f, 0f, 10f)
                reflectiveCurveToRelative(4.49f, 10f, 10f, 10f)
                curveToRelative(2.4f, 0f, 4.6f, -0.85f, 6.32f, -2.26f)
                lineToRelative(6.22f, 6.22f)
                lineToRelative(1.41f, -1.41f)
                close()
                moveTo(10f, 18f)
                curveToRelative(-4.41f, 0f, -8f, -3.59f, -8f, -8f)
                reflectiveCurveTo(5.59f, 2f, 10f, 2f)
                reflectiveCurveToRelative(8f, 3.59f, 8f, 8f)
                reflectiveCurveToRelative(-3.59f, 8f, -8f, 8f)
                close()
                moveTo(16.41f, 9.54f)
                curveToRelative(-0.49f, -0.95f, -2.41f, -4.04f, -6.41f, -4.04f)
                curveToRelative(-4.4f, 0.16f, -5.88f, 3.08f, -6.65f, 4.5f)
                curveToRelative(0.77f, 1.41f, 2.25f, 4.34f, 6.65f, 4.5f)
                curveToRelative(4.4f, -0.16f, 5.88f, -3.08f, 6.65f, -4.5f)
                lineToRelative(-0.24f, -0.46f)
                close()
                moveTo(10f, 12.5f)
                curveToRelative(-2.38f, 0f, -3.73f, -1.5f, -4.37f, -2.5f)
                curveToRelative(0.64f, -1.0f, 1.99f, -2.5f, 4.37f, -2.5f)
                reflectiveCurveToRelative(3.74f, 1.5f, 4.37f, 2.5f)
                curveToRelative(-0.64f, 1.0f, -1.99f, 2.5f, -4.37f, 2.5f)
                close()
                moveTo(11.5f, 10f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                close()
            }
        }.also { _MagnifyingGlassEye = it}
