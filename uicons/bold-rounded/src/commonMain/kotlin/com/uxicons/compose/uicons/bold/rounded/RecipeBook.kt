package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _RecipeBook: ImageVector? = null

val Icons.Br.RecipeBook: ImageVector
    get() = _RecipeBook ?: UXIcon(name = "RecipeBook") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(6.11f, 6.74f)
            curveToRelative(0.24f, -0.8f, 0.9f, -1.44f, 1.71f, -1.65f)
            curveToRelative(0.94f, -0.25f, 1.83f, 0.04f, 2.43f, 0.63f)
            curveToRelative(0.45f, -0.44f, 1.07f, -0.72f, 1.75f, -0.72f)
            reflectiveCurveToRelative(1.3f, 0.28f, 1.75f, 0.72f)
            curveToRelative(0.6f, -0.59f, 1.48f, -0.88f, 2.43f, -0.63f)
            curveToRelative(0.8f, 0.21f, 1.47f, 0.85f, 1.71f, 1.65f)
            curveToRelative(0.45f, 1.53f, -0.51f, 2.93f, -1.89f, 3.21f)
            verticalLineToRelative(1.55f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            horizontalLineToRelative(-5f)
            curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
            verticalLineToRelative(-1.55f)
            curveToRelative(-1.38f, -0.28f, -2.34f, -1.69f, -1.89f, -3.21f)
            close()
            moveTo(23f, 5.5f)
            verticalLineToRelative(13f)
            curveToRelative(0f, 3.03f, -2.47f, 5.5f, -5.5f, 5.5f)
            lineTo(5.5f, 24f)
            curveToRelative(-2.38f, 0f, -4.31f, -1.86f, -4.47f, -4.2f)
            curveToRelative(-0.02f, -0.1f, -0.03f, -0.2f, -0.03f, -0.3f)
            lineTo(1f, 5.5f)
            curveTo(1f, 2.47f, 3.47f, 0f, 6.5f, 0f)
            horizontalLineToRelative(11f)
            curveToRelative(3.03f, 0f, 5.5f, 2.47f, 5.5f, 5.5f)
            close()
            moveTo(4f, 5.5f)
            verticalLineToRelative(9.78f)
            curveToRelative(0.47f, -0.17f, 0.97f, -0.28f, 1.5f, -0.28f)
            horizontalLineToRelative(14.5f)
            lineTo(20f, 5.5f)
            curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
            lineTo(6.5f, 3f)
            curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
            close()
            moveTo(20f, 18.5f)
            verticalLineToRelative(-0.5f)
            lineTo(5.5f, 18f)
            curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
            reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
            horizontalLineToRelative(12f)
            curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
            close()
        }
    }.also { _RecipeBook = it }
