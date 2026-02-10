package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Gallery: ImageVector? = null

val Icons.Rs.Gallery: ImageVector
    get() = _Gallery ?: UXIcon(name = "Gallery") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 3f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3f, -3f)
                horizontalLineToRelative(-10f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3f, 3f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-1f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3f, 3f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-1f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3f, 3f)
                verticalLineToRelative(11f)
                horizontalLineToRelative(16f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(4f)
                close()
                moveTo(3f, 12f)
                horizontalLineToRelative(10f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, 1f)
                verticalLineToRelative(0.59f)
                lineToRelative(-4f, 4f)
                lineToRelative(-1.95f, -1.95f)
                lineToRelative(-6.05f, 5.19f)
                verticalLineToRelative(-7.83f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, -1f)
                close()
                moveTo(14f, 22f)
                horizontalLineToRelative(-10.3f)
                lineToRelative(4.24f, -3.64f)
                lineToRelative(2.06f, 2.05f)
                lineToRelative(4f, -4f)
                close()
                moveTo(18f, 17f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-4f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3f, -3f)
                horizontalLineToRelative(-7f)
                verticalLineToRelative(-2f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, -1f)
                horizontalLineToRelative(10f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, 1f)
                close()
                moveTo(22f, 12f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-4f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3f, -3f)
                horizontalLineToRelative(-7f)
                verticalLineToRelative(-2f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, -1f)
                horizontalLineToRelative(10f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, 1f)
                close()
                moveTo(4f, 15f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 1f, 1f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1f, -1f)
                close()
            }
        }.also { _Gallery = it}
