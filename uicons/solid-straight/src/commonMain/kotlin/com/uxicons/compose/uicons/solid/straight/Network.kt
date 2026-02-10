package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Network: ImageVector? = null

val Icons.Ss.Network: ImageVector
    get() = _Network ?: UXIcon(name = "Network") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 22f)
                horizontalLineToRelative(-9.18f)
                arcToRelative(2.98f, 2.98f, 0f, isMoreThanHalf = false, isPositiveArc = true, -5.63f, 0f)
                horizontalLineToRelative(-9.18f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(9.18f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.82f, -1.82f)
                verticalLineToRelative(-4.18f)
                horizontalLineToRelative(-6f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3f, -3f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(6.59f)
                lineToRelative(1f, 1f)
                horizontalLineToRelative(4.83f)
                lineToRelative(1f, -1f)
                horizontalLineToRelative(6.59f)
                verticalLineToRelative(1f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3f, 3f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(4.18f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.82f, 1.82f)
                horizontalLineToRelative(9.18f)
                close()
                moveTo(10.41f, 9f)
                horizontalLineToRelative(3.17f)
                lineToRelative(1f, -1f)
                horizontalLineToRelative(6.41f)
                verticalLineToRelative(-5f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3f, -3f)
                horizontalLineToRelative(-12f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3f, 3f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(6.41f)
                close()
            }
        }.also { _Network = it}
