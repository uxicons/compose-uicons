package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ModularHome: ImageVector? = null

val Icons.Ss.ModularHome: ImageVector
    get() = _ModularHome ?: UXIcon(name = "ModularHome") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19f, 19f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(4f)
                close()
                moveTo(5f, 24f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-8f)
                horizontalLineToRelative(-3f)
                close()
                moveTo(24f, 13f)
                verticalLineToRelative(11f)
                horizontalLineToRelative(-14f)
                verticalLineToRelative(-10f)
                horizontalLineToRelative(-7f)
                verticalLineToRelative(10f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-11f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(1.93f)
                lineToRelative(5.7f, -3.35f)
                curveToRelative(-0.96f, -0.5f, -1.62f, -1.49f, -1.62f, -2.65f)
                horizontalLineToRelative(2f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                curveToRelative(0f, -0.37f, -0.2f, -0.71f, -0.53f, -0.88f)
                curveToRelative(-0.91f, -0.49f, -1.47f, -1.48f, -1.47f, -2.58f)
                verticalLineToRelative(-0.54f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(0.54f)
                curveToRelative(0f, 0.36f, 0.17f, 0.68f, 0.42f, 0.82f)
                curveToRelative(0.98f, 0.53f, 1.58f, 1.54f, 1.58f, 2.64f)
                curveToRelative(0f, 1.16f, -0.66f, 2.15f, -1.62f, 2.65f)
                lineToRelative(5.7f, 3.35f)
                horizontalLineToRelative(1.93f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                close()
                moveTo(15.13f, 10f)
                lineTo(12f, 8.16f)
                lineTo(8.87f, 10f)
                horizontalLineToRelative(6.25f)
                close()
                moveTo(21f, 14f)
                horizontalLineToRelative(-8f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(8f)
                close()
            }
        }.also { _ModularHome = it}
