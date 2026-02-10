package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PlayPause: ImageVector? = null

val Icons.Rc.PlayPause: ImageVector
    get() = _PlayPause ?: UXIcon(name = "PlayPause") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(16.63f, 4.07f)
                curveToRelative(-0.51f, 0.2f, -0.76f, 0.78f, -0.56f, 1.3f)
                curveToRelative(0.01f, 0.02f, 0.93f, 2.41f, 0.93f, 6.63f)
                reflectiveCurveToRelative(-0.92f, 6.61f, -0.93f, 6.63f)
                curveToRelative(-0.2f, 0.51f, 0.05f, 1.37f, 0.93f, 1.37f)
                curveToRelative(0.4f, 0f, 0.77f, -0.24f, 0.93f, -0.63f)
                curveToRelative(0.04f, -0.11f, 1.07f, -2.73f, 1.07f, -7.37f)
                reflectiveCurveToRelative(-1.03f, -7.26f, -1.07f, -7.37f)
                curveToRelative(-0.2f, -0.51f, -0.78f, -0.76f, -1.3f, -0.56f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21.93f, 4.63f)
                curveToRelative(-0.2f, -0.51f, -0.78f, -0.76f, -1.3f, -0.56f)
                curveToRelative(-0.51f, 0.2f, -0.76f, 0.78f, -0.56f, 1.3f)
                curveToRelative(0.01f, 0.02f, 0.93f, 2.41f, 0.93f, 6.63f)
                reflectiveCurveToRelative(-0.92f, 6.61f, -0.93f, 6.63f)
                curveToRelative(-0.2f, 0.51f, 0.05f, 1.37f, 0.93f, 1.37f)
                curveToRelative(0.4f, 0f, 0.77f, -0.24f, 0.93f, -0.63f)
                curveToRelative(0.04f, -0.11f, 1.07f, -2.73f, 1.07f, -7.37f)
                reflectiveCurveToRelative(-1.03f, -7.26f, -1.07f, -7.37f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(15.26f, 11.4f)
                curveToRelative(-0.7f, -1.0f, -4.54f, -6.07f, -10.99f, -7.86f)
                curveToRelative(-0.42f, -0.12f, -0.86f, 0.05f, -1.1f, 0.41f)
                curveToRelative(-0.09f, 0.13f, -2.17f, 3.31f, -2.17f, 8.05f)
                reflectiveCurveToRelative(2.08f, 7.92f, 2.17f, 8.06f)
                curveToRelative(0.19f, 0.28f, 0.5f, 0.44f, 0.83f, 0.44f)
                curveToRelative(0.09f, 0f, 0.17f, -0.01f, 0.26f, -0.03f)
                curveToRelative(6.84f, -1.83f, 10.86f, -7.66f, 11.03f, -7.9f)
                curveToRelative(0.24f, -0.35f, 0.23f, -0.82f, -0.03f, -1.16f)
                lineToRelative(-0.0f, -0.0f)
                close()
                moveTo(4.48f, 18.32f)
                curveToRelative(-0.53f, -1.04f, -1.48f, -3.31f, -1.48f, -6.32f)
                curveToRelative(0f, -2.96f, 0.95f, -5.25f, 1.48f, -6.31f)
                curveToRelative(4.59f, 1.52f, 7.59f, 4.85f, 8.73f, 6.31f)
                curveToRelative(-1.08f, 1.36f, -4.2f, 4.84f, -8.74f, 6.32f)
                close()
            }
        }.also { _PlayPause = it}
