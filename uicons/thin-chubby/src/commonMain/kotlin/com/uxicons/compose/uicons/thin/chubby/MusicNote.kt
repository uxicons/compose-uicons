package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MusicNote: ImageVector? = null

val Icons.Tc.MusicNote: ImageVector
    get() = _MusicNote ?: UXIcon(name = "MusicNote") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19.5f, 1f)
                curveToRelative(-1.38f, 0f, -2.62f, 0.15f, -3.68f, 0.44f)
                curveToRelative(-1.07f, 0.29f, -1.82f, 1.28f, -1.82f, 2.41f)
                verticalLineToRelative(9.85f)
                curveToRelative(-0.87f, -1.15f, -2.32f, -1.7f, -4.5f, -1.7f)
                curveToRelative(-3.85f, 0f, -5.5f, 1.65f, -5.5f, 5.5f)
                reflectiveCurveToRelative(1.65f, 5.5f, 5.5f, 5.5f)
                reflectiveCurveToRelative(5.5f, -1.65f, 5.5f, -5.5f)
                verticalLineToRelative(-13.65f)
                curveToRelative(0f, -0.68f, 0.44f, -1.27f, 1.08f, -1.44f)
                curveToRelative(0.98f, -0.27f, 2.13f, -0.41f, 3.42f, -0.41f)
                curveToRelative(0.28f, 0f, 0.5f, -0.22f, 0.5f, -0.5f)
                reflectiveCurveToRelative(-0.22f, -0.5f, -0.5f, -0.5f)
                close()
                moveTo(9.5f, 22f)
                curveToRelative(-3.28f, 0f, -4.5f, -1.22f, -4.5f, -4.5f)
                reflectiveCurveToRelative(1.22f, -4.5f, 4.5f, -4.5f)
                reflectiveCurveToRelative(4.5f, 1.22f, 4.5f, 4.5f)
                reflectiveCurveToRelative(-1.22f, 4.5f, -4.5f, 4.5f)
                close()
            }
        }.also { _MusicNote = it}
