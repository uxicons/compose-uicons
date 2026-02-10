package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Webcam: ImageVector? = null

val Icons.Rr.Webcam: ImageVector
    get() = _Webcam ?: UXIcon(name = "Webcam") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22f, 10f)
                curveTo(22f, 4.49f, 17.51f, 0f, 12f, 0f)
                reflectiveCurveTo(2f, 4.49f, 2f, 10f)
                curveToRelative(0f, 3.67f, 1.98f, 6.88f, 4.93f, 8.62f)
                curveToRelative(-0.65f, 0.54f, -1.21f, 1.21f, -1.63f, 1.95f)
                curveToRelative(-0.41f, 0.72f, -0.4f, 1.58f, 0.02f, 2.29f)
                curveToRelative(0.42f, 0.71f, 1.16f, 1.14f, 1.99f, 1.14f)
                horizontalLineToRelative(9.39f)
                curveToRelative(0.83f, 0f, 1.57f, -0.43f, 1.99f, -1.14f)
                curveToRelative(0.42f, -0.71f, 0.42f, -1.56f, 0.02f, -2.28f)
                curveToRelative(-0.42f, -0.76f, -0.98f, -1.42f, -1.63f, -1.96f)
                curveToRelative(2.95f, -1.74f, 4.93f, -4.95f, 4.93f, -8.62f)
                close()
                moveTo(16.96f, 21.56f)
                curveToRelative(0.07f, 0.12f, 0.03f, 0.22f, -0.01f, 0.29f)
                curveToRelative(-0.03f, 0.06f, -0.11f, 0.15f, -0.26f, 0.15f)
                lineTo(7.3f, 22.0f)
                curveToRelative(-0.15f, 0f, -0.23f, -0.09f, -0.26f, -0.15f)
                curveToRelative(-0.03f, -0.06f, -0.08f, -0.17f, -0.0f, -0.3f)
                curveToRelative(0.47f, -0.84f, 1.2f, -1.53f, 2.05f, -1.98f)
                curveToRelative(0.92f, 0.28f, 1.9f, 0.43f, 2.91f, 0.43f)
                reflectiveCurveToRelative(1.99f, -0.15f, 2.91f, -0.43f)
                curveToRelative(0.85f, 0.45f, 1.58f, 1.15f, 2.05f, 1.99f)
                close()
                moveTo(12f, 18f)
                curveToRelative(-4.41f, 0f, -8f, -3.59f, -8f, -8f)
                reflectiveCurveTo(7.59f, 2f, 12f, 2f)
                reflectiveCurveToRelative(8f, 3.59f, 8f, 8f)
                reflectiveCurveToRelative(-3.59f, 8f, -8f, 8f)
                close()
                moveTo(12f, 5f)
                curveToRelative(-2.76f, 0f, -5f, 2.24f, -5f, 5f)
                reflectiveCurveToRelative(2.24f, 5f, 5f, 5f)
                reflectiveCurveToRelative(5f, -2.24f, 5f, -5f)
                reflectiveCurveToRelative(-2.24f, -5f, -5f, -5f)
                close()
                moveTo(12f, 13f)
                curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                reflectiveCurveToRelative(1.35f, -3f, 3f, -3f)
                reflectiveCurveToRelative(3f, 1.35f, 3f, 3f)
                reflectiveCurveToRelative(-1.35f, 3f, -3f, 3f)
                close()
            }
        }.also { _Webcam = it}
