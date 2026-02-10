package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ModularHome: ImageVector? = null

val Icons.Rs.ModularHome: ImageVector
    get() = _ModularHome ?: UXIcon(name = "ModularHome") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21f, 10f)
                horizontalLineToRelative(-1.93f)
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
                horizontalLineToRelative(-1.93f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(11f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(-11f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                close()
                moveTo(12f, 8.16f)
                lineTo(15.13f, 10f)
                horizontalLineToRelative(-6.25f)
                lineToRelative(3.13f, -1.84f)
                close()
                moveTo(6f, 22f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(6f)
                close()
                moveTo(22f, 22f)
                horizontalLineToRelative(-12f)
                verticalLineToRelative(-8f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-9f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(18f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                close()
                moveTo(12f, 20f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(-8f)
                close()
                moveTo(14f, 16f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-4f)
                close()
            }
        }.also { _ModularHome = it}
