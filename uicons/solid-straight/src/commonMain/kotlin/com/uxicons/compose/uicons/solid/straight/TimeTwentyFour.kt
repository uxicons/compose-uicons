package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TimeTwentyFour: ImageVector? = null

val Icons.Ss.TimeTwentyFour: ImageVector
    get() = _TimeTwentyFour ?: UXIcon(name = "TimeTwentyFour") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 3f)
                verticalLineToRelative(3f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3f, 3f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2.64f)
                arcToRelative(9.99f, 9.99f, 0f, isMoreThanHalf = true, isPositiveArc = false, -11.64f, 14.54f)
                verticalLineToRelative(2.07f)
                arcToRelative(11.99f, 11.99f, 0f, isMoreThanHalf = true, isPositiveArc = true, 13f, -18.23f)
                verticalLineToRelative(-2.37f)
                close()
                moveTo(17f, 18f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -6f, 0f)
                horizontalLineToRelative(2f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 0f)
                curveToRelative(0f, 0.5f, -0.85f, 1.14f, -1.6f, 1.7f)
                curveToRelative(-1.12f, 0.84f, -2.4f, 1.8f, -2.4f, 3.3f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-3.29f)
                curveToRelative(0.27f, -0.24f, 0.59f, -0.47f, 0.89f, -0.7f)
                curveToRelative(1.12f, -0.84f, 2.4f, -1.8f, 2.4f, -3.3f)
                close()
                moveTo(22f, 19f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(4f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-9f)
                horizontalLineToRelative(-2f)
                close()
                moveTo(13f, 6f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(6f)
                close()
            }
        }.also { _TimeTwentyFour = it}
