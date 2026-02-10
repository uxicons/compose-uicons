package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Bulb: ImageVector? = null

val Icons.Ss.Bulb: ImageVector
    get() = _Bulb ?: UXIcon(name = "Bulb") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(5.87f, 15.58f)
                arcToRelative(8.94f, 8.94f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.79f, -7.76f)
                arcToRelative(9f, 9f, 0f, isMoreThanHalf = true, isPositiveArc = true, 14.86f, 7.94f)
                arcToRelative(5.75f, 5.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.8f, 3.24f)
                horizontalLineToRelative(-3.13f)
                verticalLineToRelative(-8.18f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, -2.82f)
                horizontalLineToRelative(-2f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2f, 0f)
                horizontalLineToRelative(-2f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 2.82f)
                verticalLineToRelative(8.18f)
                horizontalLineToRelative(-3.12f)
                arcToRelative(6.54f, 6.54f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.01f, -3.42f)
                close()
                moveTo(8f, 21f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(-3f)
                close()
            }
        }.also { _Bulb = it}
