package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Glasses: ImageVector? = null

val Icons.Bs.Glasses: ImageVector
    get() = _Glasses ?: UXIcon(name = "Glasses") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19.5f, 0f)
                arcToRelative(4.5f, 4.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4.5f, 4.5f)
                verticalLineToRelative(0.5f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-0.5f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.5f, -1.5f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(10.61f)
                arcToRelative(5.48f, 5.48f, 0f, isMoreThanHalf = false, isPositiveArc = false, -7.79f, 3.39f)
                horizontalLineToRelative(-2.43f)
                arcToRelative(5.48f, 5.48f, 0f, isMoreThanHalf = false, isPositiveArc = false, -7.79f, -3.39f)
                verticalLineToRelative(-10.61f)
                horizontalLineToRelative(1.5f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.5f, 1.5f)
                verticalLineToRelative(0.5f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-0.5f)
                arcToRelative(4.5f, 4.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4.5f, -4.5f)
                horizontalLineToRelative(-4.5f)
                verticalLineToRelative(18.5f)
                arcToRelative(5.5f, 5.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10.79f, 1.5f)
                horizontalLineToRelative(2.43f)
                arcToRelative(5.5f, 5.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10.79f, -1.5f)
                verticalLineToRelative(-18.5f)
                close()
                moveTo(5.5f, 21f)
                arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 2.5f, -2.5f)
                arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.5f, 2.5f)
                close()
                moveTo(18.5f, 21f)
                arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 2.5f, -2.5f)
                arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.5f, 2.5f)
                close()
            }
        }.also { _Glasses = it}
