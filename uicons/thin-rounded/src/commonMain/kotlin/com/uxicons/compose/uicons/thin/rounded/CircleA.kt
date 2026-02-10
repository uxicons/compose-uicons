package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CircleA: ImageVector? = null

val Icons.Tr.CircleA: ImageVector
    get() = _CircleA ?: UXIcon(name = "CircleA") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(14.07f, 6.84f)
                curveToRelative(-0.34f, -0.83f, -1.14f, -1.34f, -2.07f, -1.34f)
                reflectiveCurveToRelative(-1.72f, 0.51f, -2.07f, 1.34f)
                lineToRelative(-3.89f, 9.72f)
                curveToRelative(-0.1f, 0.26f, 0.02f, 0.55f, 0.28f, 0.65f)
                curveToRelative(0.26f, 0.1f, 0.55f, -0.02f, 0.65f, -0.28f)
                lineToRelative(1.18f, -2.94f)
                horizontalLineToRelative(7.54f)
                lineToRelative(1.1f, 2.92f)
                curveToRelative(0.07f, 0.2f, 0.27f, 0.33f, 0.47f, 0.33f)
                curveToRelative(0.06f, 0f, 0.12f, -0.01f, 0.17f, -0.03f)
                curveToRelative(0.26f, -0.1f, 0.39f, -0.39f, 0.29f, -0.64f)
                lineToRelative(-3.65f, -9.74f)
                close()
                moveTo(8.54f, 13f)
                lineToRelative(2.31f, -5.78f)
                curveToRelative(0.22f, -0.53f, 0.74f, -0.72f, 1.15f, -0.72f)
                reflectiveCurveToRelative(0.92f, 0.19f, 1.14f, 0.71f)
                lineToRelative(2.17f, 5.79f)
                horizontalLineToRelative(-6.77f)
                close()
                moveTo(12f, 0f)
                curveTo(5.38f, 0f, 0f, 5.38f, 0f, 12f)
                reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
                reflectiveCurveToRelative(12f, -5.38f, 12f, -12f)
                reflectiveCurveTo(18.62f, 0f, 12f, 0f)
                close()
                moveTo(12f, 23f)
                curveToRelative(-6.07f, 0f, -11f, -4.93f, -11f, -11f)
                reflectiveCurveTo(5.93f, 1f, 12f, 1f)
                reflectiveCurveToRelative(11f, 4.93f, 11f, 11f)
                reflectiveCurveToRelative(-4.93f, 11f, -11f, 11f)
                close()
            }
        }.also { _CircleA = it}
