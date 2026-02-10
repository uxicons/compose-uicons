package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Drawer: ImageVector? = null

val Icons.Br.Drawer: ImageVector
    get() = _Drawer ?: UXIcon(name = "Drawer") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(17f, 0f)
            lineTo(7f, 0f)
            curveTo(4.24f, 0f, 2f, 2.24f, 2f, 5f)
            verticalLineToRelative(17.5f)
            curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
            reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
            verticalLineToRelative(-1.5f)
            horizontalLineToRelative(14f)
            verticalLineToRelative(1.5f)
            curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
            reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
            lineTo(22f, 5f)
            curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
            close()
            moveTo(5f, 12f)
            verticalLineToRelative(-3f)
            horizontalLineToRelative(5.5f)
            verticalLineToRelative(0.5f)
            curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
            reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
            verticalLineToRelative(-0.5f)
            horizontalLineToRelative(5.5f)
            verticalLineToRelative(3f)
            lineTo(5f, 12f)
            close()
            moveTo(7f, 3f)
            horizontalLineToRelative(3.5f)
            verticalLineToRelative(0.5f)
            curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
            reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
            verticalLineToRelative(-0.5f)
            horizontalLineToRelative(3.5f)
            curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
            verticalLineToRelative(1f)
            lineTo(5f, 6f)
            verticalLineToRelative(-1f)
            curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
            close()
            moveTo(5f, 18f)
            verticalLineToRelative(-3f)
            horizontalLineToRelative(5.5f)
            verticalLineToRelative(0.5f)
            curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
            reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
            verticalLineToRelative(-0.5f)
            horizontalLineToRelative(5.5f)
            verticalLineToRelative(3f)
            lineTo(5f, 18f)
            close()
        }
    }.also { _Drawer = it }
