package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Humidity: ImageVector? = null

val Icons.Sc.Humidity: ImageVector
    get() = _Humidity ?: UXIcon(name = "Humidity") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12.48f, 1.12f)
                curveToRelative(-0.3f, -0.17f, -0.68f, -0.16f, -0.97f, 0.01f)
                curveToRelative(-0.39f, 0.22f, -9.44f, 5.5f, -9.55f, 12.01f)
                curveToRelative(0.15f, 5.0f, 5.03f, 9.78f, 10.06f, 9.85f)
                curveToRelative(5.0f, -0.07f, 10.03f, -5f, 10.03f, -9.9f)
                curveTo(22.04f, 6.34f, 12.86f, 1.33f, 12.48f, 1.12f)
                close()
                moveTo(7.51f, 10.77f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                close()
                moveTo(10.87f, 17.03f)
                curveToRelative(-0.18f, 0.33f, -0.52f, 0.51f, -0.87f, 0.51f)
                curveToRelative(-0.17f, 0f, -0.34f, -0.04f, -0.49f, -0.13f)
                curveToRelative(-0.48f, -0.27f, -0.65f, -0.88f, -0.38f, -1.36f)
                lineToRelative(4f, -7.08f)
                curveToRelative(0.27f, -0.48f, 0.88f, -0.65f, 1.36f, -0.38f)
                curveToRelative(0.48f, 0.27f, 0.65f, 0.88f, 0.38f, 1.36f)
                lineToRelative(-4f, 7.08f)
                close()
                moveTo(14.99f, 16.73f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                close()
            }
        }.also { _Humidity = it}
