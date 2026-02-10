package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Key: ImageVector? = null

val Icons.Sr.Key: ImageVector
    get() = _Key ?: UXIcon(name = "Key") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(15.99f, 12.7f)
                verticalLineToRelative(-2.7f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, -1f)
                horizontalLineToRelative(1f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1f, -1f)
                verticalLineToRelative(-1f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, -1f)
                horizontalLineToRelative(2.69f)
                arcToRelative(1.02f, 1.02f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.92f, -0.6f)
                arcToRelative(4.52f, 4.52f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.38f, -2.38f)
                arcToRelative(3.49f, 3.49f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.51f, -3.02f)
                arcToRelative(4.54f, 4.54f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.21f, 1.33f)
                lineToRelative(-7.91f, 7.91f)
                arcToRelative(7.37f, 7.37f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.88f, 0.05f)
                arcToRelative(7.5f, 7.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.04f, 14.72f)
                arcToRelative(7.65f, 7.65f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.78f, -0.04f)
                arcToRelative(7.53f, 7.53f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6.43f, -5.43f)
                arcToRelative(7.33f, 7.33f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.05f, -3.88f)
                lineToRelative(0.65f, -0.65f)
                arcToRelative(1.98f, 1.98f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.57f, -1.3f)
                close()
                moveTo(5.5f, 20f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 1.5f, -1.5f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.5f, 1.5f)
                close()
            }
        }.also { _Key = it}
