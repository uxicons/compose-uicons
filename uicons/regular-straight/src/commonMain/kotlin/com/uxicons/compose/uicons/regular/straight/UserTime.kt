package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UserTime: ImageVector? = null

val Icons.Rs.UserTime: ImageVector
    get() = _UserTime ?: UXIcon(name = "UserTime") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(8.47f, 11f)
                arcToRelative(5.5f, 5.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 5.5f, -5.5f)
                arcToRelative(5.51f, 5.51f, 0f, isMoreThanHalf = false, isPositiveArc = true, -5.5f, 5.5f)
                close()
                moveTo(8.47f, 2f)
                arcToRelative(3.5f, 3.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, 3.5f, 3.5f)
                arcToRelative(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.5f, -3.5f)
                close()
                moveTo(17f, 24f)
                arcToRelative(7f, 7f, 0f, isMoreThanHalf = true, isPositiveArc = true, 7f, -7f)
                arcToRelative(7.01f, 7.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, -7f, 7f)
                close()
                moveTo(17f, 12f)
                arcToRelative(5f, 5f, 0f, isMoreThanHalf = true, isPositiveArc = false, 5f, 5f)
                arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, -5f, -5f)
                close()
                moveTo(19.71f, 18.29f)
                lineTo(18f, 16.59f)
                verticalLineToRelative(-2.59f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(3.41f)
                lineToRelative(2.29f, 2.29f)
                close()
                moveTo(8.95f, 13f)
                horizontalLineToRelative(-3.95f)
                arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, -5f, 5f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-6f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, -3f)
                horizontalLineToRelative(3.23f)
                arcToRelative(8.85f, 8.85f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.72f, -2f)
                close()
            }
        }.also { _UserTime = it}
