package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MusicNoteSlash: ImageVector? = null

val Icons.Rr.MusicNoteSlash: ImageVector
    get() = _MusicNoteSlash ?: UXIcon(name = "MusicNoteSlash") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.71f, 23.71f)
                curveToRelative(-0.2f, 0.2f, -0.45f, 0.29f, -0.71f, 0.29f)
                reflectiveCurveToRelative(-0.51f, -0.1f, -0.71f, -0.29f)
                lineTo(0.29f, 1.71f)
                curveTo(-0.1f, 1.32f, -0.1f, 0.68f, 0.29f, 0.29f)
                reflectiveCurveTo(1.32f, -0.1f, 1.71f, 0.29f)
                lineToRelative(11.29f, 11.29f)
                verticalLineToRelative(-7.09f)
                curveToRelative(0f, -2.48f, 2.02f, -4.5f, 4.5f, -4.5f)
                horizontalLineToRelative(2.5f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                horizontalLineToRelative(-2.5f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                verticalLineToRelative(9.09f)
                lineToRelative(8.71f, 8.71f)
                curveToRelative(0.39f, 0.39f, 0.39f, 1.02f, 0f, 1.41f)
                close()
                moveTo(14.11f, 18.52f)
                curveToRelative(-0.54f, -0.12f, -1.07f, 0.22f, -1.2f, 0.75f)
                curveToRelative(-0.36f, 1.58f, -1.79f, 2.72f, -3.41f, 2.72f)
                curveToRelative(-1.93f, 0f, -3.5f, -1.57f, -3.5f, -3.5f)
                curveToRelative(0f, -1.62f, 1.15f, -3.06f, 2.72f, -3.41f)
                curveToRelative(0.54f, -0.12f, 0.88f, -0.66f, 0.75f, -1.2f)
                curveToRelative(-0.12f, -0.54f, -0.66f, -0.88f, -1.2f, -0.75f)
                curveToRelative(-2.52f, 0.57f, -4.28f, 2.78f, -4.28f, 5.36f)
                curveToRelative(0f, 3.03f, 2.47f, 5.5f, 5.5f, 5.5f)
                curveToRelative(2.59f, 0f, 4.79f, -1.76f, 5.36f, -4.28f)
                curveToRelative(0.12f, -0.54f, -0.22f, -1.07f, -0.75f, -1.2f)
                close()
            }
        }.also { _MusicNoteSlash = it}
