package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Panorama: ImageVector? = null

val Icons.Bs.Panorama: ImageVector
    get() = _Panorama ?: UXIcon(name = "Panorama") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(14f, 9.96f)
                curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
                reflectiveCurveToRelative(-0.9f, 2f, -2f, 2f)
                reflectiveCurveToRelative(-2f, -0.9f, -2f, -2f)
                close()
                moveTo(24f, 23.94f)
                lineToRelative(-2.06f, -0.83f)
                curveToRelative(-0.05f, -0.02f, -5.3f, -2.11f, -9.94f, -2.11f)
                reflectiveCurveToRelative(-9.89f, 2.09f, -9.94f, 2.11f)
                lineTo(0f, 23.94f)
                lineTo(0f, 0.01f)
                reflectiveCurveToRelative(2.07f, 0.85f, 2.07f, 0.85f)
                curveToRelative(0.05f, 0.02f, 5.3f, 2.15f, 9.93f, 2.15f)
                reflectiveCurveTo(21.88f, 0.88f, 21.93f, 0.85f)
                lineTo(24.0f, 0.01f)
                verticalLineToRelative(23.93f)
                close()
                moveTo(3f, 4.37f)
                verticalLineToRelative(10.63f)
                lineToRelative(4.59f, -4.59f)
                curveToRelative(0.78f, -0.78f, 2.05f, -0.78f, 2.83f, 0f)
                lineToRelative(8.61f, 8.61f)
                curveToRelative(0.73f, 0.19f, 1.4f, 0.39f, 1.97f, 0.57f)
                lineTo(21f, 4.37f)
                curveToRelative(-2.15f, 0.69f, -5.65f, 1.63f, -9f, 1.63f)
                reflectiveCurveToRelative(-6.85f, -0.93f, -9f, -1.63f)
                close()
            }
        }.also { _Panorama = it}
