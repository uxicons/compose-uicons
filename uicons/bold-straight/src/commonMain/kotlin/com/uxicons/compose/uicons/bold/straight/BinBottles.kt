package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BinBottles: ImageVector? = null

val Icons.Bs.BinBottles: ImageVector
    get() = _BinBottles ?: UXIcon(name = "BinBottles") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10.99f, 19f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(5f)
                close()
                moveTo(23.95f, 9f)
                lineToRelative(-1.92f, 12.05f)
                curveToRelative(-0.27f, 1.71f, -1.73f, 2.95f, -3.46f, 2.95f)
                lineTo(5.42f, 24f)
                curveToRelative(-1.73f, 0f, -3.19f, -1.24f, -3.46f, -2.95f)
                lineTo(0.05f, 9f)
                horizontalLineToRelative(1.95f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0f, -1.95f, 1.26f, -3.6f, 3f, -4.22f)
                lineTo(5f, 0f)
                horizontalLineToRelative(6f)
                lineTo(11f, 3.28f)
                curveToRelative(1.74f, 0.62f, 3f, 2.27f, 3f, 4.22f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                horizontalLineToRelative(-1.7f)
                curveToRelative(-0.39f, -1.62f, -1.39f, -3.03f, -2.8f, -3.93f)
                lineTo(13f, 0f)
                horizontalLineToRelative(5f)
                lineTo(18f, 3.05f)
                curveToRelative(2.24f, 0.25f, 4f, 2.14f, 4f, 4.45f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(1.95f)
                close()
                moveTo(5.0f, 9f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                horizontalLineToRelative(-3f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                verticalLineToRelative(1.5f)
                close()
                moveTo(20.43f, 12f)
                lineTo(3.56f, 12f)
                lineToRelative(1.36f, 8.58f)
                curveToRelative(0.04f, 0.24f, 0.25f, 0.42f, 0.49f, 0.42f)
                horizontalLineToRelative(13.15f)
                curveToRelative(0.25f, 0f, 0.46f, -0.18f, 0.49f, -0.42f)
                lineToRelative(1.36f, -8.58f)
                close()
                moveTo(15.99f, 14f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-5f)
                close()
            }
        }.also { _BinBottles = it}
