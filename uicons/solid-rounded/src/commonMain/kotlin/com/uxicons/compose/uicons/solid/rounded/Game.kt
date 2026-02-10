package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Game: ImageVector? = null

val Icons.Sr.Game: ImageVector
    get() = _Game ?: UXIcon(name = "Game") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.8f, 8.16f)
                lineToRelative(-3.41f, 10.4f)
                arcToRelative(4.95f, 4.95f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.95f, 3.2f)
                arcToRelative(6.97f, 6.97f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.56f, -2.76f)
                verticalLineToRelative(-10f)
                arcToRelative(7.01f, 7.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, -7f, -7f)
                horizontalLineToRelative(-1.67f)
                arcToRelative(5.02f, 5.02f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.45f, -1.78f)
                lineToRelative(5.69f, 1.75f)
                arcToRelative(5.02f, 5.02f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.33f, 6.19f)
                close()
                moveTo(16f, 9f)
                verticalLineToRelative(10f)
                arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, -5f, 5f)
                horizontalLineToRelative(-6f)
                arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, -5f, -5f)
                verticalLineToRelative(-10f)
                arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5f, -5f)
                horizontalLineToRelative(6f)
                arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5f, 5f)
                close()
                moveTo(12f, 13f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4f, 0f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4f, 0f)
                curveToRelative(0f, 1.45f, 1.54f, 3.39f, 2.71f, 4.38f)
                arcToRelative(1.99f, 1.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.57f, 0f)
                curveToRelative(1.17f, -0.99f, 2.71f, -2.93f, 2.71f, -4.38f)
                close()
            }
        }.also { _Game = it}
