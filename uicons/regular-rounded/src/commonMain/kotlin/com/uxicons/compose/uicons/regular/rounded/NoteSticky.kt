package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _NoteSticky: ImageVector? = null

val Icons.Rr.NoteSticky: ImageVector
    get() = _NoteSticky ?: UXIcon(name = "NoteSticky") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 0f)
                lineTo(5f, 0f)
                curveTo(2.24f, 0f, 0f, 2.24f, 0f, 5f)
                verticalLineToRelative(14f)
                curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
                horizontalLineToRelative(11.34f)
                curveToRelative(1.34f, 0f, 2.59f, -0.52f, 3.54f, -1.46f)
                lineToRelative(2.66f, -2.66f)
                curveToRelative(0.94f, -0.94f, 1.46f, -2.2f, 1.46f, -3.54f)
                lineTo(24f, 5f)
                curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
                close()
                moveTo(5f, 22f)
                curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                lineTo(2f, 5f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(14f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                lineTo(22f, 15f)
                horizontalLineToRelative(-4f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(4f)
                lineTo(5f, 22f)
                close()
                moveTo(18.46f, 21.12f)
                curveToRelative(-0.4f, 0.4f, -0.91f, 0.68f, -1.46f, 0.8f)
                verticalLineToRelative(-3.93f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(3.93f)
                curveToRelative(-0.12f, 0.55f, -0.4f, 1.06f, -0.8f, 1.46f)
                lineToRelative(-2.66f, 2.66f)
                close()
            }
        }.also { _NoteSticky = it}
