package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _EcoBattery: ImageVector? = null

val Icons.Rs.EcoBattery: ImageVector
    get() = _EcoBattery ?: UXIcon(name = "EcoBattery") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12.64f, 7.23f)
                lineToRelative(-0.64f, -0.53f)
                curveToRelative(-0.99f, 0.94f, -3.71f, 2.71f, -4f, 6.3f)
                curveToRelative(0f, 1.86f, 1.28f, 3.41f, 3f, 3.86f)
                verticalLineToRelative(2.14f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2.14f)
                curveToRelative(1.72f, -0.45f, 3f, -2f, 3f, -3.86f)
                curveToRelative(0f, -2.88f, -3.02f, -5.48f, -3.36f, -5.77f)
                close()
                moveTo(13f, 14.72f)
                verticalLineToRelative(-1.72f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(1.72f)
                curveToRelative(-0.59f, -0.35f, -1f, -0.98f, -1f, -1.72f)
                curveToRelative(0f, -1.28f, 1.14f, -2.75f, 2f, -3.63f)
                curveToRelative(0.86f, 0.88f, 2f, 2.35f, 2f, 3.63f)
                curveToRelative(0f, 0.74f, -0.41f, 1.38f, -1f, 1.72f)
                close()
                moveTo(17f, 2f)
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
                moveTo(18f, 22f)
                horizontalLineToRelative(-12f)
                verticalLineToRelative(-17f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(10f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                close()
            }
        }.also { _EcoBattery = it}
