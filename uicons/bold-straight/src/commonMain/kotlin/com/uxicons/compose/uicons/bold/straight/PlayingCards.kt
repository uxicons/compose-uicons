package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PlayingCards: ImageVector? = null

val Icons.Bs.PlayingCards: ImageVector
    get() = _PlayingCards ?: UXIcon(name = "PlayingCards") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.59f, 4.41f)
                arcToRelative(3.33f, 3.33f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.99f, -1.61f)
                lineToRelative(-8.81f, -2.67f)
                arcToRelative(3.37f, 3.37f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4.17f, 2.28f)
                lineToRelative(-0.48f, 1.59f)
                horizontalLineToRelative(-4.63f)
                arcToRelative(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.5f, 3.5f)
                verticalLineToRelative(16.5f)
                horizontalLineToRelative(16f)
                verticalLineToRelative(-2.33f)
                lineToRelative(3.23f, 1.2f)
                lineToRelative(4.63f, -15.9f)
                arcToRelative(3.34f, 3.34f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.28f, -2.56f)
                close()
                moveTo(13f, 21f)
                horizontalLineToRelative(-10f)
                verticalLineToRelative(-13.5f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.5f, -0.5f)
                horizontalLineToRelative(9f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.5f, 0.5f)
                close()
                moveTo(20.98f, 6.13f)
                lineTo(17.26f, 18.93f)
                lineTo(16f, 18.47f)
                verticalLineToRelative(-10.97f)
                arcToRelative(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.5f, -3.5f)
                horizontalLineToRelative(-1.23f)
                lineToRelative(0.22f, -0.74f)
                arcToRelative(0.36f, 0.36f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.17f, -0.22f)
                arcToRelative(0.34f, 0.34f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.26f, -0.03f)
                lineToRelative(8.81f, 2.67f)
                arcToRelative(0.36f, 0.36f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.22f, 0.18f)
                arcToRelative(0.35f, 0.35f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.03f, 0.28f)
                close()
                moveTo(12f, 13f)
                curveToRelative(0f, 2.33f, -4f, 5f, -4f, 5f)
                reflectiveCurveToRelative(-4f, -2.67f, -4f, -5f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, 0f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, 0f)
                close()
            }
        }.also { _PlayingCards = it}
