package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MoonStars: ImageVector? = null

val Icons.Ts.MoonStars: ImageVector
    get() = _MoonStars ?: UXIcon(name = "MoonStars") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 24f)
                curveTo(5.38f, 24f, 0f, 18.62f, 0f, 12f)
                reflectiveCurveTo(5.38f, 0f, 12f, 0f)
                curveToRelative(2.01f, 0f, 4.01f, 0.52f, 5.79f, 1.51f)
                lineToRelative(0.82f, 0.46f)
                lineToRelative(-0.84f, 0.43f)
                curveToRelative(-2.8f, 1.43f, -5.77f, 5.11f, -5.77f, 9.11f)
                curveToRelative(0f, 4.14f, 2.73f, 8.05f, 6.65f, 9.51f)
                lineToRelative(0.9f, 0.34f)
                lineToRelative(-0.8f, 0.54f)
                curveToRelative(-2.01f, 1.38f, -4.35f, 2.11f, -6.76f, 2.11f)
                close()
                moveTo(12f, 1f)
                curveTo(5.93f, 1f, 1f, 5.93f, 1f, 12f)
                reflectiveCurveToRelative(4.93f, 11f, 11f, 11f)
                curveToRelative(1.9f, 0f, 3.74f, -0.49f, 5.4f, -1.44f)
                curveToRelative(-3.81f, -1.83f, -6.4f, -5.84f, -6.4f, -10.06f)
                curveToRelative(0f, -4.01f, 2.7f, -7.71f, 5.5f, -9.52f)
                curveToRelative(-1.42f, -0.64f, -2.95f, -0.98f, -4.5f, -0.98f)
                close()
                moveTo(19.5f, 14.12f)
                lineToRelative(-1.5f, -3.0f)
                lineToRelative(-3.0f, -1.5f)
                lineToRelative(3.0f, -1.5f)
                lineToRelative(1.5f, -3.0f)
                lineToRelative(1.5f, 3.0f)
                lineToRelative(3.0f, 1.5f)
                lineToRelative(-3.0f, 1.5f)
                lineToRelative(-1.5f, 3.0f)
                close()
                moveTo(17.24f, 9.62f)
                lineToRelative(1.51f, 0.75f)
                lineToRelative(0.75f, 1.51f)
                lineToRelative(0.75f, -1.51f)
                lineToRelative(1.51f, -0.75f)
                lineToRelative(-1.51f, -0.75f)
                lineToRelative(-0.75f, -1.51f)
                lineToRelative(-0.75f, 1.51f)
                lineToRelative(-1.51f, 0.75f)
                close()
                moveTo(23f, 18.0f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                close()
                moveTo(17f, 15.0f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                close()
            }
        }.also { _MoonStars = it}
