package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MagnifyingGlassEye: ImageVector? = null

val Icons.Br.MagnifyingGlassEye: ImageVector
    get() = _MagnifyingGlassEye ?: UXIcon(name = "MagnifyingGlassEye") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(23.56f, 21.44f)
            lineToRelative(-5.51f, -5.51f)
            curveToRelative(1.23f, -1.66f, 1.96f, -3.7f, 1.96f, -5.92f)
            curveTo(20.01f, 4.49f, 15.52f, 0.01f, 10.01f, 0.01f)
            reflectiveCurveTo(0.01f, 4.49f, 0.01f, 10.01f)
            reflectiveCurveToRelative(4.49f, 10f, 10f, 10f)
            curveToRelative(2.22f, 0f, 4.26f, -0.73f, 5.92f, -1.96f)
            lineToRelative(5.51f, 5.51f)
            curveToRelative(0.29f, 0.29f, 0.68f, 0.44f, 1.06f, 0.44f)
            reflectiveCurveToRelative(0.77f, -0.15f, 1.06f, -0.44f)
            curveToRelative(0.59f, -0.59f, 0.59f, -1.53f, 0f, -2.12f)
            close()
            moveTo(10.01f, 17.0f)
            curveToRelative(-3.86f, 0f, -7f, -3.14f, -7f, -7f)
            reflectiveCurveTo(6.15f, 3.01f, 10.01f, 3.01f)
            reflectiveCurveToRelative(7f, 3.14f, 7f, 7f)
            reflectiveCurveToRelative(-3.14f, 7f, -7f, 7f)
            close()
            moveTo(15.7f, 9.08f)
            curveToRelative(-0.9f, -1.28f, -2.7f, -3.08f, -5.7f, -3.08f)
            curveToRelative(-3.05f, 0f, -4.86f, 1.86f, -5.74f, 3.15f)
            curveToRelative(-0.35f, 0.52f, -0.35f, 1.19f, 0f, 1.71f)
            curveToRelative(0.89f, 1.29f, 2.69f, 3.15f, 5.74f, 3.15f)
            curveToRelative(3.0f, 0f, 4.8f, -1.8f, 5.7f, -3.08f)
            curveToRelative(0.39f, -0.56f, 0.39f, -1.28f, 0f, -1.84f)
            close()
            moveTo(10f, 12.0f)
            curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
            reflectiveCurveToRelative(0.9f, -2f, 2f, -2f)
            reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
            reflectiveCurveToRelative(-0.9f, 2f, -2f, 2f)
            close()
        }
    }.also { _MagnifyingGlassEye = it }
