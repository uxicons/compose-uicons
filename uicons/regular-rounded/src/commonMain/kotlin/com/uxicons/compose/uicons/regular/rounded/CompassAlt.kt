package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CompassAlt: ImageVector? = null

val Icons.Rr.CompassAlt: ImageVector
    get() = _CompassAlt ?: UXIcon(name = "CompassAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13f, 2.05f)
                lineTo(13f, 1f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                verticalLineToRelative(1.05f)
                curveTo(5.4f, 2.56f, 1f, 7.27f, 1f, 13f)
                curveToRelative(0f, 6.07f, 4.93f, 11f, 11f, 11f)
                reflectiveCurveToRelative(11f, -4.93f, 11f, -11f)
                curveToRelative(0f, -5.73f, -4.4f, -10.44f, -10f, -10.95f)
                close()
                moveTo(13f, 21.94f)
                verticalLineToRelative(-0.94f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                verticalLineToRelative(0.94f)
                curveToRelative(-4.17f, -0.46f, -7.48f, -3.78f, -7.94f, -7.94f)
                horizontalLineToRelative(0.94f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-0.94f)
                curveToRelative(0.46f, -4.16f, 3.78f, -7.48f, 7.94f, -7.94f)
                verticalLineToRelative(0.94f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-0.94f)
                curveToRelative(4.17f, 0.46f, 7.48f, 3.78f, 7.94f, 7.94f)
                horizontalLineToRelative(-0.94f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(0.94f)
                curveToRelative(-0.46f, 4.17f, -3.78f, 7.48f, -7.94f, 7.94f)
                close()
                moveTo(15.33f, 11.67f)
                curveToRelative(-0.35f, -0.92f, -1.08f, -1.65f, -2.0f, -2.0f)
                lineToRelative(-5.47f, -2.1f)
                curveToRelative(-0.37f, -0.14f, -0.79f, -0.05f, -1.07f, 0.23f)
                curveToRelative(-0.28f, 0.28f, -0.37f, 0.7f, -0.23f, 1.07f)
                lineToRelative(2.1f, 5.47f)
                curveToRelative(0.35f, 0.92f, 1.08f, 1.65f, 2.0f, 2.0f)
                lineToRelative(5.47f, 2.1f)
                curveToRelative(0.12f, 0.04f, 0.24f, 0.07f, 0.36f, 0.07f)
                curveToRelative(0.26f, 0f, 0.52f, -0.1f, 0.71f, -0.29f)
                curveToRelative(0.28f, -0.28f, 0.37f, -0.7f, 0.23f, -1.07f)
                lineToRelative(-2.1f, -5.47f)
                close()
                moveTo(11.39f, 14.46f)
                curveToRelative(-0.39f, -0.15f, -0.7f, -0.46f, -0.85f, -0.85f)
                lineToRelative(-1.3f, -3.37f)
                lineToRelative(3.37f, 1.29f)
                curveToRelative(0.39f, 0.15f, 0.7f, 0.46f, 0.85f, 0.85f)
                lineToRelative(1.3f, 3.37f)
                lineToRelative(-3.37f, -1.3f)
                close()
            }
        }.also { _CompassAlt = it}
