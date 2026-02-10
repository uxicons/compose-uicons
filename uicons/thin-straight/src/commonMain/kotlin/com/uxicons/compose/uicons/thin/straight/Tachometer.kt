package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Tachometer: ImageVector? = null

val Icons.Ts.Tachometer: ImageVector
    get() = _Tachometer ?: UXIcon(name = "Tachometer") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 1f)
                curveTo(5.38f, 1f, 0f, 6.38f, 0f, 13f)
                curveToRelative(0f, 3.91f, 1.95f, 7.62f, 5.21f, 9.91f)
                lineToRelative(0.13f, 0.09f)
                horizontalLineToRelative(13.32f)
                lineToRelative(0.13f, -0.09f)
                curveToRelative(3.26f, -2.29f, 5.21f, -6.0f, 5.21f, -9.91f)
                curveToRelative(0f, -6.62f, -5.38f, -12f, -12f, -12f)
                close()
                moveTo(18.34f, 22f)
                lineTo(5.66f, 22f)
                curveToRelative(-2.88f, -2.08f, -4.66f, -5.52f, -4.66f, -9f)
                curveTo(1f, 6.93f, 5.93f, 2f, 12f, 2f)
                reflectiveCurveToRelative(11f, 4.93f, 11f, 11f)
                curveToRelative(0f, 3.48f, -1.78f, 6.92f, -4.66f, 9f)
                close()
                moveTo(13.02f, 11.28f)
                curveToRelative(-0.3f, -0.18f, -0.65f, -0.28f, -1.01f, -0.28f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                reflectiveCurveToRelative(0.9f, 2f, 2f, 2f)
                reflectiveCurveToRelative(2f, -0.9f, 2f, -2f)
                curveToRelative(0f, -0.37f, -0.1f, -0.72f, -0.28f, -1.01f)
                lineToRelative(4.63f, -4.63f)
                lineToRelative(-0.71f, -0.71f)
                lineToRelative(-4.63f, 4.63f)
                close()
                moveTo(12f, 14f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                close()
            }
        }.also { _Tachometer = it}
