package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MusicNoteSlash: ImageVector? = null

val Icons.Rs.MusicNoteSlash: ImageVector
    get() = _MusicNoteSlash ?: UXIcon(name = "MusicNoteSlash") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12.56f, 16.8f)
                lineToRelative(2.4f, 2.4f)
                curveToRelative(-0.34f, 2.7f, -2.66f, 4.8f, -5.46f, 4.8f)
                curveToRelative(-3.03f, 0f, -5.5f, -2.47f, -5.5f, -5.5f)
                curveToRelative(0f, -2.8f, 2.1f, -5.11f, 4.8f, -5.46f)
                lineToRelative(2.4f, 2.4f)
                curveToRelative(-0.5f, -0.28f, -1.08f, -0.44f, -1.7f, -0.44f)
                curveToRelative(-1.93f, 0f, -3.5f, 1.57f, -3.5f, 3.5f)
                reflectiveCurveToRelative(1.57f, 3.5f, 3.5f, 3.5f)
                reflectiveCurveToRelative(3.5f, -1.57f, 3.5f, -3.5f)
                curveToRelative(0f, -0.62f, -0.16f, -1.2f, -0.44f, -1.7f)
                close()
                moveTo(15f, 13.59f)
                lineTo(15f, 2.5f)
                curveToRelative(0f, -0.28f, 0.23f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(4.5f)
                lineTo(20f, 0f)
                horizontalLineToRelative(-4.5f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                verticalLineToRelative(9.09f)
                lineTo(1.46f, 0.04f)
                lineTo(0.04f, 1.46f)
                lineToRelative(22.5f, 22.5f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(-8.96f, -8.96f)
                close()
            }
        }.also { _MusicNoteSlash = it}
