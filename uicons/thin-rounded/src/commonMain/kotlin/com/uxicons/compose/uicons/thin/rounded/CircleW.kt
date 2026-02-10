package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CircleW: ImageVector? = null

val Icons.Tr.CircleW: ImageVector
    get() = _CircleW ?: UXIcon(name = "CircleW") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 0f)
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
                moveTo(18.62f, 6.81f)
                lineToRelative(-1.14f, 9.52f)
                curveToRelative(-0.17f, 0.95f, -0.85f, 1.66f, -1.73f, 1.66f)
                curveToRelative(-0.98f, 0.01f, -1.71f, -0.51f, -2.02f, -1.35f)
                lineToRelative(-1.74f, -5.14f)
                lineToRelative(-1.78f, 5.12f)
                curveToRelative(-0.34f, 0.91f, -1.12f, 1.44f, -2.0f, 1.36f)
                curveToRelative(-0.86f, -0.07f, -1.52f, -0.71f, -1.69f, -1.63f)
                lineToRelative(-1.15f, -9.55f)
                curveToRelative(-0.03f, -0.27f, 0.16f, -0.52f, 0.44f, -0.56f)
                curveToRelative(0.28f, -0.04f, 0.52f, 0.16f, 0.56f, 0.44f)
                lineToRelative(1.14f, 9.52f)
                curveToRelative(0.1f, 0.53f, 0.47f, 0.76f, 0.79f, 0.78f)
                curveToRelative(0.34f, 0.04f, 0.76f, -0.14f, 0.97f, -0.7f)
                lineToRelative(2.25f, -6.49f)
                curveToRelative(0.07f, -0.2f, 0.26f, -0.34f, 0.47f, -0.34f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.21f, 0f, 0.4f, 0.14f, 0.47f, 0.34f)
                lineToRelative(2.2f, 6.51f)
                curveToRelative(0.2f, 0.55f, 0.65f, 0.73f, 0.99f, 0.69f)
                curveToRelative(0.33f, -0.03f, 0.72f, -0.26f, 0.82f, -0.81f)
                lineToRelative(1.14f, -9.49f)
                curveToRelative(0.03f, -0.27f, 0.29f, -0.47f, 0.56f, -0.44f)
                curveToRelative(0.27f, 0.03f, 0.47f, 0.28f, 0.44f, 0.56f)
                close()
            }
        }.also { _CircleW = it}
