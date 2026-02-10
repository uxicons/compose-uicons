package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CircleCalendar: ImageVector? = null

val Icons.Sc.CircleCalendar: ImageVector
    get() = _CircleCalendar ?: UXIcon(name = "CircleCalendar") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(15.83f, 10.26f)
                curveToRelative(0.09f, 0.62f, 0.17f, 1.39f, 0.17f, 2.24f)
                curveToRelative(0f, 1.35f, -0.19f, 2.51f, -0.33f, 3.16f)
                curveToRelative(-0.69f, 0.14f, -1.98f, 0.34f, -3.67f, 0.34f)
                reflectiveCurveToRelative(-2.98f, -0.2f, -3.67f, -0.34f)
                curveToRelative(-0.14f, -0.65f, -0.33f, -1.82f, -0.33f, -3.16f)
                curveToRelative(0f, -0.85f, 0.08f, -1.61f, 0.17f, -2.24f)
                curveToRelative(0.98f, -0.14f, 2.28f, -0.26f, 3.83f, -0.26f)
                reflectiveCurveToRelative(2.85f, 0.12f, 3.83f, 0.26f)
                close()
                moveTo(23f, 12f)
                curveToRelative(0f, 7.71f, -3.29f, 11f, -11f, 11f)
                reflectiveCurveToRelative(-11f, -3.29f, -11f, -11f)
                reflectiveCurveToRelative(3.29f, -11f, 11f, -11f)
                reflectiveCurveToRelative(11f, 3.29f, 11f, 11f)
                close()
                moveTo(18f, 12.5f)
                curveToRelative(0f, -2.36f, -0.52f, -4.2f, -0.54f, -4.28f)
                curveToRelative(-0.1f, -0.33f, -0.35f, -0.59f, -0.69f, -0.69f)
                curveToRelative(-0.03f, -0.01f, -0.3f, -0.08f, -0.77f, -0.18f)
                verticalLineToRelative(-0.36f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                verticalLineToRelative(0.09f)
                curveToRelative(-0.59f, -0.05f, -1.26f, -0.09f, -2f, -0.09f)
                reflectiveCurveToRelative(-1.41f, 0.04f, -2f, 0.09f)
                verticalLineToRelative(-0.09f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                verticalLineToRelative(0.36f)
                curveToRelative(-0.47f, 0.09f, -0.75f, 0.17f, -0.77f, 0.18f)
                curveToRelative(-0.33f, 0.1f, -0.59f, 0.35f, -0.69f, 0.69f)
                curveToRelative(-0.02f, 0.08f, -0.54f, 1.91f, -0.54f, 4.28f)
                reflectiveCurveToRelative(0.52f, 4.2f, 0.54f, 4.27f)
                curveToRelative(0.1f, 0.33f, 0.35f, 0.59f, 0.69f, 0.69f)
                curveToRelative(0.08f, 0.02f, 1.92f, 0.54f, 4.77f, 0.54f)
                reflectiveCurveToRelative(4.7f, -0.52f, 4.77f, -0.54f)
                curveToRelative(0.33f, -0.1f, 0.59f, -0.35f, 0.69f, -0.69f)
                curveToRelative(0.02f, -0.08f, 0.54f, -1.91f, 0.54f, -4.27f)
                close()
            }
        }.also { _CircleCalendar = it}
