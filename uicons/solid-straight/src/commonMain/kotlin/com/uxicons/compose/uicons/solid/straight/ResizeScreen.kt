package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ResizeScreen: ImageVector? = null

val Icons.Ss.ResizeScreen: ImageVector
    get() = _ResizeScreen ?: UXIcon(name = "ResizeScreen") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(8f, 12f)
                horizontalLineToRelative(8f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                verticalLineToRelative(-8f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                horizontalLineToRelative(-8f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                verticalLineToRelative(8f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                close()
                moveTo(8f, 2.77f)
                curveToRelative(0f, -0.42f, 0.34f, -0.77f, 0.77f, -0.77f)
                horizontalLineToRelative(4.23f)
                lineToRelative(-1.79f, 1.79f)
                lineToRelative(3f, 3f)
                lineToRelative(1.79f, -1.79f)
                verticalLineToRelative(4.23f)
                curveToRelative(0f, 0.42f, -0.34f, 0.77f, -0.77f, 0.77f)
                horizontalLineToRelative(-4.23f)
                lineToRelative(1.79f, -1.79f)
                lineToRelative(-3f, -3f)
                lineToRelative(-1.79f, 1.79f)
                close()
                moveTo(24f, 20f)
                verticalLineToRelative(-15f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(8f)
                curveToRelative(0f, 2.21f, -1.79f, 4f, -4f, 4f)
                horizontalLineToRelative(-8f)
                curveToRelative(-2.21f, 0f, -4f, -1.79f, -4f, -4f)
                verticalLineToRelative(-8f)
                horizontalLineToRelative(-1f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
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
        }.also { _ResizeScreen = it}
