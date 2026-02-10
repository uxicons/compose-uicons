package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Webcam: ImageVector? = null

val Icons.Tc.Webcam: ImageVector
    get() = _Webcam ?: UXIcon(name = "Webcam") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 6f)
                curveToRelative(-2.77f, 0f, -4f, 1.23f, -4f, 4f)
                reflectiveCurveToRelative(1.23f, 4f, 4f, 4f)
                reflectiveCurveToRelative(4f, -1.23f, 4f, -4f)
                reflectiveCurveToRelative(-1.23f, -4f, -4f, -4f)
                close()
                moveTo(12f, 13f)
                curveToRelative(-2.21f, 0f, -3f, -0.79f, -3f, -3f)
                reflectiveCurveToRelative(0.79f, -3f, 3f, -3f)
                reflectiveCurveToRelative(3f, 0.79f, 3f, 3f)
                reflectiveCurveToRelative(-0.79f, 3f, -3f, 3f)
                close()
                moveTo(21f, 10f)
                curveToRelative(0f, -6.31f, -2.69f, -9f, -9f, -9f)
                reflectiveCurveToRelative(-9f, 2.69f, -9f, 9f)
                curveToRelative(0f, 5.09f, 1.76f, 7.83f, 5.75f, 8.69f)
                curveToRelative(-1.09f, 0.63f, -1.66f, 1.69f, -1.75f, 3.28f)
                curveToRelative(-0.01f, 0.23f, 0.13f, 0.44f, 0.36f, 0.51f)
                curveToRelative(0.07f, 0.02f, 1.78f, 0.52f, 4.64f, 0.52f)
                reflectiveCurveToRelative(4.57f, -0.5f, 4.64f, -0.52f)
                curveToRelative(0.22f, -0.07f, 0.37f, -0.28f, 0.36f, -0.51f)
                curveToRelative(-0.1f, -1.59f, -0.67f, -2.65f, -1.75f, -3.28f)
                curveToRelative(4.0f, -0.86f, 5.75f, -3.6f, 5.75f, -8.69f)
                close()
                moveTo(15.96f, 21.62f)
                curveToRelative(-0.64f, 0.14f, -2.03f, 0.38f, -3.96f, 0.38f)
                reflectiveCurveToRelative(-3.32f, -0.24f, -3.96f, -0.38f)
                curveToRelative(0.24f, -1.9f, 1.36f, -2.62f, 3.96f, -2.62f)
                reflectiveCurveToRelative(3.72f, 0.72f, 3.96f, 2.62f)
                close()
                moveTo(12f, 18f)
                curveToRelative(-5.83f, 0f, -8f, -2.17f, -8f, -8f)
                reflectiveCurveToRelative(2.17f, -8f, 8f, -8f)
                reflectiveCurveToRelative(8f, 2.17f, 8f, 8f)
                reflectiveCurveToRelative(-2.17f, 8f, -8f, 8f)
                close()
            }
        }.also { _Webcam = it}
