package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TabletRugged: ImageVector? = null

val Icons.Ss.TabletRugged: ImageVector
    get() = _TabletRugged ?: UXIcon(name = "TabletRugged") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21.01f, 6f)
                lineToRelative(1f, -1f)
                verticalLineToRelative(-2.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                horizontalLineToRelative(-2.5f)
                lineToRelative(-1f, 1f)
                horizontalLineToRelative(-8.01f)
                lineToRelative(-1f, -1f)
                horizontalLineToRelative(-2.5f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                verticalLineToRelative(2.5f)
                lineToRelative(1f, 1f)
                verticalLineToRelative(2f)
                lineToRelative(-1f, 1f)
                verticalLineToRelative(6f)
                lineToRelative(1f, 1f)
                verticalLineToRelative(2f)
                lineToRelative(-1f, 1f)
                verticalLineToRelative(2.5f)
                curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
                horizontalLineToRelative(2.5f)
                lineToRelative(1f, -1f)
                horizontalLineToRelative(8.01f)
                lineToRelative(1f, 1f)
                horizontalLineToRelative(2.5f)
                curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
                verticalLineToRelative(-2.5f)
                lineToRelative(-1f, -1f)
                horizontalLineToRelative(-0.01f)
                verticalLineToRelative(-2f)
                lineToRelative(1f, -1f)
                verticalLineToRelative(-6f)
                lineToRelative(-1f, -1f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(0.01f)
                close()
                moveTo(5f, 21f)
                verticalLineTo(3f)
                horizontalLineToRelative(14f)
                verticalLineToRelative(18f)
                horizontalLineTo(5f)
                close()
                moveTo(7f, 5f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(14f)
                horizontalLineTo(7f)
                verticalLineTo(5f)
                close()
            }
        }.also { _TabletRugged = it}
