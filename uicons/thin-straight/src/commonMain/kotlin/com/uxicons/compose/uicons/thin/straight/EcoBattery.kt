package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _EcoBattery: ImageVector? = null

val Icons.Ts.EcoBattery: ImageVector
    get() = _EcoBattery ?: UXIcon(name = "EcoBattery") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12.3f, 7.1f)
                lineToRelative(-0.3f, -0.22f)
                curveToRelative(-0.4f, 0.36f, -3.89f, 2.68f, -4f, 6.12f)
                curveToRelative(0f, 2.03f, 1.53f, 3.7f, 3.5f, 3.95f)
                verticalLineToRelative(2.05f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-2.05f)
                curveToRelative(1.97f, -0.25f, 3.5f, -1.92f, 3.5f, -3.95f)
                curveToRelative(0f, -3.13f, -3.55f, -5.79f, -3.7f, -5.9f)
                close()
                moveTo(12.5f, 15.95f)
                verticalLineToRelative(-2.95f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(2.95f)
                curveToRelative(-1.42f, -0.24f, -2.5f, -1.47f, -2.5f, -2.95f)
                curveToRelative(0f, -2.15f, 2.19f, -4.18f, 3f, -4.86f)
                curveToRelative(0.81f, 0.68f, 3f, 2.71f, 3f, 4.86f)
                curveToRelative(0f, 1.48f, -1.08f, 2.71f, -2.5f, 2.95f)
                close()
                moveTo(17.5f, 2f)
                horizontalLineToRelative(-1.5f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-8f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-1.5f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                verticalLineToRelative(19.5f)
                horizontalLineToRelative(16f)
                verticalLineToRelative(-19.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                close()
                moveTo(19f, 23f)
                horizontalLineToRelative(-14f)
                verticalLineToRelative(-18.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(2.5f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2.5f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                close()
            }
        }.also { _EcoBattery = it}
