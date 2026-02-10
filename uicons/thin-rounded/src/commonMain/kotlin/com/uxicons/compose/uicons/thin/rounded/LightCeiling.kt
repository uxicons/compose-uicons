package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LightCeiling: ImageVector? = null

val Icons.Tr.LightCeiling: ImageVector
    get() = _LightCeiling ?: UXIcon(name = "LightCeiling") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.78f, 14.93f)
                curveToRelative(-1.65f, -4.73f, -6.34f, -8.19f, -11.28f, -8.41f)
                lineTo(12.5f, 0.5f)
                curveToRelative(0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f)
                reflectiveCurveToRelative(-0.5f, 0.22f, -0.5f, 0.5f)
                verticalLineToRelative(6.02f)
                curveTo(6.56f, 6.74f, 1.87f, 10.21f, 0.22f, 14.93f)
                curveToRelative(-0.41f, 1.19f, -0.24f, 2.46f, 0.49f, 3.48f)
                curveToRelative(0.72f, 1.01f, 1.84f, 1.59f, 3.08f, 1.59f)
                horizontalLineToRelative(4.21f)
                curveToRelative(0f, 2.21f, 1.79f, 4f, 4f, 4f)
                reflectiveCurveToRelative(4f, -1.79f, 4f, -4f)
                horizontalLineToRelative(4.21f)
                curveToRelative(1.24f, 0f, 2.36f, -0.58f, 3.08f, -1.59f)
                curveToRelative(0.73f, -1.02f, 0.9f, -2.29f, 0.49f, -3.48f)
                close()
                moveTo(12f, 23f)
                curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                horizontalLineToRelative(6f)
                curveToRelative(0f, 1.65f, -1.35f, 3f, -3f, 3f)
                close()
                moveTo(22.48f, 17.83f)
                curveToRelative(-0.53f, 0.74f, -1.35f, 1.17f, -2.27f, 1.17f)
                lineTo(3.79f, 19f)
                curveToRelative(-0.91f, 0f, -1.74f, -0.43f, -2.27f, -1.17f)
                curveToRelative(-0.54f, -0.75f, -0.67f, -1.69f, -0.36f, -2.57f)
                curveToRelative(1.57f, -4.5f, 6.13f, -7.76f, 10.84f, -7.76f)
                reflectiveCurveToRelative(9.27f, 3.26f, 10.84f, 7.76f)
                curveToRelative(0.31f, 0.88f, 0.18f, 1.81f, -0.36f, 2.57f)
                close()
            }
        }.also { _LightCeiling = it}
