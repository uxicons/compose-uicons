package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SubtitlesSlash: ImageVector? = null

val Icons.Sr.SubtitlesSlash: ImageVector
    get() = _SubtitlesSlash ?: UXIcon(name = "SubtitlesSlash") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 17f)
                lineTo(24f, 7f)
                curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
                lineTo(5f, 2f)
                curveToRelative(-0.48f, 0f, -0.94f, 0.07f, -1.38f, 0.2f)
                lineTo(1.71f, 0.29f)
                curveTo(1.32f, -0.1f, 0.68f, -0.1f, 0.29f, 0.29f)
                reflectiveCurveTo(-0.1f, 1.32f, 0.29f, 1.71f)
                lineTo(22.29f, 23.71f)
                curveToRelative(0.2f, 0.2f, 0.45f, 0.29f, 0.71f, 0.29f)
                reflectiveCurveToRelative(0.51f, -0.1f, 0.71f, -0.29f)
                curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0f, -1.41f)
                lineToRelative(-1.5f, -1.5f)
                curveToRelative(1.09f, -0.91f, 1.79f, -2.27f, 1.79f, -3.8f)
                close()
                moveTo(20f, 11f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                horizontalLineToRelative(-5.59f)
                lineToRelative(-2f, -2f)
                horizontalLineToRelative(7.59f)
                close()
                moveTo(17.41f, 16f)
                horizontalLineToRelative(2.59f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                horizontalLineToRelative(-0.59f)
                lineToRelative(-2f, -2f)
                close()
                moveTo(4f, 18f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(7.74f)
                lineTo(0.53f, 4.79f)
                curveToRelative(-0.33f, 0.67f, -0.53f, 1.41f, -0.53f, 2.21f)
                verticalLineToRelative(10f)
                curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
                horizontalLineToRelative(12.74f)
                lineToRelative(-4f, -4f)
                lineTo(4f, 18f)
                close()
                moveTo(4f, 11f)
                horizontalLineToRelative(1f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                horizontalLineToRelative(-1f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                close()
            }
        }.also { _SubtitlesSlash = it}
