package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Gallery: ImageVector? = null

val Icons.Sr.Gallery: ImageVector
    get() = _Gallery ?: UXIcon(name = "Gallery") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20f, 10f)
                verticalLineToRelative(4f)
                arcToRelative(4.98f, 4.98f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2f, 3.97f)
                verticalLineToRelative(-2.97f)
                arcToRelative(7.01f, 7.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, -7f, -7f)
                horizontalLineToRelative(-6f)
                curveToRelative(-0.2f, 0f, -0.4f, 0.01f, -0.59f, 0.03f)
                arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.59f, -3.03f)
                horizontalLineToRelative(6f)
                arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5f, 5f)
                close()
                moveTo(11.59f, 18.58f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.83f, 0f)
                lineToRelative(-0.48f, -0.48f)
                lineToRelative(-5.91f, 5.13f)
                arcToRelative(4.96f, 4.96f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.65f, 0.78f)
                horizontalLineToRelative(6f)
                arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, -5f)
                verticalLineToRelative(-4f)
                arcToRelative(4.98f, 4.98f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.08f, -0.8f)
                close()
                moveTo(15.14f, 12.18f)
                lineTo(10.18f, 17.17f)
                lineTo(9.71f, 16.69f)
                arcToRelative(1.99f, 1.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.71f, -0.11f)
                lineToRelative(-6.08f, 5.26f)
                arcToRelative(4.96f, 4.96f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.9f, -2.84f)
                verticalLineToRelative(-4f)
                arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5f, -5f)
                horizontalLineToRelative(6f)
                arcToRelative(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.12f, 2.17f)
                close()
                moveTo(5f, 14.1f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, -1f, 1f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1f, -1f)
                close()
                moveTo(19f, 0f)
                horizontalLineToRelative(-6f)
                arcToRelative(4.99f, 4.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4.58f, 3.03f)
                curveToRelative(0.19f, -0.01f, 0.38f, -0.03f, 0.58f, -0.03f)
                horizontalLineToRelative(6f)
                arcToRelative(7.01f, 7.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7f, 7f)
                verticalLineToRelative(2.97f)
                arcToRelative(4.98f, 4.98f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, -3.97f)
                verticalLineToRelative(-4f)
                arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, -5f, -5f)
                close()
            }
        }.also { _Gallery = it}
