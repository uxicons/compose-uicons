package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CircleHeart: ImageVector? = null

val Icons.Rc.CircleHeart: ImageVector
    get() = _CircleHeart ?: UXIcon(name = "CircleHeart") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12.01f, 1f)
                horizontalLineToRelative(-0.01f)
                curveTo(4.95f, 1.04f, 1.15f, 4.84f, 1.03f, 12.02f)
                curveToRelative(0.13f, 7.14f, 3.92f, 10.94f, 10.97f, 10.98f)
                horizontalLineToRelative(9.97f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                lineTo(22.97f, 11.98f)
                curveToRelative(-0.12f, -7.04f, -4.02f, -10.94f, -10.97f, -10.98f)
                close()
                moveTo(20.97f, 21f)
                lineTo(12.01f, 21f)
                curveToRelative(-6.01f, -0.04f, -8.87f, -2.9f, -8.98f, -8.98f)
                curveToRelative(0.11f, -6.03f, 3.04f, -8.98f, 8.97f, -9.02f)
                curveToRelative(5.85f, 0.04f, 8.87f, 3.07f, 8.97f, 9f)
                verticalLineToRelative(9f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(16.4f, 8.15f)
                curveToRelative(-0.68f, -0.63f, -1.59f, -0.97f, -2.46f, -0.94f)
                curveToRelative(-0.73f, 0.03f, -1.41f, 0.31f, -1.94f, 0.8f)
                curveToRelative(-0.53f, -0.49f, -1.21f, -0.77f, -1.94f, -0.8f)
                curveToRelative(-0.86f, -0.04f, -1.78f, 0.3f, -2.46f, 0.94f)
                curveToRelative(-0.62f, 0.58f, -1.28f, 1.67f, -1.26f, 3.02f)
                curveToRelative(0.02f, 1.48f, 0.81f, 2.9f, 2.35f, 4.24f)
                curveToRelative(1.05f, 0.92f, 2.17f, 1.38f, 3.31f, 1.38f)
                curveToRelative(1.14f, 0f, 2.25f, -0.47f, 3.3f, -1.38f)
                curveToRelative(1.54f, -1.34f, 2.33f, -2.77f, 2.35f, -4.24f)
                curveToRelative(0.02f, -1.34f, -0.64f, -2.44f, -1.26f, -3.02f)
                close()
                moveTo(13.99f, 13.9f)
                curveToRelative(-1.36f, 1.18f, -2.62f, 1.18f, -3.98f, 0f)
                curveToRelative(-1.08f, -0.94f, -1.65f, -1.89f, -1.67f, -2.76f)
                curveToRelative(-0.01f, -0.73f, 0.37f, -1.31f, 0.62f, -1.52f)
                curveToRelative(0.8f, -0.67f, 1.5f, -0.33f, 1.75f, -0.07f)
                lineToRelative(0.55f, 0.6f)
                curveToRelative(0.38f, 0.41f, 1.1f, 0.41f, 1.48f, 0f)
                lineToRelative(0.55f, -0.6f)
                curveToRelative(0.24f, -0.26f, 0.91f, -0.63f, 1.75f, 0.07f)
                horizontalLineToRelative(0f)
                curveToRelative(0.23f, 0.22f, 0.63f, 0.78f, 0.62f, 1.52f)
                curveToRelative(-0.01f, 0.87f, -0.59f, 1.82f, -1.67f, 2.76f)
                close()
            }
        }.also { _CircleHeart = it}
