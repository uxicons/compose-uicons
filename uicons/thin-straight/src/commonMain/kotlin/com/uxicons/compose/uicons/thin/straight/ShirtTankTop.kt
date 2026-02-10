package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ShirtTankTop: ImageVector? = null

val Icons.Ts.ShirtTankTop: ImageVector
    get() = _ShirtTankTop ?: UXIcon(name = "ShirtTankTop") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20.67f, 8.94f)
                curveToRelative(-1.62f, -0.57f, -2.67f, -2.18f, -2.67f, -4.09f)
                lineTo(18f, 0f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(3f)
                curveToRelative(0f, 2.76f, -2.24f, 5f, -5f, 5f)
                reflectiveCurveToRelative(-5f, -2.24f, -5f, -5f)
                lineTo(7f, 0f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(4.86f)
                curveToRelative(0f, 1.91f, -1.05f, 3.52f, -2.67f, 4.09f)
                lineToRelative(-0.33f, 0.12f)
                verticalLineToRelative(14.94f)
                horizontalLineToRelative(18f)
                verticalLineToRelative(-14.94f)
                lineToRelative(-0.33f, -0.12f)
                close()
                moveTo(20f, 23f)
                lineTo(4f, 23f)
                verticalLineToRelative(-13.24f)
                curveToRelative(1.48f, -0.65f, 2.52f, -2.0f, 2.87f, -3.65f)
                curveToRelative(1.05f, 1.73f, 2.96f, 2.89f, 5.13f, 2.89f)
                reflectiveCurveToRelative(4.08f, -1.16f, 5.13f, -2.89f)
                curveToRelative(0.35f, 1.65f, 1.39f, 3.0f, 2.87f, 3.65f)
                verticalLineToRelative(13.24f)
                close()
            }
        }.also { _ShirtTankTop = it}
