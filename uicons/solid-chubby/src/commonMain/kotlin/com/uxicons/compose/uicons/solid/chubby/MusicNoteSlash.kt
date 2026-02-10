package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MusicNoteSlash: ImageVector? = null

val Icons.Sc.MusicNoteSlash: ImageVector
    get() = _MusicNoteSlash ?: UXIcon(name = "MusicNoteSlash") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22.56f, 22.56f)
                curveToRelative(-0.59f, 0.59f, -1.53f, 0.59f, -2.12f, 0f)
                lineToRelative(-19.0f, -19f)
                curveToRelative(-0.59f, -0.59f, -0.59f, -1.53f, 0f, -2.12f)
                reflectiveCurveToRelative(1.53f, -0.59f, 2.12f, 0f)
                lineToRelative(8.44f, 8.44f)
                verticalLineToRelative(-5.03f)
                curveToRelative(0f, -1.57f, 1.05f, -2.96f, 2.55f, -3.37f)
                curveToRelative(1.16f, -0.32f, 2.49f, -0.48f, 3.95f, -0.48f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                curveToRelative(-1.19f, 0f, -2.26f, 0.12f, -3.16f, 0.37f)
                curveToRelative(-0.2f, 0.06f, -0.34f, 0.25f, -0.34f, 0.48f)
                verticalLineToRelative(8.03f)
                lineToRelative(7.56f, 7.56f)
                curveToRelative(0.59f, 0.59f, 0.59f, 1.53f, 0f, 2.12f)
                close()
                moveTo(4f, 17.5f)
                curveToRelative(0f, 3.75f, 1.75f, 5.5f, 5.5f, 5.5f)
                curveToRelative(2.92f, 0f, 4.62f, -1.08f, 5.23f, -3.32f)
                lineToRelative(-7.4f, -7.4f)
                curveToRelative(-2.25f, 0.61f, -3.32f, 2.3f, -3.32f, 5.23f)
                close()
            }
        }.also { _MusicNoteSlash = it}
