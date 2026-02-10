package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MessageStar: ImageVector? = null

val Icons.Br.MessageStar: ImageVector
    get() = _MessageStar ?: UXIcon(name = "MessageStar") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(12.84f, 0.03f)
            curveTo(9.37f, -0.22f, 5.96f, 1.07f, 3.51f, 3.52f)
            curveTo(1.06f, 5.98f, -0.21f, 9.38f, 0.03f, 12.85f)
            curveToRelative(0.44f, 6.35f, 6.03f, 11.15f, 13.01f, 11.15f)
            horizontalLineToRelative(5.65f)
            curveToRelative(2.93f, 0f, 5.32f, -2.39f, 5.32f, -5.32f)
            verticalLineToRelative(-6.36f)
            curveTo(24f, 5.85f, 19.1f, 0.45f, 12.84f, 0.03f)
            close()
            moveTo(21f, 18.68f)
            curveToRelative(0f, 1.28f, -1.04f, 2.32f, -2.32f, 2.32f)
            horizontalLineToRelative(-5.65f)
            curveToRelative(-5.46f, 0f, -9.68f, -3.51f, -10.01f, -8.35f)
            curveToRelative(-0.18f, -2.61f, 0.77f, -5.16f, 2.61f, -7.0f)
            curveToRelative(1.69f, -1.7f, 3.99f, -2.64f, 6.38f, -2.64f)
            curveToRelative(0.2f, 0f, 0.41f, 0.01f, 0.62f, 0.02f)
            curveToRelative(4.69f, 0.32f, 8.37f, 4.4f, 8.37f, 9.3f)
            verticalLineToRelative(6.36f)
            close()
            moveTo(17.44f, 10.62f)
            curveToRelative(0.13f, 0.36f, 0.02f, 0.77f, -0.27f, 1.02f)
            lineToRelative(-2.17f, 1.77f)
            lineToRelative(0.9f, 2.73f)
            curveToRelative(0.12f, 0.37f, 0f, 0.78f, -0.31f, 1.01f)
            curveToRelative(-0.31f, 0.24f, -0.73f, 0.25f, -1.06f, 0.04f)
            lineToRelative(-2.52f, -1.64f)
            lineToRelative(-2.48f, 1.66f)
            curveToRelative(-0.15f, 0.1f, -0.33f, 0.15f, -0.51f, 0.15f)
            verticalLineToRelative(-0.01f)
            curveToRelative(-0.19f, 0f, -0.39f, -0.06f, -0.55f, -0.18f)
            curveToRelative(-0.31f, -0.23f, -0.44f, -0.64f, -0.32f, -1.01f)
            lineToRelative(0.86f, -2.76f)
            lineToRelative(-2.18f, -1.77f)
            curveToRelative(-0.29f, -0.25f, -0.4f, -0.65f, -0.27f, -1.01f)
            reflectiveCurveToRelative(0.48f, -0.6f, 0.86f, -0.6f)
            horizontalLineToRelative(2.75f)
            lineToRelative(0.97f, -2.61f)
            curveToRelative(0.13f, -0.36f, 0.48f, -0.6f, 0.86f, -0.6f)
            reflectiveCurveToRelative(0.73f, 0.24f, 0.86f, 0.6f)
            lineToRelative(0.97f, 2.61f)
            horizontalLineToRelative(2.75f)
            curveToRelative(0.38f, 0f, 0.73f, 0.24f, 0.86f, 0.6f)
            close()
        }
    }.also { _MessageStar = it }
