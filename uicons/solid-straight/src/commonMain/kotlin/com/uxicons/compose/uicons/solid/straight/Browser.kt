package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Browser: ImageVector? = null

val Icons.Ss.Browser: ImageVector
    get() = _Browser ?: UXIcon(name = "Browser") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(0f, 9f)
                verticalLineToRelative(14f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(-14f)
                close()
                moveTo(15f, 19f)
                horizontalLineToRelative(-10f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(10f)
                close()
                moveTo(19f, 15f)
                horizontalLineToRelative(-14f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(14f)
                close()
                moveTo(21f, 1f)
                horizontalLineToRelative(-18f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3f, 3f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(-3f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3f, -3f)
                close()
                moveTo(4f, 5f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 1f, -1f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1f, 1f)
                close()
                moveTo(7f, 5f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 1f, -1f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1f, 1f)
                close()
                moveTo(10f, 5f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 1f, -1f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1f, 1f)
                close()
            }
        }.also { _Browser = it}
