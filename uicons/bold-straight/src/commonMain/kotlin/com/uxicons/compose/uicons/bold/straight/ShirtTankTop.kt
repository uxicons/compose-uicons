package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ShirtTankTop: ImageVector? = null

val Icons.Bs.ShirtTankTop: ImageVector
    get() = _ShirtTankTop ?: UXIcon(name = "ShirtTankTop") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20f, 7.83f)
                curveToRelative(-1.2f, -0.42f, -2f, -1.56f, -2f, -2.83f)
                lineTo(18f, 0f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(4f)
                curveToRelative(0f, 1.65f, -1.35f, 3f, -3f, 3f)
                reflectiveCurveToRelative(-3f, -1.35f, -3f, -3f)
                lineTo(9f, 0f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(5f)
                curveToRelative(0f, 1.27f, -0.8f, 2.41f, -2f, 2.83f)
                lineToRelative(-1f, 0.35f)
                verticalLineToRelative(15.82f)
                horizontalLineToRelative(18f)
                verticalLineToRelative(-15.82f)
                lineToRelative(-1f, -0.35f)
                close()
                moveTo(18f, 21f)
                lineTo(6f, 21f)
                verticalLineToRelative(-10.8f)
                curveToRelative(0.78f, -0.45f, 1.44f, -1.06f, 1.94f, -1.79f)
                curveToRelative(1.07f, 0.99f, 2.5f, 1.59f, 4.07f, 1.59f)
                reflectiveCurveToRelative(3.0f, -0.6f, 4.07f, -1.59f)
                curveToRelative(0.5f, 0.72f, 1.16f, 1.34f, 1.94f, 1.79f)
                verticalLineToRelative(10.8f)
                close()
            }
        }.also { _ShirtTankTop = it}
