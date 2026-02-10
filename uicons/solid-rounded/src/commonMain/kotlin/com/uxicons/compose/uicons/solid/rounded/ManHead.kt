package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ManHead: ImageVector? = null

val Icons.Sr.ManHead: ImageVector
    get() = _ManHead ?: UXIcon(name = "ManHead") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 11.5f)
                arcToRelative(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3.27f, 3.49f)
                arcTo(11.04f, 11.04f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 19.95f)
                lineTo(16f, 23f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1f, 1f)
                lineTo(9f, 24f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1f, -1f)
                lineTo(8f, 19.95f)
                arcToRelative(11.26f, 11.26f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4.54f, -4.57f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 1.78f, -0.92f)
                curveTo(6.4f, 16.72f, 9.1f, 19f, 12f, 19f)
                horizontalLineToRelative(0f)
                curveToRelative(3.13f, 0f, 6.21f, -2.78f, 7.13f, -5.38f)
                arcToRelative(0.99f, 0.99f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.12f, -0.65f)
                arcTo(1.61f, 1.61f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20.5f, 13f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.27f, -2.97f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.82f, -0.88f)
                arcToRelative(7.96f, 7.96f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4.01f, -6.11f)
                arcToRelative(12.8f, 12.8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.13f, 2.54f)
                arcToRelative(15.09f, 15.09f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4.96f, 4.47f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, -1.72f, 0.84f)
                arcToRelative(15.81f, 15.81f, 0f, isMoreThanHalf = false, isPositiveArc = true, -7.26f, 1.1f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.5f, 10.14f)
                arcTo(6.37f, 6.37f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.82f, 7.77f)
                curveTo(3.12f, 4.67f, 5.1f, 0f, 12f, 0f)
                arcToRelative(9.97f, 9.97f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9.85f, 8.27f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 24f, 11.5f)
                close()
                moveTo(16f, 11.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, 14.5f, 13f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 11.5f)
                close()
            }
        }.also { _ManHead = it}
