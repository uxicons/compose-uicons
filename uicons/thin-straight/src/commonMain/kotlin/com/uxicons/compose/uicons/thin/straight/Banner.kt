package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Banner: ImageVector? = null

val Icons.Ts.Banner: ImageVector
    get() = _Banner ?: UXIcon(name = "Banner") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24.01f, 7.1f)
                lineToRelative(-0.94f, -0.14f)
                curveToRelative(-3.05f, -0.44f, -7.44f, -0.96f, -11.07f, -0.96f)
                reflectiveCurveToRelative(-8.02f, 0.52f, -11.07f, 0.96f)
                lineTo(-0.01f, 7.1f)
                lineToRelative(4.65f, 5.05f)
                lineTo(0.35f, 17.98f)
                lineToRelative(1.17f, -0.16f)
                curveToRelative(2.24f, -0.31f, 6.59f, -0.82f, 10.48f, -0.82f)
                reflectiveCurveToRelative(8.24f, 0.52f, 10.48f, 0.82f)
                lineToRelative(1.17f, 0.16f)
                lineToRelative(-4.29f, -5.83f)
                lineToRelative(4.65f, -5.05f)
                close()
                moveTo(21.45f, 16.68f)
                curveToRelative(-2.42f, -0.3f, -6.1f, -0.68f, -9.45f, -0.68f)
                reflectiveCurveToRelative(-7.03f, 0.38f, -9.45f, 0.68f)
                lineToRelative(3.38f, -4.6f)
                lineToRelative(-3.92f, -4.26f)
                curveToRelative(2.93f, -0.4f, 6.77f, -0.82f, 9.98f, -0.82f)
                reflectiveCurveToRelative(7.05f, 0.42f, 9.98f, 0.82f)
                lineToRelative(-3.92f, 4.26f)
                lineToRelative(3.38f, 4.6f)
                close()
            }
        }.also { _Banner = it}
