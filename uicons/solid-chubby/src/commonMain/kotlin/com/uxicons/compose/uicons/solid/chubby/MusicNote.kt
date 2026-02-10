package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MusicNote: ImageVector? = null

val Icons.Sc.MusicNote: ImageVector
    get() = _MusicNote ?: UXIcon(name = "MusicNote") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20f, 2.5f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                curveToRelative(-1.49f, 0f, -2.54f, 0.2f, -3.15f, 0.37f)
                curveToRelative(-0.2f, 0.06f, -0.35f, 0.25f, -0.35f, 0.48f)
                verticalLineToRelative(12.65f)
                curveToRelative(0f, 3.75f, -1.75f, 5.5f, -5.5f, 5.5f)
                reflectiveCurveToRelative(-5.5f, -1.75f, -5.5f, -5.5f)
                reflectiveCurveToRelative(1.75f, -5.5f, 5.5f, -5.5f)
                curveToRelative(0.97f, 0f, 1.79f, 0.12f, 2.5f, 0.36f)
                verticalLineToRelative(-7.51f)
                curveToRelative(0f, -1.57f, 1.05f, -2.96f, 2.55f, -3.37f)
                curveToRelative(1.15f, -0.32f, 2.48f, -0.48f, 3.95f, -0.48f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                close()
            }
        }.also { _MusicNote = it}
