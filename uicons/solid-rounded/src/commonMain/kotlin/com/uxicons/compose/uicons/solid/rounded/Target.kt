package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Target: ImageVector? = null

val Icons.Sr.Target: ImageVector
    get() = _Target ?: UXIcon(name = "Target") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21f, 13f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -2f)
                horizontalLineToRelative(2.95f)
                arcToRelative(12.01f, 12.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, -10.95f, -10.95f)
                verticalLineToRelative(2.99f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2f, 0f)
                verticalLineToRelative(-2.99f)
                arcToRelative(12.01f, 12.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, -10.95f, 10.95f)
                horizontalLineToRelative(2.95f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 2f)
                horizontalLineToRelative(-2.95f)
                arcToRelative(12.01f, 12.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10.95f, 10.95f)
                verticalLineToRelative(-2.95f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 0f)
                verticalLineToRelative(2.95f)
                arcToRelative(12.01f, 12.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10.95f, -10.95f)
                close()
                moveTo(15f, 13f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2f, 0f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-2f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 0f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 2f)
                close()
            }
        }.also { _Target = it}
