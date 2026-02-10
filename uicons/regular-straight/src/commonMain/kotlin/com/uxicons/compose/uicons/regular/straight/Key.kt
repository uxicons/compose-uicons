package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Key: ImageVector? = null

val Icons.Rs.Key: ImageVector
    get() = _Key ?: UXIcon(name = "Key") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22f, 0f)
                horizontalLineToRelative(-2.17f)
                arcToRelative(2.98f, 2.98f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.12f, 0.88f)
                lineToRelative(-8.36f, 8.36f)
                arcToRelative(7.54f, 7.54f, 0f, isMoreThanHalf = true, isPositiveArc = false, 5.42f, 5.42f)
                lineToRelative(1.24f, -1.24f)
                verticalLineToRelative(-2.42f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(2.41f)
                lineToRelative(1.71f, -1.71f)
                arcToRelative(2.98f, 2.98f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.88f, -2.12f)
                verticalLineToRelative(-2.17f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2f, -2f)
                close()
                moveTo(22f, 4.17f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.29f, 0.71f)
                lineToRelative(-1.12f, 1.12f)
                horizontalLineToRelative(-3.59f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(3.58f)
                lineToRelative(-1.54f, 1.54f)
                arcToRelative(5.64f, 5.64f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.55f, 2.37f)
                arcToRelative(5.5f, 5.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, -5.5f, -5.5f)
                arcToRelative(4.24f, 4.24f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.37f, 0.54f)
                lineToRelative(9.25f, -9.25f)
                arcToRelative(1.01f, 1.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.71f, -0.29f)
                horizontalLineToRelative(2.17f)
                close()
                moveTo(5f, 18f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, 1f, -1f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1f, 1f)
                close()
            }
        }.also { _Key = it}
