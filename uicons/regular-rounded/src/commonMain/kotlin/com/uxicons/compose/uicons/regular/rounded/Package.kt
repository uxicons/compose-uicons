package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Package: ImageVector? = null

val Icons.Rr.Package: ImageVector
    get() = _Package ?: UXIcon(name = "Package") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21f, 8f)
                horizontalLineToRelative(-4f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3f, 3f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-4f)
                arcToRelative(6f, 6f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.11f, -5.25f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = true, isPositiveArc = false, -5.79f, 0f)
                arcToRelative(6f, 6f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.11f, 5.25f)
                verticalLineToRelative(11f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 0f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(20f)
                verticalLineToRelative(5f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 0f)
                verticalLineToRelative(-12f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3f, -3f)
                close()
                moveTo(4f, 4f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = true, 2f, 2f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2f, -2f)
                close()
                moveTo(6f, 8f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, 4f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-8f)
                verticalLineToRelative(-4f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, -4f)
                close()
                moveTo(16f, 16f)
                verticalLineToRelative(-5f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, -1f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(1f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 0f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(1f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, 1f)
                verticalLineToRelative(5f)
                close()
            }
        }.also { _Package = it}
