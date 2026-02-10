package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _KeyboardFinger: ImageVector? = null

val Icons.Ss.KeyboardFinger: ImageVector
    get() = _KeyboardFinger ?: UXIcon(name = "KeyboardFinger") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(14f, 12.11f)
                curveToRelative(0f, -1.0f, -0.68f, -1.92f, -1.66f, -2.08f)
                curveToRelative(-1.25f, -0.2f, -2.34f, 0.76f, -2.34f, 1.97f)
                verticalLineToRelative(8.82f)
                curveToRelative(-1.08f, -0.89f, -2.11f, -1.75f, -2.15f, -1.78f)
                curveToRelative(-0.92f, -0.86f, -2.37f, -0.81f, -3.23f, 0.11f)
                curveToRelative(-0.86f, 0.92f, -0.82f, 2.37f, 0.1f, 3.23f)
                lineToRelative(1.94f, 1.63f)
                horizontalLineToRelative(16.34f)
                verticalLineToRelative(-4.0f)
                lineToRelative(-9f, -3.54f)
                close()
                moveTo(12f, 8f)
                curveToRelative(2.21f, 0f, 4f, 1.79f, 4f, 4f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(-11f)
                curveToRelative(0f, -1.66f, -1.34f, -3f, -3f, -3f)
                horizontalLineToRelative(-18f)
                curveToRelative(-1.66f, 0f, -3f, 1.34f, -3f, 3f)
                verticalLineToRelative(11f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -2.21f, 1.79f, -4f, 4f, -4f)
                close()
                moveTo(20f, 10f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                close()
                moveTo(14f, 4f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-6f)
                close()
                moveTo(9f, 4f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-3f)
                close()
                moveTo(6f, 10f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                close()
                moveTo(4f, 6f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(2f)
                close()
            }
        }.also { _KeyboardFinger = it}
