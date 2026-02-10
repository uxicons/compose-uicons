package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HandZoomIn: ImageVector? = null

val Icons.Ss.HandZoomIn: ImageVector
    get() = _HandZoomIn ?: UXIcon(name = "HandZoomIn") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(14f, 15.46f)
                lineToRelative(10f, 4f)
                verticalLineToRelative(4.54f)
                horizontalLineToRelative(-16.94f)
                lineToRelative(-2.34f, -2.05f)
                curveToRelative(-0.92f, -0.86f, -0.96f, -2.31f, -0.1f, -3.23f)
                curveToRelative(0.86f, -0.92f, 2.31f, -0.97f, 3.23f, -0.11f)
                curveToRelative(0.03f, 0.03f, 1.07f, 0.82f, 2.15f, 1.7f)
                verticalLineToRelative(-10.32f)
                curveToRelative(0f, -1.22f, 1.08f, -2.18f, 2.34f, -1.97f)
                curveToRelative(0.98f, 0.16f, 1.66f, 1.08f, 1.66f, 2.08f)
                close()
                moveTo(11f, 0f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2.59f)
                lineToRelative(-7.59f, 7.59f)
                verticalLineToRelative(-2.59f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(4f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-2.59f)
                lineToRelative(7.59f, -7.59f)
                verticalLineToRelative(2.59f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-4f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                close()
            }
        }.also { _HandZoomIn = it}
