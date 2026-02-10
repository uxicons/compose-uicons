package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _NoteSticky: ImageVector? = null

val Icons.Ss.NoteSticky: ImageVector
    get() = _NoteSticky ?: UXIcon(name = "NoteSticky") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18f, 18f)
                horizontalLineToRelative(5.41f)
                lineToRelative(-5.41f, 5.41f)
                verticalLineToRelative(-5.41f)
                close()
                moveTo(24f, 3f)
                verticalLineToRelative(13f)
                horizontalLineToRelative(-8f)
                verticalLineToRelative(8f)
                horizontalLineTo(0f)
                verticalLineTo(3f)
                curveTo(0f, 1.35f, 1.35f, 0f, 3f, 0f)
                horizontalLineTo(21f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                close()
            }
        }.also { _NoteSticky = it}
