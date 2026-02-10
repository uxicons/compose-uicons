package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _KeyboardLeft: ImageVector? = null

val Icons.Bs.KeyboardLeft: ImageVector
    get() = _KeyboardLeft ?: UXIcon(name = "KeyboardLeft") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 3f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-15f)
                verticalLineToRelative(12f)
                horizontalLineToRelative(15f)
                verticalLineToRelative(3f)
                lineTo(6f, 21f)
                lineTo(6f, 6f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(15f)
                close()
                moveTo(11f, 8f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-3f)
                close()
                moveTo(16f, 8f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-3f)
                close()
                moveTo(21f, 11f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(3f)
                close()
                moveTo(11f, 16f)
                horizontalLineToRelative(13f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-13f)
                verticalLineToRelative(3f)
                close()
                moveTo(0.37f, 12.82f)
                lineToRelative(3.63f, 3.32f)
                lineTo(4f, 7.84f)
                lineTo(0.37f, 11.16f)
                curveToRelative(-0.49f, 0.44f, -0.49f, 1.22f, 0f, 1.66f)
                close()
            }
        }.also { _KeyboardLeft = it}
