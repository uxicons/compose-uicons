package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HandHoldingHeart: ImageVector? = null

val Icons.Bs.HandHoldingHeart: ImageVector
    get() = _HandHoldingHeart ?: UXIcon(name = "HandHoldingHeart") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.73f, 9.01f)
                arcToRelative(3.88f, 3.88f, 0f, isMoreThanHalf = false, isPositiveArc = false, -5.49f, 0.26f)
                lineToRelative(-2.44f, 2.68f)
                arcTo(3.63f, 3.63f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12.36f, 11f)
                lineTo(3.5f, 11f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 14.5f)
                verticalLineToRelative(6f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.5f, 24f)
                lineTo(14.68f, 24f)
                lineToRelative(8.33f, -9.53f)
                arcTo(3.9f, 3.9f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22.73f, 9.01f)
                close()
                moveTo(20.77f, 12.48f)
                lineTo(13.32f, 21f)
                lineTo(3.5f, 21f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.5f, -0.5f)
                verticalLineToRelative(-6f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.5f, -0.5f)
                horizontalLineToRelative(8.86f)
                arcToRelative(0.64f, 0.64f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.09f, 1.28f)
                lineToRelative(-5.16f, 0.74f)
                lineToRelative(0.42f, 2.97f)
                lineToRelative(5.16f, -0.74f)
                arcToRelative(3.67f, 3.67f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.09f, -3.12f)
                lineToRelative(3.5f, -3.84f)
                arcToRelative(0.88f, 0.88f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.25f, -0.06f)
                arcTo(0.89f, 0.89f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20.77f, 12.48f)
                close()
                moveTo(7f, 2.48f)
                arcTo(2.37f, 2.37f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9.25f, 0f)
                arcTo(2.37f, 2.37f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11.5f, 2.48f)
                arcTo(2.37f, 2.37f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13.75f, 0f)
                arcTo(2.37f, 2.37f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 2.48f)
                curveToRelative(0f, 2.59f, -4.5f, 5.78f, -4.5f, 5.78f)
                reflectiveCurveTo(7f, 5.07f, 7f, 2.48f)
                close()
            }
        }.also { _HandHoldingHeart = it}
