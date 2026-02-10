package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _KeyboardLeft: ImageVector? = null

val Icons.Ss.KeyboardLeft: ImageVector
    get() = _KeyboardLeft ?: UXIcon(name = "KeyboardLeft") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(15.01f, 17f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(8.99f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-2.99f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2.99f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-2.99f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2.99f)
                lineTo(24f, 3f)
                horizontalLineToRelative(-14.5f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                verticalLineToRelative(15.5f)
                horizontalLineToRelative(17f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(-8.99f)
                close()
                moveTo(16.01f, 7f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-2f)
                close()
                moveTo(16.01f, 11f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-2f)
                close()
                moveTo(13.01f, 17f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                close()
                moveTo(14f, 13f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(2f)
                close()
                moveTo(11f, 9f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-3f)
                close()
                moveTo(3.88f, 16.71f)
                lineToRelative(-3.29f, -3.29f)
                curveToRelative(-0.78f, -0.78f, -0.78f, -2.05f, 0f, -2.83f)
                lineToRelative(3.29f, -3.29f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(-3.29f, 3.29f)
                lineToRelative(3.29f, 3.29f)
                lineToRelative(-1.41f, 1.41f)
                close()
            }
        }.also { _KeyboardLeft = it}
