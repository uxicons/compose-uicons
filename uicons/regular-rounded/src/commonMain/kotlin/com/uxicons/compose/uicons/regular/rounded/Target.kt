package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Target: ImageVector? = null

val Icons.Rr.Target: ImageVector
    get() = _Target ?: UXIcon(name = "Target") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 0f)
                arcToRelative(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = false, 12f, 12f)
                arcToRelative(12.01f, 12.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, -12f, -12f)
                close()
                moveTo(13f, 21.95f)
                verticalLineToRelative(-1.95f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2f, 0f)
                verticalLineToRelative(1.95f)
                arcToRelative(10.02f, 10.02f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8.95f, -8.95f)
                horizontalLineToRelative(1.95f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -2f)
                horizontalLineToRelative(-1.95f)
                arcToRelative(10.02f, 10.02f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8.95f, -8.95f)
                verticalLineToRelative(1.95f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 0f)
                verticalLineToRelative(-1.95f)
                arcToRelative(10.02f, 10.02f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8.95f, 8.95f)
                horizontalLineToRelative(-1.95f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 2f)
                horizontalLineToRelative(1.95f)
                arcToRelative(10.02f, 10.02f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8.95f, 8.95f)
                close()
                moveTo(16f, 12f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1f, 1f)
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
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, 1f)
                close()
            }
        }.also { _Target = it}
