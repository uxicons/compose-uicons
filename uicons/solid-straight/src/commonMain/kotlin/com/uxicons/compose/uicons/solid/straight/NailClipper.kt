package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _NailClipper: ImageVector? = null

val Icons.Ss.NailClipper: ImageVector
    get() = _NailClipper ?: UXIcon(name = "NailClipper") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(11.52f, 0.01f)
                lineToRelative(-0.3f, 0.35f)
                curveToRelative(-0.06f, 0.07f, -1.44f, 1.64f, -4.22f, 1.64f)
                reflectiveCurveToRelative(-4.16f, -1.58f, -4.21f, -1.64f)
                lineToRelative(-0.32f, -0.36f)
                horizontalLineToRelative(-1.52f)
                lineToRelative(0.98f, 19.16f)
                curveToRelative(0.13f, 2.71f, 2.36f, 4.84f, 5.07f, 4.84f)
                reflectiveCurveToRelative(4.94f, -2.12f, 5.07f, -4.83f)
                lineToRelative(0.96f, -19.17f)
                close()
                moveTo(7f, 10f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                close()
                moveTo(22.0f, 20.0f)
                curveToRelative(-1.29f, 1.29f, -3.36f, 1.34f, -4.71f, 0.11f)
                lineToRelative(-3.12f, -2.84f)
                lineToRelative(0.52f, -10.14f)
                lineToRelative(7.42f, 8.16f)
                curveToRelative(1.23f, 1.35f, 1.18f, 3.42f, -0.11f, 4.71f)
                close()
            }
        }.also { _NailClipper = it}
