package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Badge: ImageVector? = null

val Icons.Bs.Badge: ImageVector
    get() = _Badge ?: UXIcon(name = "Badge") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20f, 8f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = false, -14f, 5.27f)
                verticalLineToRelative(7.87f)
                arcToRelative(2.85f, 2.85f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.63f, 2.23f)
                lineToRelative(1.37f, -1.1f)
                lineToRelative(1.37f, 1.1f)
                arcToRelative(2.85f, 2.85f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.63f, -2.23f)
                verticalLineToRelative(-7.87f)
                arcToRelative(7.96f, 7.96f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, -5.27f)
                close()
                moveTo(12f, 3f)
                arcToRelative(5f, 5f, 0f, isMoreThanHalf = true, isPositiveArc = true, -5f, 5f)
                arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5f, -5f)
                close()
                moveTo(12f, 18.44f)
                lineTo(9f, 20.84f)
                verticalLineToRelative(-5.42f)
                arcToRelative(7.93f, 7.93f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6f, 0f)
                verticalLineToRelative(5.42f)
                close()
            }
        }.also { _Badge = it}
