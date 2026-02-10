package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HandHoldingHeart: ImageVector? = null

val Icons.Sr.HandHoldingHeart: ImageVector
    get() = _HandHoldingHeart ?: UXIcon(name = "HandHoldingHeart") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16f, 2.75f)
                curveToRelative(0f, 2.16f, -2.82f, 4.85f, -4.22f, 5.98f)
                arcToRelative(1.24f, 1.24f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.55f, 0f)
                curveTo(8.82f, 7.6f, 6f, 4.91f, 6f, 2.75f)
                arcTo(2.63f, 2.63f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8.5f, 0f)
                arcTo(2.63f, 2.63f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11f, 2.75f)
                arcTo(2.63f, 2.63f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13.5f, 0f)
                arcTo(2.63f, 2.63f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 2.75f)
                close()
                moveTo(23.34f, 12.35f)
                lineTo(15.64f, 20.76f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8.26f, 24f)
                lineTo(4f, 24f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4f, -4f)
                lineTo(0f, 15f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, -4f)
                horizontalLineToRelative(7.79f)
                arcToRelative(2.22f, 2.22f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.16f, 2.69f)
                arcToRelative(2.28f, 2.28f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.94f, 1.73f)
                lineTo(7.85f, 16f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7f, 17.13f)
                lineTo(7f, 17.13f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.13f, 0.85f)
                lineToRelative(4.25f, -0.6f)
                arcTo(4.23f, 4.23f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 13.21f)
                arcToRelative(4.08f, 4.08f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.07f, -0.64f)
                lineToRelative(3.54f, -3.74f)
                arcToRelative(2.61f, 2.61f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.67f, -0.16f)
                arcTo(2.62f, 2.62f, 0f, isMoreThanHalf = false, isPositiveArc = true, 23.34f, 12.35f)
                close()
            }
        }.also { _HandHoldingHeart = it}
