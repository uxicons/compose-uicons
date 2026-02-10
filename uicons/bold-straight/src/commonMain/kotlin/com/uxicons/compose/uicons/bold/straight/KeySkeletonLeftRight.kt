package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _KeySkeletonLeftRight: ImageVector? = null

val Icons.Bs.KeySkeletonLeftRight: ImageVector
    get() = _KeySkeletonLeftRight ?: UXIcon(name = "KeySkeletonLeftRight") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 0f)
                curveToRelative(-2.41f, 0f, -4.43f, 1.72f, -4.9f, 4f)
                lineTo(2f, 4f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(4.1f)
                curveToRelative(0.46f, 2.28f, 2.48f, 4f, 4.9f, 4f)
                curveToRelative(2.76f, 0f, 5f, -2.24f, 5f, -5f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
                close()
                moveTo(21f, 6f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                reflectiveCurveToRelative(-2f, -0.9f, -2f, -2f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
                verticalLineToRelative(1f)
                close()
                moveTo(19f, 17f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-4.1f)
                curveToRelative(-0.46f, -2.28f, -2.48f, -4f, -4.9f, -4f)
                curveToRelative(-2.76f, 0f, -5f, 2.24f, -5f, 5f)
                verticalLineToRelative(1f)
                curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
                curveToRelative(2.41f, 0f, 4.43f, -1.72f, 4.9f, -4f)
                horizontalLineToRelative(12.1f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(3f)
                close()
                moveTo(7f, 19f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                reflectiveCurveToRelative(-2f, -0.9f, -2f, -2f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
                verticalLineToRelative(1f)
                close()
            }
        }.also { _KeySkeletonLeftRight = it}
