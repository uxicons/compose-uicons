package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Skull: ImageVector? = null

val Icons.Sr.Skull: ImageVector
    get() = _Skull ?: UXIcon(name = "Skull") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12.75f, 0.02f)
                curveToRelative(-3.08f, -0.2f, -6.01f, 0.84f, -8.26f, 2.94f)
                curveTo(2.27f, 5.04f, 1f, 7.97f, 1f, 11f)
                verticalLineToRelative(4f)
                curveToRelative(0f, 2.42f, 1.73f, 4.45f, 4.02f, 4.9f)
                curveToRelative(0.2f, 2.29f, 2.14f, 4.1f, 4.48f, 4.1f)
                horizontalLineToRelative(5f)
                curveToRelative(2.35f, 0f, 4.28f, -1.8f, 4.48f, -4.1f)
                curveToRelative(2.29f, -0.46f, 4.02f, -2.48f, 4.02f, -4.9f)
                verticalLineToRelative(-3.65f)
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
