package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TabletRugged: ImageVector? = null

val Icons.Bs.TabletRugged: ImageVector
    get() = _TabletRugged ?: UXIcon(name = "TabletRugged") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22f, 5f)
                verticalLineToRelative(-2.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                horizontalLineToRelative(-2.5f)
                lineToRelative(-1f, 1f)
                horizontalLineToRelative(-8f)
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
                horizontalLineToRelative(8f)
                lineToRelative(1f, 1f)
                horizontalLineToRelative(2.5f)
                curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
                verticalLineToRelative(-2.5f)
                lineToRelative(-1f, -1f)
                verticalLineToRelative(-2f)
                lineToRelative(1f, -1f)
                verticalLineToRelative(-6f)
                lineToRelative(-1f, -1f)
                verticalLineToRelative(-2f)
                lineToRelative(1f, -1f)
                close()
                moveTo(6f, 20f)
                verticalLineTo(4f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(16f)
                horizontalLineTo(6f)
                close()
            }
        }.also { _TabletRugged = it}
