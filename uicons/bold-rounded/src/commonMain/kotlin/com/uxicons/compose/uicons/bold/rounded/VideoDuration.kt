package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _VideoDuration: ImageVector? = null

val Icons.Br.VideoDuration: ImageVector
    get() = _VideoDuration ?: UXIcon(name = "VideoDuration") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(24f, 5.5f)
            verticalLineToRelative(4f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
            verticalLineToRelative(-4f)
            curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
            lineTo(5.5f, 3f)
            curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
            verticalLineToRelative(9f)
            curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
            horizontalLineToRelative(3f)
            curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
            reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
            horizontalLineToRelative(-3f)
            curveToRelative(-3.03f, 0f, -5.5f, -2.47f, -5.5f, -5.5f)
            lineTo(0f, 5.5f)
            curveTo(0f, 2.47f, 2.47f, 0f, 5.5f, 0f)
            horizontalLineToRelative(13f)
            curveToRelative(3.03f, 0f, 5.5f, 2.47f, 5.5f, 5.5f)
            close()
            moveTo(14.89f, 9.08f)
            lineToRelative(-4.14f, -2.3f)
            curveToRelative(-0.79f, -0.44f, -1.75f, 0.13f, -1.75f, 1.03f)
            verticalLineToRelative(4.6f)
            curveToRelative(0f, 0.9f, 0.97f, 1.47f, 1.75f, 1.03f)
            lineToRelative(4.14f, -2.3f)
            curveToRelative(0.81f, -0.45f, 0.81f, -1.61f, 0f, -2.06f)
            close()
            moveTo(24f, 18f)
            curveToRelative(0f, 3.31f, -2.69f, 6f, -6f, 6f)
            reflectiveCurveToRelative(-6f, -2.69f, -6f, -6f)
            reflectiveCurveToRelative(2.69f, -6f, 6f, -6f)
            reflectiveCurveToRelative(6f, 2.69f, 6f, 6f)
            close()
            moveTo(20.5f, 19.09f)
            lineToRelative(-1.5f, -1.5f)
            verticalLineToRelative(-2.59f)
            curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
            horizontalLineToRelative(0f)
            curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
            verticalLineToRelative(2.59f)
            curveToRelative(0f, 0.53f, 0.21f, 1.04f, 0.59f, 1.41f)
            lineToRelative(1.5f, 1.5f)
            curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0f)
            curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0f, -1.41f)
            close()
        }
    }.also { _VideoDuration = it }
