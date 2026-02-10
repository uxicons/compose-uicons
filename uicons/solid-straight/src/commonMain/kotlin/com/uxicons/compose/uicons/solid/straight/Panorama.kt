package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Panorama: ImageVector? = null

val Icons.Ss.Panorama: ImageVector
    get() = _Panorama ?: UXIcon(name = "Panorama") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(0f, 16.59f)
                lineTo(0f, 0.07f)
                reflectiveCurveToRelative(1.39f, 0.58f, 1.39f, 0.58f)
                curveToRelative(0.06f, 0.02f, 5.64f, 2.35f, 10.61f, 2.35f)
                reflectiveCurveTo(22.56f, 0.68f, 22.61f, 0.66f)
                lineToRelative(1.39f, -0.58f)
                verticalLineToRelative(22.8f)
                reflectiveCurveToRelative(-12.95f, -12.95f, -12.95f, -12.95f)
                curveToRelative(-1.21f, -1.21f, -3.17f, -1.21f, -4.38f, 0f)
                lineTo(0f, 16.59f)
                close()
                moveTo(16f, 8f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                reflectiveCurveToRelative(2f, -0.9f, 2f, -2f)
                reflectiveCurveToRelative(-0.9f, -2f, -2f, -2f)
                reflectiveCurveToRelative(-2f, 0.9f, -2f, 2f)
                close()
                moveTo(9.63f, 11.34f)
                curveToRelative(-0.43f, -0.43f, -1.12f, -0.43f, -1.55f, 0f)
                lineTo(0f, 19.42f)
                verticalLineToRelative(4.61f)
                reflectiveCurveToRelative(1.35f, -0.51f, 1.35f, -0.51f)
                curveToRelative(0.06f, -0.02f, 5.66f, -2.12f, 10.65f, -2.12f)
                curveToRelative(3.56f, 0f, 7.43f, 1.07f, 9.38f, 1.69f)
                lineToRelative(-11.74f, -11.74f)
                close()
            }
        }.also { _Panorama = it}
