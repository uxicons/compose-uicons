package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Pound: ImageVector? = null

val Icons.Bs.Pound: ImageVector
    get() = _Pound ?: UXIcon(name = "Pound") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(9f, 17f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-7f)
                verticalLineToRelative(-3f)
                arcToRelative(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10f, 0f)
                horizontalLineToRelative(3f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -16f, 0f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(3f)
                arcToRelative(3.76f, 3.76f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4f, 4f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(20f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-14.15f)
                arcToRelative(7.21f, 7.21f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.15f, -4f)
                close()
            }
        }.also { _Pound = it}
