package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CopyAlt: ImageVector? = null

val Icons.Ss.CopyAlt: ImageVector
    get() = _CopyAlt ?: UXIcon(name = "CopyAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(16.86f, 5f)
                horizontalLineToRelative(-4.86f)
                verticalLineToRelative(-4.98f)
                close()
                moveTo(10f, 7f)
                verticalLineToRelative(-7f)
                horizontalLineToRelative(-5f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3f, 3f)
                verticalLineToRelative(16f)
                horizontalLineToRelative(15f)
                verticalLineToRelative(-12f)
                close()
                moveTo(19f, 7.01f)
                verticalLineToRelative(14.03f)
                horizontalLineToRelative(-12f)
                verticalLineToRelative(2.96f)
                horizontalLineToRelative(15f)
                verticalLineToRelative(-14f)
                close()
            }
        }.also { _CopyAlt = it}
