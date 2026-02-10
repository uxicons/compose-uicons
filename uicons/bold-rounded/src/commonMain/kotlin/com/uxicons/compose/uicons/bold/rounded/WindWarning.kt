package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _WindWarning: ImageVector? = null

val Icons.Br.WindWarning: ImageVector
    get() = _WindWarning ?: UXIcon(name = "WindWarning") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(19.54f, 20f)
            arcToRelative(5.02f, 5.02f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3.61f, -1.56f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 2.21f, -2.02f)
            curveToRelative(0.92f, 1.03f, 2.9f, 0.63f, 2.89f, -0.91f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.5f, -1.5f)
            lineTo(14.5f, 14f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -3f)
            horizontalLineToRelative(5.04f)
            curveTo(25.48f, 11.16f, 25.47f, 19.85f, 19.54f, 20f)
            close()
            moveTo(24.04f, 4.5f)
            curveToRelative(0.01f, -4.26f, -5.37f, -5.98f, -8.11f, -2.94f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, 2.21f, 2.02f)
            curveToRelative(0.92f, -1.03f, 2.9f, -0.63f, 2.89f, 0.91f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.5f, 1.5f)
            lineTo(16.5f, 6f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 3f)
            horizontalLineToRelative(3.04f)
            arcTo(4.5f, 4.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24.04f, 4.5f)
            close()
            moveTo(14f, 19.5f)
            arcTo(4.5f, 4.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9.5f, 15f)
            horizontalLineToRelative(-8f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 3f)
            horizontalLineToRelative(8f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 3f)
            arcToRelative(1.85f, 1.85f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.38f, -0.65f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, -2.32f, 1.9f)
            arcTo(4.83f, 4.83f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9.5f, 24f)
            arcTo(4.5f, 4.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 14f, 19.5f)
            close()
            moveTo(13f, 6.5f)
            curveToRelative(-0.27f, 8.59f, -12.73f, 8.59f, -13f, 0f)
            curveTo(0.27f, -2.09f, 12.73f, -2.09f, 13f, 6.5f)
            close()
            moveTo(8f, 9.5f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3f, 0f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 9.5f)
            close()
            moveTo(8f, 3.5f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3f, 0f)
            verticalLineToRelative(2f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 0f)
            close()
        }
    }.also { _WindWarning = it }
