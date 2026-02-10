package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MusicNoteSlash: ImageVector? = null

val Icons.Ss.MusicNoteSlash: ImageVector
    get() = _MusicNoteSlash ?: UXIcon(name = "MusicNoteSlash") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.96f, 22.54f)
                lineToRelative(-1.41f, 1.41f)
                lineTo(0.04f, 1.46f)
                lineTo(1.46f, 0.04f)
                lineToRelative(11.54f, 11.54f)
                lineTo(13f, 2.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(4.5f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-4.5f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.23f, -0.5f, 0.5f)
                verticalLineToRelative(11f)
                horizontalLineToRelative(-0.09f)
                lineToRelative(9.04f, 9.04f)
                close()
                moveTo(8.8f, 13.04f)
                curveToRelative(-2.7f, 0.34f, -4.8f, 2.66f, -4.8f, 5.46f)
                curveToRelative(0f, 3.03f, 2.47f, 5.5f, 5.5f, 5.5f)
                curveToRelative(2.8f, 0f, 5.11f, -2.1f, 5.46f, -4.8f)
                lineToRelative(-6.15f, -6.15f)
                close()
            }
        }.also { _MusicNoteSlash = it}
