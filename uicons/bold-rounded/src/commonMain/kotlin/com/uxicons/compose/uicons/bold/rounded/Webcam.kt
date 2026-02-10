package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Webcam: ImageVector? = null

val Icons.Br.Webcam: ImageVector
    get() = _Webcam ?: UXIcon(name = "Webcam") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(22f, 10f)
            curveTo(22f, 4.49f, 17.51f, 0f, 12f, 0f)
            reflectiveCurveTo(2f, 4.49f, 2f, 10f)
            curveToRelative(0f, 3.76f, 2.08f, 7.04f, 5.16f, 8.74f)
            curveToRelative(-0.91f, 0.77f, -1.62f, 1.74f, -2.04f, 2.85f)
            curveToRelative(-0.45f, 1.17f, 0.53f, 2.4f, 1.83f, 2.4f)
            horizontalLineToRelative(10.11f)
            curveToRelative(1.31f, 0f, 2.28f, -1.23f, 1.83f, -2.4f)
            curveToRelative(-0.42f, -1.11f, -1.13f, -2.09f, -2.04f, -2.85f)
            curveToRelative(3.07f, -1.71f, 5.16f, -4.99f, 5.16f, -8.74f)
            close()
            moveTo(12f, 17f)
            curveToRelative(-3.86f, 0f, -7f, -3.14f, -7f, -7f)
            reflectiveCurveToRelative(3.14f, -7f, 7f, -7f)
            reflectiveCurveToRelative(7f, 3.14f, 7f, 7f)
            reflectiveCurveToRelative(-3.14f, 7f, -7f, 7f)
            close()
            moveTo(12f, 5f)
            curveToRelative(-2.76f, 0f, -5f, 2.24f, -5f, 5f)
            reflectiveCurveToRelative(2.24f, 5f, 5f, 5f)
            reflectiveCurveToRelative(5f, -2.24f, 5f, -5f)
            reflectiveCurveToRelative(-2.24f, -5f, -5f, -5f)
            close()
            moveTo(12f, 12f)
            curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
            reflectiveCurveToRelative(0.9f, -2f, 2f, -2f)
            reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
            reflectiveCurveToRelative(-0.9f, 2f, -2f, 2f)
            close()
        }
    }.also { _Webcam = it }
