package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MusicNoteSlash: ImageVector? = null

val Icons.Rc.MusicNoteSlash: ImageVector
    get() = _MusicNoteSlash ?: UXIcon(name = "MusicNoteSlash") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22.71f, 22.71f)
                curveToRelative(-0.39f, 0.39f, -1.02f, 0.39f, -1.41f, 0f)
                lineToRelative(-20f, -20f)
                curveToRelative(-0.39f, -0.39f, -0.39f, -1.02f, 0f, -1.41f)
                reflectiveCurveToRelative(1.02f, -0.39f, 1.41f, 0f)
                lineToRelative(10.29f, 10.29f)
                verticalLineToRelative(-7.24f)
                curveToRelative(0f, -1.35f, 0.9f, -2.54f, 2.18f, -2.89f)
                curveToRelative(1.12f, -0.31f, 2.4f, -0.46f, 3.82f, -0.46f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                curveToRelative(-1.24f, 0f, -2.35f, 0.13f, -3.29f, 0.39f)
                curveToRelative(-0.42f, 0.12f, -0.71f, 0.51f, -0.71f, 0.96f)
                verticalLineToRelative(9.24f)
                lineToRelative(7.71f, 7.71f)
                curveToRelative(0.39f, 0.39f, 0.39f, 1.02f, 0f, 1.41f)
                close()
                moveTo(14.06f, 18.02f)
                curveToRelative(-0.54f, -0.1f, -1.06f, 0.26f, -1.16f, 0.81f)
                curveToRelative(-0.25f, 1.38f, -0.89f, 2.18f, -3.4f, 2.18f)
                curveToRelative(-2.65f, 0f, -3.5f, -0.85f, -3.5f, -3.5f)
                curveToRelative(0f, -2.51f, 0.8f, -3.15f, 2.18f, -3.4f)
                curveToRelative(0.54f, -0.1f, 0.9f, -0.62f, 0.81f, -1.16f)
                reflectiveCurveToRelative(-0.61f, -0.91f, -1.16f, -0.81f)
                curveToRelative(-3.43f, 0.62f, -3.82f, 3.36f, -3.82f, 5.37f)
                curveToRelative(0f, 3.75f, 1.75f, 5.5f, 5.5f, 5.5f)
                curveToRelative(2.01f, 0f, 4.74f, -0.4f, 5.37f, -3.82f)
                curveToRelative(0.1f, -0.54f, -0.26f, -1.06f, -0.81f, -1.16f)
                close()
            }
        }.also { _MusicNoteSlash = it}
