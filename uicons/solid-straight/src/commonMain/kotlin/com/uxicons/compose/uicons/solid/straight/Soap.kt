package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Soap: ImageVector? = null

val Icons.Ss.Soap: ImageVector
    get() = _Soap ?: UXIcon(name = "Soap") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(15f, 2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-10f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-1f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, -3f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(2f)
                close()
                moveTo(16f, 16f)
                horizontalLineToRelative(-8f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(8f)
                close()
                moveTo(22f, 17f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(-20f)
                verticalLineToRelative(-7f)
                arcToRelative(8.94f, 8.94f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.93f, -8f)
                horizontalLineToRelative(10.14f)
                arcToRelative(8.94f, 8.94f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.93f, 8f)
                close()
                moveTo(18f, 14f)
                horizontalLineToRelative(-12f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(12f)
                close()
            }
        }.also { _Soap = it}
