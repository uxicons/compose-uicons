package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LiveAlt: ImageVector? = null

val Icons.Bs.LiveAlt: ImageVector
    get() = _LiveAlt ?: UXIcon(name = "LiveAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 5f)
                curveToRelative(1.47f, 0f, 2.85f, 0.57f, 3.89f, 1.61f)
                lineToRelative(-2.12f, 2.12f)
                curveToRelative(-0.94f, -0.94f, -2.59f, -0.94f, -3.54f, 0f)
                lineToRelative(-2.12f, -2.12f)
                curveToRelative(1.04f, -1.04f, 2.42f, -1.61f, 3.89f, -1.61f)
                close()
                moveTo(16.6f, 4.9f)
                lineToRelative(2.12f, -2.12f)
                curveTo(15.01f, -0.92f, 8.99f, -0.92f, 5.28f, 2.78f)
                lineToRelative(2.12f, 2.12f)
                curveToRelative(2.54f, -2.53f, 6.66f, -2.53f, 9.19f, 0f)
                close()
                moveTo(24f, 13.5f)
                verticalLineToRelative(10.5f)
                lineTo(0f, 24f)
                verticalLineToRelative(-10.5f)
                curveToRelative(0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                horizontalLineToRelative(17f)
                curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
                close()
                moveTo(6f, 19f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-2f)
                close()
                moveTo(9f, 13f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-8f)
                close()
                moveTo(16f, 13f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(0.36f)
                lineToRelative(-1f, 3.5f)
                lineToRelative(-1f, -3.5f)
                verticalLineToRelative(-0.36f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(0.5f)
                lineToRelative(2.12f, 7.5f)
                horizontalLineToRelative(1.78f)
                lineToRelative(2.06f, -7.22f)
                lineToRelative(0.04f, -0.78f)
                close()
                moveTo(21f, 13f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2f)
                close()
            }
        }.also { _LiveAlt = it}
