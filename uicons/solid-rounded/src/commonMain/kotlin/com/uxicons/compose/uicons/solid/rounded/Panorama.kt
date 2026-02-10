package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Panorama: ImageVector? = null

val Icons.Sr.Panorama: ImageVector
    get() = _Panorama ?: UXIcon(name = "Panorama") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(6.03f, 11.17f)
                curveToRelative(1.51f, -1.51f, 4.15f, -1.51f, 5.66f, 0f)
                lineToRelative(11.81f, 11.81f)
                curveToRelative(0.32f, -0.43f, 0.51f, -0.96f, 0.51f, -1.53f)
                lineTo(24.0f, 2.54f)
                curveToRelative(0f, -0.93f, -0.48f, -1.75f, -1.28f, -2.21f)
                curveToRelative(-0.81f, -0.46f, -1.77f, -0.45f, -2.58f, 0.03f)
                curveToRelative(-1.33f, 0.79f, -4.79f, 2.64f, -8.14f, 2.64f)
                reflectiveCurveTo(5.19f, 1.16f, 3.86f, 0.36f)
                curveToRelative(-0.8f, -0.48f, -1.76f, -0.49f, -2.58f, -0.03f)
                curveTo(0.48f, 0.79f, 0f, 1.62f, 0f, 2.54f)
                verticalLineToRelative(14.66f)
                lineToRelative(6.03f, -6.03f)
                close()
                moveTo(18f, 6f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                reflectiveCurveToRelative(-0.9f, 2f, -2f, 2f)
                reflectiveCurveToRelative(-2f, -0.9f, -2f, -2f)
                reflectiveCurveToRelative(0.9f, -2f, 2f, -2f)
                close()
                moveTo(21.68f, 23.99f)
                curveToRelative(-0.07f, 0.01f, -0.15f, 0.01f, -0.22f, 0.01f)
                curveToRelative(-0.45f, 0f, -0.9f, -0.12f, -1.31f, -0.37f)
                curveToRelative(-1.33f, -0.79f, -4.79f, -2.63f, -8.14f, -2.63f)
                reflectiveCurveToRelative(-6.81f, 1.84f, -8.14f, 2.63f)
                curveToRelative(-0.8f, 0.48f, -1.77f, 0.49f, -2.58f, 0.03f)
                curveToRelative(-0.8f, -0.46f, -1.28f, -1.28f, -1.28f, -2.21f)
                verticalLineToRelative(-1.43f)
                lineToRelative(7.44f, -7.44f)
                curveToRelative(0.76f, -0.76f, 2.07f, -0.76f, 2.83f, 0f)
                lineToRelative(11.4f, 11.4f)
                close()
            }
        }.also { _Panorama = it}
