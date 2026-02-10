package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _EcoBattery: ImageVector? = null

val Icons.Ss.EcoBattery: ImageVector
    get() = _EcoBattery ?: UXIcon(name = "EcoBattery") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(17f, 2f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-8f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-1f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(19f)
                horizontalLineToRelative(16f)
                verticalLineToRelative(-19f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                close()
                moveTo(13f, 18.15f)
                verticalLineToRelative(2.1f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2.1f)
                curveToRelative(-2.28f, -0.47f, -4f, -2.48f, -4f, -4.9f)
                curveToRelative(0.28f, -4.02f, 3.96f, -6.37f, 5f, -7.25f)
                curveToRelative(1.04f, 0.88f, 4.73f, 3.23f, 5f, 7.25f)
                curveToRelative(0f, 2.42f, -1.72f, 4.43f, -4f, 4.9f)
                close()
                moveTo(15f, 13.25f)
                curveToRelative(0f, 1.3f, -0.84f, 2.4f, -2f, 2.82f)
                verticalLineToRelative(-3.82f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(3.82f)
                curveToRelative(-1.16f, -0.41f, -2f, -1.51f, -2f, -2.82f)
                curveToRelative(0f, -1.71f, 1.82f, -3.67f, 3f, -4.71f)
                curveToRelative(1.18f, 1.04f, 3f, 3f, 3f, 4.71f)
                close()
            }
        }.also { _EcoBattery = it}
