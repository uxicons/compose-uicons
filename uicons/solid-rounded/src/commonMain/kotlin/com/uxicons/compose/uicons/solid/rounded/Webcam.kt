package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Webcam: ImageVector? = null

val Icons.Sr.Webcam: ImageVector
    get() = _Webcam ?: UXIcon(name = "Webcam") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(15f, 10f)
                curveToRelative(0f, 1.65f, -1.35f, 3f, -3f, 3f)
                reflectiveCurveToRelative(-3f, -1.35f, -3f, -3f)
                reflectiveCurveToRelative(1.35f, -3f, 3f, -3f)
                reflectiveCurveToRelative(3f, 1.35f, 3f, 3f)
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
                moveTo(18.43f, 20.13f)
                curveToRelative(-1.86f, 1.19f, -4.07f, 1.87f, -6.43f, 1.87f)
                reflectiveCurveToRelative(-4.57f, -0.69f, -6.43f, -1.87f)
                curveToRelative(-0.1f, 0.14f, -0.18f, 0.29f, -0.27f, 0.44f)
                curveToRelative(-0.41f, 0.72f, -0.4f, 1.58f, 0.02f, 2.29f)
                curveToRelative(0.42f, 0.71f, 1.16f, 1.14f, 1.99f, 1.14f)
                horizontalLineToRelative(9.39f)
                curveToRelative(0.83f, 0f, 1.57f, -0.43f, 1.99f, -1.14f)
                curveToRelative(0.42f, -0.71f, 0.42f, -1.56f, 0.02f, -2.28f)
                curveToRelative(-0.09f, -0.15f, -0.18f, -0.3f, -0.28f, -0.45f)
                close()
            }
        }.also { _Webcam = it}
