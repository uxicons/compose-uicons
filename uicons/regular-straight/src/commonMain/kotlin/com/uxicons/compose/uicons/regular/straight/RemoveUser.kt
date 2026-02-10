package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _RemoveUser: ImageVector? = null

val Icons.Rs.RemoveUser: ImageVector
    get() = _RemoveUser ?: UXIcon(name = "RemoveUser") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 12f)
                horizontalLineToRelative(-8f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(8f)
                close()
                moveTo(14.97f, 6f)
                arcToRelative(6f, 6f, 0f, isMoreThanHalf = true, isPositiveArc = false, -6f, 6f)
                arcToRelative(6.01f, 6.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6f, -6f)
                close()
                moveTo(12.97f, 6f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = true, isPositiveArc = true, -4f, -4f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, 4f)
                close()
                moveTo(18f, 19f)
                arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, -5f, -5f)
                horizontalLineToRelative(-8f)
                arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, -5f, 5f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-5f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, -3f)
                horizontalLineToRelative(8f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 3f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(2f)
                close()
            }
        }.also { _RemoveUser = it}
