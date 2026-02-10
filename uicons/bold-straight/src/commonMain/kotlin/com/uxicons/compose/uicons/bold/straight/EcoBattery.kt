package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _EcoBattery: ImageVector? = null

val Icons.Bs.EcoBattery: ImageVector
    get() = _EcoBattery ?: UXIcon(name = "EcoBattery") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 17f)
                curveToRelative(0.35f, 0f, 0.68f, -0.06f, 1f, -0.14f)
                verticalLineToRelative(2.14f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2.14f)
                curveToRelative(0.32f, 0.08f, 0.65f, 0.14f, 1f, 0.14f)
                close()
                moveTo(12f, 7f)
                curveToRelative(-1.26f, 1.26f, -4f, 3.68f, -4f, 6f)
                curveToRelative(0f, 1.86f, 1.28f, 3.41f, 3f, 3.86f)
                verticalLineToRelative(-4.86f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(4.86f)
                curveToRelative(1.72f, -0.45f, 3f, -2.0f, 3f, -3.86f)
                curveToRelative(0f, -2.32f, -2.74f, -4.74f, -4f, -6f)
                close()
                moveTo(20f, 5.5f)
                verticalLineToRelative(18.5f)
                horizontalLineToRelative(-16f)
                verticalLineToRelative(-18.5f)
                curveToRelative(0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                horizontalLineToRelative(0.5f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(0.5f)
                curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
                close()
                moveTo(17f, 5.5f)
                curveToRelative(0f, -0.28f, -0.23f, -0.5f, -0.5f, -0.5f)
                horizontalLineToRelative(-9f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                verticalLineToRelative(15.5f)
                horizontalLineToRelative(10f)
                close()
            }
        }.also { _EcoBattery = it}
