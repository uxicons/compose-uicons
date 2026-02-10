package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ScrollOld: ImageVector? = null

val Icons.Ss.ScrollOld: ImageVector
    get() = _ScrollOld ?: UXIcon(name = "ScrollOld") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20f, 17f)
                horizontalLineToRelative(-10f)
                verticalLineToRelative(4.36f)
                curveToRelative(0f, 1.31f, -0.94f, 2.5f, -2.24f, 2.63f)
                curveToRelative(-1.5f, 0.15f, -2.76f, -1.02f, -2.76f, -2.49f)
                verticalLineToRelative(-6.5f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-5f)
                lineTo(5f, 1.5f)
                curveToRelative(0f, -0.54f, -0.12f, -1.04f, -0.34f, -1.5f)
                horizontalLineToRelative(11.34f)
                curveToRelative(2.21f, 0f, 4f, 1.79f, 4f, 4f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(6f)
                close()
                moveTo(3f, 1.5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveTo(0f, 0.67f, 0f, 1.5f)
                verticalLineToRelative(3.5f)
                horizontalLineToRelative(3f)
                lineTo(3f, 1.5f)
                close()
                moveTo(12f, 19f)
                verticalLineToRelative(2.5f)
                curveToRelative(0f, 0.92f, -0.28f, 1.78f, -0.76f, 2.5f)
                horizontalLineToRelative(9.26f)
                curveToRelative(1.93f, 0f, 3.5f, -1.57f, 3.5f, -3.5f)
                verticalLineToRelative(-1.5f)
                horizontalLineToRelative(-12f)
                close()
            }
        }.also { _ScrollOld = it}
