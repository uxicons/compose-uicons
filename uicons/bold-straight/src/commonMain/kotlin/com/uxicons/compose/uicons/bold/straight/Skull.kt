package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Skull: ImageVector? = null

val Icons.Bs.Skull: ImageVector
    get() = _Skull ?: UXIcon(name = "Skull") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12.75f, 0.02f)
                curveToRelative(-3.08f, -0.2f, -6.01f, 0.84f, -8.26f, 2.94f)
                curveTo(2.27f, 5.04f, 1f, 7.97f, 1f, 11f)
                verticalLineToRelative(5.5f)
                curveToRelative(0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                horizontalLineToRelative(0.5f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(14f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(0.5f)
                curveToRelative(1.93f, 0f, 3.5f, -1.57f, 3.5f, -3.5f)
                verticalLineToRelative(-5.17f)
                curveTo(23f, 5.38f, 18.5f, 0.41f, 12.75f, 0.02f)
                close()
                moveTo(20f, 16.5f)
                curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                horizontalLineToRelative(-3.5f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-8f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(-3.5f)
                curveToRelative(-0.28f, 0f, -0.5f, -0.23f, -0.5f, -0.5f)
                verticalLineToRelative(-5.5f)
                curveToRelative(0f, -2.23f, 0.9f, -4.31f, 2.54f, -5.84f)
                curveToRelative(1.64f, -1.53f, 3.76f, -2.29f, 6.01f, -2.14f)
                curveToRelative(4.18f, 0.28f, 7.45f, 3.93f, 7.45f, 8.32f)
                verticalLineToRelative(5.17f)
                close()
                moveTo(8f, 9f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                reflectiveCurveToRelative(0.9f, 2f, 2f, 2f)
                reflectiveCurveToRelative(2f, -0.9f, 2f, -2f)
                reflectiveCurveToRelative(-0.9f, -2f, -2f, -2f)
                close()
                moveTo(16f, 9f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                reflectiveCurveToRelative(0.9f, 2f, 2f, 2f)
                reflectiveCurveToRelative(2f, -0.9f, 2f, -2f)
                reflectiveCurveToRelative(-0.9f, -2f, -2f, -2f)
                close()
                moveTo(14f, 17f)
                curveToRelative(0f, 1.1f, -0.9f, 1f, -2f, 1f)
                reflectiveCurveToRelative(-2f, 0.1f, -2f, -1f)
                reflectiveCurveToRelative(0.9f, -3f, 2f, -3f)
                reflectiveCurveToRelative(2f, 1.9f, 2f, 3f)
                close()
            }
        }.also { _Skull = it}
