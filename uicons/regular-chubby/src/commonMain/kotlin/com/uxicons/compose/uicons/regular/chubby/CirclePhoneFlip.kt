package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CirclePhoneFlip: ImageVector? = null

val Icons.Rc.CirclePhoneFlip: ImageVector
    get() = _CirclePhoneFlip ?: UXIcon(name = "CirclePhoneFlip") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(1f, 12f)
                curveToRelative(0f, 9.75f, 5.88f, 11f, 11f, 11f)
                reflectiveCurveToRelative(11f, -1.25f, 11f, -11f)
                reflectiveCurveToRelative(-5.88f, -11f, -11f, -11f)
                reflectiveCurveToRelative(-11f, 1.25f, -11f, 11f)
                close()
                moveTo(3f, 12f)
                curveToRelative(0f, -7.47f, 3.6f, -9f, 9f, -9f)
                reflectiveCurveToRelative(9f, 1.53f, 9f, 9f)
                reflectiveCurveToRelative(-3.6f, 9f, -9f, 9f)
                reflectiveCurveToRelative(-9f, -1.53f, -9f, -9f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(8.06f, 12.46f)
                curveToRelative(0.89f, -0.27f, 1.85f, -0.04f, 2.52f, 0.6f)
                lineToRelative(0.1f, 0.1f)
                curveToRelative(0.48f, -0.17f, 1.14f, -0.61f, 1.51f, -0.96f)
                curveToRelative(0.37f, -0.38f, 0.81f, -1.02f, 0.98f, -1.5f)
                lineToRelative(-0.1f, -0.1f)
                curveToRelative(-0.65f, -0.66f, -0.88f, -1.62f, -0.6f, -2.5f)
                curveToRelative(0.24f, -0.77f, 0.84f, -1.38f, 1.61f, -1.62f)
                curveToRelative(0.88f, -0.28f, 1.83f, -0.04f, 2.45f, 0.58f)
                curveToRelative(0.06f, 0.05f, 1.47f, 1.24f, 1.12f, 3.16f)
                curveToRelative(-0.34f, 1.74f, -1.58f, 3.63f, -2.67f, 4.75f)
                curveToRelative(-1.12f, 1.06f, -3.02f, 2.32f, -4.79f, 2.63f)
                curveToRelative(-1.83f, 0.33f, -3.01f, -0.92f, -3.16f, -1.08f)
                curveToRelative(-0.66f, -0.65f, -0.89f, -1.58f, -0.61f, -2.46f)
                curveToRelative(0.25f, -0.76f, 0.86f, -1.35f, 1.64f, -1.59f)
                close()
            }
        }.also { _CirclePhoneFlip = it}
