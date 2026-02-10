package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TachometerFastest: ImageVector? = null

val Icons.Ts.TachometerFastest: ImageVector
    get() = _TachometerFastest ?: UXIcon(name = "TachometerFastest") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19.29f, 16.95f)
                lineToRelative(0.42f, -0.91f)
                lineToRelative(-5.75f, -2.68f)
                curveToRelative(0.02f, -0.12f, 0.03f, -0.24f, 0.03f, -0.37f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                reflectiveCurveToRelative(-2f, 0.9f, -2f, 2f)
                reflectiveCurveToRelative(0.9f, 2f, 2f, 2f)
                curveToRelative(0.62f, 0f, 1.18f, -0.28f, 1.54f, -0.73f)
                lineToRelative(5.75f, 2.68f)
                close()
                moveTo(12f, 14f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                close()
                moveTo(24f, 13f)
                curveToRelative(0f, 3.9f, -1.91f, 7.57f, -5.11f, 9.82f)
                lineToRelative(-0.32f, 0.23f)
                lineToRelative(-2.71f, -2.35f)
                lineToRelative(0.65f, -0.76f)
                lineToRelative(2.12f, 1.83f)
                curveToRelative(2.75f, -2.08f, 4.37f, -5.33f, 4.37f, -8.77f)
                curveToRelative(0f, -6.07f, -4.93f, -11f, -11f, -11f)
                reflectiveCurveTo(1f, 6.93f, 1f, 13f)
                curveToRelative(0f, 3.44f, 1.63f, 6.69f, 4.37f, 8.77f)
                lineToRelative(2.12f, -1.83f)
                lineToRelative(0.65f, 0.76f)
                lineToRelative(-2.71f, 2.35f)
                lineToRelative(-0.32f, -0.23f)
                curveTo(1.91f, 20.57f, 0f, 16.9f, 0f, 13f)
                curveTo(0f, 6.38f, 5.38f, 1f, 12f, 1f)
                reflectiveCurveToRelative(12f, 5.38f, 12f, 12f)
                close()
            }
        }.also { _TachometerFastest = it}
