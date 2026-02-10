package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HairConditioner: ImageVector? = null

val Icons.Ss.HairConditioner: ImageVector
    get() = _HairConditioner ?: UXIcon(name = "HairConditioner") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(2f, 19f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(2.5f)
                curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
                horizontalLineToRelative(-5f)
                curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
                close()
                moveTo(0f, 1f)
                curveToRelative(0f, 4.54f, 1.31f, 12.91f, 1.82f, 16f)
                horizontalLineToRelative(10.37f)
                curveToRelative(0.51f, -3.09f, 1.82f, -11.46f, 1.82f, -16f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(-14.0f)
                close()
                moveTo(14.83f, 13f)
                curveToRelative(-0.23f, 1.58f, -0.45f, 2.97f, -0.62f, 4f)
                horizontalLineToRelative(3.79f)
                curveToRelative(1.63f, 0f, 3f, -1.34f, 3f, -2.93f)
                curveToRelative(0f, -1.07f, -0.3f, -1.52f, -0.9f, -2.32f)
                lineToRelative(-1.3f, -1.75f)
                lineToRelative(-0.91f, 1.44f)
                curveToRelative(-0.16f, 0.26f, -0.88f, 1.56f, -2.38f, 1.56f)
                close()
                moveTo(21.5f, 19f)
                horizontalLineToRelative(-7.5f)
                verticalLineToRelative(2.5f)
                curveToRelative(0f, 0.93f, -0.28f, 1.78f, -0.76f, 2.5f)
                horizontalLineToRelative(8.26f)
                curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
                reflectiveCurveToRelative(-1.12f, -2.5f, -2.5f, -2.5f)
                close()
            }
        }.also { _HairConditioner = it}
