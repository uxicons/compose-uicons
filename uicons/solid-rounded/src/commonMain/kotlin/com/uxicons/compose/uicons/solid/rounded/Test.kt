package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Test: ImageVector? = null

val Icons.Sr.Test: ImageVector
    get() = _Test ?: UXIcon(name = "Test") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(16f, 7f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2f, -2f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(-6f)
                arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, -5f, 5f)
                verticalLineToRelative(14f)
                arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 5f)
                horizontalLineToRelative(8f)
                arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, -5f)
                verticalLineToRelative(-12f)
                close()
                moveTo(11.71f, 19.7f)
                lineTo(10.1f, 21.34f)
                arcToRelative(2.25f, 2.25f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3.19f, 0f)
                lineToRelative(-0.63f, -0.64f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.43f, -1.39f)
                lineToRelative(0.62f, 0.63f)
                arcToRelative(0.25f, 0.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.34f, -0.01f)
                lineToRelative(1.61f, -1.63f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 1.42f, 1.4f)
                close()
                moveTo(13f, 15f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(1f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, -2f, 0f)
                verticalLineToRelative(-4f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6f, 0f)
                verticalLineToRelative(4f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, -2f, 0f)
                close()
                moveTo(17f, 21f)
                horizontalLineToRelative(-2f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 0f, -2f)
                horizontalLineToRelative(2f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 2f)
                close()
                moveTo(13f, 11f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-1f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 0f)
                close()
                moveTo(20.7f, 5f)
                horizontalLineToRelative(-4.7f)
                verticalLineToRelative(-4.7f)
                arcToRelative(4.97f, 4.97f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.88f, 1.16f)
                lineToRelative(1.66f, 1.66f)
                arcToRelative(4.95f, 4.95f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.17f, 1.88f)
                close()
            }
        }.also { _Test = it}
