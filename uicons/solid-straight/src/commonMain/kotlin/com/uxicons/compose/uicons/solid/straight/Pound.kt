package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Pound: ImageVector? = null

val Icons.Ss.Pound: ImageVector
    get() = _Pound ?: UXIcon(name = "Pound") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(8f, 18f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-8f)
                verticalLineToRelative(-4f)
                arcToRelative(6f, 6f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 0f)
                horizontalLineToRelative(2f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -16f, 0f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(4f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4f, 4f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(20f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-15.54f)
                arcToRelative(5.97f, 5.97f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.54f, -4f)
                close()
            }
        }.also { _Pound = it}
