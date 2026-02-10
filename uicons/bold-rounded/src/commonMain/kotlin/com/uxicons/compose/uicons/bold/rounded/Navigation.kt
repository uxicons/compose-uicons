package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Navigation: ImageVector? = null

val Icons.Br.Navigation: ImageVector
    get() = _Navigation ?: UXIcon(name = "Navigation") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(7.13f, 14.55f)
            curveToRelative(0.04f, 0.01f, 1.92f, 0.48f, 1.92f, 0.48f)
            reflectiveCurveToRelative(0.61f, 1.98f, 0.63f, 2.03f)
            arcToRelative(3.08f, 3.08f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.86f, 1.92f)
            horizontalLineToRelative(0.05f)
            arcToRelative(3.08f, 3.08f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.85f, -2.01f)
            reflectiveCurveToRelative(2.46f, -6.55f, 2.47f, -6.6f)
            arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13.63f, 6.1f)
            curveTo(13.57f, 6.11f, 7f, 8.72f, 7f, 8.72f)
            arcToRelative(3.1f, 3.1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.14f, 5.83f)
            close()
            moveTo(8.1f, 11.51f)
            lineTo(14.46f, 8.98f)
            arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.56f, 0.57f)
            lineToRelative(-2.39f, 6.36f)
            arcToRelative(0.09f, 0.09f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.08f, 0.06f)
            curveToRelative(-0.04f, 0f, -0.06f, -0.01f, -0.07f, -0.02f)
            lineToRelative(-0.8f, -2.61f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.07f, -1.02f)
            lineToRelative(-2.55f, -0.64f)
            curveToRelative(-0.02f, -0.01f, -0.03f, -0.03f, -0.04f, -0.08f)
            curveTo(8.02f, 11.54f, 8.05f, 11.53f, 8.1f, 11.51f)
            close()
            moveTo(12f, 24f)
            arcTo(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = false, 0f, 12f)
            arcTo(12.01f, 12.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 24f)
            close()
            moveTo(12f, 3f)
            arcToRelative(9f, 9f, 0f, isMoreThanHalf = true, isPositiveArc = true, -9f, 9f)
            arcTo(9.01f, 9.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 3f)
            close()
        }
    }.also { _Navigation = it }
