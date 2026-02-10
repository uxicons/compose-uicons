package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Webcam: ImageVector? = null

val Icons.Ss.Webcam: ImageVector
    get() = _Webcam ?: UXIcon(name = "Webcam") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(18.82f, 22.83f)
                lineToRelative(0.2f, 1.17f)
                lineTo(4.82f, 24f)
                lineToRelative(0.2f, -1.17f)
                curveToRelative(0.15f, -0.9f, 0.47f, -1.74f, 0.94f, -2.49f)
                curveToRelative(1.78f, 1.04f, 3.84f, 1.66f, 6.05f, 1.66f)
                curveToRelative(2.16f, 0f, 4.18f, -0.58f, 5.93f, -1.58f)
                curveToRelative(0.44f, 0.73f, 0.75f, 1.55f, 0.89f, 2.41f)
                close()
                moveTo(12f, 7f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                reflectiveCurveToRelative(1.35f, 3f, 3f, 3f)
                reflectiveCurveToRelative(3f, -1.35f, 3f, -3f)
                reflectiveCurveToRelative(-1.35f, -3f, -3f, -3f)
                close()
                moveTo(22f, 10f)
                curveToRelative(0f, 5.51f, -4.49f, 10f, -10f, 10f)
                reflectiveCurveTo(2f, 15.51f, 2f, 10f)
                reflectiveCurveTo(6.49f, 0f, 12f, 0f)
                reflectiveCurveToRelative(10f, 4.49f, 10f, 10f)
                close()
                moveTo(17f, 10f)
                curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
                reflectiveCurveToRelative(-5f, 2.24f, -5f, 5f)
                reflectiveCurveToRelative(2.24f, 5f, 5f, 5f)
                reflectiveCurveToRelative(5f, -2.24f, 5f, -5f)
                close()
            }
        }.also { _Webcam = it}
