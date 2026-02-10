package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ShirtTankTop: ImageVector? = null

val Icons.Ss.ShirtTankTop: ImageVector
    get() = _ShirtTankTop ?: UXIcon(name = "ShirtTankTop") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20.33f, 8.8f)
                curveToRelative(-1.4f, -0.49f, -2.33f, -1.82f, -2.33f, -3.3f)
                verticalLineTo(0f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(4f)
                curveToRelative(0f, 2.21f, -1.79f, 4f, -4f, 4f)
                reflectiveCurveToRelative(-4f, -1.79f, -4f, -4f)
                verticalLineTo(0f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(5.5f)
                curveToRelative(0f, 1.48f, -0.94f, 2.81f, -2.33f, 3.3f)
                lineToRelative(-0.67f, 0.24f)
                verticalLineToRelative(14.96f)
                horizontalLineToRelative(18f)
                verticalLineToRelative(-14.96f)
                lineToRelative(-0.67f, -0.24f)
                close()
            }
        }.also { _ShirtTankTop = it}
