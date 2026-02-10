package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _KeySkeletonLeftRight: ImageVector? = null

val Icons.Ts.KeySkeletonLeftRight: ImageVector
    get() = _KeySkeletonLeftRight ?: UXIcon(name = "KeySkeletonLeftRight") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19.5f, 0f)
                curveToRelative(-2.48f, 0f, -4.5f, 2.02f, -4.5f, 4.5f)
                verticalLineToRelative(0.5f)
                lineTo(2f, 5f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(1f)
                lineTo(3f, 6f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(1f)
                lineTo(7f, 6f)
                lineTo(15f, 6f)
                verticalLineToRelative(0.5f)
                curveToRelative(0f, 2.48f, 2.02f, 4.5f, 4.5f, 4.5f)
                reflectiveCurveToRelative(4.5f, -2.02f, 4.5f, -4.5f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -2.48f, -2.02f, -4.5f, -4.5f, -4.5f)
                close()
                moveTo(23f, 6.5f)
                curveToRelative(0f, 1.93f, -1.57f, 3.5f, -3.5f, 3.5f)
                reflectiveCurveToRelative(-3.5f, -1.57f, -3.5f, -3.5f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                reflectiveCurveToRelative(3.5f, 1.57f, 3.5f, 3.5f)
                verticalLineToRelative(2f)
                close()
                moveTo(21f, 18f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(4f)
                lineTo(9f, 18f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0f, -2.48f, -2.02f, -4.5f, -4.5f, -4.5f)
                reflectiveCurveTo(0f, 15.02f, 0f, 17.5f)
                verticalLineToRelative(2f)
                curveToRelative(0f, 2.48f, 2.02f, 4.5f, 4.5f, 4.5f)
                reflectiveCurveToRelative(4.5f, -2.02f, 4.5f, -4.5f)
                verticalLineToRelative(-0.5f)
                horizontalLineToRelative(13f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(4f)
                close()
                moveTo(8f, 19.5f)
                curveToRelative(0f, 1.93f, -1.57f, 3.5f, -3.5f, 3.5f)
                reflectiveCurveToRelative(-3.5f, -1.57f, -3.5f, -3.5f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                reflectiveCurveToRelative(3.5f, 1.57f, 3.5f, 3.5f)
                verticalLineToRelative(2f)
                close()
            }
        }.also { _KeySkeletonLeftRight = it}
