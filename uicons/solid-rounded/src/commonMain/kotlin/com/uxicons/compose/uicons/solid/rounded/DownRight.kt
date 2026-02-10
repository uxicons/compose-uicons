package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DownRight: ImageVector? = null

val Icons.Sr.DownRight: ImageVector
    get() = _DownRight ?: UXIcon(name = "DownRight") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17.87f, 7.87f)
                curveToRelative(1.11f, -1.1f, 2.82f, -1.2f, 4.14f, -0.11f)
                curveToRelative(0.65f, 0.54f, 0.97f, 1.39f, 0.97f, 2.23f)
                horizontalLineToRelative(0f)
                reflectiveCurveToRelative(0f, 9.01f, 0f, 9.01f)
                curveToRelative(0f, 2.21f, -1.79f, 3.99f, -4f, 3.99f)
                horizontalLineTo(10.1f)
                curveToRelative(-1.17f, 0f, -2.3f, -0.61f, -2.81f, -1.66f)
                curveToRelative(-0.58f, -1.18f, -0.36f, -2.52f, 0.56f, -3.45f)
                lineToRelative(1.47f, -1.47f)
                lineTo(1.88f, 8.91f)
                curveToRelative(-1.17f, -1.17f, -1.17f, -3.07f, 0f, -4.24f)
                lineTo(4.71f, 1.84f)
                curveToRelative(1.17f, -1.17f, 3.07f, -1.17f, 4.24f, 0f)
                lineToRelative(7.45f, 7.5f)
                lineToRelative(1.47f, -1.48f)
                close()
            }
        }.also { _DownRight = it}
