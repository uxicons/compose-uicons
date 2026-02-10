package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Star: ImageVector? = null

val Icons.Br.Star: ImageVector
    get() = _Star ?: UXIcon(name = "Star") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(6.85f, 23.44f)
            arcToRelative(3.61f, 3.61f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.12f, -0.7f)
            arcTo(3.57f, 3.57f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.4f, 18.68f)
            lineTo(4.57f, 15.06f)
            lineTo(1.49f, 12.81f)
            arcTo(3.62f, 3.62f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.63f, 6.26f)
            horizontalLineTo(7.4f)
            lineToRelative(1.15f, -3.57f)
            arcToRelative(3.63f, 3.63f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6.91f, 0f)
            horizontalLineToRelative(0f)
            lineTo(16.6f, 6.26f)
            horizontalLineTo(20.37f)
            arcToRelative(3.62f, 3.62f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.14f, 6.55f)
            lineTo(19.43f, 15.06f)
            lineTo(20.6f, 18.68f)
            arcTo(3.63f, 3.63f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15f, 22.72f)
            lineToRelative(-3f, -2.21f)
            lineTo(9f, 22.72f)
            arcTo(3.62f, 3.62f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6.85f, 23.44f)
            close()
            moveTo(3.63f, 9.26f)
            arcToRelative(0.63f, 0.63f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.37f, 1.13f)
            lineToRelative(3.96f, 2.89f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.54f, 1.67f)
            lineToRelative(-1.5f, 4.65f)
            arcToRelative(0.63f, 0.63f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.97f, 0.7f)
            lineToRelative(3.89f, -2.86f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.78f, 0f)
            lineToRelative(3.89f, 2.86f)
            arcToRelative(0.62f, 0.62f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.97f, -0.7f)
            lineToRelative(-1.5f, -4.65f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.54f, -1.67f)
            lineToRelative(3.96f, -2.89f)
            arcToRelative(0.63f, 0.63f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.37f, -1.13f)
            horizontalLineTo(15.5f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.43f, -1.04f)
            lineTo(12.6f, 3.61f)
            arcToRelative(0.63f, 0.63f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.19f, 0f)
            lineTo(9.93f, 8.22f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8.5f, 9.26f)
            close()
        }
    }.also { _Star = it }
