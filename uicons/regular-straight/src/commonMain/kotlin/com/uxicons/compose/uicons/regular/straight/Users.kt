package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Users: ImageVector? = null

val Icons.Rs.Users: ImageVector
    get() = _Users ?: UXIcon(name = "Users") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(7.5f, 13f)
                arcToRelative(4.5f, 4.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 4.5f, -4.5f)
                arcToRelative(4.5f, 4.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4.5f, 4.5f)
                close()
                moveTo(7.5f, 6f)
                arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, 2.5f, 2.5f)
                arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.5f, -2.5f)
                close()
                moveTo(15f, 20f)
                arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, -5f, -5f)
                horizontalLineToRelative(-5f)
                arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, -5f, 5f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-4f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, -3f)
                horizontalLineToRelative(5f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 3f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(2f)
                close()
                moveTo(17.5f, 9f)
                arcToRelative(4.5f, 4.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 4.5f, -4.5f)
                arcToRelative(4.5f, 4.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4.5f, 4.5f)
                close()
                moveTo(17.5f, 2f)
                arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, 2.5f, 2.5f)
                arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.5f, -2.5f)
                close()
                moveTo(24f, 16f)
                arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, -5f, -5f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(4f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 3f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(2f)
                close()
            }
        }.also { _Users = it}
