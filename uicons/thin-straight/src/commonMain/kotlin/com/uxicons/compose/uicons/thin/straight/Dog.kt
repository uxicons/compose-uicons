package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Dog: ImageVector? = null

val Icons.Ts.Dog: ImageVector
    get() = _Dog ?: UXIcon(name = "Dog") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22.12f, 5f)
                curveToRelative(-0.5f, 0f, -0.95f, -0.28f, -1.17f, -0.72f)
                curveToRelative(-0.39f, -0.79f, -1.19f, -1.28f, -2.06f, -1.28f)
                horizontalLineToRelative(-0.88f)
                lineTo(18f, 0f)
                horizontalLineToRelative(-0.5f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                verticalLineToRelative(1.76f)
                lineToRelative(-1.35f, 3.74f)
                lineToRelative(-8.15f, 0.0f)
                curveToRelative(-0.94f, 0f, -1.81f, 0.36f, -2.48f, 1.02f)
                curveToRelative(-0.03f, 0.03f, -0.06f, 0.06f, -0.09f, 0.09f)
                curveToRelative(-0.57f, -0.4f, -1.94f, -1.62f, -1.94f, -4.12f)
                lineTo(-0.0f, 5.0f)
                curveTo(-0.0f, 7.95f, 1.61f, 9.42f, 2.36f, 9.95f)
                curveToRelative(-0.24f, 0.48f, -0.36f, 1.01f, -0.36f, 1.56f)
                lineToRelative(0.0f, 12.5f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(-6.0f)
                lineToRelative(7.0f, -0.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(5.0f)
                lineToRelative(-0.01f, -5.91f)
                lineToRelative(1.31f, -7.09f)
                horizontalLineToRelative(1.2f)
                curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
                verticalLineToRelative(-3.5f)
                horizontalLineToRelative(-1.88f)
                close()
                moveTo(23f, 8.5f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                horizontalLineToRelative(-2.03f)
                lineToRelative(-1.47f, 8f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-6.0f)
                lineToRelative(-9.0f, 0.01f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(-3.0f)
                lineToRelative(-0.0f, -11.5f)
                curveToRelative(0f, -0.67f, 0.26f, -1.3f, 0.73f, -1.77f)
                curveToRelative(0.47f, -0.47f, 1.1f, -0.73f, 1.77f, -0.73f)
                lineToRelative(8.85f, -0.0f)
                lineToRelative(1.62f, -4.49f)
                lineToRelative(0.03f, -2.01f)
                curveToRelative(0f, -0.65f, 0.42f, -1.21f, 1f, -1.42f)
                verticalLineToRelative(2.92f)
                horizontalLineToRelative(1.88f)
                curveToRelative(0.5f, 0f, 0.95f, 0.28f, 1.17f, 0.72f)
                curveToRelative(0.39f, 0.79f, 1.19f, 1.28f, 2.06f, 1.28f)
                horizontalLineToRelative(0.88f)
                verticalLineToRelative(2.5f)
                close()
            }
        }.also { _Dog = it}
