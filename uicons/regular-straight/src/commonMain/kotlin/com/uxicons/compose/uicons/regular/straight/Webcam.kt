package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Webcam: ImageVector? = null

val Icons.Rs.Webcam: ImageVector
    get() = _Webcam ?: UXIcon(name = "Webcam") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(17f, 10f)
                curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
                reflectiveCurveToRelative(-5f, 2.24f, -5f, 5f)
                reflectiveCurveToRelative(2.24f, 5f, 5f, 5f)
                reflectiveCurveToRelative(5f, -2.24f, 5f, -5f)
                close()
                moveTo(9f, 10f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                reflectiveCurveToRelative(3f, 1.35f, 3f, 3f)
                reflectiveCurveToRelative(-1.35f, 3f, -3f, 3f)
                reflectiveCurveToRelative(-3f, -1.35f, -3f, -3f)
                close()
                moveTo(16.71f, 18.82f)
                curveToRelative(3.15f, -1.69f, 5.29f, -5.01f, 5.29f, -8.82f)
                curveTo(22f, 4.49f, 17.51f, 0f, 12f, 0f)
                reflectiveCurveTo(2f, 4.49f, 2f, 10f)
                curveToRelative(0f, 3.81f, 2.15f, 7.13f, 5.29f, 8.82f)
                curveToRelative(-1.15f, 1.05f, -1.93f, 2.45f, -2.19f, 4.01f)
                lineToRelative(-0.2f, 1.17f)
                horizontalLineToRelative(14.2f)
                lineToRelative(-0.2f, -1.17f)
                curveToRelative(-0.26f, -1.56f, -1.04f, -2.97f, -2.19f, -4.01f)
                close()
                moveTo(4f, 10f)
                curveToRelative(0f, -4.41f, 3.59f, -8f, 8f, -8f)
                reflectiveCurveToRelative(8f, 3.59f, 8f, 8f)
                reflectiveCurveToRelative(-3.59f, 8f, -8f, 8f)
                reflectiveCurveToRelative(-8f, -3.59f, -8f, -8f)
                close()
                moveTo(7.42f, 22f)
                curveToRelative(0.42f, -0.96f, 1.14f, -1.78f, 2.07f, -2.32f)
                curveToRelative(0.8f, 0.21f, 1.65f, 0.32f, 2.52f, 0.32f)
                reflectiveCurveToRelative(1.71f, -0.11f, 2.52f, -0.32f)
                curveToRelative(0.93f, 0.54f, 1.65f, 1.36f, 2.07f, 2.32f)
                lineTo(7.42f, 22f)
                close()
            }
        }.also { _Webcam = it}
