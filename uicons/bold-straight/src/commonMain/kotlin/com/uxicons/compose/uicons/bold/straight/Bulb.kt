package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Bulb: ImageVector? = null

val Icons.Bs.Bulb: ImageVector
    get() = _Bulb ?: UXIcon(name = "Bulb") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(17.99f, 2.29f)
                arcToRelative(9f, 9f, 0f, isMoreThanHalf = false, isPositiveArc = false, -14.92f, 5.54f)
                arcToRelative(9.81f, 9.81f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.11f, 8.1f)
                arcToRelative(5.32f, 5.32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.82f, 3.88f)
                verticalLineToRelative(4.2f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(-4.05f)
                arcToRelative(6.17f, 6.17f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.93f, -4.19f)
                arcToRelative(9f, 9f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.06f, -13.48f)
                close()
                moveTo(15.96f, 13.51f)
                arcToRelative(8.64f, 8.64f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.91f, 2.49f)
                horizontalLineToRelative(-0.55f)
                verticalLineToRelative(-4.3f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.5f, -3.7f)
                horizontalLineToRelative(-3f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2f, 0f)
                horizontalLineToRelative(-3f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.5f, 3.7f)
                verticalLineToRelative(4.3f)
                horizontalLineToRelative(-0.5f)
                arcToRelative(9.05f, 9.05f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.77f, -2.27f)
                arcToRelative(6.94f, 6.94f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.18f, -5.53f)
                arcToRelative(6.02f, 6.02f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.24f, -5.17f)
                arcToRelative(6f, 6f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.66f, 10.47f)
                close()
            }
        }.also { _Bulb = it}
