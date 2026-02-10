package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LightCeiling: ImageVector? = null

val Icons.Sr.LightCeiling: ImageVector
    get() = _LightCeiling ?: UXIcon(name = "LightCeiling") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.76f, 13.41f)
                curveToRelative(-1.6f, -4.58f, -6.03f, -7.99f, -10.76f, -8.41f)
                lineTo(13f, 1f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                verticalLineToRelative(4f)
                curveTo(6.26f, 5.43f, 1.84f, 8.83f, 0.24f, 13.41f)
                curveToRelative(-0.45f, 1.28f, -0.25f, 2.7f, 0.53f, 3.8f)
                curveToRelative(0.79f, 1.11f, 2.01f, 1.74f, 3.37f, 1.74f)
                horizontalLineToRelative(15.71f)
                curveToRelative(1.36f, 0f, 2.59f, -0.64f, 3.37f, -1.74f)
                curveToRelative(0.78f, -1.1f, 0.98f, -2.52f, 0.53f, -3.8f)
                close()
                moveTo(15.86f, 21f)
                curveToRelative(-0.45f, 1.72f, -2.0f, 3f, -3.86f, 3f)
                reflectiveCurveToRelative(-3.41f, -1.28f, -3.86f, -3f)
                horizontalLineToRelative(7.72f)
                close()
            }
        }.also { _LightCeiling = it}
