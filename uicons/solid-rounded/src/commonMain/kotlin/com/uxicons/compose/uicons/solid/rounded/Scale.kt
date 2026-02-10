package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Scale: ImageVector? = null

val Icons.Sr.Scale: ImageVector
    get() = _Scale ?: UXIcon(name = "Scale") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(7f, 5f)
                arcToRelative(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10f, 0f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2f, 2f)
                horizontalLineToRelative(-2.8f)
                lineToRelative(1.63f, -2.44f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.66f, -1.11f)
                lineToRelative(-2.37f, 3.56f)
                horizontalLineToRelative(-0.8f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2f, -2f)
                close()
                moveTo(19f, 2f)
                horizontalLineToRelative(-0.67f)
                arcToRelative(6.99f, 6.99f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.67f, 3f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4f, 4f)
                horizontalLineToRelative(-6.53f)
                lineToRelative(0.01f, -0.01f)
                arcToRelative(3.79f, 3.79f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3.47f, -3.77f)
                arcToRelative(7.43f, 7.43f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.75f, -3.21f)
                horizontalLineToRelative(-0.75f)
                arcToRelative(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -5f, 5f)
                verticalLineToRelative(12f)
                arcToRelative(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 5f)
                horizontalLineToRelative(14f)
                arcToRelative(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, -5f)
                verticalLineToRelative(-12f)
                arcToRelative(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -5f, -5f)
                close()
            }
        }.also { _Scale = it}
