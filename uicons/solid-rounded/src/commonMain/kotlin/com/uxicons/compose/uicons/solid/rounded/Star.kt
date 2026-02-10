package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Star: ImageVector? = null

val Icons.Sr.Star: ImageVector
    get() = _Star ?: UXIcon(name = "Star") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(1.33f, 12.4f)
                lineTo(4.89f, 15f)
                lineTo(3.54f, 19.19f)
                arcTo(3.18f, 3.18f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.72f, 22.8f)
                arcToRelative(3.18f, 3.18f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.8f, -0.02f)
                lineTo(12f, 20.22f)
                lineToRelative(3.48f, 2.56f)
                arcToRelative(3.23f, 3.23f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.98f, -3.59f)
                lineTo(19.11f, 15f)
                lineToRelative(3.56f, -2.6f)
                arcToRelative(3.23f, 3.23f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.9f, -5.83f)
                horizontalLineTo(16.4f)
                lineTo(15.07f, 2.43f)
                arcToRelative(3.23f, 3.23f, 0f, isMoreThanHalf = false, isPositiveArc = false, -6.15f, 0f)
                lineTo(7.6f, 6.57f)
                horizontalLineTo(3.23f)
                arcToRelative(3.23f, 3.23f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.9f, 5.83f)
                close()
            }
        }.also { _Star = it}
