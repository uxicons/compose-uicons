package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ImageSlash: ImageVector? = null

val Icons.Br.ImageSlash: ImageVector
    get() = _ImageSlash ?: UXIcon(name = "ImageSlash") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(18f, 8f)
            curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
            reflectiveCurveToRelative(-2f, -0.9f, -2f, -2f)
            reflectiveCurveToRelative(0.9f, -2f, 2f, -2f)
            reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
            close()
            moveTo(23.56f, 23.56f)
            curveToRelative(-0.29f, 0.29f, -0.68f, 0.44f, -1.06f, 0.44f)
            reflectiveCurveToRelative(-0.77f, -0.15f, -1.06f, -0.44f)
            lineTo(0.44f, 2.56f)
            curveTo(-0.15f, 1.98f, -0.15f, 1.02f, 0.44f, 0.44f)
            reflectiveCurveTo(1.98f, -0.15f, 2.56f, 0.44f)
            lineToRelative(1.26f, 1.26f)
            curveToRelative(0.81f, -0.45f, 1.74f, -0.7f, 2.68f, -0.7f)
            horizontalLineToRelative(11f)
            curveToRelative(3.03f, 0f, 5.5f, 2.47f, 5.5f, 5.5f)
            verticalLineToRelative(11f)
            curveToRelative(0f, 0.95f, -0.24f, 1.87f, -0.7f, 2.68f)
            lineToRelative(1.26f, 1.26f)
            curveToRelative(0.59f, 0.59f, 0.59f, 1.53f, 0f, 2.12f)
            close()
            moveTo(6.15f, 4.03f)
            lineToRelative(13.83f, 13.83f)
            curveToRelative(0.02f, -0.12f, 0.03f, -0.23f, 0.03f, -0.35f)
            lineTo(20.0f, 6.5f)
            curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
            lineTo(6.5f, 4f)
            curveToRelative(-0.12f, 0f, -0.24f, 0.01f, -0.35f, 0.03f)
            close()
            moveTo(15.25f, 20.2f)
            lineToRelative(-6.75f, -6.75f)
            curveToRelative(-0.54f, -0.54f, -1.41f, -0.54f, -1.95f, 0f)
            lineToRelative(-2.55f, 2.55f)
            verticalLineToRelative(-6.5f)
            curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
            reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
            verticalLineToRelative(8f)
            curveToRelative(0f, 3.03f, 2.47f, 5.5f, 5.5f, 5.5f)
            horizontalLineToRelative(8f)
            curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
            curveToRelative(0f, -0.55f, -0.3f, -1.04f, -0.74f, -1.3f)
            close()
        }
    }.also { _ImageSlash = it }
