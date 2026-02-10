package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MusicSlash: ImageVector? = null

val Icons.Rr.MusicSlash: ImageVector
    get() = _MusicSlash ?: UXIcon(name = "MusicSlash") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 6f)
                curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
                horizontalLineToRelative(-6f)
                curveToRelative(-2.76f, 0f, -5f, 2.24f, -5f, 5f)
                verticalLineToRelative(0.59f)
                lineTo(1.71f, 0.29f)
                curveTo(1.32f, -0.1f, 0.68f, -0.1f, 0.29f, 0.29f)
                reflectiveCurveTo(-0.1f, 1.32f, 0.29f, 1.71f)
                lineToRelative(22f, 22f)
                curveToRelative(0.2f, 0.2f, 0.45f, 0.29f, 0.71f, 0.29f)
                reflectiveCurveToRelative(0.51f, -0.1f, 0.71f, -0.29f)
                curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0f, -1.41f)
                lineToRelative(-0.97f, -0.97f)
                curveToRelative(0.81f, -0.91f, 1.26f, -2.08f, 1.26f, -3.32f)
                lineTo(24f, 6f)
                close()
                moveTo(10f, 6f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(6f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                verticalLineToRelative(8.0f)
                curveToRelative(-0.84f, -0.63f, -1.88f, -1.0f, -3f, -1.0f)
                curveToRelative(-1.24f, 0f, -2.42f, 0.45f, -3.32f, 1.26f)
                lineToRelative(-5.68f, -5.68f)
                verticalLineToRelative(-2.59f)
                close()
                moveTo(17.1f, 15.68f)
                curveToRelative(0.53f, -0.44f, 1.2f, -0.68f, 1.9f, -0.68f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                curveToRelative(0f, 0.7f, -0.24f, 1.37f, -0.68f, 1.9f)
                lineToRelative(-4.22f, -4.22f)
                close()
                moveTo(9f, 13f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                verticalLineToRelative(0.0f)
                curveToRelative(-0.84f, -0.63f, -1.88f, -1.0f, -3f, -1.0f)
                curveToRelative(-2.76f, 0f, -5f, 2.24f, -5f, 5f)
                reflectiveCurveToRelative(2.24f, 5f, 5f, 5f)
                reflectiveCurveToRelative(5f, -2.24f, 5f, -5f)
                verticalLineToRelative(-4f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                close()
                moveTo(5f, 21f)
                curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                reflectiveCurveToRelative(1.35f, -3f, 3f, -3f)
                reflectiveCurveToRelative(3f, 1.35f, 3f, 3f)
                reflectiveCurveToRelative(-1.35f, 3f, -3f, 3f)
                close()
            }
        }.also { _MusicSlash = it}
