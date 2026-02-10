package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _NoteSticky: ImageVector? = null

val Icons.Sr.NoteSticky: ImageVector
    get() = _NoteSticky ?: UXIcon(name = "NoteSticky") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 18f)
                horizontalLineToRelative(4.54f)
                curveToRelative(-0.35f, 0.91f, -0.88f, 1.75f, -1.59f, 2.46f)
                lineToRelative(-1.48f, 1.48f)
                curveToRelative(-0.71f, 0.71f, -1.55f, 1.24f, -2.46f, 1.59f)
                verticalLineToRelative(-4.54f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                close()
                moveTo(24f, 5f)
                lineTo(24f, 15.51f)
                curveToRelative(0f, 0.16f, -0.01f, 0.32f, -0.02f, 0.49f)
                horizontalLineToRelative(-4.98f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(4.98f)
                curveToRelative(-0.16f, 0.01f, -0.32f, 0.02f, -0.49f, 0.02f)
                lineTo(5f, 24f)
                curveToRelative(-2.76f, 0f, -5f, -2.24f, -5f, -5f)
                lineTo(0f, 5f)
                curveTo(0f, 2.24f, 2.24f, 0f, 5f, 0f)
                horizontalLineToRelative(14f)
                curveToRelative(2.76f, 0f, 5f, 2.24f, 5f, 5f)
                close()
            }
        }.also { _NoteSticky = it}
