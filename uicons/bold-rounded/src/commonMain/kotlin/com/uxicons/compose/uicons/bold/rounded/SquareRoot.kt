package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SquareRoot: ImageVector? = null

val Icons.Br.SquareRoot: ImageVector
    get() = _SquareRoot ?: UXIcon(name = "SquareRoot") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(15.99f, 5f)
            arcToRelative(2.51f, 2.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.4f, 1.79f)
            lineToRelative(-4.01f, 13.63f)
            arcToRelative(2.17f, 2.17f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.08f, 1.58f)
            arcToRelative(2.25f, 2.25f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.09f, -1.49f)
            lineToRelative(-2.31f, -6.7f)
            arcToRelative(2.94f, 2.94f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.95f, -1.85f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.71f, -2.92f)
            arcToRelative(5.94f, 5.94f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.07f, 3.77f)
            lineToRelative(1.49f, 4.33f)
            lineToRelative(3.3f, -11.19f)
            arcToRelative(5.53f, 5.53f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.27f, -3.95f)
            horizontalLineToRelative(6.51f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 3f)
            close()
            moveTo(23.4f, 11.3f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.1f, 0.3f)
            lineToRelative(-1.8f, 2.4f)
            lineToRelative(-1.8f, -2.4f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, -2.4f, 1.8f)
            lineToRelative(2.33f, 3.1f)
            lineToRelative(-2.33f, 3.1f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, 2.4f, 1.8f)
            lineToRelative(1.8f, -2.4f)
            lineToRelative(1.8f, 2.4f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.4f, -1.8f)
            lineToRelative(-2.33f, -3.1f)
            lineToRelative(2.33f, -3.1f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.3f, -2.1f)
            close()
        }
    }.also { _SquareRoot = it }
