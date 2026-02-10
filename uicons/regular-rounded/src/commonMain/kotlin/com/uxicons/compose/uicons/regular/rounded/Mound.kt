package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Mound: ImageVector? = null

val Icons.Rr.Mound: ImageVector
    get() = _Mound ?: UXIcon(name = "Mound") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.63f, 19.3f)
                lineToRelative(-3.74f, -7.4f)
                curveToRelative(-1.51f, -2.99f, -4.54f, -4.85f, -7.89f, -4.85f)
                reflectiveCurveToRelative(-6.38f, 1.86f, -7.89f, 4.85f)
                lineTo(0.38f, 19.29f)
                curveToRelative(-0.53f, 1.01f, -0.5f, 2.21f, 0.09f, 3.19f)
                curveToRelative(0.59f, 0.98f, 1.63f, 1.57f, 2.77f, 1.57f)
                horizontalLineToRelative(17.52f)
                curveToRelative(1.14f, 0f, 2.18f, -0.59f, 2.77f, -1.57f)
                curveToRelative(0.59f, -0.99f, 0.63f, -2.18f, 0.1f, -3.18f)
                close()
                moveTo(21.82f, 21.45f)
                curveToRelative(-0.23f, 0.38f, -0.61f, 0.6f, -1.06f, 0.6f)
                lineTo(3.24f, 22.05f)
                curveToRelative(-0.44f, 0f, -0.83f, -0.22f, -1.06f, -0.6f)
                curveToRelative(-0.23f, -0.39f, -0.24f, -0.83f, -0.03f, -1.23f)
                curveToRelative(0.0f, -0.01f, 0.01f, -0.01f, 0.01f, -0.02f)
                lineToRelative(3.74f, -7.4f)
                curveToRelative(1.19f, -2.35f, 3.47f, -3.75f, 6.11f, -3.75f)
                reflectiveCurveToRelative(4.92f, 1.4f, 6.11f, 3.75f)
                lineToRelative(3.75f, 7.42f)
                curveToRelative(0.21f, 0.4f, 0.2f, 0.85f, -0.03f, 1.23f)
                close()
            }
        }.also { _Mound = it}
