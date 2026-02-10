package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MagnifyingGlassEye: ImageVector? = null

val Icons.Ts.MagnifyingGlassEye: ImageVector
    get() = _MagnifyingGlassEye ?: UXIcon(name = "MagnifyingGlassEye") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24.0f, 23.29f)
                lineToRelative(-6.6f, -6.6f)
                curveToRelative(1.61f, -1.77f, 2.6f, -4.12f, 2.6f, -6.7f)
                curveTo(20f, 4.49f, 15.51f, 0f, 10f, 0f)
                reflectiveCurveTo(0f, 4.49f, 0f, 10f)
                reflectiveCurveToRelative(4.49f, 10f, 10f, 10f)
                curveToRelative(2.58f, 0f, 4.92f, -0.99f, 6.7f, -2.6f)
                lineToRelative(6.6f, 6.6f)
                lineToRelative(0.71f, -0.71f)
                close()
                moveTo(1f, 10f)
                curveTo(1f, 5.04f, 5.04f, 1f, 10f, 1f)
                reflectiveCurveToRelative(9f, 4.04f, 9f, 9f)
                reflectiveCurveToRelative(-4.04f, 9f, -9f, 9f)
                reflectiveCurveTo(1f, 14.96f, 1f, 10f)
                close()
                moveTo(16.88f, 10f)
                curveToRelative(-0.66f, -1.24f, -2.47f, -4.42f, -6.88f, -4.5f)
                curveToRelative(-4.41f, 0.08f, -6.21f, 3.26f, -6.88f, 4.5f)
                curveToRelative(0.66f, 1.24f, 2.47f, 4.42f, 6.88f, 4.5f)
                curveToRelative(4.41f, -0.08f, 6.21f, -3.26f, 6.88f, -4.5f)
                close()
                moveTo(10f, 13.5f)
                curveToRelative(-3.37f, 0f, -5.14f, -2.44f, -5.75f, -3.5f)
                curveToRelative(0.69f, -1.21f, 2.43f, -3.5f, 5.75f, -3.5f)
                reflectiveCurveToRelative(5.06f, 2.29f, 5.75f, 3.5f)
                curveToRelative(-0.69f, 1.21f, -2.43f, 3.5f, -5.75f, 3.5f)
                close()
                moveTo(10f, 8f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                reflectiveCurveToRelative(0.9f, 2f, 2f, 2f)
                reflectiveCurveToRelative(2f, -0.9f, 2f, -2f)
                reflectiveCurveToRelative(-0.9f, -2f, -2f, -2f)
                close()
                moveTo(10f, 11f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                close()
            }
        }.also { _MagnifyingGlassEye = it}
