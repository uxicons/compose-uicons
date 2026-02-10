package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _EarthAmericas: ImageVector? = null

val Icons.Ts.EarthAmericas: ImageVector
    get() = _EarthAmericas ?: UXIcon(name = "EarthAmericas") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 0f)
                curveTo(5.38f, 0f, 0f, 5.38f, 0f, 12f)
                reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
                reflectiveCurveToRelative(12f, -5.38f, 12f, -12f)
                reflectiveCurveTo(18.62f, 0f, 12f, 0f)
                close()
                moveTo(11.45f, 1.01f)
                lineToRelative(-1.29f, 2.94f)
                lineToRelative(-0.34f, 0.52f)
                lineToRelative(1.34f, 2.23f)
                lineToRelative(-1.86f, -0.93f)
                lineToRelative(-2.72f, 2.72f)
                lineToRelative(0.5f, 0.5f)
                horizontalLineToRelative(-1.66f)
                lineToRelative(-2.75f, -2.83f)
                curveTo(4.54f, 3.21f, 7.75f, 1.2f, 11.45f, 1.01f)
                close()
                moveTo(12f, 23f)
                curveToRelative(-6.07f, 0f, -11f, -4.93f, -11f, -11f)
                curveToRelative(0f, -1.77f, 0.42f, -3.44f, 1.17f, -4.93f)
                lineToRelative(2.84f, 2.93f)
                horizontalLineToRelative(3.0f)
                lineToRelative(1f, 1f)
                verticalLineToRelative(2f)
                lineToRelative(2f, 2f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(2f)
                lineToRelative(3f, -6.5f)
                lineToRelative(-4f, -2.5f)
                horizontalLineToRelative(-2.5f)
                lineToRelative(-1.5f, -1.5f)
                lineToRelative(1.5f, -1.5f)
                lineToRelative(2f, 1f)
                lineToRelative(1f, -1f)
                lineToRelative(-1.5f, -2.5f)
                lineToRelative(1.54f, -3.48f)
                curveToRelative(3.66f, 0.18f, 6.85f, 2.15f, 8.72f, 5.05f)
                lineToRelative(-3.26f, 1.94f)
                lineToRelative(1.0f, 3.99f)
                lineToRelative(3.82f, 2.02f)
                curveToRelative(-0.95f, 5.11f, -5.44f, 8.99f, -10.82f, 8.99f)
                close()
                moveTo(10f, 12.59f)
                verticalLineToRelative(-1.59f)
                horizontalLineToRelative(1.71f)
                lineToRelative(3.01f, 1.88f)
                lineToRelative(-2.36f, 5.12f)
                horizontalLineToRelative(-0.36f)
                verticalLineToRelative(-3.41f)
                lineToRelative(-2f, -2f)
                close()
                moveTo(19.86f, 11.32f)
                lineToRelative(-0.71f, -2.83f)
                lineToRelative(2.61f, -1.55f)
                curveToRelative(0.79f, 1.52f, 1.24f, 3.24f, 1.24f, 5.07f)
                curveToRelative(0f, 0.32f, -0.01f, 0.64f, -0.04f, 0.95f)
                lineToRelative(-3.1f, -1.64f)
                close()
            }
        }.also { _EarthAmericas = it}
