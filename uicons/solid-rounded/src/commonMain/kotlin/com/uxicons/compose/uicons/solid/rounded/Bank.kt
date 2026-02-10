package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Bank: ImageVector? = null

val Icons.Sr.Bank: ImageVector
    get() = _Bank ?: UXIcon(name = "Bank") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(0.29f, 8.55f)
                arcToRelative(2.44f, 2.44f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.15f, -2.57f)
                arcToRelative(4.72f, 4.72f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.67f, -1.5f)
                lineToRelative(7.5f, -3.9f)
                arcToRelative(5.17f, 5.17f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.77f, 0f)
                lineToRelative(7.5f, 3.91f)
                arcToRelative(4.72f, 4.72f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.67f, 1.5f)
                arcToRelative(2.44f, 2.44f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.15f, 2.57f)
                arcToRelative(2.71f, 2.71f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.42f, 1.45f)
                horizontalLineToRelative(-18.58f)
                arcToRelative(2.71f, 2.71f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.42f, -1.45f)
                close()
                moveTo(23f, 22f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2f, -2f)
                verticalLineToRelative(-8f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-8f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-8f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-8f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(8f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2f, 2f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 2f)
                horizontalLineToRelative(22f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -2f)
                close()
            }
        }.also { _Bank = it}
