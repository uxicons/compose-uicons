package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Webcam: ImageVector? = null

val Icons.Rc.Webcam: ImageVector
    get() = _Webcam ?: UXIcon(name = "Webcam") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 6f)
                curveToRelative(-2.69f, 0f, -4f, 1.31f, -4f, 4f)
                reflectiveCurveToRelative(1.31f, 4f, 4f, 4f)
                reflectiveCurveToRelative(4f, -1.31f, 4f, -4f)
                reflectiveCurveToRelative(-1.31f, -4f, -4f, -4f)
                close()
                moveTo(12f, 12f)
                curveToRelative(-1.59f, 0f, -2f, -0.41f, -2f, -2f)
                reflectiveCurveToRelative(0.41f, -2f, 2f, -2f)
                reflectiveCurveToRelative(2f, 0.41f, 2f, 2f)
                reflectiveCurveToRelative(-0.41f, 2f, -2f, 2f)
                close()
                moveTo(21f, 10f)
                curveToRelative(0f, -6.31f, -2.69f, -9f, -9f, -9f)
                reflectiveCurveToRelative(-9f, 2.69f, -9f, 9f)
                curveToRelative(0f, 4.76f, 1.53f, 7.46f, 4.99f, 8.5f)
                curveToRelative(-0.58f, 0.72f, -0.91f, 1.69f, -0.98f, 2.95f)
                curveToRelative(-0.02f, 0.45f, 0.25f, 0.86f, 0.68f, 1f)
                curveToRelative(0.07f, 0.02f, 1.67f, 0.55f, 4.31f, 0.55f)
                reflectiveCurveToRelative(4.24f, -0.53f, 4.31f, -0.55f)
                curveToRelative(0.42f, -0.14f, 0.7f, -0.55f, 0.68f, -1f)
                curveToRelative(-0.07f, -1.27f, -0.4f, -2.23f, -0.98f, -2.95f)
                curveToRelative(3.46f, -1.04f, 4.99f, -3.74f, 4.99f, -8.5f)
                close()
                moveTo(14.9f, 20.74f)
                curveToRelative(-0.63f, 0.12f, -1.62f, 0.26f, -2.9f, 0.26f)
                reflectiveCurveToRelative(-2.27f, -0.14f, -2.9f, -0.26f)
                curveToRelative(0.23f, -1.15f, 0.91f, -1.74f, 2.9f, -1.74f)
                reflectiveCurveToRelative(2.67f, 0.58f, 2.9f, 1.74f)
                close()
                moveTo(12f, 17f)
                curveToRelative(-5.17f, 0f, -7f, -1.83f, -7f, -7f)
                reflectiveCurveToRelative(1.83f, -7f, 7f, -7f)
                reflectiveCurveToRelative(7f, 1.83f, 7f, 7f)
                reflectiveCurveToRelative(-1.83f, 7f, -7f, 7f)
                close()
            }
        }.also { _Webcam = it}
