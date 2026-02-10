package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _IdBadge: ImageVector? = null

val Icons.Bs.IdBadge: ImageVector
    get() = _IdBadge ?: UXIcon(name = "IdBadge") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20.5f, 4f)
                horizontalLineToRelative(-5.5f)
                verticalLineToRelative(-1f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -6f, 0f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-5.5f)
                arcToRelative(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.5f, 3.5f)
                verticalLineToRelative(16.5f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(-16.5f)
                arcToRelative(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.5f, -3.5f)
                close()
                moveTo(21f, 21f)
                horizontalLineToRelative(-18f)
                verticalLineToRelative(-13.5f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.5f, -0.5f)
                horizontalLineToRelative(5.5f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(5.5f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.5f, 0.5f)
                close()
                moveTo(5f, 11f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(-5f)
                close()
                moveTo(12f, 11f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-7f)
                close()
                moveTo(12f, 16f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-5f)
                close()
            }
        }.also { _IdBadge = it}
