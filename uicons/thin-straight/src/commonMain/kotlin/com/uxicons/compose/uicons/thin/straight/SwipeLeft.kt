package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SwipeLeft: ImageVector? = null

val Icons.Ts.SwipeLeft: ImageVector
    get() = _SwipeLeft ?: UXIcon(name = "SwipeLeft") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(11f, 2.61f)
                curveToRelative(0f, -1.27f, -0.9f, -2.38f, -2.08f, -2.57f)
                curveToRelative(-0.73f, -0.12f, -1.48f, 0.09f, -2.03f, 0.56f)
                curveToRelative(-0.56f, 0.48f, -0.88f, 1.17f, -0.88f, 1.91f)
                verticalLineToRelative(12.6f)
                lineToRelative(-1.8f, -1.43f)
                curveToRelative(-0.49f, -0.45f, -1.1f, -0.69f, -1.79f, -0.67f)
                curveToRelative(-0.67f, 0.02f, -1.28f, 0.3f, -1.74f, 0.79f)
                curveToRelative(-0.94f, 1.01f, -0.89f, 2.59f, 0.11f, 3.53f)
                lineToRelative(7.01f, 6.68f)
                horizontalLineToRelative(13.2f)
                verticalLineToRelative(-12.68f)
                lineToRelative(-10f, -2.22f)
                lineTo(11f, 2.61f)
                close()
                moveTo(20f, 12.12f)
                verticalLineToRelative(10.88f)
                horizontalLineToRelative(-11.8f)
                lineToRelative(-6.73f, -6.4f)
                curveToRelative(-0.6f, -0.56f, -0.64f, -1.52f, -0.07f, -2.12f)
                curveToRelative(0.56f, -0.6f, 1.51f, -0.64f, 2.15f, -0.05f)
                lineToRelative(3.45f, 2.75f)
                lineTo(7f, 2.5f)
                curveToRelative(0f, -0.44f, 0.19f, -0.86f, 0.53f, -1.14f)
                curveToRelative(0.34f, -0.29f, 0.78f, -0.41f, 1.23f, -0.34f)
                curveToRelative(0.71f, 0.12f, 1.24f, 0.8f, 1.24f, 1.59f)
                verticalLineToRelative(7.29f)
                lineToRelative(10f, 2.22f)
                close()
                moveTo(24f, 3f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-8.66f)
                lineToRelative(2.33f, 2.33f)
                lineToRelative(-0.71f, 0.71f)
                lineToRelative(-2.63f, -2.63f)
                curveToRelative(-0.48f, -0.48f, -0.48f, -1.27f, 0f, -1.76f)
                lineTo(16.96f, 0.03f)
                lineToRelative(0.71f, 0.71f)
                lineToRelative(-2.27f, 2.27f)
                horizontalLineToRelative(8.6f)
                close()
            }
        }.also { _SwipeLeft = it}
