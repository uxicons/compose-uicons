package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Gallery: ImageVector? = null

val Icons.Bs.Gallery: ImageVector
    get() = _Gallery ?: UXIcon(name = "Gallery") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 3.5f)
                arcToRelative(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.5f, -3.5f)
                horizontalLineToRelative(-10f)
                arcToRelative(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.5f, 3.5f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(-0.5f)
                arcToRelative(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.5f, 3.5f)
                verticalLineToRelative(1.55f)
                arcToRelative(3.49f, 3.49f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3f, 3.45f)
                verticalLineToRelative(10.5f)
                horizontalLineToRelative(16f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(4f)
                close()
                moveTo(3.5f, 13f)
                horizontalLineToRelative(9f)
                arcToRelative(0.51f, 0.51f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.5f, 0.5f)
                verticalLineToRelative(2.5f)
                lineToRelative(-2f, 2f)
                lineToRelative(-2f, -2f)
                lineToRelative(-6f, 4.88f)
                verticalLineToRelative(-7.38f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.5f, -0.5f)
                close()
                moveTo(17f, 16f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-2.5f)
                arcToRelative(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.5f, -3.5f)
                horizontalLineToRelative(-6.5f)
                verticalLineToRelative(-1.5f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.5f, -0.5f)
                horizontalLineToRelative(10f)
                arcToRelative(0.51f, 0.51f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.5f, 0.5f)
                close()
                moveTo(21f, 11f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-2.5f)
                arcToRelative(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.5f, -3.5f)
                horizontalLineToRelative(-6.5f)
                verticalLineToRelative(-1.5f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.5f, -0.5f)
                horizontalLineToRelative(10f)
                arcToRelative(0.51f, 0.51f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.5f, 0.5f)
                close()
                moveTo(4f, 15.5f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 1.5f, 1.5f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.5f, -1.5f)
                close()
            }
        }.also { _Gallery = it}
