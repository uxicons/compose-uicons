package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _KeyboardBrightness: ImageVector? = null

val Icons.Rs.KeyboardBrightness: ImageVector
    get() = _KeyboardBrightness ?: UXIcon(name = "KeyboardBrightness") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17f, 18f)
                lineTo(7f, 18f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(2f)
                close()
                moveTo(13f, 4f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(2f)
                lineTo(13f, 4f)
                close()
                moveTo(4f, 16f)
                lineTo(0f, 16f)
                verticalLineToRelative(2f)
                lineTo(4f, 18f)
                verticalLineToRelative(-2f)
                close()
                moveTo(24f, 16f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-2f)
                close()
                moveTo(21.71f, 8.71f)
                lineToRelative(-1.41f, -1.41f)
                lineToRelative(-4.05f, 4.05f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(4.05f, -4.05f)
                close()
                moveTo(7.76f, 11.35f)
                lineTo(3.71f, 7.29f)
                lineToRelative(-1.41f, 1.41f)
                lineToRelative(4.05f, 4.05f)
                lineToRelative(1.41f, -1.41f)
                close()
            }
        }.also { _KeyboardBrightness = it}
