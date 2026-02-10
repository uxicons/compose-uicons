package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _KeyboardBrightness: ImageVector? = null

val Icons.Bs.KeyboardBrightness: ImageVector
    get() = _KeyboardBrightness ?: UXIcon(name = "KeyboardBrightness") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17f, 18f)
                lineTo(7f, 18f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(3f)
                close()
                moveTo(13.5f, 4f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(3f)
                lineTo(13.5f, 4f)
                close()
                moveTo(4f, 15f)
                lineTo(0f, 15f)
                verticalLineToRelative(3f)
                lineTo(4f, 18f)
                verticalLineToRelative(-3f)
                close()
                moveTo(24f, 15f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-3f)
                close()
                moveTo(22.06f, 8.56f)
                lineToRelative(-2.12f, -2.12f)
                lineToRelative(-4.05f, 4.05f)
                lineToRelative(2.12f, 2.12f)
                lineToRelative(4.05f, -4.05f)
                close()
                moveTo(8.11f, 10.49f)
                lineTo(4.06f, 6.44f)
                lineToRelative(-2.12f, 2.12f)
                lineToRelative(4.05f, 4.05f)
                lineToRelative(2.12f, -2.12f)
                close()
            }
        }.also { _KeyboardBrightness = it}
