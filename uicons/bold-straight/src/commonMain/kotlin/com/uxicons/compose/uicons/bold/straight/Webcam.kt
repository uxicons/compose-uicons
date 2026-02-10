package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Webcam: ImageVector? = null

val Icons.Bs.Webcam: ImageVector
    get() = _Webcam ?: UXIcon(name = "Webcam") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22f, 10f)
                curveTo(22f, 4.49f, 17.51f, 0f, 12f, 0f)
                reflectiveCurveTo(2f, 4.49f, 2f, 10f)
                curveToRelative(0f, 3.81f, 2.15f, 7.13f, 5.29f, 8.82f)
                curveToRelative(-1.41f, 1.28f, -2.29f, 3.13f, -2.29f, 5.18f)
                horizontalLineToRelative(14f)
                curveToRelative(0f, -2.05f, -0.88f, -3.9f, -2.29f, -5.18f)
                curveToRelative(3.15f, -1.69f, 5.29f, -5.01f, 5.29f, -8.82f)
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
        }.also { _Webcam = it}
