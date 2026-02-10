package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Webcam: ImageVector? = null

val Icons.Sc.Webcam: ImageVector
    get() = _Webcam ?: UXIcon(name = "Webcam") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(14f, 10f)
                curveToRelative(0f, 1.59f, -0.41f, 2f, -2f, 2f)
                reflectiveCurveToRelative(-2f, -0.41f, -2f, -2f)
                reflectiveCurveToRelative(0.41f, -2f, 2f, -2f)
                reflectiveCurveToRelative(2f, 0.41f, 2f, 2f)
                close()
                moveTo(12f, 21f)
                curveToRelative(-1.85f, 0f, -3.46f, -0.23f, -4.84f, -0.68f)
                curveToRelative(-0.07f, 0.35f, -0.12f, 0.72f, -0.15f, 1.12f)
                curveToRelative(-0.02f, 0.45f, 0.25f, 0.86f, 0.68f, 1f)
                curveToRelative(0.07f, 0.02f, 1.67f, 0.55f, 4.31f, 0.55f)
                reflectiveCurveToRelative(4.24f, -0.53f, 4.31f, -0.55f)
                curveToRelative(0.42f, -0.14f, 0.7f, -0.55f, 0.68f, -1f)
                curveToRelative(-0.02f, -0.41f, -0.07f, -0.78f, -0.15f, -1.12f)
                curveToRelative(-1.38f, 0.45f, -2.99f, 0.68f, -4.84f, 0.68f)
                close()
                moveTo(21f, 10f)
                curveToRelative(0f, 6.31f, -2.69f, 9f, -9f, 9f)
                reflectiveCurveToRelative(-9f, -2.69f, -9f, -9f)
                reflectiveCurveToRelative(2.69f, -9f, 9f, -9f)
                reflectiveCurveToRelative(9f, 2.69f, 9f, 9f)
                close()
                moveTo(16f, 10f)
                curveToRelative(0f, -2.69f, -1.31f, -4f, -4f, -4f)
                reflectiveCurveToRelative(-4f, 1.31f, -4f, 4f)
                reflectiveCurveToRelative(1.31f, 4f, 4f, 4f)
                reflectiveCurveToRelative(4f, -1.31f, 4f, -4f)
                close()
            }
        }.also { _Webcam = it}
