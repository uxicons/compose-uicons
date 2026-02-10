package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CircleR: ImageVector? = null

val Icons.Tr.CircleR: ImageVector
    get() = _CircleR ?: UXIcon(name = "CircleR") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(17.5f, 10f)
                curveToRelative(0f, -2.21f, -1.79f, -4f, -4f, -4f)
                horizontalLineToRelative(-3f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(8.5f)
                curveToRelative(0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                reflectiveCurveToRelative(0.5f, -0.22f, 0.5f, -0.5f)
                verticalLineToRelative(-3.5f)
                horizontalLineToRelative(5f)
                curveToRelative(0.07f, 0f, 0.14f, -0.0f, 0.2f, -0.01f)
                lineToRelative(2.11f, 3.75f)
                curveToRelative(0.09f, 0.16f, 0.26f, 0.26f, 0.44f, 0.26f)
                curveToRelative(0.08f, 0f, 0.17f, -0.02f, 0.24f, -0.06f)
                curveToRelative(0.24f, -0.14f, 0.33f, -0.44f, 0.19f, -0.68f)
                lineToRelative(-1.94f, -3.45f)
                curveToRelative(1.6f, -0.52f, 2.76f, -2.03f, 2.76f, -3.8f)
                close()
                moveTo(13.5f, 13f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(-4f)
                curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                horizontalLineToRelative(3f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                reflectiveCurveToRelative(-1.35f, 3f, -3f, 3f)
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
        }.also { _CircleR = it}
