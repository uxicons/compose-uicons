package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HeartHalfStroke: ImageVector? = null

val Icons.Rc.HeartHalfStroke: ImageVector
    get() = _HeartHalfStroke ?: UXIcon(name = "HeartHalfStroke") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(16.21f, 3.0f)
                curveToRelative(-1.42f, 0.06f, -2.62f, 0.62f, -3.61f, 1.72f)
                lineToRelative(-0.59f, 0.73f)
                lineToRelative(-0.64f, -0.77f)
                curveToRelative(-0.96f, -1.05f, -2.16f, -1.62f, -3.63f, -1.68f)
                curveToRelative(-3.83f, 0.03f, -6.6f, 3.07f, -6.74f, 7.44f)
                curveToRelative(0.03f, 2.59f, 1.36f, 5.05f, 3.93f, 7.34f)
                curveToRelative(0.86f, 0.76f, 1.87f, 1.47f, 3.09f, 2.16f)
                curveToRelative(1.2f, 0.68f, 2.58f, 1.04f, 3.98f, 1.04f)
                reflectiveCurveToRelative(2.77f, -0.36f, 3.98f, -1.04f)
                curveToRelative(1.22f, -0.69f, 2.23f, -1.4f, 3.1f, -2.16f)
                curveToRelative(2.57f, -2.28f, 3.9f, -4.75f, 3.93f, -7.38f)
                curveToRelative(-0.13f, -4.33f, -2.9f, -7.37f, -6.79f, -7.4f)
                close()
                moveTo(17.74f, 16.28f)
                curveToRelative(-0.76f, 0.67f, -1.66f, 1.29f, -2.75f, 1.92f)
                curveToRelative(-0.9f, 0.51f, -1.95f, 0.77f, -2.99f, 0.77f)
                verticalLineToRelative(-10.34f)
                reflectiveCurveToRelative(2.12f, -2.6f, 2.12f, -2.6f)
                curveToRelative(0.6f, -0.66f, 1.29f, -0.99f, 2.13f, -1.02f)
                curveToRelative(2.74f, 0.02f, 4.65f, 2.21f, 4.75f, 5.41f)
                curveToRelative(-0.03f, 2f, -1.12f, 3.98f, -3.26f, 5.87f)
                close()
            }
        }.also { _HeartHalfStroke = it}
