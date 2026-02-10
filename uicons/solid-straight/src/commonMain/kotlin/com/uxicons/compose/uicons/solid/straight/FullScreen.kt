package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FullScreen: ImageVector? = null

val Icons.Ss.FullScreen: ImageVector
    get() = _FullScreen ?: UXIcon(name = "FullScreen") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(6f, 11.23f)
                verticalLineToRelative(-4.23f)
                lineToRelative(1.79f, 1.79f)
                lineToRelative(2.79f, -2.79f)
                lineToRelative(-2.79f, -2.79f)
                lineToRelative(-1.79f, 1.79f)
                verticalLineToRelative(-4.23f)
                curveToRelative(0f, -0.42f, 0.34f, -0.77f, 0.77f, -0.77f)
                horizontalLineToRelative(4.23f)
                lineToRelative(-1.79f, 1.79f)
                lineToRelative(2.79f, 2.79f)
                lineToRelative(2.79f, -2.79f)
                lineToRelative(-1.79f, -1.79f)
                horizontalLineToRelative(4.23f)
                curveToRelative(0.42f, 0f, 0.77f, 0.34f, 0.77f, 0.77f)
                verticalLineToRelative(4.23f)
                lineToRelative(-1.79f, -1.79f)
                lineToRelative(-2.79f, 2.79f)
                lineToRelative(2.79f, 2.79f)
                lineToRelative(1.79f, -1.79f)
                verticalLineToRelative(4.23f)
                curveToRelative(0f, 0.42f, -0.34f, 0.77f, -0.77f, 0.77f)
                horizontalLineToRelative(-4.23f)
                lineToRelative(1.79f, -1.79f)
                lineToRelative(-2.79f, -2.79f)
                lineToRelative(-2.79f, 2.79f)
                lineToRelative(1.79f, 1.79f)
                horizontalLineToRelative(-4.23f)
                curveToRelative(-0.42f, 0f, -0.77f, -0.34f, -0.77f, -0.77f)
                close()
                moveTo(24f, 20f)
                verticalLineToRelative(-15f)
                curveToRelative(0f, -1.66f, -1.34f, -3f, -3f, -3f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(10f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                horizontalLineToRelative(-12f)
                curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                verticalLineToRelative(-10f)
                horizontalLineToRelative(-1f)
                curveToRelative(-1.66f, 0f, -3f, 1.34f, -3f, 3f)
                verticalLineToRelative(15f)
                horizontalLineToRelative(11f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(-2f)
                close()
            }
        }.also { _FullScreen = it}
