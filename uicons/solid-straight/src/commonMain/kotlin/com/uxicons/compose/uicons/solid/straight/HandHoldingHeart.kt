package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HandHoldingHeart: ImageVector? = null

val Icons.Ss.HandHoldingHeart: ImageVector
    get() = _HandHoldingHeart ?: UXIcon(name = "HandHoldingHeart") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11f, 9.17f)
                reflectiveCurveTo(6f, 5.63f, 6f, 2.75f)
                arcTo(2.63f, 2.63f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8.5f, 0f)
                arcTo(2.63f, 2.63f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11f, 2.75f)
                arcTo(2.63f, 2.63f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13.5f, 0f)
                arcTo(2.63f, 2.63f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 2.75f)
                curveTo(16f, 5.63f, 11f, 9.17f, 11f, 9.17f)
                close()
                moveTo(23.15f, 8.68f)
                arcToRelative(2.61f, 2.61f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.67f, 0.16f)
                lineToRelative(-3.54f, 3.74f)
                arcToRelative(4.08f, 4.08f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.07f, 0.64f)
                arcToRelative(4.23f, 4.23f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3.62f, 4.17f)
                lineToRelative(-4.24f, 0.61f)
                lineToRelative(-0.28f, -1.98f)
                lineTo(12.1f, 15.4f)
                arcToRelative(2.21f, 2.21f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.31f, -4.4f)
                lineTo(3f, 11f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3f, 3f)
                verticalLineToRelative(7f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 3f)
                horizontalLineToRelative(9.66f)
                lineTo(23.34f, 12.35f)
                arcTo(2.62f, 2.62f, 0f, isMoreThanHalf = false, isPositiveArc = false, 23.15f, 8.68f)
                close()
            }
        }.also { _HandHoldingHeart = it}
