package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Grate: ImageVector? = null

val Icons.Tr.Grate: ImageVector
    get() = _Grate ?: UXIcon(name = "Grate") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19.5f, 0f)
                lineTo(4.5f, 0f)
                curveTo(2.02f, 0f, 0f, 2.02f, 0f, 4.5f)
                verticalLineToRelative(15f)
                curveToRelative(0f, 2.48f, 2.02f, 4.5f, 4.5f, 4.5f)
                horizontalLineToRelative(15f)
                curveToRelative(2.48f, 0f, 4.5f, -2.02f, 4.5f, -4.5f)
                lineTo(24f, 4.5f)
                curveToRelative(0f, -2.48f, -2.02f, -4.5f, -4.5f, -4.5f)
                close()
                moveTo(23f, 4.5f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(-5f)
                lineTo(18f, 1f)
                horizontalLineToRelative(1.5f)
                curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
                close()
                moveTo(11.5f, 12.5f)
                verticalLineToRelative(10.5f)
                horizontalLineToRelative(-4.5f)
                verticalLineToRelative(-10.5f)
                horizontalLineToRelative(4.5f)
                close()
                moveTo(7f, 11.5f)
                lineTo(7f, 1f)
                horizontalLineToRelative(4.5f)
                verticalLineToRelative(10.5f)
                horizontalLineToRelative(-4.5f)
                close()
                moveTo(12.5f, 12.5f)
                horizontalLineToRelative(4.5f)
                verticalLineToRelative(10.5f)
                horizontalLineToRelative(-4.5f)
                verticalLineToRelative(-10.5f)
                close()
                moveTo(12.5f, 11.5f)
                lineTo(12.5f, 1f)
                horizontalLineToRelative(4.5f)
                verticalLineToRelative(10.5f)
                horizontalLineToRelative(-4.5f)
                close()
                moveTo(4.5f, 1f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(10.5f)
                lineTo(1f, 11.5f)
                verticalLineToRelative(-7f)
                curveToRelative(0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                close()
                moveTo(1f, 19.5f)
                verticalLineToRelative(-7f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(10.5f)
                horizontalLineToRelative(-1.5f)
                curveToRelative(-1.93f, 0f, -3.5f, -1.57f, -3.5f, -3.5f)
                close()
                moveTo(19.5f, 23f)
                horizontalLineToRelative(-1.5f)
                verticalLineToRelative(-10.5f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(7f)
                curveToRelative(0f, 1.93f, -1.57f, 3.5f, -3.5f, 3.5f)
                close()
            }
        }.also { _Grate = it}
