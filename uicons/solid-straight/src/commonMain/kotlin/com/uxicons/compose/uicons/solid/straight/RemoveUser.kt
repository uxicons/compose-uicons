package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _RemoveUser: ImageVector? = null

val Icons.Ss.RemoveUser: ImageVector
    get() = _RemoveUser ?: UXIcon(name = "RemoveUser") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(3f, 6f)
                arcToRelative(6f, 6f, 0f, isMoreThanHalf = true, isPositiveArc = true, 6f, 6f)
                arcToRelative(6f, 6f, 0f, isMoreThanHalf = false, isPositiveArc = true, -6f, -6f)
                close()
                moveTo(13.04f, 14f)
                horizontalLineToRelative(-8.09f)
                arcToRelative(4.96f, 4.96f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4.96f, 4.96f)
                verticalLineToRelative(5.04f)
                horizontalLineToRelative(18f)
                verticalLineToRelative(-5.04f)
                arcToRelative(4.96f, 4.96f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4.96f, -4.96f)
                close()
                moveTo(16f, 10f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(-2f)
                close()
            }
        }.also { _RemoveUser = it}
