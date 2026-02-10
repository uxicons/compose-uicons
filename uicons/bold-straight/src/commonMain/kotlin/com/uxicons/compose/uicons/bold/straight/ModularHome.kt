package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ModularHome: ImageVector? = null

val Icons.Bs.ModularHome: ImageVector
    get() = _ModularHome ?: UXIcon(name = "ModularHome") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20.5f, 10f)
                horizontalLineToRelative(-1.43f)
                lineToRelative(-5.7f, -3.35f)
                curveToRelative(0.96f, -0.5f, 1.62f, -1.49f, 1.62f, -2.65f)
                curveToRelative(0f, -1.1f, -0.6f, -2.12f, -1.58f, -2.64f)
                curveToRelative(-0.25f, -0.14f, -0.42f, -0.46f, -0.42f, -0.82f)
                verticalLineToRelative(-0.54f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(0.54f)
                curveToRelative(0f, 1.1f, 0.56f, 2.09f, 1.47f, 2.58f)
                curveToRelative(0.33f, 0.18f, 0.53f, 0.51f, 0.53f, 0.88f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                horizontalLineToRelative(-2f)
                curveToRelative(0f, 1.16f, 0.66f, 2.15f, 1.62f, 2.65f)
                lineToRelative(-5.7f, 3.35f)
                horizontalLineToRelative(-1.43f)
                curveToRelative(-1.93f, 0f, -3.5f, 1.57f, -3.5f, 3.5f)
                verticalLineToRelative(10.5f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(-10.5f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                close()
                moveTo(12f, 8.16f)
                lineTo(15.13f, 10f)
                horizontalLineToRelative(-6.25f)
                lineToRelative(3.13f, -1.84f)
                close()
                moveTo(21f, 21f)
                horizontalLineToRelative(-10f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-7.5f)
                curveToRelative(0f, -0.28f, 0.23f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(17f)
                curveToRelative(0.28f, 0f, 0.5f, 0.23f, 0.5f, 0.5f)
                close()
                moveTo(14f, 15f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-4f)
                close()
            }
        }.also { _ModularHome = it}
