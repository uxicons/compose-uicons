package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LightCeiling: ImageVector? = null

val Icons.Rc.LightCeiling: ImageVector
    get() = _LightCeiling ?: UXIcon(name = "LightCeiling") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(13f, 6.03f)
                verticalLineToRelative(-4.03f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                verticalLineToRelative(4.03f)
                curveToRelative(-6.97f, 0.28f, -9.98f, 3.6f, -9.98f, 10.97f)
                curveToRelative(0f, 1.13f, 0.08f, 2.16f, 0.23f, 3.15f)
                curveToRelative(0.08f, 0.49f, 0.5f, 0.84f, 0.99f, 0.84f)
                horizontalLineToRelative(6.85f)
                curveToRelative(0.26f, 1.4f, 1.14f, 2f, 2.91f, 2f)
                reflectiveCurveToRelative(2.65f, -0.6f, 2.91f, -2f)
                horizontalLineToRelative(6.85f)
                curveToRelative(0.49f, 0f, 0.91f, -0.36f, 0.99f, -0.84f)
                curveToRelative(0.16f, -0.99f, 0.23f, -2.02f, 0.23f, -3.17f)
                curveToRelative(0f, -7.35f, -3.01f, -10.67f, -9.98f, -10.95f)
                close()
                moveTo(20.88f, 19f)
                horizontalLineToRelative(-17.77f)
                curveToRelative(-0.07f, -0.64f, -0.1f, -1.3f, -0.1f, -2.02f)
                curveToRelative(0f, -6.55f, 2.43f, -8.98f, 8.98f, -8.98f)
                reflectiveCurveToRelative(8.98f, 2.43f, 8.98f, 9f)
                curveToRelative(0f, 0.71f, -0.03f, 1.37f, -0.1f, 2f)
                close()
            }
        }.also { _LightCeiling = it}
