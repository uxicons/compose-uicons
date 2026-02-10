package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Flag: ImageVector? = null

val Icons.Rs.Flag: ImageVector
    get() = _Flag ?: UXIcon(name = "Flag") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(15f, 3f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3f, -3f)
                horizontalLineToRelative(-12f)
                verticalLineToRelative(24f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-11f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(1f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 3f)
                horizontalLineToRelative(11f)
                verticalLineToRelative(-13f)
                horizontalLineToRelative(-9f)
                close()
                moveTo(2f, 2f)
                horizontalLineToRelative(10f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, 1f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(-11f)
                close()
                moveTo(22f, 6f)
                verticalLineToRelative(9f)
                horizontalLineToRelative(-9f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1f, -1f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-7f)
                close()
            }
        }.also { _Flag = it}
