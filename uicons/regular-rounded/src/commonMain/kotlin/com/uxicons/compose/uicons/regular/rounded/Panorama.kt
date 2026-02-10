package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Panorama: ImageVector? = null

val Icons.Rr.Panorama: ImageVector
    get() = _Panorama ?: UXIcon(name = "Panorama") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(17f, 11f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                reflectiveCurveToRelative(-0.9f, -2f, -2f, -2f)
                reflectiveCurveToRelative(-2f, 0.9f, -2f, 2f)
                reflectiveCurveToRelative(0.9f, 2f, 2f, 2f)
                close()
                moveTo(22.72f, 0.33f)
                curveToRelative(-0.81f, -0.46f, -1.77f, -0.45f, -2.58f, 0.03f)
                curveToRelative(-1.33f, 0.79f, -4.79f, 2.64f, -8.14f, 2.64f)
                reflectiveCurveTo(5.19f, 1.16f, 3.86f, 0.36f)
                curveToRelative(-0.8f, -0.48f, -1.76f, -0.49f, -2.58f, -0.03f)
                curveTo(0.48f, 0.79f, 0f, 1.62f, 0f, 2.54f)
                verticalLineToRelative(18.91f)
                curveToRelative(0f, 0.93f, 0.48f, 1.75f, 1.28f, 2.21f)
                curveToRelative(0.81f, 0.46f, 1.77f, 0.45f, 2.58f, -0.03f)
                curveToRelative(1.33f, -0.79f, 4.79f, -2.63f, 8.14f, -2.63f)
                reflectiveCurveToRelative(6.81f, 1.84f, 8.14f, 2.63f)
                curveToRelative(0.41f, 0.24f, 0.86f, 0.37f, 1.31f, 0.37f)
                curveToRelative(0.43f, 0f, 0.87f, -0.11f, 1.26f, -0.34f)
                curveToRelative(0.8f, -0.46f, 1.28f, -1.28f, 1.28f, -2.21f)
                lineTo(24f, 2.54f)
                curveToRelative(0f, -0.93f, -0.48f, -1.75f, -1.28f, -2.21f)
                close()
                moveTo(2.27f, 2.07f)
                curveToRelative(0.08f, -0.05f, 0.31f, -0.14f, 0.56f, 0.01f)
                curveToRelative(1.48f, 0.88f, 5.32f, 2.92f, 9.16f, 2.92f)
                reflectiveCurveToRelative(7.69f, -2.04f, 9.16f, -2.92f)
                curveToRelative(0.26f, -0.15f, 0.48f, -0.06f, 0.56f, -0.01f)
                curveToRelative(0.1f, 0.06f, 0.27f, 0.2f, 0.27f, 0.47f)
                verticalLineToRelative(18.91f)
                curveToRelative(0f, 0.01f, 0f, 0.02f, -0.0f, 0.03f)
                lineToRelative(-10.31f, -10.31f)
                curveToRelative(-1.51f, -1.51f, -4.15f, -1.51f, -5.66f, 0f)
                lineToRelative(-4.03f, 4.03f)
                lineTo(2f, 2.54f)
                curveToRelative(0f, -0.27f, 0.17f, -0.41f, 0.27f, -0.47f)
                close()
                moveTo(2.83f, 21.92f)
                curveToRelative(-0.26f, 0.15f, -0.48f, 0.06f, -0.56f, 0.01f)
                curveToRelative(-0.1f, -0.06f, -0.27f, -0.2f, -0.27f, -0.47f)
                verticalLineToRelative(-3.43f)
                lineToRelative(5.44f, -5.44f)
                curveToRelative(0.76f, -0.76f, 2.07f, -0.76f, 2.83f, 0f)
                lineToRelative(7.77f, 7.77f)
                curveToRelative(-1.74f, -0.72f, -3.89f, -1.35f, -6.04f, -1.35f)
                curveToRelative(-3.85f, 0f, -7.69f, 2.04f, -9.16f, 2.92f)
                close()
            }
        }.also { _Panorama = it}
