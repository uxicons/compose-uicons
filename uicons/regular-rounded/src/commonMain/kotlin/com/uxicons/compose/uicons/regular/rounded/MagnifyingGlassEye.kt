package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MagnifyingGlassEye: ImageVector? = null

val Icons.Rr.MagnifyingGlassEye: ImageVector
    get() = _MagnifyingGlassEye ?: UXIcon(name = "MagnifyingGlassEye") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.71f, 22.29f)
                lineToRelative(-5.97f, -5.97f)
                curveToRelative(1.41f, -1.73f, 2.26f, -3.93f, 2.26f, -6.32f)
                curveTo(20f, 4.49f, 15.51f, 0f, 10f, 0f)
                reflectiveCurveTo(0f, 4.49f, 0f, 10f)
                reflectiveCurveToRelative(4.49f, 10f, 10f, 10f)
                curveToRelative(2.4f, 0f, 4.6f, -0.85f, 6.32f, -2.26f)
                lineToRelative(5.97f, 5.97f)
                curveToRelative(0.2f, 0.2f, 0.45f, 0.29f, 0.71f, 0.29f)
                reflectiveCurveToRelative(0.51f, -0.1f, 0.71f, -0.29f)
                curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0f, -1.41f)
                close()
                moveTo(2f, 10f)
                curveTo(2f, 5.59f, 5.59f, 2f, 10f, 2f)
                reflectiveCurveToRelative(8f, 3.59f, 8f, 8f)
                reflectiveCurveToRelative(-3.59f, 8f, -8f, 8f)
                reflectiveCurveTo(2f, 14.41f, 2f, 10f)
                close()
                moveTo(15.93f, 8.74f)
                curveToRelative(-0.82f, -1.21f, -2.69f, -3.24f, -5.93f, -3.24f)
                reflectiveCurveToRelative(-5.11f, 2.03f, -5.93f, 3.24f)
                curveToRelative(-0.52f, 0.77f, -0.52f, 1.75f, 0f, 2.52f)
                curveToRelative(0.82f, 1.21f, 2.69f, 3.24f, 5.93f, 3.24f)
                reflectiveCurveToRelative(5.11f, -2.03f, 5.93f, -3.24f)
                curveToRelative(0.52f, -0.77f, 0.52f, -1.75f, 0f, -2.52f)
                close()
                moveTo(14.28f, 10.13f)
                curveToRelative(-0.73f, 1.08f, -2.08f, 2.37f, -4.28f, 2.37f)
                reflectiveCurveToRelative(-3.54f, -1.29f, -4.28f, -2.37f)
                curveToRelative(-0.06f, -0.08f, -0.06f, -0.18f, 0f, -0.27f)
                curveToRelative(0.73f, -1.08f, 2.08f, -2.37f, 4.28f, -2.37f)
                reflectiveCurveToRelative(3.54f, 1.29f, 4.28f, 2.37f)
                horizontalLineToRelative(0f)
                curveToRelative(0.06f, 0.08f, 0.06f, 0.19f, 0f, 0.27f)
                close()
                moveTo(11.5f, 10f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                close()
            }
        }.also { _MagnifyingGlassEye = it}
