package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UpLeft: ImageVector? = null

val Icons.Sr.UpLeft: ImageVector
    get() = _UpLeft ?: UXIcon(name = "UpLeft") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16.09f, 6.13f)
                curveToRelative(1.1f, -1.11f, 1.2f, -2.82f, 0.11f, -4.14f)
                curveToRelative(-0.54f, -0.65f, -1.39f, -0.97f, -2.23f, -0.97f)
                horizontalLineToRelative(0f)
                reflectiveCurveToRelative(-9.01f, 0f, -9.01f, 0f)
                curveToRelative(-2.21f, 0f, -3.99f, 1.79f, -3.99f, 4f)
                horizontalLineTo(0.96f)
                reflectiveCurveToRelative(0f, 8.88f, 0f, 8.88f)
                curveToRelative(0f, 1.17f, 0.61f, 2.3f, 1.66f, 2.81f)
                curveToRelative(1.18f, 0.58f, 2.52f, 0.36f, 3.45f, -0.56f)
                lineToRelative(1.47f, -1.47f)
                lineToRelative(7.5f, 7.44f)
                curveToRelative(1.17f, 1.17f, 3.07f, 1.17f, 4.24f, 0f)
                lineToRelative(2.83f, -2.83f)
                curveToRelative(1.17f, -1.17f, 1.17f, -3.07f, 0f, -4.24f)
                lineToRelative(-7.5f, -7.45f)
                lineToRelative(1.48f, -1.47f)
                close()
            }
        }.also { _UpLeft = it}
