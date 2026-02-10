package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HeartHalfStroke: ImageVector? = null

val Icons.Sc.HeartHalfStroke: ImageVector
    get() = _HeartHalfStroke ?: UXIcon(name = "HeartHalfStroke") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(15.94f, 3.0f)
                curveToRelative(-1.5f, 0.06f, -2.78f, 0.65f, -3.85f, 1.81f)
                lineToRelative(-0.3f, 0.36f)
                lineToRelative(-0.41f, -0.49f)
                curveToRelative(-0.96f, -1.05f, -2.16f, -1.62f, -3.63f, -1.68f)
                curveToRelative(-3.83f, 0.03f, -6.6f, 3.07f, -6.74f, 7.44f)
                curveToRelative(0.03f, 2.59f, 1.36f, 5.05f, 3.93f, 7.34f)
                curveToRelative(0.86f, 0.76f, 1.87f, 1.47f, 3.09f, 2.16f)
                curveToRelative(1.2f, 0.69f, 2.54f, 1.01f, 3.89f, 1.06f)
                curveToRelative(1.42f, -0.02f, 2.83f, -0.35f, 4.07f, -1.04f)
                curveToRelative(1.2f, -0.67f, 2.2f, -1.35f, 3.06f, -2.09f)
                curveToRelative(2.59f, -2.25f, 3.92f, -4.71f, 3.96f, -7.38f)
                curveToRelative(-0.14f, -4.38f, -3.01f, -7.46f, -7.06f, -7.48f)
                close()
                moveTo(17.07f, 15.6f)
                curveToRelative(-0.7f, 0.6f, -1.53f, 1.17f, -2.54f, 1.73f)
                curveToRelative(-0.76f, 0.42f, -1.64f, 0.65f, -2.53f, 0.66f)
                verticalLineToRelative(-8.39f)
                reflectiveCurveToRelative(2.33f, -2.81f, 2.33f, -2.81f)
                curveToRelative(0.48f, -0.52f, 1.01f, -0.76f, 1.65f, -0.79f)
                curveToRelative(2.32f, 0.01f, 3.93f, 1.85f, 4.01f, 4.51f)
                curveToRelative(-0.02f, 1.71f, -1.01f, 3.42f, -2.93f, 5.09f)
                close()
            }
        }.also { _HeartHalfStroke = it}
