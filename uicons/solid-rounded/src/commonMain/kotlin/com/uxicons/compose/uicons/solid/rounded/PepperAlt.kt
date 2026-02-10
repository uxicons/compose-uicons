package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PepperAlt: ImageVector? = null

val Icons.Sr.PepperAlt: ImageVector
    get() = _PepperAlt ?: UXIcon(name = "PepperAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19.33f, 3.95f)
                curveToRelative(-1.45f, 0f, -2.8f, 0.8f, -3.67f, 1.99f)
                curveToRelative(-0.59f, -0.81f, -1.38f, -1.6f, -2.48f, -1.77f)
                curveToRelative(0.28f, -1.07f, 0.66f, -1.76f, 0.99f, -2.34f)
                lineToRelative(0.2f, -0.35f)
                curveToRelative(0.27f, -0.48f, 0.09f, -1.09f, -0.4f, -1.36f)
                reflectiveCurveToRelative(-1.09f, -0.09f, -1.36f, 0.4f)
                lineToRelative(-0.18f, 0.32f)
                curveToRelative(-0.4f, 0.7f, -0.98f, 1.72f, -1.32f, 3.36f)
                curveToRelative(-1.81f, 0.58f, -3.13f, 2.25f, -3.13f, 4.25f)
                curveToRelative(0f, 1.63f, 0.78f, 5.1f, 2.0f, 8.11f)
                curveToRelative(0.27f, 0.67f, -0.21f, 1.39f, -0.93f, 1.39f)
                curveToRelative(-0.41f, 0f, -0.79f, -0.24f, -0.94f, -0.62f)
                curveToRelative(-1.42f, -3.51f, -2.13f, -7.39f, -2.13f, -8.88f)
                curveToRelative(0f, -1.39f, 0.44f, -2.68f, 1.19f, -3.74f)
                curveToRelative(-0.73f, -0.48f, -1.59f, -0.76f, -2.53f, -0.76f)
                curveTo(2.09f, 3.95f, 0f, 6.04f, 0f, 8.61f)
                curveToRelative(0f, 2.92f, 2.81f, 15.24f, 8.44f, 15.33f)
                curveToRelative(0.04f, 0.0f, 0.06f, 0.0f, 0.06f, 0.0f)
                curveToRelative(1.42f, 0f, 2.67f, -0.68f, 3.5f, -1.71f)
                curveToRelative(0.82f, 1.03f, 2.08f, 1.71f, 3.5f, 1.71f)
                curveToRelative(0f, 0f, 0.02f, -0.0f, 0.06f, -0.0f)
                curveToRelative(5.72f, -0.09f, 8.44f, -12.31f, 8.44f, -15.33f)
                curveToRelative(0f, -2.57f, -2.09f, -4.67f, -4.67f, -4.67f)
                close()
            }
        }.also { _PepperAlt = it}
