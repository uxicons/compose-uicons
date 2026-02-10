package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Bank: ImageVector? = null

val Icons.Rr.Bank: ImageVector
    get() = _Bank ?: UXIcon(name = "Bank") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 23f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1f, 1f)
                horizontalLineToRelative(-22f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -2f)
                horizontalLineToRelative(22f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, 1f)
                close()
                moveTo(0.29f, 8.55f)
                arcToRelative(2.44f, 2.44f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.15f, -2.57f)
                arcToRelative(4.72f, 4.72f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.67f, -1.5f)
                lineToRelative(7.5f, -3.9f)
                arcToRelative(5.17f, 5.17f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.77f, 0f)
                lineToRelative(7.5f, 3.91f)
                arcToRelative(4.72f, 4.72f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.67f, 1.5f)
                arcToRelative(2.44f, 2.44f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.15f, 2.57f)
                arcToRelative(2.71f, 2.71f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.42f, 1.45f)
                horizontalLineToRelative(-0.29f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(1f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 2f)
                horizontalLineToRelative(-20f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -2f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-8f)
                horizontalLineToRelative(-0.29f)
                arcToRelative(2.71f, 2.71f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.42f, -1.45f)
                close()
                moveTo(5f, 18f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-8f)
                horizontalLineToRelative(-3f)
                close()
                moveTo(10f, 10f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-8f)
                close()
                moveTo(19f, 10f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(3f)
                close()
                moveTo(2.06f, 7.62f)
                arcToRelative(0.72f, 0.72f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.65f, 0.38f)
                horizontalLineToRelative(18.58f)
                arcToRelative(0.72f, 0.72f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.65f, -0.38f)
                arcToRelative(0.45f, 0.45f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.02f, -0.5f)
                arcToRelative(2.7f, 2.7f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.95f, -0.86f)
                lineToRelative(-7.5f, -3.91f)
                arcToRelative(3.18f, 3.18f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.93f, 0f)
                lineToRelative(-7.5f, 3.91f)
                arcToRelative(2.71f, 2.71f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.95f, 0.86f)
                arcToRelative(0.45f, 0.45f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.03f, 0.5f)
                close()
            }
        }.also { _Bank = it}
