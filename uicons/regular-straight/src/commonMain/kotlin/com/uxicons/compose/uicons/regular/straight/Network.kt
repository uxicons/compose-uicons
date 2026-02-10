package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Network: ImageVector? = null

val Icons.Rs.Network: ImageVector
    get() = _Network ?: UXIcon(name = "Network") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 20f)
                horizontalLineToRelative(-9.18f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.82f, -1.82f)
                verticalLineToRelative(-4.18f)
                horizontalLineToRelative(6f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, -3f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-5f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3f, -3f)
                horizontalLineToRelative(-12f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3f, 3f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(3f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 3f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(4.18f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.82f, 1.82f)
                horizontalLineToRelative(-9.18f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(9.18f)
                arcToRelative(2.98f, 2.98f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.63f, 0f)
                horizontalLineToRelative(9.18f)
                close()
                moveTo(5f, 3f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, -1f)
                horizontalLineToRelative(12f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, 1f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(-4.41f)
                lineToRelative(-1f, 1f)
                horizontalLineToRelative(-3.17f)
                lineToRelative(-1f, -1f)
                horizontalLineToRelative(-4.41f)
                close()
                moveTo(4f, 11f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(4.59f)
                lineToRelative(1f, 1f)
                horizontalLineToRelative(4.83f)
                lineToRelative(1f, -1f)
                horizontalLineToRelative(4.59f)
                verticalLineToRelative(1f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1f, 1f)
                horizontalLineToRelative(-14f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1f, -1f)
                close()
                moveTo(12f, 22f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 1f, -1f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1f, 1f)
                close()
            }
        }.also { _Network = it}
