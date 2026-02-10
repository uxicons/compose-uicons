package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Browser: ImageVector? = null

val Icons.Bs.Browser: ImageVector
    get() = _Browser ?: UXIcon(name = "Browser") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19f, 13f)
                horizontalLineToRelative(-14f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(14f)
                close()
                moveTo(15f, 15f)
                horizontalLineToRelative(-10f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(10f)
                close()
                moveTo(24f, 4.5f)
                verticalLineToRelative(18.5f)
                horizontalLineToRelative(-24f)
                verticalLineToRelative(-18.5f)
                arcToRelative(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.5f, -3.5f)
                horizontalLineToRelative(17f)
                arcToRelative(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.5f, 3.5f)
                close()
                moveTo(8f, 4.5f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, 1.5f, -1.5f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.5f, 1.5f)
                close()
                moveTo(4.5f, 6f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, -1.5f, -1.5f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.5f, 1.5f)
                close()
                moveTo(21f, 8f)
                horizontalLineToRelative(-18f)
                verticalLineToRelative(12f)
                horizontalLineToRelative(18f)
                close()
            }
        }.also { _Browser = it}
