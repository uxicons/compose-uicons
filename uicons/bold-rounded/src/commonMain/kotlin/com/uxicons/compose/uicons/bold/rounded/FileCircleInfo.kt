package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FileCircleInfo: ImageVector? = null

val Icons.Br.FileCircleInfo: ImageVector
    get() = _FileCircleInfo ?: UXIcon(name = "FileCircleInfo") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(12f, 8f)
            curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
            lineTo(10f, 3f)
            lineTo(5.5f, 3f)
            curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
            verticalLineToRelative(11f)
            curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
            horizontalLineToRelative(2f)
            curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
            reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
            horizontalLineToRelative(-2f)
            curveToRelative(-3.03f, 0f, -5.5f, -2.47f, -5.5f, -5.5f)
            lineTo(0f, 5.5f)
            curveTo(0f, 2.47f, 2.47f, 0f, 5.5f, 0f)
            horizontalLineToRelative(4.76f)
            curveToRelative(1.18f, 0f, 2.34f, 0.48f, 3.18f, 1.32f)
            lineToRelative(3.24f, 3.24f)
            curveToRelative(0.75f, 0.75f, 1.22f, 1.76f, 1.3f, 2.82f)
            curveToRelative(0.07f, 0.83f, -0.55f, 1.55f, -1.37f, 1.62f)
            curveToRelative(-0.04f, 0f, -0.08f, 0f, -0.12f, 0f)
            curveToRelative(-0.64f, 0f, -1.2f, -0.41f, -1.41f, -1f)
            horizontalLineToRelative(-3.08f)
            close()
            moveTo(24f, 17.5f)
            curveToRelative(0f, 3.59f, -2.91f, 6.5f, -6.5f, 6.5f)
            reflectiveCurveToRelative(-6.5f, -2.91f, -6.5f, -6.5f)
            reflectiveCurveToRelative(2.91f, -6.5f, 6.5f, -6.5f)
            reflectiveCurveToRelative(6.5f, 2.91f, 6.5f, 6.5f)
            close()
            moveTo(19f, 18.5f)
            curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
            reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
            verticalLineToRelative(1f)
            curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
            reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
            verticalLineToRelative(-1f)
            close()
            moveTo(19f, 14.5f)
            curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
            reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
            reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
            reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
            close()
        }
    }.also { _FileCircleInfo = it }
