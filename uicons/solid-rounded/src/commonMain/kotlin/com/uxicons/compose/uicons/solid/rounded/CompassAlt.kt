package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CompassAlt: ImageVector? = null

val Icons.Sr.CompassAlt: ImageVector
    get() = _CompassAlt ?: UXIcon(name = "CompassAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13.46f, 12.39f)
                lineToRelative(1.3f, 3.37f)
                lineToRelative(-3.37f, -1.3f)
                curveToRelative(-0.39f, -0.15f, -0.7f, -0.46f, -0.85f, -0.85f)
                lineToRelative(-1.3f, -3.37f)
                lineToRelative(3.37f, 1.29f)
                curveToRelative(0.39f, 0.15f, 0.7f, 0.46f, 0.85f, 0.85f)
                close()
                moveTo(13f, 2.05f)
                lineTo(13f, 1f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                verticalLineToRelative(1.05f)
                curveToRelative(0.33f, -0.03f, 0.66f, -0.05f, 1f, -0.05f)
                reflectiveCurveToRelative(0.67f, 0.02f, 1f, 0.05f)
                close()
                moveTo(21f, 14f)
                horizontalLineToRelative(1.95f)
                curveToRelative(-0.48f, 5.27f, -4.68f, 9.47f, -9.95f, 9.95f)
                verticalLineToRelative(-1.95f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                verticalLineToRelative(1.95f)
                curveToRelative(-5.27f, -0.48f, -9.47f, -4.68f, -9.95f, -9.95f)
                horizontalLineToRelative(1.95f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                lineTo(1.05f, 12f)
                curveTo(1.53f, 6.73f, 5.73f, 2.52f, 11f, 2.05f)
                verticalLineToRelative(1.95f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-1.95f)
                curveToRelative(5.27f, 0.48f, 9.47f, 4.68f, 9.95f, 9.95f)
                horizontalLineToRelative(-1.95f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                close()
                moveTo(17.43f, 17.14f)
                lineToRelative(-2.1f, -5.47f)
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
                close()
            }
        }.also { _CompassAlt = it}
