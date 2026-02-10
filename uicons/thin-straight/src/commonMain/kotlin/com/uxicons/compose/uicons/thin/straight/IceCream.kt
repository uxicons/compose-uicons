package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _IceCream: ImageVector? = null

val Icons.Ts.IceCream: ImageVector
    get() = _IceCream ?: UXIcon(name = "IceCream") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(16.9f, 4.0f)
                curveToRelative(-0.46f, -2.28f, -2.48f, -4.0f, -4.9f, -4.0f)
                reflectiveCurveToRelative(-4.44f, 1.72f, -4.9f, 4.0f)
                curveToRelative(-2.83f, 0.08f, -5.1f, 2.4f, -5.1f, 5.25f)
                curveToRelative(0f, 0.91f, 0.24f, 1.8f, 0.76f, 2.68f)
                lineToRelative(9.24f, 12.08f)
                lineToRelative(9.27f, -12.13f)
                curveToRelative(0.48f, -0.83f, 0.73f, -1.71f, 0.73f, -2.63f)
                curveToRelative(0f, -2.84f, -2.27f, -5.17f, -5.1f, -5.25f)
                close()
                moveTo(21f, 9.25f)
                curveToRelative(0f, 0.25f, -0.02f, 0.5f, -0.07f, 0.75f)
                horizontalLineToRelative(-8.36f)
                curveToRelative(-0.05f, -0.25f, -0.07f, -0.5f, -0.07f, -0.75f)
                curveToRelative(0f, -2.34f, 1.91f, -4.25f, 4.25f, -4.25f)
                reflectiveCurveToRelative(4.25f, 1.91f, 4.25f, 4.25f)
                close()
                moveTo(12f, 1f)
                curveToRelative(1.89f, 0f, 3.47f, 1.31f, 3.89f, 3.07f)
                curveToRelative(-1.72f, 0.28f, -3.17f, 1.41f, -3.89f, 2.94f)
                curveToRelative(-0.72f, -1.53f, -2.17f, -2.66f, -3.89f, -2.94f)
                curveToRelative(0.42f, -1.76f, 2.0f, -3.07f, 3.89f, -3.07f)
                close()
                moveTo(7.25f, 5f)
                curveToRelative(2.34f, 0f, 4.25f, 1.91f, 4.25f, 4.25f)
                curveToRelative(0f, 0.25f, -0.02f, 0.5f, -0.07f, 0.75f)
                lineTo(3.07f, 10f)
                curveToRelative(-0.05f, -0.25f, -0.07f, -0.5f, -0.07f, -0.75f)
                curveToRelative(0f, -2.34f, 1.91f, -4.25f, 4.25f, -4.25f)
                close()
                moveTo(12f, 22.36f)
                lineTo(3.59f, 11.37f)
                curveToRelative(-0.07f, -0.12f, -0.14f, -0.25f, -0.2f, -0.37f)
                horizontalLineToRelative(17.21f)
                curveToRelative(-0.05f, 0.11f, -0.11f, 0.22f, -0.17f, 0.32f)
                lineToRelative(-8.44f, 11.04f)
                close()
            }
        }.also { _IceCream = it}
