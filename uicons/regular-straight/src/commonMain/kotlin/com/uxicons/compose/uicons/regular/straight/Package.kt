package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Package: ImageVector? = null

val Icons.Rs.Package: ImageVector
    get() = _Package ?: UXIcon(name = "Package") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(14f, 16f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-4f)
                arcToRelative(6f, 6f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.11f, -5.25f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = true, isPositiveArc = false, -5.79f, 0f)
                arcToRelative(6f, 6f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.11f, 5.25f)
                verticalLineToRelative(12f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(20f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-16f)
                horizontalLineToRelative(-10f)
                close()
                moveTo(4f, 4f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = true, 2f, 2f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2f, -2f)
                close()
                moveTo(2f, 12f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 0f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-8f)
                close()
                moveTo(18f, 10f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(-6f)
                close()
            }
        }.also { _Package = it}
