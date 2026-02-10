package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Transform: ImageVector? = null

val Icons.Bs.Transform: ImageVector
    get() = _Transform ?: UXIcon(name = "Transform") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 24f)
                horizontalLineToRelative(-7f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(3f)
                close()
                moveTo(24f, 3.5f)
                arcToRelative(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.5f, -3.5f)
                horizontalLineToRelative(-3.5f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(3.5f)
                arcToRelative(0.51f, 0.51f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.5f, 0.5f)
                verticalLineToRelative(3.5f)
                horizontalLineToRelative(3f)
                close()
                moveTo(7f, 21f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(7f)
                close()
                moveTo(3f, 3.5f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.5f, -0.5f)
                horizontalLineToRelative(3.5f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-3.5f)
                arcToRelative(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.5f, 3.5f)
                verticalLineToRelative(3.5f)
                horizontalLineToRelative(3f)
                close()
                moveTo(16f, 12f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = true, isPositiveArc = false, -4f, 4f)
                arcToRelative(4.0f, 4.0f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, -4f)
                close()
            }
        }.also { _Transform = it}
