package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Skull: ImageVector? = null

val Icons.Ss.Skull: ImageVector
    get() = _Skull ?: UXIcon(name = "Skull") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12.75f, 0.02f)
                curveToRelative(-3.08f, -0.2f, -6.01f, 0.84f, -8.26f, 2.94f)
                curveTo(2.27f, 5.04f, 1f, 7.97f, 1f, 11f)
                verticalLineToRelative(6f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(2f)
                curveToRelative(1.65f, 0f, 3f, -1.35f, 3f, -3f)
                verticalLineToRelative(-5.65f)
                curveTo(23f, 5.38f, 18.5f, 0.41f, 12.75f, 0.02f)
                close()
                moveTo(8f, 13f)
                curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                reflectiveCurveToRelative(0.9f, -2f, 2f, -2f)
                reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
                reflectiveCurveToRelative(-0.9f, 2f, -2f, 2f)
                close()
                moveTo(12f, 18.0f)
                curveToRelative(-1.1f, 0f, -2f, 0.1f, -2f, -1f)
                reflectiveCurveToRelative(0.9f, -3f, 2f, -3f)
                reflectiveCurveToRelative(2f, 1.9f, 2f, 3f)
                reflectiveCurveToRelative(-0.9f, 1f, -2f, 1f)
                close()
                moveTo(16f, 13f)
                curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                reflectiveCurveToRelative(0.9f, -2f, 2f, -2f)
                reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
                reflectiveCurveToRelative(-0.9f, 2f, -2f, 2f)
                close()
            }
        }.also { _Skull = it}
