package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BlogPencil: ImageVector? = null

val Icons.Br.BlogPencil: ImageVector
    get() = _BlogPencil ?: UXIcon(name = "BlogPencil") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(24f, 7.5f)
            verticalLineToRelative(6f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
            lineTo(21f, 7.5f)
            curveToRelative(0f, -0.17f, -0.02f, -0.34f, -0.05f, -0.5f)
            lineTo(3.05f, 7f)
            curveToRelative(-0.03f, 0.16f, -0.05f, 0.33f, -0.05f, 0.5f)
            verticalLineToRelative(9f)
            curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
            horizontalLineToRelative(6f)
            curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
            reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
            lineTo(5.5f, 22f)
            curveToRelative(-3.03f, 0f, -5.5f, -2.47f, -5.5f, -5.5f)
            lineTo(0f, 7.5f)
            curveTo(0f, 4.47f, 2.47f, 2f, 5.5f, 2f)
            horizontalLineToRelative(13f)
            curveToRelative(3.03f, 0f, 5.5f, 2.47f, 5.5f, 5.5f)
            close()
            moveTo(16.55f, 13.27f)
            curveToRelative(-0.81f, -0.81f, -1.92f, -1.27f, -3.06f, -1.27f)
            horizontalLineToRelative(-0.95f)
            curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
            verticalLineToRelative(0.95f)
            curveToRelative(0f, 1.15f, 0.46f, 2.25f, 1.27f, 3.06f)
            lineToRelative(6.81f, 6.81f)
            curveToRelative(0.95f, 0.95f, 2.53f, 0.89f, 3.41f, -0.18f)
            curveToRelative(0.76f, -0.93f, 0.6f, -2.32f, -0.25f, -3.17f)
            lineToRelative(-6.71f, -6.71f)
            close()
        }
    }.also { _BlogPencil = it }
