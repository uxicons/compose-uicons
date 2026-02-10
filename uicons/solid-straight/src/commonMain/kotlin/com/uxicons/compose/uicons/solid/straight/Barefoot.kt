package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Barefoot: ImageVector? = null

val Icons.Ss.Barefoot: ImageVector
    get() = _Barefoot ?: UXIcon(name = "Barefoot") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 20f)
                horizontalLineToRelative(-2.54f)
                curveToRelative(-1.62f, -1.95f, -2.65f, -4.04f, -3.64f, -6.05f)
                curveToRelative(-0.82f, -1.67f, -1.6f, -3.26f, -2.65f, -4.6f)
                lineTo(17.45f, 0f)
                horizontalLineTo(6.15f)
                lineTo(3.1f, 6.54f)
                curveToRelative(-0.29f, 0.57f, -0.75f, 0.95f, -1.24f, 1.35f)
                curveToRelative(-0.83f, 0.68f, -1.85f, 1.53f, -1.85f, 3.31f)
                curveToRelative(0f, 2.08f, 1.4f, 3.68f, 3.74f, 4.26f)
                curveToRelative(1.61f, 0.4f, 4.62f, 3.0f, 7.85f, 6.77f)
                curveToRelative(0.96f, 1.12f, 2.34f, 1.76f, 3.8f, 1.76f)
                horizontalLineToRelative(6.61f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                reflectiveCurveToRelative(-0.9f, -2f, -2f, -2f)
                close()
            }
        }.also { _Barefoot = it}
