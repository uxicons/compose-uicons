package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ScreenShield: ImageVector? = null

val Icons.Bs.ScreenShield: ImageVector
    get() = _ScreenShield ?: UXIcon(name = "ScreenShield") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(13.5f, 19f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(4.5f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-12f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(4.5f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-10.5f)
                verticalLineToRelative(-14.5f)
                curveToRelative(0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                horizontalLineToRelative(1.8f)
                curveToRelative(-0.51f, 0.72f, -0.81f, 1.6f, -0.81f, 2.53f)
                verticalLineToRelative(0.47f)
                horizontalLineToRelative(-1.0f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                verticalLineToRelative(9.5f)
                horizontalLineToRelative(18f)
                verticalLineToRelative(-9.5f)
                curveToRelative(0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-0.47f)
                curveToRelative(0f, -0.93f, -0.29f, -1.81f, -0.81f, -2.53f)
                horizontalLineToRelative(1.81f)
                curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
                verticalLineToRelative(14.5f)
                close()
                moveTo(6.5f, 6.63f)
                verticalLineToRelative(-3.1f)
                curveToRelative(0f, -1.03f, 0.66f, -1.94f, 1.64f, -2.27f)
                lineToRelative(3.86f, -1.28f)
                lineToRelative(3.86f, 1.28f)
                curveToRelative(0.98f, 0.33f, 1.64f, 1.24f, 1.64f, 2.27f)
                verticalLineToRelative(3.1f)
                curveToRelative(-0.26f, 4.57f, -3.74f, 5.72f, -5.56f, 6.51f)
                curveToRelative(-1.73f, -0.92f, -5.19f, -2.41f, -5.44f, -6.51f)
                close()
                moveTo(9.5f, 6.63f)
                curveToRelative(0f, 1.52f, 1.69f, 2.7f, 2.56f, 3.21f)
                curveToRelative(0.9f, -0.45f, 2.44f, -1.46f, 2.44f, -3.21f)
                verticalLineToRelative(-2.66f)
                lineToRelative(-2.5f, -0.83f)
                lineToRelative(-2.5f, 0.83f)
                close()
            }
        }.also { _ScreenShield = it}
