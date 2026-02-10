package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SquarePlus: ImageVector? = null

val Icons.Ts.SquarePlus: ImageVector
    get() = _SquarePlus ?: UXIcon(name = "SquarePlus") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12.5f, 11.5f)
                horizontalLineToRelative(4.5f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-4.5f)
                verticalLineToRelative(4.5f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-4.5f)
                lineTo(7f, 12.5f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(4.5f)
                lineTo(11.5f, 7f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(4.5f)
                close()
                moveTo(24f, 2.5f)
                lineTo(24f, 24f)
                lineTo(0f, 24f)
                lineTo(0f, 2.5f)
                curveTo(0f, 1.12f, 1.12f, 0f, 2.5f, 0f)
                lineTo(21.5f, 0f)
                curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
                close()
                moveTo(23f, 2.5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                lineTo(2.5f, 1f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                lineTo(1f, 23f)
                lineTo(23f, 23f)
                lineTo(23f, 2.5f)
                close()
            }
        }.also { _SquarePlus = it}
