package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TreasureChest: ImageVector? = null

val Icons.Bs.TreasureChest: ImageVector
    get() = _TreasureChest ?: UXIcon(name = "TreasureChest") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17.5f, 0f)
                lineTo(6.5f, 0f)
                curveTo(2.92f, 0f, 0f, 2.92f, 0f, 6.5f)
                lineTo(0f, 24f)
                lineTo(24f, 24f)
                lineTo(24f, 6.5f)
                curveToRelative(0f, -3.58f, -2.92f, -6.5f, -6.5f, -6.5f)
                close()
                moveTo(21f, 6.5f)
                verticalLineToRelative(2.5f)
                horizontalLineToRelative(-2f)
                lineTo(19f, 3.34f)
                curveToRelative(1.18f, 0.56f, 2f, 1.77f, 2f, 3.16f)
                close()
                moveTo(12f, 6f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-2f)
                lineTo(8f, 3f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                close()
                moveTo(5f, 3.34f)
                verticalLineToRelative(5.66f)
                lineTo(3f, 9f)
                verticalLineToRelative(-2.5f)
                curveToRelative(0f, -1.39f, 0.82f, -2.6f, 2f, -3.16f)
                close()
                moveTo(19f, 21f)
                verticalLineToRelative(-7f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(7f)
                lineTo(8f, 21f)
                verticalLineToRelative(-7f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(7f)
                lineTo(3f, 21f)
                lineTo(3f, 12f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(9f)
                horizontalLineToRelative(-2f)
                close()
            }
        }.also { _TreasureChest = it}
