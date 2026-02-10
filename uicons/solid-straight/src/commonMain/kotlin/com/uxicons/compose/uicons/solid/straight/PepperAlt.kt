package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PepperAlt: ImageVector? = null

val Icons.Ss.PepperAlt: ImageVector
    get() = _PepperAlt ?: UXIcon(name = "PepperAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19.33f, 4f)
                curveToRelative(-1.45f, 0f, -2.8f, 0.8f, -3.67f, 1.99f)
                curveToRelative(-0.59f, -0.81f, -1.41f, -1.43f, -2.33f, -1.75f)
                curveToRelative(0.35f, -1.47f, 0.89f, -2.62f, 1.23f, -3.23f)
                lineTo(12.81f, 0.05f)
                curveToRelative(-0.41f, 0.76f, -1.12f, 2.24f, -1.51f, 4.14f)
                curveToRelative(-1.9f, 0.53f, -3.3f, 2.25f, -3.3f, 4.31f)
                curveToRelative(0f, 1.89f, 1.04f, 6.25f, 2.62f, 9.5f)
                horizontalLineToRelative(-2.22f)
                curveToRelative(-1.6f, -3.66f, -2.39f, -7.93f, -2.39f, -9.5f)
                curveToRelative(0f, -1.39f, 0.44f, -2.68f, 1.19f, -3.74f)
                curveToRelative(-0.73f, -0.48f, -1.59f, -0.76f, -2.53f, -0.76f)
                curveTo(2.09f, 4f, 0f, 6.09f, 0f, 8.67f)
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
