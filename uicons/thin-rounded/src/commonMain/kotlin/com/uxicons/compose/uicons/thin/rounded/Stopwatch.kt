package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Stopwatch: ImageVector? = null

val Icons.Tr.Stopwatch: ImageVector
    get() = _Stopwatch ?: UXIcon(name = "Stopwatch") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12.5f, 11.07f)
                verticalLineToRelative(-4.57f)
                curveToRelative(0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f)
                reflectiveCurveToRelative(-0.5f, 0.22f, -0.5f, 0.5f)
                verticalLineToRelative(4.57f)
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
                moveTo(23f, 3f)
                curveToRelative(-1.38f, 0f, -2f, -0.62f, -2f, -2f)
                curveToRelative(0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f)
                reflectiveCurveToRelative(-0.5f, 0.22f, -0.5f, 0.5f)
                curveToRelative(0f, 0.77f, 0.17f, 1.39f, 0.49f, 1.87f)
                lineToRelative(-1.51f, 1.64f)
                curveToRelative(-1.78f, -1.47f, -4.03f, -2.37f, -6.48f, -2.48f)
                lineTo(12.5f, 0.5f)
                curveToRelative(0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f)
                reflectiveCurveToRelative(-0.5f, 0.22f, -0.5f, 0.5f)
                verticalLineToRelative(1.52f)
                curveToRelative(-2.45f, 0.11f, -4.7f, 1.02f, -6.48f, 2.48f)
                lineToRelative(-1.51f, -1.64f)
                curveToRelative(0.32f, -0.48f, 0.49f, -1.1f, 0.49f, -1.87f)
                curveToRelative(0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f)
                reflectiveCurveToRelative(-0.5f, 0.22f, -0.5f, 0.5f)
                curveToRelative(0f, 1.38f, -0.62f, 2f, -2f, 2f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                reflectiveCurveToRelative(0.22f, 0.5f, 0.5f, 0.5f)
                curveToRelative(0.72f, 0f, 1.32f, -0.15f, 1.79f, -0.43f)
                lineToRelative(1.49f, 1.61f)
                curveToRelative(-2.02f, 2.0f, -3.28f, 4.76f, -3.28f, 7.82f)
                curveToRelative(0f, 6.07f, 4.93f, 11f, 11f, 11f)
                reflectiveCurveToRelative(11f, -4.93f, 11f, -11f)
                curveToRelative(0f, -3.06f, -1.26f, -5.83f, -3.28f, -7.82f)
                lineToRelative(1.49f, -1.61f)
                curveToRelative(0.47f, 0.28f, 1.07f, 0.43f, 1.79f, 0.43f)
                curveToRelative(0.28f, 0f, 0.5f, -0.22f, 0.5f, -0.5f)
                reflectiveCurveToRelative(-0.22f, -0.5f, -0.5f, -0.5f)
                close()
                moveTo(22f, 13f)
                curveToRelative(0f, 5.52f, -4.48f, 10f, -10f, 10f)
                reflectiveCurveTo(2f, 18.52f, 2f, 13f)
                reflectiveCurveTo(6.48f, 3f, 12f, 3f)
                reflectiveCurveToRelative(10f, 4.48f, 10f, 10f)
                close()
            }
        }.also { _Stopwatch = it}
