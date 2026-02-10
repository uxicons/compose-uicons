package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _YinYang: ImageVector? = null

val Icons.Sr.YinYang: ImageVector
    get() = _YinYang ?: UXIcon(name = "YinYang") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(6f, 18.5f)
                curveToRelative(0f, -3.54f, 2.43f, -6.68f, 5.77f, -7.47f)
                horizontalLineToRelative(0f)
                curveToRelative(2.41f, -0.57f, 4.23f, -2.95f, 4.23f, -5.53f)
                curveToRelative(0f, -1.21f, -0.39f, -2.33f, -1.06f, -3.24f)
                curveTo(13.62f, 0.45f, 11.23f, -0.18f, 9.06f, 0.36f)
                curveTo(3.86f, 1.68f, 0f, 6.4f, 0f, 12f)
                curveToRelative(0f, 5.08f, 3.17f, 9.43f, 7.65f, 11.18f)
                curveToRelative(-1.03f, -1.28f, -1.65f, -2.91f, -1.65f, -4.68f)
                close()
                moveTo(10.5f, 4f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                close()
                moveTo(16.35f, 0.82f)
                curveToRelative(1.03f, 1.28f, 1.65f, 2.91f, 1.65f, 4.68f)
                curveToRelative(0f, 3.53f, -2.43f, 6.68f, -5.77f, 7.47f)
                horizontalLineToRelative(0f)
                curveToRelative(-2.41f, 0.57f, -4.23f, 2.95f, -4.23f, 5.53f)
                curveToRelative(0f, 1.21f, 0.39f, 2.33f, 1.06f, 3.24f)
                curveToRelative(1.32f, 1.8f, 3.71f, 2.44f, 5.88f, 1.89f)
                curveToRelative(5.2f, -1.31f, 9.06f, -6.03f, 9.06f, -11.64f)
                curveToRelative(0f, -5.08f, -3.17f, -9.43f, -7.65f, -11.18f)
                close()
                moveTo(13.5f, 20f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                close()
            }
        }.also { _YinYang = it}
