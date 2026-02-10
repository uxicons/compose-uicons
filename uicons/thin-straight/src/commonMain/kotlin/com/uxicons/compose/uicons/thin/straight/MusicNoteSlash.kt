package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MusicNoteSlash: ImageVector? = null

val Icons.Ts.MusicNoteSlash: ImageVector
    get() = _MusicNoteSlash ?: UXIcon(name = "MusicNoteSlash") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24.0f, 23.3f)
                lineToRelative(-0.71f, 0.71f)
                lineTo(-0.0f, 0.7f)
                lineTo(0.7f, -0.0f)
                lineToRelative(13.3f, 13.3f)
                lineTo(14f, 2.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(3.5f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-3.5f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                verticalLineToRelative(11.79f)
                lineToRelative(9.0f, 9.0f)
                close()
                moveTo(14f, 18.5f)
                curveToRelative(0f, 2.48f, -2.02f, 4.5f, -4.5f, 4.5f)
                reflectiveCurveToRelative(-4.5f, -2.02f, -4.5f, -4.5f)
                reflectiveCurveToRelative(2.02f, -4.5f, 4.5f, -4.5f)
                curveToRelative(0.38f, 0f, 0.75f, 0.05f, 1.1f, 0.14f)
                lineToRelative(-1.14f, -1.14f)
                curveToRelative(-3.02f, 0.02f, -5.46f, 2.48f, -5.46f, 5.5f)
                reflectiveCurveToRelative(2.47f, 5.5f, 5.5f, 5.5f)
                reflectiveCurveToRelative(5.48f, -2.45f, 5.5f, -5.46f)
                lineToRelative(-1.14f, -1.14f)
                curveToRelative(0.09f, 0.35f, 0.14f, 0.72f, 0.14f, 1.1f)
                close()
            }
        }.also { _MusicNoteSlash = it}
