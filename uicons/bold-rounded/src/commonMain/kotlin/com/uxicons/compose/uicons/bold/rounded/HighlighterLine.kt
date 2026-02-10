package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HighlighterLine: ImageVector? = null

val Icons.Br.HighlighterLine: ImageVector
    get() = _HighlighterLine ?: UXIcon(name = "HighlighterLine") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(8.02f, 19f)
            curveToRelative(1.78f, 0f, 3.48f, -0.76f, 4.7f, -2.13f)
            lineToRelative(7.1f, -8.52f)
            curveToRelative(1.65f, -1.9f, 1.55f, -4.79f, -0.23f, -6.58f)
            lineToRelative(-0.37f, -0.37f)
            curveToRelative(-1.78f, -1.78f, -4.67f, -1.88f, -6.55f, -0.25f)
            lineTo(4.09f, 8.31f)
            curveToRelative(-1.33f, 1.18f, -2.09f, 2.88f, -2.09f, 4.66f)
            verticalLineToRelative(3.9f)
            lineToRelative(-1.56f, 1.56f)
            curveToRelative(-0.59f, 0.59f, -0.59f, 1.54f, 0f, 2.12f)
            curveToRelative(0.29f, 0.29f, 0.68f, 0.44f, 1.06f, 0.44f)
            reflectiveCurveToRelative(0.77f, -0.15f, 1.06f, -0.44f)
            lineToRelative(1.56f, -1.56f)
            horizontalLineToRelative(3.9f)
            close()
            moveTo(6.05f, 10.59f)
            lineTo(14.61f, 3.45f)
            curveToRelative(0.72f, -0.62f, 1.81f, -0.59f, 2.49f, 0.09f)
            lineToRelative(0.37f, 0.37f)
            curveToRelative(0.67f, 0.67f, 0.71f, 1.77f, 0.07f, 2.51f)
            lineToRelative(-7.09f, 8.5f)
            curveToRelative(-0.23f, 0.25f, -0.49f, 0.47f, -0.78f, 0.64f)
            lineToRelative(-4.22f, -4.22f)
            curveToRelative(0.16f, -0.28f, 0.37f, -0.53f, 0.6f, -0.74f)
            close()
            moveTo(24f, 22.5f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            lineTo(5.5f, 24f)
            curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
            reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
            lineTo(22.5f, 21f)
            curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
            close()
        }
    }.also { _HighlighterLine = it }
