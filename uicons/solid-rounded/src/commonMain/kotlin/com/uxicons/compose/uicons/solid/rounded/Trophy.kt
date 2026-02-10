package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Trophy: ImageVector? = null

val Icons.Sr.Trophy: ImageVector
    get() = _Trophy ?: UXIcon(name = "Trophy") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(14.09f, 16f)
                horizontalLineToRelative(0.91f)
                curveToRelative(6.64f, 0f, 9f, -3.5f, 9f, -6.5f)
                arcToRelative(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.84f, -3.43f)
                arcToRelative(7.56f, 7.56f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.41f, -1f)
                arcToRelative(3.89f, 3.89f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.63f, -3.46f)
                arcToRelative(3.98f, 3.98f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.21f, -1.61f)
                horizontalLineToRelative(-11.46f)
                arcToRelative(3.98f, 3.98f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.21f, 1.61f)
                arcToRelative(3.89f, 3.89f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.63f, 3.46f)
                arcToRelative(7.56f, 7.56f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.41f, 1f)
                arcToRelative(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.84f, 3.43f)
                curveToRelative(0f, 3f, 2.36f, 6.5f, 9f, 6.5f)
                horizontalLineToRelative(0.91f)
                arcToRelative(5.03f, 5.03f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.09f, 0.92f)
                verticalLineToRelative(3.08f)
                arcToRelative(1.88f, 1.88f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2f, 2f)
                horizontalLineToRelative(-2f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 2f)
                horizontalLineToRelative(12f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -2f)
                horizontalLineToRelative(-1.99f)
                arcToRelative(1.89f, 1.89f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.01f, -2f)
                verticalLineToRelative(-3.08f)
                arcToRelative(5.03f, 5.03f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.09f, -0.92f)
                close()
                moveTo(15.73f, 13.15f)
                arcToRelative(23.49f, 23.49f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.4f, -5.22f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.37f, 0.08f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.5f, 1.5f)
                curveToRelative(0f, 2.18f, -1.84f, 4.5f, -7f, 4.5f)
                horizontalLineToRelative(-0.06f)
                arcToRelative(4.8f, 4.8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.78f, -0.85f)
                close()
                moveTo(9f, 14f)
                curveToRelative(-5.16f, 0f, -7f, -2.32f, -7f, -4.5f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.5f, -1.5f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.38f, -0.08f)
                arcToRelative(23.49f, 23.49f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.4f, 5.22f)
                arcToRelative(4.8f, 4.8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.78f, 0.85f)
                close()
            }
        }.also { _Trophy = it}
