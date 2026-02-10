package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LogOut: ImageVector? = null

val Icons.Rs.LogOut: ImageVector
    get() = _LogOut ?: UXIcon(name = "LogOut") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15f, 2.43f)
                verticalLineToRelative(2.1f)
                arcToRelative(9f, 9f, 0f, isMoreThanHalf = true, isPositiveArc = true, -6f, 0f)
                verticalLineToRelative(-2.1f)
                arcToRelative(11f, 11f, 0f, isMoreThanHalf = true, isPositiveArc = false, 6f, 0f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(11f, 0f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(-2f)
                close()
            }
        }.also { _LogOut = it}
