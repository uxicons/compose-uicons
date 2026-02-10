package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Webcam: ImageVector? = null

val Icons.Ts.Webcam: ImageVector
    get() = _Webcam ?: UXIcon(name = "Webcam") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22f, 10f)
                curveTo(22f, 4.49f, 17.51f, 0f, 12f, 0f)
                reflectiveCurveTo(2f, 4.49f, 2f, 10f)
                curveToRelative(0f, 3.99f, 2.35f, 7.45f, 5.75f, 9.05f)
                curveToRelative(-1.41f, 1.06f, -2.36f, 2.61f, -2.65f, 4.37f)
                lineToRelative(-0.1f, 0.58f)
                horizontalLineToRelative(13.85f)
                lineToRelative(-0.1f, -0.58f)
                curveToRelative(-0.29f, -1.73f, -1.22f, -3.26f, -2.59f, -4.32f)
                curveToRelative(3.45f, -1.58f, 5.85f, -5.06f, 5.85f, -9.1f)
                close()
                moveTo(17.63f, 23f)
                lineTo(6.21f, 23f)
                curveToRelative(0.4f, -1.46f, 1.34f, -2.71f, 2.66f, -3.5f)
                curveToRelative(0.99f, 0.33f, 2.04f, 0.5f, 3.13f, 0.5f)
                curveToRelative(1.05f, 0f, 2.07f, -0.16f, 3.03f, -0.47f)
                curveToRelative(1.28f, 0.8f, 2.21f, 2.03f, 2.6f, 3.47f)
                close()
                moveTo(12f, 19f)
                curveToRelative(-4.96f, 0f, -9f, -4.04f, -9f, -9f)
                reflectiveCurveTo(7.04f, 1f, 12f, 1f)
                reflectiveCurveToRelative(9f, 4.04f, 9f, 9f)
                reflectiveCurveToRelative(-4.04f, 9f, -9f, 9f)
                close()
                moveTo(12f, 5f)
                curveToRelative(-2.76f, 0f, -5f, 2.24f, -5f, 5f)
                reflectiveCurveToRelative(2.24f, 5f, 5f, 5f)
                reflectiveCurveToRelative(5f, -2.24f, 5f, -5f)
                reflectiveCurveToRelative(-2.24f, -5f, -5f, -5f)
                close()
                moveTo(12f, 14f)
                curveToRelative(-2.21f, 0f, -4f, -1.79f, -4f, -4f)
                reflectiveCurveToRelative(1.79f, -4f, 4f, -4f)
                reflectiveCurveToRelative(4f, 1.79f, 4f, 4f)
                reflectiveCurveToRelative(-1.79f, 4f, -4f, 4f)
                close()
            }
        }.also { _Webcam = it}
