package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FullScreen: ImageVector? = null

val Icons.Ts.FullScreen: ImageVector
    get() = _FullScreen ?: UXIcon(name = "FullScreen") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(6f, 10.81f)
                verticalLineToRelative(-2.81f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(2.29f)
                lineToRelative(4.29f, -4.29f)
                lineToRelative(-4.29f, -4.29f)
                verticalLineToRelative(2.29f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-2.81f)
                curveToRelative(0f, -0.66f, 0.54f, -1.19f, 1.19f, -1.19f)
                horizontalLineToRelative(2.81f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-2.29f)
                lineToRelative(4.29f, 4.29f)
                lineToRelative(4.29f, -4.29f)
                horizontalLineToRelative(-2.29f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(2.81f)
                curveToRelative(0.66f, 0f, 1.19f, 0.54f, 1.19f, 1.19f)
                verticalLineToRelative(2.81f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-2.29f)
                lineToRelative(-4.29f, 4.29f)
                lineToRelative(4.29f, 4.29f)
                verticalLineToRelative(-2.29f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(2.81f)
                curveToRelative(0f, 0.66f, -0.54f, 1.19f, -1.19f, 1.19f)
                horizontalLineToRelative(-2.81f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(2.29f)
                lineToRelative(-4.29f, -4.29f)
                lineToRelative(-4.29f, 4.29f)
                horizontalLineToRelative(2.29f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-2.81f)
                curveToRelative(-0.66f, 0f, -1.19f, -0.54f, -1.19f, -1.19f)
                close()
                moveTo(24f, 20f)
                verticalLineToRelative(-15.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                horizontalLineToRelative(-1.5f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(1.5f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(14.5f)
                horizontalLineToRelative(-22f)
                verticalLineToRelative(-14.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(-1.5f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                verticalLineToRelative(15.5f)
                horizontalLineToRelative(11.5f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-5.5f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(-5.5f)
                verticalLineToRelative(-3f)
                close()
            }
        }.also { _FullScreen = it}
