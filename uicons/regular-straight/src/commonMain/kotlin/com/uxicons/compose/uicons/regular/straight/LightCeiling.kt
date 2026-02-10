package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LightCeiling: ImageVector? = null

val Icons.Rs.LightCeiling: ImageVector
    get() = _LightCeiling ?: UXIcon(name = "LightCeiling") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 18f)
                curveToRelative(0f, -6.28f, -4.85f, -11.44f, -11f, -11.95f)
                lineTo(13f, 0f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(6.05f)
                curveTo(4.85f, 6.56f, 0f, 11.72f, 0f, 18f)
                verticalLineToRelative(2.02f)
                horizontalLineToRelative(8.0f)
                curveToRelative(0.01f, 2.19f, 1.8f, 3.98f, 4.0f, 3.98f)
                reflectiveCurveToRelative(3.98f, -1.78f, 4.0f, -3.98f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(-2.02f)
                close()
                moveTo(12f, 22f)
                curveToRelative(-1.09f, 0f, -1.98f, -0.88f, -2.0f, -1.98f)
                horizontalLineToRelative(4.0f)
                curveToRelative(-0.01f, 1.09f, -0.9f, 1.98f, -2.0f, 1.98f)
                close()
                moveTo(2f, 18.02f)
                verticalLineToRelative(-0.02f)
                curveToRelative(0f, -5.51f, 4.49f, -10f, 10f, -10f)
                reflectiveCurveToRelative(10f, 4.49f, 10f, 10f)
                lineToRelative(-20f, 0.02f)
                close()
            }
        }.also { _LightCeiling = it}
