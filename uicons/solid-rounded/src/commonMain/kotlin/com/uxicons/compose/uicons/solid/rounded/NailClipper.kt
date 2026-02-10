package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _NailClipper: ImageVector? = null

val Icons.Sr.NailClipper: ImageVector
    get() = _NailClipper ?: UXIcon(name = "NailClipper") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12.06f, 0.22f)
                curveToRelative(-0.54f, -0.31f, -1.2f, -0.29f, -1.72f, 0.04f)
                curveToRelative(-0.21f, 0.14f, -0.45f, 0.32f, -0.7f, 0.53f)
                curveToRelative(-0.7f, 0.56f, -1.49f, 1.21f, -2.68f, 1.21f)
                reflectiveCurveToRelative(-1.98f, -0.64f, -2.68f, -1.21f)
                curveToRelative(-0.26f, -0.21f, -0.49f, -0.39f, -0.7f, -0.53f)
                curveToRelative(-0.52f, -0.34f, -1.18f, -0.35f, -1.72f, -0.04f)
                curveToRelative(-0.54f, 0.31f, -0.85f, 0.9f, -0.82f, 1.52f)
                lineToRelative(0.85f, 17.42f)
                curveToRelative(0.13f, 2.71f, 2.36f, 4.84f, 5.07f, 4.84f)
                reflectiveCurveToRelative(4.94f, -2.12f, 5.07f, -4.84f)
                lineToRelative(0.85f, -17.42f)
                curveToRelative(0.03f, -0.62f, -0.28f, -1.21f, -0.82f, -1.52f)
                close()
                moveTo(6.96f, 10f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                close()
                moveTo(21.96f, 20.0f)
                curveToRelative(-1.29f, 1.29f, -3.36f, 1.34f, -4.71f, 0.11f)
                lineToRelative(-3.12f, -2.84f)
                lineToRelative(0.52f, -10.14f)
                lineToRelative(7.42f, 8.16f)
                curveToRelative(1.23f, 1.35f, 1.18f, 3.42f, -0.11f, 4.71f)
                close()
            }
        }.also { _NailClipper = it}
