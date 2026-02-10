package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BoxFragile: ImageVector? = null

val Icons.Br.BoxFragile: ImageVector
    get() = _BoxFragile ?: UXIcon(name = "BoxFragile") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(18.5f, 0f)
            lineTo(5.5f, 0f)
            curveTo(2.47f, 0f, 0f, 2.47f, 0f, 5.5f)
            verticalLineToRelative(13f)
            curveToRelative(0f, 3.03f, 2.47f, 5.5f, 5.5f, 5.5f)
            horizontalLineToRelative(13f)
            curveToRelative(3.03f, 0f, 5.5f, -2.47f, 5.5f, -5.5f)
            lineTo(24f, 5.5f)
            curveToRelative(0f, -3.03f, -2.47f, -5.5f, -5.5f, -5.5f)
            close()
            moveTo(21f, 18.5f)
            curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
            lineTo(5.5f, 21f)
            curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
            lineTo(3f, 5.5f)
            curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
            horizontalLineToRelative(13f)
            curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
            verticalLineToRelative(13f)
            close()
            moveTo(17f, 7f)
            verticalLineToRelative(2.77f)
            curveToRelative(0f, 2.23f, -1.47f, 4.13f, -3.5f, 4.77f)
            verticalLineToRelative(1.46f)
            horizontalLineToRelative(1f)
            curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
            reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
            horizontalLineToRelative(-5f)
            curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
            reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
            horizontalLineToRelative(1f)
            verticalLineToRelative(-1.46f)
            curveToRelative(-2.07f, -0.67f, -3.5f, -2.73f, -3.5f, -4.99f)
            verticalLineToRelative(-2.55f)
            curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
            horizontalLineToRelative(1.78f)
            reflectiveCurveToRelative(-1.69f, 2.84f, -1.71f, 2.92f)
            curveToRelative(-0.15f, 0.49f, -0.06f, 1.02f, 0.25f, 1.43f)
            reflectiveCurveToRelative(0.79f, 0.65f, 1.3f, 0.65f)
            horizontalLineToRelative(2.07f)
            lineToRelative(-1.03f, 1.47f)
            curveToRelative(-0.29f, 0.47f, -0.15f, 1.09f, 0.32f, 1.38f)
            curveToRelative(0.16f, 0.1f, 0.35f, 0.15f, 0.53f, 0.15f)
            curveToRelative(0.33f, 0f, 0.66f, -0.17f, 0.85f, -0.47f)
            lineToRelative(1.38f, -2.04f)
            curveToRelative(0.33f, -0.49f, 0.36f, -1.12f, 0.08f, -1.65f)
            reflectiveCurveToRelative(-0.82f, -0.85f, -1.41f, -0.85f)
            horizontalLineToRelative(-2.08f)
            lineToRelative(1.8f, -3f)
            horizontalLineToRelative(1.89f)
            curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
            close()
        }
    }.also { _BoxFragile = it }
