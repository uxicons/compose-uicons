package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Equipment: ImageVector? = null

val Icons.Sr.Equipment: ImageVector
    get() = _Equipment ?: UXIcon(name = "Equipment") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23f, 19f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1f, 1f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2f, 2f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(2.1f)
                arcToRelative(3.9f, 3.9f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.9f, -3.9f)
                arcToRelative(6.01f, 6.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4.82f, -5.88f)
                lineToRelative(-1.74f, -0.35f)
                lineToRelative(-2.07f, 3.63f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.74f, -0.99f)
                lineToRelative(1.74f, -3.05f)
                lineToRelative(-0.07f, -0.02f)
                arcToRelative(1.97f, 1.97f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.6f, -0.23f)
                lineToRelative(-3.02f, 1.84f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.04f, -1.71f)
                lineToRelative(3.04f, -1.85f)
                lineToRelative(-0.06f, -0.49f)
                horizontalLineToRelative(-3.61f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -2f)
                horizontalLineToRelative(3.35f)
                lineToRelative(-0.05f, -0.42f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.68f, -2.49f)
                lineToRelative(-4.71f, 1.33f)
                arcToRelative(4.01f, 4.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.91f, 3.85f)
                verticalLineToRelative(8.73f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 4f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-4f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 2f)
                horizontalLineToRelative(19f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, -4f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1f, -1f)
                close()
                moveTo(7f, 18f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-7f)
                close()
            }
        }.also { _Equipment = it}
