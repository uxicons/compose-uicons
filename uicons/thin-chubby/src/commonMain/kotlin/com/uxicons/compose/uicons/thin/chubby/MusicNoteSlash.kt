package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MusicNoteSlash: ImageVector? = null

val Icons.Tc.MusicNoteSlash: ImageVector
    get() = _MusicNoteSlash ?: UXIcon(name = "MusicNoteSlash") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(14.96f, 18.55f)
                curveToRelative(-0.28f, 3.08f, -1.97f, 4.45f, -5.46f, 4.45f)
                curveToRelative(-3.85f, 0f, -5.5f, -1.65f, -5.5f, -5.5f)
                curveToRelative(0f, -3.49f, 1.37f, -5.17f, 4.45f, -5.46f)
                curveToRelative(0.27f, -0.02f, 0.52f, 0.18f, 0.54f, 0.45f)
                reflectiveCurveToRelative(-0.18f, 0.52f, -0.45f, 0.54f)
                curveToRelative(-2.55f, 0.23f, -3.55f, 1.49f, -3.55f, 4.46f)
                curveToRelative(0f, 3.28f, 1.22f, 4.5f, 4.5f, 4.5f)
                curveToRelative(2.97f, 0f, 4.22f, -0.99f, 4.46f, -3.55f)
                curveToRelative(0.03f, -0.28f, 0.27f, -0.46f, 0.54f, -0.45f)
                curveToRelative(0.28f, 0.03f, 0.48f, 0.27f, 0.45f, 0.54f)
                close()
                moveTo(22.85f, 22.15f)
                lineTo(15.0f, 14.29f)
                verticalLineToRelative(-10.44f)
                curveToRelative(0f, -0.68f, 0.45f, -1.27f, 1.08f, -1.44f)
                curveToRelative(0.98f, -0.27f, 2.14f, -0.41f, 3.42f, -0.41f)
                curveToRelative(0.28f, 0f, 0.5f, -0.22f, 0.5f, -0.5f)
                reflectiveCurveToRelative(-0.22f, -0.5f, -0.5f, -0.5f)
                curveToRelative(-1.37f, 0f, -2.61f, 0.15f, -3.68f, 0.44f)
                curveToRelative(-1.07f, 0.29f, -1.82f, 1.28f, -1.82f, 2.41f)
                verticalLineToRelative(9.44f)
                lineToRelative(-12.14f, -12.15f)
                curveToRelative(-0.2f, -0.2f, -0.51f, -0.2f, -0.71f, 0f)
                reflectiveCurveToRelative(-0.2f, 0.51f, 0f, 0.71f)
                lineToRelative(21.0f, 21.0f)
                curveToRelative(0.2f, 0.2f, 0.51f, 0.2f, 0.71f, 0f)
                reflectiveCurveToRelative(0.2f, -0.51f, 0f, -0.71f)
                close()
            }
        }.also { _MusicNoteSlash = it}
