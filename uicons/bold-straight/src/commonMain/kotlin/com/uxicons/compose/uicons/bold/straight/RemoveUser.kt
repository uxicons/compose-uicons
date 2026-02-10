package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _RemoveUser: ImageVector? = null

val Icons.Bs.RemoveUser: ImageVector
    get() = _RemoveUser ?: UXIcon(name = "RemoveUser") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 13f)
                horizontalLineToRelative(-9f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(9f)
                close()
                moveTo(14f, 6f)
                arcToRelative(6f, 6f, 0f, isMoreThanHalf = true, isPositiveArc = false, -6f, 6f)
                arcToRelative(6.01f, 6.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6f, -6f)
                close()
                moveTo(11f, 6f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = true, isPositiveArc = true, -3f, -3f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 3f)
                close()
                moveTo(16f, 19f)
                arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, -5f, -5f)
                horizontalLineToRelative(-6f)
                arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, -5f, 5f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-5f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, -2f)
                horizontalLineToRelative(6f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 2f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(3f)
                close()
            }
        }.also { _RemoveUser = it}
