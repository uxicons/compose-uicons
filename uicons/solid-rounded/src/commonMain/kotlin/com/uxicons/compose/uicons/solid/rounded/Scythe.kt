package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Scythe: ImageVector? = null

val Icons.Sr.Scythe: ImageVector
    get() = _Scythe ?: UXIcon(name = "Scythe") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.48f, 1.04f)
                curveToRelative(-0.49f, -0.66f, -1.25f, -1.04f, -2.08f, -1.04f)
                horizontalLineToRelative(-5.56f)
                curveTo(9.72f, 0f, 4.52f, 2.5f, 0.37f, 7.42f)
                curveToRelative(-0.46f, 0.55f, -0.5f, 1.31f, -0.09f, 1.9f)
                curveToRelative(0.41f, 0.59f, 1.13f, 0.82f, 1.81f, 0.59f)
                curveToRelative(0.29f, -0.1f, 0.6f, -0.22f, 0.94f, -0.34f)
                curveToRelative(1.77f, -0.66f, 4.19f, -1.56f, 6.71f, -1.56f)
                horizontalLineToRelative(10.67f)
                lineToRelative(-1.49f, 5f)
                horizontalLineToRelative(-5.93f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(5.33f)
                lineToRelative(-2.29f, 7.71f)
                curveToRelative(-0.16f, 0.53f, 0.14f, 1.09f, 0.67f, 1.24f)
                curveToRelative(0.1f, 0.03f, 0.19f, 0.04f, 0.28f, 0.04f)
                curveToRelative(0.43f, 0f, 0.83f, -0.28f, 0.96f, -0.71f)
                lineTo(23.89f, 3.33f)
                curveToRelative(0.23f, -0.79f, 0.09f, -1.62f, -0.41f, -2.29f)
                close()
            }
        }.also { _Scythe = it}
