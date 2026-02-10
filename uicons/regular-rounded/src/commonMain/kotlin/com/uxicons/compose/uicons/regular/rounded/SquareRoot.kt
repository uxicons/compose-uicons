package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SquareRoot: ImageVector? = null

val Icons.Rr.SquareRoot: ImageVector
    get() = _SquareRoot ?: UXIcon(name = "SquareRoot") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(16.04f, 4f)
                arcToRelative(3.01f, 3.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.89f, 2.2f)
                lineToRelative(-4.05f, 14.57f)
                arcToRelative(1.68f, 1.68f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.6f, 1.23f)
                arcToRelative(1.75f, 1.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.62f, -1.16f)
                lineToRelative(-2.79f, -7.68f)
                arcToRelative(3.46f, 3.46f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.31f, -2.19f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.47f, -1.94f)
                arcToRelative(5.43f, 5.43f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.72f, 3.45f)
                lineToRelative(2.47f, 6.8f)
                lineToRelative(3.78f, -13.62f)
                arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.82f, -3.66f)
                horizontalLineToRelative(6.96f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 2f)
                close()
                moveTo(23.6f, 12.2f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.4f, 0.2f)
                lineToRelative(-2.2f, 2.93f)
                lineToRelative(-2.2f, -2.93f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.6f, 1.2f)
                lineToRelative(2.55f, 3.4f)
                lineToRelative(-2.55f, 3.4f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, 1.6f, 1.2f)
                lineToRelative(2.2f, -2.93f)
                lineToRelative(2.2f, 2.93f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, 1.6f, -1.2f)
                lineToRelative(-2.55f, -3.4f)
                lineToRelative(2.55f, -3.4f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.2f, -1.4f)
                close()
            }
        }.also { _SquareRoot = it}
