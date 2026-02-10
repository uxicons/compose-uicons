package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Network: ImageVector? = null

val Icons.Bs.Network: ImageVector
    get() = _Network ?: UXIcon(name = "Network") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 19f)
                horizontalLineToRelative(-8.85f)
                arcToRelative(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.65f, -1.65f)
                verticalLineToRelative(-3.35f)
                horizontalLineToRelative(5.5f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, -3f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-5.5f)
                arcToRelative(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.5f, -3.5f)
                horizontalLineToRelative(-11f)
                arcToRelative(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.5f, 3.5f)
                verticalLineToRelative(5.5f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(2f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 3f)
                horizontalLineToRelative(5.5f)
                verticalLineToRelative(3.35f)
                arcToRelative(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.65f, 1.65f)
                horizontalLineToRelative(-8.85f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(8.85f)
                arcToRelative(3.48f, 3.48f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6.3f, 0f)
                horizontalLineToRelative(8.85f)
                close()
                moveTo(9.41f, 9f)
                horizontalLineToRelative(-3.41f)
                verticalLineToRelative(-5.5f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.5f, -0.5f)
                horizontalLineToRelative(11f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.5f, 0.5f)
                verticalLineToRelative(5.5f)
                horizontalLineToRelative(-3.41f)
                lineToRelative(-1f, 1f)
                horizontalLineToRelative(-3.17f)
                close()
            }
        }.also { _Network = it}
