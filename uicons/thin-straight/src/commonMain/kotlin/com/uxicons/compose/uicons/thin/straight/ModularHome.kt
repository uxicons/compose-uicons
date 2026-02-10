package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ModularHome: ImageVector? = null

val Icons.Ts.ModularHome: ImageVector
    get() = _ModularHome ?: UXIcon(name = "ModularHome") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21.5f, 11f)
                horizontalLineToRelative(-2.58f)
                lineToRelative(-5.8f, -3.22f)
                curveToRelative(1.1f, -0.45f, 1.88f, -1.52f, 1.88f, -2.78f)
                curveToRelative(0f, -1.1f, -0.6f, -2.12f, -1.58f, -2.64f)
                curveToRelative(-0.56f, -0.3f, -0.92f, -0.96f, -0.92f, -1.68f)
                verticalLineToRelative(-0.67f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(0.68f)
                curveToRelative(0f, 1.1f, 0.56f, 2.08f, 1.45f, 2.56f)
                curveToRelative(0.65f, 0.35f, 1.05f, 1.02f, 1.05f, 1.76f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                reflectiveCurveToRelative(-2f, -0.9f, -2f, -2f)
                horizontalLineToRelative(-1f)
                curveToRelative(0f, 1.26f, 0.78f, 2.33f, 1.88f, 2.78f)
                lineToRelative(-5.8f, 3.22f)
                horizontalLineToRelative(-2.58f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                verticalLineToRelative(10.5f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(-10.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                close()
                moveTo(12f, 8.3f)
                lineTo(16.86f, 11f)
                horizontalLineToRelative(-9.71f)
                close()
                moveTo(5f, 23f)
                verticalLineToRelative(-7f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(7f)
                close()
                moveTo(23f, 23f)
                horizontalLineToRelative(-14f)
                verticalLineToRelative(-8f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-9.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(19f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                close()
                moveTo(13f, 20f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(-7f)
                close()
                moveTo(14f, 16f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-5f)
                close()
            }
        }.also { _ModularHome = it}
