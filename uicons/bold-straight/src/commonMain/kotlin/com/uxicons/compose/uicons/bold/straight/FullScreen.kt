package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FullScreen: ImageVector? = null

val Icons.Bs.FullScreen: ImageVector
    get() = _FullScreen ?: UXIcon(name = "FullScreen") {
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
                verticalLineToRelative(-16f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(13f)
                horizontalLineToRelative(18f)
                verticalLineToRelative(-13f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(1f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                verticalLineToRelative(16f)
                close()
                moveTo(6.77f, 12f)
                horizontalLineToRelative(4.23f)
                lineToRelative(-1.44f, -1.44f)
                lineToRelative(2.44f, -2.44f)
                lineToRelative(2.44f, 2.44f)
                lineToRelative(-1.44f, 1.44f)
                horizontalLineToRelative(4.23f)
                curveToRelative(0.42f, 0f, 0.77f, -0.34f, 0.77f, -0.77f)
                verticalLineToRelative(-4.23f)
                lineToRelative(-1.44f, 1.44f)
                lineToRelative(-2.44f, -2.44f)
                lineToRelative(2.44f, -2.44f)
                lineToRelative(1.44f, 1.44f)
                verticalLineToRelative(-4.23f)
                curveToRelative(0f, -0.42f, -0.34f, -0.77f, -0.77f, -0.77f)
                horizontalLineToRelative(-4.23f)
                lineToRelative(1.44f, 1.44f)
                lineToRelative(-2.44f, 2.44f)
                lineToRelative(-2.44f, -2.44f)
                lineToRelative(1.44f, -1.44f)
                horizontalLineToRelative(-4.23f)
                curveToRelative(-0.42f, 0f, -0.77f, 0.34f, -0.77f, 0.77f)
                verticalLineToRelative(4.23f)
                lineToRelative(1.44f, -1.44f)
                lineToRelative(2.44f, 2.44f)
                lineToRelative(-2.44f, 2.44f)
                lineToRelative(-1.44f, -1.44f)
                verticalLineToRelative(4.23f)
                curveToRelative(0f, 0.42f, 0.34f, 0.77f, 0.77f, 0.77f)
                close()
            }
        }.also { _FullScreen = it}
