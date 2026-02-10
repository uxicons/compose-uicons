package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _KeyboardBrightness: ImageVector? = null

val Icons.Ts.KeyboardBrightness: ImageVector
    get() = _KeyboardBrightness ?: UXIcon(name = "KeyboardBrightness") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17f, 17f)
                lineTo(7f, 17f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(1f)
                close()
                moveTo(12.5f, 3.5f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(1f)
                lineTo(12.5f, 3.5f)
                close()
                moveTo(4f, 16f)
                lineTo(0f, 16f)
                verticalLineToRelative(1f)
                lineTo(4f, 17f)
                verticalLineToRelative(-1f)
                close()
                moveTo(24f, 16f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-1f)
                close()
                moveTo(21.35f, 7.85f)
                lineToRelative(-0.71f, -0.71f)
                lineToRelative(-4.05f, 4.05f)
                lineToRelative(0.71f, 0.71f)
                lineToRelative(4.05f, -4.05f)
                close()
                moveTo(7.4f, 11.19f)
                lineTo(3.35f, 7.15f)
                lineToRelative(-0.71f, 0.71f)
                lineToRelative(4.05f, 4.05f)
                lineToRelative(0.71f, -0.71f)
                close()
            }
        }.also { _KeyboardBrightness = it}
