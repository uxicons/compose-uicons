package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BinBottles: ImageVector? = null

val Icons.Ss.BinBottles: ImageVector
    get() = _BinBottles ?: UXIcon(name = "BinBottles") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 3f)
                horizontalLineToRelative(-6f)
                lineTo(13f, 0f)
                horizontalLineToRelative(6f)
                lineTo(19f, 3f)
                close()
                moveTo(23.57f, 12f)
                lineToRelative(-1.46f, 9.46f)
                curveToRelative(-0.23f, 1.47f, -1.47f, 2.54f, -2.96f, 2.54f)
                lineTo(4.85f, 24f)
                curveToRelative(-1.49f, 0f, -2.74f, -1.07f, -2.96f, -2.54f)
                lineTo(0.43f, 12f)
                lineTo(23.57f, 12f)
                close()
                moveTo(8f, 15f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-5f)
                close()
                moveTo(13f, 15f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-5f)
                close()
                moveTo(18f, 15f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-5f)
                close()
                moveTo(14.74f, 5f)
                curveToRelative(0.79f, 0.95f, 1.26f, 2.17f, 1.26f, 3.5f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                horizontalLineToRelative(-3.76f)
                close()
                moveTo(14f, 8.5f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                lineTo(5.5f, 5f)
                curveToRelative(-1.93f, 0f, -3.5f, 1.57f, -3.5f, 3.5f)
                verticalLineToRelative(1.5f)
                lineTo(14f, 10f)
                verticalLineToRelative(-1.5f)
                close()
                moveTo(11f, 0f)
                lineTo(5f, 0f)
                lineTo(5f, 3f)
                horizontalLineToRelative(6f)
                lineTo(11f, 0f)
                close()
            }
        }.also { _BinBottles = it}
