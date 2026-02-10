package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Scooter: ImageVector? = null

val Icons.Sr.Scooter: ImageVector
    get() = _Scooter ?: UXIcon(name = "Scooter") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21.29f, 18.03f)
                lineToRelative(-3.56f, -14.24f)
                curveToRelative(-0.56f, -2.23f, -2.55f, -3.79f, -4.85f, -3.79f)
                horizontalLineToRelative(-0.88f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(0.88f)
                curveToRelative(1.38f, 0f, 2.58f, 0.94f, 2.91f, 2.27f)
                lineToRelative(1.91f, 7.63f)
                lineToRelative(-3.27f, 4.0f)
                curveToRelative(-0.57f, 0.7f, -1.42f, 1.1f, -2.32f, 1.1f)
                horizontalLineTo(1f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(0.78f)
                curveToRelative(-0.48f, 0.53f, -0.78f, 1.23f, -0.78f, 2f)
                curveToRelative(0f, 1.66f, 1.34f, 3f, 3f, 3f)
                reflectiveCurveToRelative(3f, -1.34f, 3f, -3f)
                curveToRelative(0f, -0.77f, -0.3f, -1.47f, -0.78f, -2f)
                horizontalLineToRelative(5.88f)
                curveToRelative(1.51f, 0f, 2.92f, -0.67f, 3.87f, -1.83f)
                lineToRelative(2.33f, -2.84f)
                lineToRelative(1.04f, 4.18f)
                curveToRelative(-0.81f, 0.54f, -1.34f, 1.46f, -1.34f, 2.5f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                reflectiveCurveToRelative(3f, -1.35f, 3f, -3f)
                curveToRelative(0f, -1.56f, -1.2f, -2.82f, -2.71f, -2.97f)
                close()
            }
        }.also { _Scooter = it}
