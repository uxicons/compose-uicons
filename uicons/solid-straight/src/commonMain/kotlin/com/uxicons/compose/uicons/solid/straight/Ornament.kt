package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Ornament: ImageVector? = null

val Icons.Ss.Ornament: ImageVector
    get() = _Ornament ?: UXIcon(name = "Ornament") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22f, 14f)
                curveToRelative(0f, 0.55f, -0.06f, 1.08f, -0.14f, 1.6f)
                lineToRelative(-5.01f, -5.01f)
                lineToRelative(-4.89f, 4.89f)
                lineToRelative(-4.66f, -4.66f)
                lineToRelative(-5.11f, 5.11f)
                curveToRelative(-0.12f, -0.62f, -0.19f, -1.27f, -0.19f, -1.93f)
                curveToRelative(0f, -4.09f, 2.47f, -7.61f, 6f, -9.16f)
                verticalLineToRelative(-1.84f)
                horizontalLineToRelative(2.27f)
                curveToRelative(-0.17f, -0.29f, -0.28f, -0.63f, -0.28f, -1f)
                curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
                curveToRelative(0f, 0.37f, -0.11f, 0.7f, -0.28f, 1f)
                horizontalLineToRelative(2.28f)
                verticalLineToRelative(1.84f)
                curveToRelative(3.53f, 1.55f, 6f, 5.07f, 6f, 9.16f)
                close()
                moveTo(11.96f, 18.31f)
                lineToRelative(-4.66f, -4.66f)
                lineToRelative(-4.42f, 4.42f)
                curveToRelative(1.56f, 3.49f, 5.06f, 5.93f, 9.12f, 5.93f)
                curveToRelative(4.17f, 0f, 7.74f, -2.56f, 9.24f, -6.19f)
                lineToRelative(-4.39f, -4.39f)
                lineToRelative(-4.89f, 4.89f)
                close()
            }
        }.also { _Ornament = it}
