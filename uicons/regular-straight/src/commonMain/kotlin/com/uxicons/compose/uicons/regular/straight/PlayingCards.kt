package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PlayingCards: ImageVector? = null

val Icons.Rs.PlayingCards: ImageVector
    get() = _PlayingCards ?: UXIcon(name = "PlayingCards") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21.85f, 2.98f)
                lineToRelative(-9.44f, -2.86f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.71f, 2.03f)
                lineToRelative(-0.56f, 1.85f)
                horizontalLineToRelative(-5.14f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3f, 3f)
                verticalLineToRelative(17f)
                horizontalLineToRelative(16f)
                verticalLineToRelative(-2.04f)
                lineToRelative(3.1f, 1.15f)
                lineToRelative(4.78f, -16.41f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.03f, -3.72f)
                close()
                moveTo(14f, 22f)
                horizontalLineToRelative(-12f)
                verticalLineToRelative(-15f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, -1f)
                horizontalLineToRelative(10f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, 1f)
                close()
                moveTo(21.96f, 6.13f)
                lineTo(17.78f, 20.48f)
                lineTo(16f, 19.82f)
                verticalLineToRelative(-12.82f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3f, -3f)
                horizontalLineToRelative(-2.77f)
                lineToRelative(0.38f, -1.28f)
                arcToRelative(0.99f, 0.99f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.48f, -0.6f)
                arcToRelative(0.98f, 0.98f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.75f, -0.09f)
                lineToRelative(9.44f, 2.86f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.68f, 1.24f)
                close()
                moveTo(12f, 13f)
                curveToRelative(0f, 2.33f, -4f, 5f, -4f, 5f)
                reflectiveCurveToRelative(-4f, -2.67f, -4f, -5f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, 0f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, 0f)
                close()
            }
        }.also { _PlayingCards = it}
