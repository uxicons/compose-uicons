package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Cannon: ImageVector? = null

val Icons.Ss.Cannon: ImageVector
    get() = _Cannon ?: UXIcon(name = "Cannon") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(0f, 3f)
                lineTo(0f, 1f)
                curveToRelative(4.24f, 0f, 7.62f, 2.52f, 8.69f, 6.3f)
                lineTo(19.34f, 1.45f)
                lineToRelative(4.68f, 6.61f)
                lineToRelative(-5.3f, 4.8f)
                curveToRelative(-0.95f, -0.54f, -2.05f, -0.86f, -3.22f, -0.86f)
                curveToRelative(-2.79f, 0f, -5.17f, 1.77f, -6.09f, 4.24f)
                lineToRelative(-4.75f, -6.74f)
                lineToRelative(2.21f, -1.22f)
                curveTo(6.19f, 5.1f, 3.53f, 3f, 0f, 3f)
                close()
                moveTo(20f, 18.5f)
                curveToRelative(0f, 2.48f, -2.02f, 4.5f, -4.5f, 4.5f)
                reflectiveCurveToRelative(-4.5f, -2.02f, -4.5f, -4.5f)
                reflectiveCurveToRelative(2.02f, -4.5f, 4.5f, -4.5f)
                reflectiveCurveToRelative(4.5f, 2.02f, 4.5f, 4.5f)
                close()
                moveTo(17f, 18.5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                close()
                moveTo(2.9f, 10.48f)
                lineToRelative(-0.25f, 0.14f)
                curveTo(1.28f, 11.58f, 0.37f, 13.02f, 0.09f, 14.68f)
                curveToRelative(-0.28f, 1.65f, 0.1f, 3.31f, 1.06f, 4.68f)
                curveToRelative(1.22f, 1.72f, 3.16f, 2.64f, 5.12f, 2.64f)
                curveToRelative(1.12f, 0f, 2.24f, -0.32f, 3.25f, -0.93f)
                curveToRelative(-0.25f, -0.59f, -0.42f, -1.22f, -0.49f, -1.88f)
                lineTo(2.9f, 10.48f)
                close()
            }
        }.also { _Cannon = it}
