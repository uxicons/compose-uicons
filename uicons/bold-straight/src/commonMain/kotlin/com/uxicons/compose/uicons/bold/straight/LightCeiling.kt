package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LightCeiling: ImageVector? = null

val Icons.Bs.LightCeiling: ImageVector
    get() = _LightCeiling ?: UXIcon(name = "LightCeiling") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(13.5f, 6.1f)
                verticalLineTo(0f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(6.1f)
                curveTo(4.59f, 6.85f, 0f, 11.89f, 0f, 18f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(8f)
                curveToRelative(0f, 2.21f, 1.79f, 4f, 4f, 4f)
                reflectiveCurveToRelative(4f, -1.79f, 4f, -4f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -6.11f, -4.59f, -11.15f, -10.5f, -11.9f)
                close()
                moveTo(3.06f, 17f)
                curveToRelative(0.5f, -4.49f, 4.32f, -8f, 8.94f, -8f)
                reflectiveCurveToRelative(8.45f, 3.51f, 8.94f, 8f)
                horizontalLineTo(3.06f)
                close()
            }
        }.also { _LightCeiling = it}
