package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Treatment: ImageVector? = null

val Icons.Rs.Treatment: ImageVector
    get() = _Treatment ?: UXIcon(name = "Treatment") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(13f, 8f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                close()
                moveTo(7f, 16f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-10f)
                close()
                moveTo(7f, 20f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-6f)
                close()
                moveTo(21f, 2f)
                verticalLineToRelative(19f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3f, 3f)
                horizontalLineToRelative(-12f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3f, -3f)
                verticalLineToRelative(-19f)
                horizontalLineToRelative(5.17f)
                arcToRelative(3.01f, 3.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.83f, -2f)
                horizontalLineToRelative(2f)
                arcToRelative(3.01f, 3.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.83f, 2f)
                close()
                moveTo(19f, 4f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(-1f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1f, -1f)
                horizontalLineToRelative(-2f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1f, 1f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(17f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1f, 1f)
                horizontalLineToRelative(12f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1f, -1f)
                close()
            }
        }.also { _Treatment = it}
