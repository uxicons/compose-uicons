package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Bulb: ImageVector? = null

val Icons.Sr.Bulb: ImageVector
    get() = _Bulb ?: UXIcon(name = "Bulb") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(5.87f, 15.58f)
                arcToRelative(8.94f, 8.94f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.79f, -7.76f)
                arcToRelative(9f, 9f, 0f, isMoreThanHalf = true, isPositiveArc = true, 14.86f, 7.94f)
                arcToRelative(5.74f, 5.74f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.59f, 2.24f)
                horizontalLineToRelative(-3.34f)
                verticalLineToRelative(-7.18f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, -2.82f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2f, 0f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2f, 0f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2f, 0f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 2.82f)
                verticalLineToRelative(7.18f)
                horizontalLineToRelative(-3.44f)
                arcToRelative(6.84f, 6.84f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.7f, -2.42f)
                close()
                moveTo(8f, 20f)
                verticalLineToRelative(0.31f)
                arcToRelative(3.69f, 3.69f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.69f, 3.69f)
                horizontalLineToRelative(0.62f)
                arcToRelative(3.69f, 3.69f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.69f, -3.69f)
                verticalLineToRelative(-0.31f)
                close()
            }
        }.also { _Bulb = it}
