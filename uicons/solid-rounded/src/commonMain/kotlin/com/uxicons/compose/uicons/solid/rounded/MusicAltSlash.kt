package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MusicAltSlash: ImageVector? = null

val Icons.Sr.MusicAltSlash: ImageVector
    get() = _MusicAltSlash ?: UXIcon(name = "MusicAltSlash") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(14.6f, 18.79f)
                curveToRelative(0.24f, 0.24f, 0.34f, 0.59f, 0.27f, 0.93f)
                curveToRelative(-0.57f, 2.52f, -2.78f, 4.28f, -5.36f, 4.28f)
                curveToRelative(-3.03f, 0f, -5.5f, -2.47f, -5.5f, -5.5f)
                curveToRelative(0f, -2.59f, 1.76f, -4.79f, 4.28f, -5.36f)
                curveToRelative(0.34f, -0.08f, 0.69f, 0.03f, 0.93f, 0.27f)
                lineToRelative(5.39f, 5.39f)
                close()
                moveTo(23.71f, 23.71f)
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
                moveTo(15.0f, 13.58f)
                horizontalLineToRelative(0f)
                reflectiveCurveToRelative(0f, -0.0f, 0f, 0f)
                close()
            }
        }.also { _MusicAltSlash = it}
