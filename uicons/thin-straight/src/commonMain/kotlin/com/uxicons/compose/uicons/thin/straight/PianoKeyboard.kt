package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PianoKeyboard: ImageVector? = null

val Icons.Ts.PianoKeyboard: ImageVector
    get() = _PianoKeyboard ?: UXIcon(name = "PianoKeyboard") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21.5f, 2f)
                lineTo(2.5f, 2f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                verticalLineToRelative(17.5f)
                horizontalLineToRelative(24f)
                lineTo(24f, 4.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                close()
                moveTo(2.5f, 3f)
                horizontalLineToRelative(19f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(8.5f)
                lineTo(1f, 13f)
                lineTo(1f, 4.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                close()
                moveTo(1f, 21f)
                verticalLineToRelative(-7f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(7f)
                lineTo(1f, 21f)
                close()
            }
        }.also { _PianoKeyboard = it}
