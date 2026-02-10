package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LightCeiling: ImageVector? = null

val Icons.Ss.LightCeiling: ImageVector
    get() = _LightCeiling ?: UXIcon(name = "LightCeiling") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(13f, 5.03f)
                lineTo(13f, 0f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(5.03f)
                curveTo(4.85f, 5.54f, 0f, 10.7f, 0f, 16.98f)
                verticalLineToRelative(2.02f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(-2.02f)
                curveToRelative(0f, -6.28f, -4.85f, -11.44f, -11f, -11.95f)
                close()
                moveTo(15.86f, 21f)
                curveToRelative(-0.45f, 1.72f, -2.0f, 3f, -3.86f, 3f)
                reflectiveCurveToRelative(-3.41f, -1.28f, -3.86f, -3f)
                horizontalLineToRelative(7.72f)
                close()
            }
        }.also { _LightCeiling = it}
