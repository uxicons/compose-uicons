package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _NoteSticky: ImageVector? = null

val Icons.Rs.NoteSticky: ImageVector
    get() = _NoteSticky ?: UXIcon(name = "NoteSticky") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 0f)
                lineTo(3f, 0f)
                curveTo(1.35f, 0f, 0f, 1.35f, 0f, 3f)
                lineTo(0f, 24f)
                lineTo(17.41f, 24f)
                lineToRelative(6.59f, -6.59f)
                lineTo(24f, 3f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                close()
                moveTo(2f, 3f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                lineTo(21f, 2f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                verticalLineToRelative(13f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(6f)
                lineTo(2f, 22f)
                lineTo(2f, 3f)
                close()
                moveTo(20.59f, 18f)
                lineToRelative(-2.59f, 2.59f)
                verticalLineToRelative(-2.59f)
                horizontalLineToRelative(2.59f)
                close()
            }
        }.also { _NoteSticky = it}
