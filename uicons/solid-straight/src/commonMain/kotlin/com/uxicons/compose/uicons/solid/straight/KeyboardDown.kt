package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _KeyboardDown: ImageVector? = null

val Icons.Ss.KeyboardDown: ImageVector
    get() = _KeyboardDown ?: UXIcon(name = "KeyboardDown") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 24.0f)
                curveToRelative(-0.51f, 0f, -1.02f, -0.2f, -1.41f, -0.58f)
                lineToRelative(-3.29f, -3.29f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(3.29f, 3.29f)
                lineToRelative(3.29f, -3.29f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(-3.29f, 3.29f)
                curveToRelative(-0.39f, 0.39f, -0.9f, 0.58f, -1.41f, 0.58f)
                close()
                moveTo(24f, 6f)
                verticalLineToRelative(11f)
                lineTo(0f, 17f)
                lineTo(0f, 6f)
                curveToRelative(0f, -1.66f, 1.34f, -3f, 3f, -3f)
                horizontalLineToRelative(18f)
                curveToRelative(1.66f, 0f, 3f, 1.34f, 3f, 3f)
                close()
                moveTo(9f, 9f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(2f)
                close()
                moveTo(6f, 11f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2f)
                close()
                moveTo(7f, 7f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-2f)
                close()
                moveTo(16f, 11f)
                horizontalLineToRelative(-8f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(-2f)
                close()
                moveTo(20f, 11f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2f)
                close()
                moveTo(20f, 7f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(-2f)
                close()
            }
        }.also { _KeyboardDown = it}
