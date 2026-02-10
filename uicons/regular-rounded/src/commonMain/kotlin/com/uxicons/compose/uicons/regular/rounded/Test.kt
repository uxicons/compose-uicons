package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Test: ImageVector? = null

val Icons.Rr.Test: ImageVector
    get() = _Test ?: UXIcon(name = "Test") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(16f, 17f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 2f)
                horizontalLineToRelative(-1f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -2f)
                close()
                moveTo(14f, 15f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1f, -1f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(1f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2f, 0f)
                verticalLineToRelative(-4f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6f, 0f)
                verticalLineToRelative(4f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1f, 1f)
                close()
                moveTo(13f, 11f)
                verticalLineToRelative(-1f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2f, 0f)
                verticalLineToRelative(1f)
                close()
                moveTo(11.29f, 16.3f)
                lineTo(9.68f, 17.93f)
                arcToRelative(0.25f, 0.25f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.34f, 0.01f)
                lineToRelative(-0.62f, -0.64f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.43f, 1.4f)
                lineToRelative(0.63f, 0.64f)
                arcToRelative(2.25f, 2.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.19f, 0f)
                lineToRelative(1.62f, -1.64f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.42f, -1.4f)
                close()
                moveTo(21f, 6.66f)
                verticalLineToRelative(12.34f)
                arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, -5f, 5f)
                horizontalLineToRelative(-8f)
                arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, -5f, -5f)
                verticalLineToRelative(-14f)
                arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5f, -5f)
                horizontalLineToRelative(6.34f)
                arcToRelative(4.97f, 4.97f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.54f, 1.47f)
                lineToRelative(1.66f, 1.66f)
                arcToRelative(4.97f, 4.97f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.47f, 3.54f)
                close()
                moveTo(16.46f, 2.88f)
                arcToRelative(3.04f, 3.04f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.47f, -0.38f)
                verticalLineToRelative(2.5f)
                horizontalLineToRelative(2.5f)
                arcToRelative(3.04f, 3.04f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.38f, -0.47f)
                close()
                moveTo(19f, 7f)
                horizontalLineToRelative(-3f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2f, -2f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-6f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3f, 3f)
                verticalLineToRelative(14f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 3f)
                horizontalLineToRelative(8f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, -3f)
                close()
            }
        }.also { _Test = it}
