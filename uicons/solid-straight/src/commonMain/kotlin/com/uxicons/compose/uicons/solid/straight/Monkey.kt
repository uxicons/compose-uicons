package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Monkey: ImageVector? = null

val Icons.Ss.Monkey: ImageVector
    get() = _Monkey ?: UXIcon(name = "Monkey") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20f, 22f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(-6f)
                curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
                verticalLineToRelative(4f)
                close()
                moveTo(24f, 5.5f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                curveToRelative(-0.13f, 0f, -0.25f, -0.01f, -0.37f, -0.04f)
                curveToRelative(-0.34f, 0.89f, -0.91f, 1.68f, -1.63f, 2.28f)
                verticalLineToRelative(4.82f)
                curveToRelative(-0.59f, -0.34f, -1.27f, -0.56f, -2f, -0.56f)
                curveToRelative(-2.21f, 0f, -4f, 1.79f, -4f, 4f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(-7f)
                curveToRelative(-3.86f, 0f, -7f, -3.14f, -7f, -7f)
                lineTo(0f, 6f)
                curveTo(0f, 2.41f, 2.41f, 0f, 6f, 0f)
                verticalLineToRelative(2f)
                curveToRelative(-2.47f, 0f, -4f, 1.53f, -4f, 4f)
                verticalLineToRelative(11f)
                curveToRelative(0f, 1.66f, 0.82f, 3.13f, 2.08f, 4.04f)
                curveToRelative(0.4f, -4.21f, 2.53f, -10.2f, 8.5f, -11.69f)
                curveToRelative(-0.53f, -0.54f, -0.94f, -1.18f, -1.21f, -1.89f)
                curveToRelative(-0.12f, 0.02f, -0.24f, 0.04f, -0.37f, 0.04f)
                curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                reflectiveCurveToRelative(0.9f, -2f, 2f, -2f)
                curveToRelative(0.13f, 0f, 0.25f, 0.01f, 0.37f, 0.04f)
                curveToRelative(0.79f, -2.06f, 2.79f, -3.54f, 5.13f, -3.54f)
                reflectiveCurveToRelative(4.34f, 1.47f, 5.13f, 3.54f)
                curveToRelative(0.12f, -0.02f, 0.24f, -0.04f, 0.37f, -0.04f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                close()
            }
        }.also { _Monkey = it}
