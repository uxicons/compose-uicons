package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HeartRate: ImageVector? = null

val Icons.Sr.HeartRate: ImageVector
    get() = _HeartRate ?: UXIcon(name = "HeartRate") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(16.55f, 21f)
                horizontalLineToRelative(-0.02f)
                curveToRelative(-0.62f, -0.01f, -1.16f, -0.41f, -1.32f, -1.01f)
                lineToRelative(-3.27f, -13.23f)
                lineToRelative(-3.18f, 11.24f)
                curveToRelative(-0.19f, 0.6f, -0.69f, 0.98f, -1.28f, 1.0f)
                curveToRelative(-0.61f, 0.03f, -1.12f, -0.32f, -1.34f, -0.86f)
                lineToRelative(-1.6f, -4.47f)
                curveToRelative(-0.14f, -0.4f, -0.52f, -0.66f, -0.94f, -0.66f)
                horizontalLineTo(1f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(2.59f)
                curveToRelative(1.26f, 0f, 2.4f, 0.8f, 2.83f, 1.99f)
                lineToRelative(0.94f, 2.63f)
                lineToRelative(3.28f, -11.62f)
                curveToRelative(0.2f, -0.62f, 0.73f, -1.03f, 1.36f, -1f)
                curveToRelative(0.62f, 0.01f, 1.15f, 0.42f, 1.31f, 1.01f)
                lineToRelative(3.26f, 13.17f)
                lineToRelative(1.06f, -3.96f)
                curveToRelative(0.35f, -1.31f, 1.54f, -2.22f, 2.9f, -2.22f)
                horizontalLineToRelative(2.47f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                horizontalLineToRelative(-2.47f)
                curveToRelative(-0.45f, 0f, -0.85f, 0.3f, -0.97f, 0.74f)
                lineToRelative(-1.68f, 6.24f)
                curveToRelative(-0.19f, 0.62f, -0.72f, 1.02f, -1.34f, 1.02f)
                close()
            }
        }.also { _HeartRate = it}
