package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PumpMedical: ImageVector? = null

val Icons.Ts.PumpMedical: ImageVector
    get() = _PumpMedical ?: UXIcon(name = "PumpMedical") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21.18f, 0.59f)
                curveToRelative(-0.58f, -0.39f, -1.25f, -0.59f, -1.94f, -0.59f)
                horizontalLineToRelative(-7.74f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                verticalLineToRelative(3.61f)
                curveToRelative(-2.97f, 1.21f, -5f, 4.13f, -5f, 7.39f)
                verticalLineToRelative(10.5f)
                horizontalLineToRelative(16f)
                verticalLineToRelative(-10.5f)
                curveToRelative(0f, -3.25f, -2.03f, -6.18f, -5f, -7.39f)
                lineTo(15.0f, 1f)
                horizontalLineToRelative(4.24f)
                curveToRelative(0.49f, 0f, 0.97f, 0.15f, 1.39f, 0.42f)
                lineToRelative(2.5f, 1.67f)
                lineToRelative(0.56f, -0.83f)
                lineToRelative(-2.5f, -1.67f)
                close()
                moveTo(10f, 2.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(2.5f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-3.5f)
                close()
                moveTo(19f, 13.5f)
                verticalLineToRelative(9.5f)
                lineTo(5f, 23f)
                verticalLineToRelative(-9.5f)
                curveToRelative(0f, -2.88f, 1.81f, -5.46f, 4.46f, -6.5f)
                horizontalLineToRelative(5.08f)
                curveToRelative(2.65f, 1.04f, 4.46f, 3.62f, 4.46f, 6.5f)
                close()
                moveTo(12.5f, 14.5f)
                horizontalLineToRelative(3.5f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-3.5f)
                verticalLineToRelative(3.5f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-3.5f)
                horizontalLineToRelative(-3.5f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(3.5f)
                verticalLineToRelative(-3.5f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(3.5f)
                close()
            }
        }.also { _PumpMedical = it}
