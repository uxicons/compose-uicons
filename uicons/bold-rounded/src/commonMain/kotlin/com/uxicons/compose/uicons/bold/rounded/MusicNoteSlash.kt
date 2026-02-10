package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MusicNoteSlash: ImageVector? = null

val Icons.Br.MusicNoteSlash: ImageVector
    get() = _MusicNoteSlash ?: UXIcon(name = "MusicNoteSlash") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(23.56f, 23.56f)
            curveToRelative(-0.29f, 0.29f, -0.68f, 0.44f, -1.06f, 0.44f)
            reflectiveCurveToRelative(-0.77f, -0.15f, -1.06f, -0.44f)
            lineTo(0.44f, 2.56f)
            curveTo(-0.15f, 1.98f, -0.15f, 1.02f, 0.44f, 0.44f)
            reflectiveCurveTo(1.98f, -0.15f, 2.56f, 0.44f)
            lineToRelative(9.44f, 9.44f)
            verticalLineToRelative(-4.88f)
            curveToRelative(0f, -2.76f, 2.24f, -5f, 5f, -5f)
            horizontalLineToRelative(2.5f)
            curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
            reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
            horizontalLineToRelative(-2.5f)
            curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
            verticalLineToRelative(7.88f)
            lineToRelative(8.56f, 8.56f)
            curveToRelative(0.59f, 0.59f, 0.59f, 1.53f, 0f, 2.12f)
            close()
            moveTo(13.73f, 19.12f)
            curveToRelative(-0.72f, -0.4f, -1.64f, -0.14f, -2.04f, 0.59f)
            curveToRelative(-0.44f, 0.8f, -1.28f, 1.29f, -2.19f, 1.29f)
            curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
            curveToRelative(0f, -0.91f, 0.49f, -1.75f, 1.29f, -2.19f)
            curveToRelative(0.72f, -0.4f, 0.99f, -1.31f, 0.59f, -2.04f)
            curveToRelative(-0.4f, -0.73f, -1.31f, -0.98f, -2.04f, -0.59f)
            curveToRelative(-1.75f, 0.97f, -2.84f, 2.81f, -2.84f, 4.81f)
            curveToRelative(0f, 3.03f, 2.47f, 5.5f, 5.5f, 5.5f)
            curveToRelative(2.0f, 0f, 3.84f, -1.09f, 4.81f, -2.84f)
            curveToRelative(0.4f, -0.72f, 0.14f, -1.64f, -0.59f, -2.04f)
            close()
        }
    }.also { _MusicNoteSlash = it }
