package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MousePointerHeart: ImageVector? = null

val Icons.Sr.MousePointerHeart: ImageVector
    get() = _MousePointerHeart ?: UXIcon(name = "MousePointerHeart") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.69f, 19.27f)
                lineToRelative(2.76f, -1.38f)
                curveToRelative(0.74f, -0.34f, 0.72f, -1.49f, -0.03f, -1.8f)
                curveToRelative(0f, 0f, -8.74f, -3.97f, -8.77f, -3.98f)
                curveToRelative(-0.68f, -0.23f, -1.43f, -0.07f, -2.0f, 0.43f)
                curveToRelative(-0.59f, 0.51f, -0.8f, 1.34f, -0.5f, 2.2f)
                lineToRelative(3.94f, 8.68f)
                curveToRelative(0.31f, 0.75f, 1.46f, 0.77f, 1.8f, 0.03f)
                lineToRelative(1.38f, -2.76f)
                lineToRelative(3.02f, 3.02f)
                curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0f)
                reflectiveCurveToRelative(0.39f, -1.02f, 0f, -1.41f)
                lineToRelative(-3.02f, -3.02f)
                close()
                moveTo(12.11f, 19.49f)
                curveToRelative(-1.28f, 0.35f, -2.68f, 0.1f, -3.76f, -0.78f)
                curveTo(2.71f, 14.09f, -2.19f, 7.43f, 1.02f, 2.62f)
                curveToRelative(0.55f, -0.82f, 1.32f, -1.49f, 2.24f, -1.93f)
                curveToRelative(0.95f, -0.46f, 1.94f, -0.69f, 2.9f, -0.69f)
                curveToRelative(1.11f, 0f, 2.19f, 0.3f, 3.16f, 0.91f)
                curveToRelative(0.69f, 0.43f, 1.26f, 0.99f, 1.69f, 1.62f)
                curveToRelative(0.43f, -0.64f, 1.0f, -1.19f, 1.69f, -1.62f)
                curveToRelative(1.8f, -1.13f, 4.0f, -1.21f, 6.06f, -0.22f)
                curveToRelative(0.91f, 0.44f, 1.69f, 1.11f, 2.24f, 1.93f)
                curveToRelative(1.88f, 2.83f, 0.96f, 6.29f, -1.25f, 9.6f)
                curveToRelative(0f, 0f, -4.35f, -1.97f, -4.44f, -2.0f)
                curveToRelative(-1.36f, -0.47f, -2.84f, -0.16f, -3.96f, 0.81f)
                curveToRelative(-1.23f, 1.06f, -1.65f, 2.74f, -1.08f, 4.37f)
                lineToRelative(1.86f, 4.1f)
                close()
            }
        }.also { _MousePointerHeart = it}
