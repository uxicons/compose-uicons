package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MusicNote: ImageVector? = null

val Icons.Rc.MusicNote: ImageVector
    get() = _MusicNote ?: UXIcon(name = "MusicNote") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19f, 1f)
                curveToRelative(-1.42f, 0f, -2.71f, 0.15f, -3.82f, 0.46f)
                curveToRelative(-1.28f, 0.35f, -2.18f, 1.54f, -2.18f, 2.89f)
                verticalLineToRelative(8.49f)
                curveToRelative(-0.87f, -0.56f, -2.02f, -0.84f, -3.5f, -0.84f)
                curveToRelative(-0.62f, 0f, -1.17f, 0.04f, -1.68f, 0.14f)
                curveToRelative(-3.43f, 0.62f, -3.82f, 3.36f, -3.82f, 5.37f)
                curveToRelative(0f, 3.75f, 1.75f, 5.5f, 5.5f, 5.5f)
                reflectiveCurveToRelative(5.5f, -1.75f, 5.5f, -5.5f)
                verticalLineToRelative(-13.15f)
                curveToRelative(0f, -0.45f, 0.29f, -0.84f, 0.71f, -0.96f)
                curveToRelative(0.94f, -0.26f, 2.04f, -0.39f, 3.29f, -0.39f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                close()
                moveTo(9.5f, 21f)
                curveToRelative(-2.65f, 0f, -3.5f, -0.85f, -3.5f, -3.5f)
                curveToRelative(0f, -2.51f, 0.8f, -3.15f, 2.18f, -3.4f)
                curveToRelative(0.38f, -0.07f, 0.82f, -0.1f, 1.32f, -0.1f)
                curveToRelative(2.65f, 0f, 3.5f, 0.85f, 3.5f, 3.5f)
                reflectiveCurveToRelative(-0.85f, 3.5f, -3.5f, 3.5f)
                close()
            }
        }.also { _MusicNote = it}
