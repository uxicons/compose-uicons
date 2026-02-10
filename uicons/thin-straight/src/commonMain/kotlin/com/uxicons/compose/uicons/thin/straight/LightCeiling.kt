package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LightCeiling: ImageVector? = null

val Icons.Ts.LightCeiling: ImageVector
    get() = _LightCeiling ?: UXIcon(name = "LightCeiling") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12.5f, 6.53f)
                lineTo(12.5f, 0f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(6.53f)
                curveTo(5.12f, 6.79f, 0f, 12.02f, 0f, 18.43f)
                verticalLineToRelative(1.57f)
                horizontalLineToRelative(8f)
                curveToRelative(0f, 2.21f, 1.79f, 4f, 4f, 4f)
                reflectiveCurveToRelative(4f, -1.79f, 4f, -4f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(-1.57f)
                curveToRelative(0f, -6.41f, -5.12f, -11.64f, -11.5f, -11.9f)
                close()
                moveTo(12f, 23f)
                curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                horizontalLineToRelative(6f)
                curveToRelative(0f, 1.65f, -1.35f, 3f, -3f, 3f)
                close()
                moveTo(23f, 19f)
                lineTo(1f, 19f)
                verticalLineToRelative(-0.57f)
                curveToRelative(0f, -6.03f, 4.93f, -10.93f, 11f, -10.93f)
                reflectiveCurveToRelative(11f, 4.9f, 11f, 10.93f)
                verticalLineToRelative(0.57f)
                close()
            }
        }.also { _LightCeiling = it}
