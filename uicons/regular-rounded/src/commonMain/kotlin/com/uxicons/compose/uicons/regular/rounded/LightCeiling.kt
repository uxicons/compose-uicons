package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LightCeiling: ImageVector? = null

val Icons.Rr.LightCeiling: ImageVector
    get() = _LightCeiling ?: UXIcon(name = "LightCeiling") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.76f, 14.46f)
                curveToRelative(-1.6f, -4.58f, -6.03f, -7.99f, -10.76f, -8.41f)
                lineTo(13f, 1f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                verticalLineToRelative(5.05f)
                curveTo(6.26f, 6.47f, 1.84f, 9.88f, 0.24f, 14.46f)
                curveToRelative(-0.45f, 1.28f, -0.25f, 2.7f, 0.53f, 3.8f)
                curveToRelative(0.79f, 1.11f, 2.01f, 1.74f, 3.37f, 1.74f)
                horizontalLineToRelative(3.86f)
                curveToRelative(0f, 2.21f, 1.79f, 4f, 4f, 4f)
                reflectiveCurveToRelative(4f, -1.79f, 4f, -4f)
                horizontalLineToRelative(3.86f)
                curveToRelative(1.36f, 0f, 2.59f, -0.64f, 3.37f, -1.74f)
                curveToRelative(0.78f, -1.1f, 0.98f, -2.52f, 0.53f, -3.8f)
                close()
                moveTo(12f, 22f)
                curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                horizontalLineToRelative(4f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                close()
                moveTo(21.6f, 17.1f)
                curveToRelative(-0.41f, 0.57f, -1.04f, 0.9f, -1.74f, 0.9f)
                lineTo(4.14f, 18f)
                curveToRelative(-0.7f, 0f, -1.33f, -0.33f, -1.74f, -0.9f)
                curveToRelative(-0.41f, -0.58f, -0.51f, -1.3f, -0.28f, -1.98f)
                curveToRelative(1.44f, -4.12f, 5.59f, -7.12f, 9.87f, -7.12f)
                reflectiveCurveToRelative(8.43f, 2.99f, 9.87f, 7.12f)
                curveToRelative(0.24f, 0.68f, 0.14f, 1.4f, -0.28f, 1.98f)
                close()
            }
        }.also { _LightCeiling = it}
