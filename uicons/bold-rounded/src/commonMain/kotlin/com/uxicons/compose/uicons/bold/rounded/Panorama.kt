package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Panorama: ImageVector? = null

val Icons.Br.Panorama: ImageVector
    get() = _Panorama ?: UXIcon(name = "Panorama") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(14.5f, 9.25f)
            curveToRelative(0f, -0.97f, 0.78f, -1.75f, 1.75f, -1.75f)
            reflectiveCurveToRelative(1.75f, 0.78f, 1.75f, 1.75f)
            reflectiveCurveToRelative(-0.78f, 1.75f, -1.75f, 1.75f)
            reflectiveCurveToRelative(-1.75f, -0.78f, -1.75f, -1.75f)
            close()
            moveTo(24f, 2.99f)
            verticalLineToRelative(18.05f)
            curveToRelative(0f, 1.08f, -0.56f, 2.05f, -1.5f, 2.58f)
            curveToRelative(-0.46f, 0.26f, -0.96f, 0.39f, -1.48f, 0.39f)
            curveToRelative(-0.53f, 0f, -1.06f, -0.14f, -1.53f, -0.42f)
            curveToRelative(-2.77f, -1.65f, -5.43f, -2.56f, -7.49f, -2.56f)
            reflectiveCurveToRelative(-4.72f, 0.91f, -7.49f, 2.56f)
            curveToRelative(-0.92f, 0.55f, -2.08f, 0.56f, -3.01f, 0.03f)
            curveToRelative(-0.94f, -0.53f, -1.5f, -1.5f, -1.5f, -2.58f)
            lineTo(0f, 2.99f)
            curveTo(0f, 1.91f, 0.56f, 0.94f, 1.5f, 0.41f)
            curveToRelative(0.93f, -0.53f, 2.08f, -0.52f, 3.01f, 0.03f)
            curveToRelative(2.77f, 1.65f, 5.43f, 2.56f, 7.49f, 2.56f)
            reflectiveCurveToRelative(4.72f, -0.91f, 7.49f, -2.56f)
            curveToRelative(0.92f, -0.55f, 2.08f, -0.56f, 3.01f, -0.03f)
            curveToRelative(0.94f, 0.53f, 1.5f, 1.5f, 1.5f, 2.58f)
            close()
            moveTo(2.97f, 3.02f)
            lineToRelative(0.02f, 11.99f)
            lineToRelative(3.43f, -3.43f)
            curveToRelative(1.42f, -1.42f, 3.73f, -1.42f, 5.15f, 0f)
            lineToRelative(9.42f, 9.42f)
            reflectiveCurveToRelative(0.0f, 0.0f, 0.01f, 0.0f)
            lineTo(21f, 2.99f)
            curveToRelative(-2.26f, 1.39f, -5.68f, 3.01f, -9f, 3.01f)
            reflectiveCurveToRelative(-6.74f, -1.62f, -9.03f, -2.98f)
            close()
        }
    }.also { _Panorama = it }
