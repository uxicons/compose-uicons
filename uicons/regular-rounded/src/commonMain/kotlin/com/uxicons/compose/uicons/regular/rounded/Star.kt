package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Star: ImageVector? = null

val Icons.Rr.Star: ImageVector
    get() = _Star ?: UXIcon(name = "Star") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.84f, 8.79f)
                arcToRelative(3.18f, 3.18f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.07f, -2.23f)
                lineTo(16.4f, 6.57f)
                lineTo(15.07f, 2.43f)
                arcToRelative(3.23f, 3.23f, 0f, isMoreThanHalf = false, isPositiveArc = false, -6.15f, 0f)
                lineTo(7.6f, 6.57f)
                lineTo(3.23f, 6.57f)
                arcToRelative(3.23f, 3.23f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.9f, 5.83f)
                lineTo(4.89f, 15f)
                lineTo(3.54f, 19.19f)
                arcTo(3.18f, 3.18f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.72f, 22.8f)
                arcToRelative(3.18f, 3.18f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.8f, -0.02f)
                lineTo(12f, 20.22f)
                lineToRelative(3.48f, 2.56f)
                arcToRelative(3.23f, 3.23f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.98f, -3.59f)
                lineTo(19.11f, 15f)
                lineToRelative(3.56f, -2.6f)
                arcTo(3.18f, 3.18f, 0f, isMoreThanHalf = false, isPositiveArc = false, 23.84f, 8.79f)
                close()
                moveTo(21.49f, 10.79f)
                lineTo(17.35f, 13.81f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.36f, 1.12f)
                lineTo(18.56f, 19.8f)
                arcToRelative(1.23f, 1.23f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.9f, 1.36f)
                lineToRelative(-4.08f, -3f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.18f, 0f)
                lineToRelative(-4.08f, 3f)
                arcToRelative(1.23f, 1.23f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.9f, -1.36f)
                lineTo(7.01f, 14.93f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.36f, -1.12f)
                lineTo(2.51f, 10.79f)
                arcToRelative(1.23f, 1.23f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.72f, -2.22f)
                horizontalLineToRelative(5.1f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.95f, -0.69f)
                lineToRelative(1.55f, -4.83f)
                arcToRelative(1.23f, 1.23f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.34f, 0f)
                lineToRelative(1.55f, 4.83f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.95f, 0.69f)
                horizontalLineToRelative(5.1f)
                arcToRelative(1.23f, 1.23f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.72f, 2.22f)
                close()
            }
        }.also { _Star = it}
