package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MagnifyingGlassEye: ImageVector? = null

val Icons.Bs.MagnifyingGlassEye: ImageVector
    get() = _MagnifyingGlassEye ?: UXIcon(name = "MagnifyingGlassEye") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.99f, 21.87f)
                lineToRelative(-5.95f, -5.95f)
                curveToRelative(1.23f, -1.66f, 1.96f, -3.7f, 1.96f, -5.92f)
                curveTo(20.01f, 4.49f, 15.52f, 0.01f, 10.01f, 0.01f)
                reflectiveCurveTo(0.01f, 4.49f, 0.01f, 10.01f)
                reflectiveCurveToRelative(4.49f, 10f, 10f, 10f)
                curveToRelative(2.22f, 0f, 4.26f, -0.73f, 5.92f, -1.96f)
                lineToRelative(5.95f, 5.95f)
                lineToRelative(2.12f, -2.12f)
                close()
                moveTo(10.01f, 17.01f)
                curveToRelative(-3.86f, 0f, -7f, -3.14f, -7f, -7f)
                reflectiveCurveTo(6.15f, 3.01f, 10.01f, 3.01f)
                reflectiveCurveToRelative(7f, 3.14f, 7f, 7f)
                reflectiveCurveToRelative(-3.14f, 7f, -7f, 7f)
                close()
                moveTo(10f, 6f)
                curveToRelative(-3.7f, 0f, -5.49f, 2.96f, -6f, 4f)
                curveToRelative(0.51f, 1.03f, 2.3f, 4f, 6f, 4f)
                reflectiveCurveToRelative(5.49f, -2.96f, 6f, -4f)
                curveToRelative(-0.51f, -1.04f, -2.3f, -4f, -6f, -4f)
                close()
                moveTo(10f, 12f)
                curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                reflectiveCurveToRelative(0.9f, -2f, 2f, -2f)
                reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
                reflectiveCurveToRelative(-0.9f, 2f, -2f, 2f)
                close()
            }
        }.also { _MagnifyingGlassEye = it}
