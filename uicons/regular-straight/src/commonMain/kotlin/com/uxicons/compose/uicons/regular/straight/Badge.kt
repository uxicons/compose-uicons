package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Badge: ImageVector? = null

val Icons.Rs.Badge: ImageVector
    get() = _Badge ?: UXIcon(name = "Badge") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20f, 8f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = false, -14f, 5.27f)
                verticalLineToRelative(8.23f)
                arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.06f, 1.95f)
                lineToRelative(1.94f, -1.55f)
                lineToRelative(1.94f, 1.55f)
                arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.06f, -1.95f)
                verticalLineToRelative(-8.23f)
                arcToRelative(7.96f, 7.96f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, -5.27f)
                close()
                moveTo(12f, 2f)
                arcToRelative(6f, 6f, 0f, isMoreThanHalf = true, isPositiveArc = true, -6f, 6f)
                arcToRelative(6.01f, 6.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6f, -6f)
                close()
                moveTo(15.72f, 21.95f)
                arcToRelative(0.49f, 0.49f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.53f, -0.06f)
                lineToRelative(-3.19f, -2.55f)
                lineToRelative(-3.19f, 2.55f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.81f, -0.39f)
                verticalLineToRelative(-6.58f)
                arcToRelative(7.93f, 7.93f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 0f)
                verticalLineToRelative(6.58f)
                arcToRelative(0.49f, 0.49f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.28f, 0.45f)
                close()
            }
        }.also { _Badge = it}
