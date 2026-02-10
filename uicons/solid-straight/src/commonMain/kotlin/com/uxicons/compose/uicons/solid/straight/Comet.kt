package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Comet: ImageVector? = null

val Icons.Ss.Comet: ImageVector
    get() = _Comet ?: UXIcon(name = "Comet") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.41f, 1.82f)
                lineToRelative(0.47f, -1.7f)
                lineToRelative(-1.7f, 0.47f)
                curveToRelative(-0.2f, 0.05f, -4.43f, 1.24f, -9.18f, 3.72f)
                lineTo(13f, 0.19f)
                lineToRelative(-1.75f, 1.13f)
                curveTo(5.98f, 4.72f, 0f, 8.58f, 0f, 15.5f)
                curveToRelative(0f, 2.27f, 0.88f, 4.4f, 2.49f, 6.01f)
                curveToRelative(1.61f, 1.6f, 3.74f, 2.49f, 6.01f, 2.49f)
                curveToRelative(6.92f, 0f, 10.78f, -5.98f, 14.18f, -11.25f)
                lineToRelative(1.13f, -1.75f)
                horizontalLineToRelative(-4.12f)
                curveToRelative(2.48f, -4.74f, 3.67f, -8.98f, 3.72f, -9.18f)
                close()
                moveTo(9f, 20f)
                curveToRelative(-2.76f, 0f, -5f, -2.24f, -5f, -5f)
                reflectiveCurveToRelative(2.24f, -5f, 5f, -5f)
                reflectiveCurveToRelative(5f, 2.24f, 5f, 5f)
                reflectiveCurveToRelative(-2.24f, 5f, -5f, 5f)
                close()
                moveTo(12f, 15f)
                curveToRelative(0f, 1.65f, -1.35f, 3f, -3f, 3f)
                reflectiveCurveToRelative(-3f, -1.35f, -3f, -3f)
                reflectiveCurveToRelative(1.35f, -3f, 3f, -3f)
                reflectiveCurveToRelative(3f, 1.35f, 3f, 3f)
                close()
            }
        }.also { _Comet = it}
