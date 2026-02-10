package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LaptopShield: ImageVector? = null

val Icons.Rs.LaptopShield: ImageVector
    get() = _LaptopShield ?: UXIcon(name = "LaptopShield") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22f, 14.2f)
                curveToRelative(-0.79f, 0.53f, -1.52f, 0.88f, -2f, 1.09f)
                verticalLineToRelative(2.71f)
                horizontalLineToRelative(-4.91f)
                lineToRelative(-1f, 1f)
                horizontalLineToRelative(-4.17f)
                lineToRelative(-1f, -1f)
                horizontalLineToRelative(-4.91f)
                verticalLineToRelative(-10f)
                horizontalLineToRelative(7.05f)
                curveToRelative(-0.03f, -0.27f, -0.05f, -0.54f, -0.05f, -0.82f)
                verticalLineToRelative(-1.18f)
                horizontalLineToRelative(-9f)
                verticalLineToRelative(12f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(3f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                horizontalLineToRelative(18f)
                curveToRelative(1.65f, 0f, 3f, -1.35f, 3f, -3f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-2f)
                close()
                moveTo(22f, 21f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                horizontalLineToRelative(-18f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(6.09f)
                lineToRelative(1f, 1f)
                horizontalLineToRelative(5.83f)
                lineToRelative(1f, -1f)
                horizontalLineToRelative(6.09f)
                close()
                moveTo(22.63f, 1.37f)
                lineTo(18.5f, 0f)
                lineTo(14.37f, 1.37f)
                curveToRelative(-0.82f, 0.27f, -1.37f, 1.03f, -1.37f, 1.9f)
                verticalLineToRelative(3.91f)
                curveToRelative(0f, 3.57f, 3.71f, 5.7f, 4.85f, 6.27f)
                lineToRelative(0.6f, 0.3f)
                lineToRelative(0.63f, -0.25f)
                curveToRelative(1.15f, -0.46f, 4.92f, -2.29f, 4.92f, -6.32f)
                verticalLineToRelative(-3.91f)
                curveToRelative(0f, -0.86f, -0.55f, -1.62f, -1.37f, -1.9f)
                close()
                moveTo(22f, 7.18f)
                curveToRelative(0f, 2.58f, -2.42f, 3.92f, -3.46f, 4.38f)
                curveToRelative(-0.92f, -0.49f, -3.54f, -2.1f, -3.54f, -4.38f)
                verticalLineToRelative(-3.91f)
                reflectiveCurveToRelative(3.5f, -1.16f, 3.5f, -1.16f)
                lineToRelative(3.5f, 1.16f)
                close()
            }
        }.also { _LaptopShield = it}
