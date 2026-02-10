package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _YinYang: ImageVector? = null

val Icons.Tr.YinYang: ImageVector
    get() = _YinYang ?: UXIcon(name = "YinYang") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 0f)
                horizontalLineToRelative(0f)
                curveTo(5.37f, 0f, 0f, 5.37f, 0f, 12f)
                lineTo(0f, 12f)
                curveToRelative(0f, 6.63f, 5.37f, 12f, 12f, 12f)
                horizontalLineToRelative(0f)
                curveToRelative(6.63f, 0f, 12f, -5.37f, 12f, -12f)
                horizontalLineToRelative(0f)
                curveTo(24f, 5.37f, 18.63f, 0f, 12f, 0f)
                close()
                moveTo(1f, 12f)
                curveTo(1f, 5.98f, 5.87f, 1.07f, 11.88f, 1f)
                curveToRelative(2.84f, 0.07f, 5.12f, 2.4f, 5.12f, 5.25f)
                curveToRelative(0f, 2.65f, -2.26f, 5f, -5.04f, 5.25f)
                curveToRelative(-3.28f, 0.3f, -5.96f, 3.1f, -5.96f, 6.25f)
                curveToRelative(0f, 1.73f, 0.71f, 3.3f, 1.85f, 4.44f)
                curveToRelative(-4.02f, -1.64f, -6.85f, -5.59f, -6.85f, -10.19f)
                close()
                moveTo(12.12f, 23f)
                curveToRelative(-2.84f, -0.07f, -5.12f, -2.4f, -5.12f, -5.25f)
                curveToRelative(0f, -2.65f, 2.26f, -5f, 5.04f, -5.25f)
                curveToRelative(3.28f, -0.3f, 5.96f, -3.1f, 5.96f, -6.25f)
                curveToRelative(0f, -1.73f, -0.71f, -3.3f, -1.85f, -4.44f)
                curveToRelative(4.02f, 1.64f, 6.85f, 5.59f, 6.85f, 10.19f)
                curveToRelative(0f, 6.02f, -4.87f, 10.93f, -10.88f, 11f)
                close()
                moveTo(11f, 6f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                close()
                moveTo(13f, 18f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                close()
            }
        }.also { _YinYang = it}
