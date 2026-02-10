package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _NoteSticky: ImageVector? = null

val Icons.Br.NoteSticky: ImageVector
    get() = _NoteSticky ?: UXIcon(name = "NoteSticky") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(19.5f, 0f)
            horizontalLineTo(4.5f)
            curveTo(2.02f, 0f, 0f, 2.02f, 0f, 4.5f)
            verticalLineToRelative(15f)
            curveToRelative(0f, 2.48f, 2.02f, 4.5f, 4.5f, 4.5f)
            horizontalLineToRelative(11.65f)
            curveToRelative(1.42f, 0f, 2.76f, -0.55f, 3.76f, -1.56f)
            lineToRelative(2.54f, -2.54f)
            curveToRelative(1f, -1f, 1.56f, -2.34f, 1.56f, -3.76f)
            verticalLineTo(4.5f)
            curveToRelative(0f, -2.48f, -2.02f, -4.5f, -4.5f, -4.5f)
            close()
            moveTo(3f, 19.5f)
            verticalLineTo(4.5f)
            curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
            horizontalLineToRelative(15f)
            curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
            verticalLineTo(15f)
            horizontalLineToRelative(-3f)
            curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
            verticalLineToRelative(3f)
            horizontalLineTo(4.5f)
            curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
            close()
        }
    }.also { _NoteSticky = it }
