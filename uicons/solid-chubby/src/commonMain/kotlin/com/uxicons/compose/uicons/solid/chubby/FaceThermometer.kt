package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FaceThermometer: ImageVector? = null

val Icons.Sc.FaceThermometer: ImageVector
    get() = _FaceThermometer ?: UXIcon(name = "FaceThermometer") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22.95f, 10.53f)
                curveToRelative(-0.09f, 0.35f, -0.33f, 0.71f, -0.72f, 1.1f)
                lineToRelative(-0.09f, 0.09f)
                lineToRelative(-0.93f, -0.93f)
                curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0f)
                reflectiveCurveToRelative(-0.39f, 1.02f, 0f, 1.41f)
                lineToRelative(0.93f, 0.93f)
                lineToRelative(-1.09f, 1.09f)
                lineToRelative(-0.93f, -0.93f)
                curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0f)
                reflectiveCurveToRelative(-0.39f, 1.02f, 0f, 1.41f)
                lineToRelative(0.93f, 0.93f)
                lineToRelative(-0.73f, 0.73f)
                curveToRelative(-0.58f, 0.46f, -0.63f, 0.63f, -1.5f, 0.63f)
                curveToRelative(-0.33f, 0f, -0.5f, -0.06f, -0.71f, -0.21f)
                curveToRelative(-0.68f, -0.53f, -1.76f, -0.79f, -3.29f, -0.79f)
                reflectiveCurveToRelative(-2.61f, 0.26f, -3.29f, 0.79f)
                curveToRelative(-0.43f, 0.34f, -1.06f, 0.26f, -1.4f, -0.17f)
                curveToRelative(-0.34f, -0.44f, -0.26f, -1.06f, 0.17f, -1.4f)
                curveToRelative(1.06f, -0.83f, 2.5f, -1.21f, 4.53f, -1.21f)
                curveToRelative(0.79f, 0f, 1.48f, 0.08f, 2.1f, 0.2f)
                curveToRelative(2.0f, -1.98f, 5.27f, -5.43f, 5.27f, -5.43f)
                curveToRelative(1.02f, -1.02f, 1.84f, -1.02f, 2.87f, 0f)
                curveToRelative(0.32f, 0.32f, 0.52f, 0.61f, 0.64f, 0.9f)
                curveToRelative(-0.64f, -6.04f, -4.0f, -8.67f, -10.88f, -8.67f)
                curveToRelative(-7.71f, -0.0f, -11.0f, 3.29f, -11.0f, 11.0f)
                reflectiveCurveToRelative(3.29f, 11f, 11f, 11f)
                reflectiveCurveToRelative(11f, -3.29f, 11f, -11f)
                curveToRelative(0f, -0.51f, -0.02f, -1.0f, -0.05f, -1.47f)
                close()
                moveTo(15.5f, 8f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                close()
                moveTo(8.5f, 8f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                close()
            }
        }.also { _FaceThermometer = it}
