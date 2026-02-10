package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BaseballPlayer: ImageVector? = null

val Icons.Bs.BaseballPlayer: ImageVector
    get() = _BaseballPlayer ?: UXIcon(name = "BaseballPlayer") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(9.5f, 3.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
                close()
                moveTo(4f, 7f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                reflectiveCurveToRelative(-2f, 0.9f, -2f, 2f)
                reflectiveCurveToRelative(0.9f, 2f, 2f, 2f)
                reflectiveCurveToRelative(2f, -0.9f, 2f, -2f)
                close()
                moveTo(19.19f, 0.06f)
                lineTo(16.5f, 1.4f)
                lineTo(20.32f, 9.0f)
                horizontalLineToRelative(-3.52f)
                lineToRelative(-4.31f, -1.78f)
                curveToRelative(-0.76f, -0.31f, -1.62f, -0.3f, -2.37f, 0.03f)
                curveToRelative(-0.75f, 0.33f, -1.33f, 0.97f, -1.61f, 1.74f)
                lineToRelative(-5.33f, 15.01f)
                horizontalLineToRelative(3.18f)
                lineToRelative(2.47f, -6.96f)
                lineToRelative(3.16f, 2.24f)
                verticalLineToRelative(4.72f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-6.28f)
                lineToRelative(-3.17f, -2.25f)
                lineToRelative(1.64f, -4.61f)
                lineToRelative(2.74f, 1.13f)
                horizontalLineToRelative(7.8f)
                verticalLineToRelative(-2.35f)
                close()
            }
        }.also { _BaseballPlayer = it}
