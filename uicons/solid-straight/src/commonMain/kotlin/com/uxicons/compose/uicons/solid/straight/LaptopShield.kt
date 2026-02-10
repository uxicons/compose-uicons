package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LaptopShield: ImageVector? = null

val Icons.Ss.LaptopShield: ImageVector
    get() = _LaptopShield ?: UXIcon(name = "LaptopShield") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(18.46f, 13.76f)
                lineToRelative(-0.6f, -0.3f)
                curveToRelative(-1.14f, -0.57f, -4.85f, -2.7f, -4.85f, -6.27f)
                verticalLineToRelative(-3.91f)
                curveToRelative(0f, -0.86f, 0.55f, -1.62f, 1.37f, -1.9f)
                lineToRelative(4.13f, -1.37f)
                lineToRelative(4.13f, 1.37f)
                curveToRelative(0.82f, 0.27f, 1.37f, 1.03f, 1.37f, 1.9f)
                verticalLineToRelative(3.91f)
                curveToRelative(0f, 4.03f, -3.76f, 5.86f, -4.92f, 6.32f)
                lineToRelative(-0.63f, 0.25f)
                close()
                moveTo(15.01f, 21f)
                lineTo(15.86f, 20f)
                horizontalLineToRelative(8.14f)
                verticalLineToRelative(1f)
                curveToRelative(0f, 1.66f, -1.34f, 3f, -3f, 3f)
                horizontalLineToRelative(-18.0f)
                curveToRelative(-1.66f, 0f, -3f, -1.34f, -3f, -3f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(8.14f)
                lineToRelative(0.85f, 1f)
                horizontalLineToRelative(6.02f)
                close()
                moveTo(19.83f, 15.36f)
                lineTo(18.37f, 15.95f)
                lineTo(16.95f, 15.24f)
                curveToRelative(-1.39f, -0.7f, -5.95f, -3.34f, -5.95f, -8.06f)
                verticalLineToRelative(-1.18f)
                horizontalLineToRelative(-9f)
                verticalLineToRelative(12f)
                horizontalLineToRelative(7.08f)
                lineToRelative(0.85f, 1f)
                horizontalLineToRelative(4.16f)
                lineToRelative(0.85f, -1f)
                horizontalLineToRelative(7.07f)
                verticalLineToRelative(-3.8f)
                curveToRelative(-0.89f, 0.59f, -1.7f, 0.97f, -2.17f, 1.16f)
                close()
            }
        }.also { _LaptopShield = it}
