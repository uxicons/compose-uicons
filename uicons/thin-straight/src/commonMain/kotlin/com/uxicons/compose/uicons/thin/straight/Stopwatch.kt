package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Stopwatch: ImageVector? = null

val Icons.Ts.Stopwatch: ImageVector
    get() = _Stopwatch ?: UXIcon(name = "Stopwatch") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19.71f, 5.17f)
                lineToRelative(1.66f, -1.81f)
                lineToRelative(1.26f, 1.26f)
                lineToRelative(0.71f, -0.71f)
                lineToRelative(-3.19f, -3.19f)
                lineToRelative(-0.71f, 0.71f)
                lineToRelative(1.22f, 1.22f)
                lineToRelative(-1.7f, 1.85f)
                curveToRelative(-1.78f, -1.46f, -4.02f, -2.36f, -6.47f, -2.48f)
                lineTo(12.5f, 0f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(2.02f)
                curveToRelative(-2.45f, 0.11f, -4.7f, 1.01f, -6.47f, 2.48f)
                lineToRelative(-1.7f, -1.85f)
                lineToRelative(1.29f, -1.29f)
                lineToRelative(-0.71f, -0.71f)
                lineTo(0.66f, 3.91f)
                lineToRelative(0.71f, 0.71f)
                lineToRelative(1.26f, -1.26f)
                lineToRelative(1.66f, 1.81f)
                curveToRelative(-2.02f, 2.0f, -3.29f, 4.77f, -3.29f, 7.83f)
                curveToRelative(0f, 6.07f, 4.93f, 11f, 11f, 11f)
                reflectiveCurveToRelative(11f, -4.93f, 11f, -11f)
                curveToRelative(0f, -3.06f, -1.26f, -5.83f, -3.29f, -7.83f)
                close()
                moveTo(12f, 23f)
                curveToRelative(-5.51f, 0f, -10f, -4.49f, -10f, -10f)
                reflectiveCurveTo(6.49f, 3f, 12f, 3f)
                reflectiveCurveToRelative(10f, 4.49f, 10f, 10f)
                reflectiveCurveToRelative(-4.49f, 10f, -10f, 10f)
                close()
                moveTo(12.5f, 11.07f)
                verticalLineToRelative(-6.07f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(6.07f)
                curveToRelative(-0.86f, 0.22f, -1.5f, 1f, -1.5f, 1.93f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                reflectiveCurveToRelative(2f, -0.9f, 2f, -2f)
                curveToRelative(0f, -0.93f, -0.64f, -1.71f, -1.5f, -1.93f)
                close()
                moveTo(12f, 14f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                close()
            }
        }.also { _Stopwatch = it}
