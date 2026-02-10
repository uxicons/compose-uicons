package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _NoteSticky: ImageVector? = null

val Icons.Ts.NoteSticky: ImageVector
    get() = _NoteSticky ?: UXIcon(name = "NoteSticky") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.5f, 0f)
                lineTo(2.5f, 0f)
                curveTo(1.12f, 0f, 0f, 1.12f, 0f, 2.5f)
                lineTo(0f, 24f)
                lineTo(17.71f, 24f)
                lineToRelative(6.29f, -6.29f)
                lineTo(24f, 2.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                close()
                moveTo(1f, 2.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                lineTo(21.5f, 1f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(14.5f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(6f)
                lineTo(1f, 23f)
                lineTo(1f, 2.5f)
                close()
                moveTo(22.29f, 18f)
                lineToRelative(-4.29f, 4.29f)
                verticalLineToRelative(-4.29f)
                horizontalLineToRelative(4.29f)
                close()
            }
        }.also { _NoteSticky = it}
