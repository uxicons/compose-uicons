package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UserTime: ImageVector? = null

val Icons.Sr.UserTime: ImageVector
    get() = _UserTime ?: UXIcon(name = "UserTime") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(17f, 10f)
                arcToRelative(7f, 7f, 0f, isMoreThanHalf = true, isPositiveArc = false, 7f, 7f)
                arcToRelative(7.01f, 7.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, -7f, -7f)
                close()
                moveTo(19.71f, 19.71f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.41f, 0f)
                lineToRelative(-2f, -2f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.29f, -0.71f)
                verticalLineToRelative(-3f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 0f)
                verticalLineToRelative(2.59f)
                lineToRelative(1.71f, 1.71f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 1.41f)
                close()
                moveTo(8.47f, 11f)
                arcToRelative(5.5f, 5.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 5.5f, -5.5f)
                arcToRelative(5.51f, 5.51f, 0f, isMoreThanHalf = false, isPositiveArc = true, -5.5f, 5.5f)
                close()
                moveTo(11.36f, 24f)
                horizontalLineToRelative(-10.36f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1f, -1.01f)
                arcToRelative(10.28f, 10.28f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6.55f, -9.6f)
                arcToRelative(6.68f, 6.68f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.39f, -0.38f)
                arcToRelative(9.09f, 9.09f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.42f, 0.99f)
                arcToRelative(8.85f, 8.85f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.52f, 3f)
                arcToRelative(8.98f, 8.98f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.36f, 7f)
                close()
            }
        }.also { _UserTime = it}
