package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _WaterDrop: ImageVector? = null

val Icons.Ss.WaterDrop: ImageVector
    get() = _WaterDrop ?: UXIcon(name = "WaterDrop") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(9.5f, 2.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
                close()
                moveTo(13.5f, 14f)
                curveToRelative(0f, -1.55f, 1.56f, -2.43f, 1.5f, -4f)
                curveToRelative(0f, -1.66f, -1.34f, -3f, -3f, -3f)
                reflectiveCurveToRelative(-3f, 1.34f, -3f, 3f)
                curveToRelative(-0.06f, 1.57f, 1.5f, 2.45f, 1.5f, 4f)
                curveToRelative(0f, 1f, -1.16f, 1.19f, -1.5f, 1.24f)
                curveToRelative(-2.21f, 0.35f, -4f, 1.04f, -4f, 1.76f)
                curveToRelative(0f, 1.04f, 3.69f, 2f, 7f, 2f)
                reflectiveCurveToRelative(6.5f, -0.96f, 6.5f, -2f)
                curveToRelative(0f, -0.71f, -1.49f, -1.38f, -3.5f, -1.74f)
                curveToRelative(-0.33f, -0.06f, -1.5f, -0.26f, -1.5f, -1.26f)
                close()
                moveTo(16.97f, 10.63f)
                curveToRelative(-0.16f, 1.19f, -0.71f, 1.96f, -1.19f, 2.74f)
                curveToRelative(3.08f, 0.64f, 5.22f, 2.02f, 5.22f, 3.63f)
                curveToRelative(0f, 2.21f, -4.03f, 4f, -9f, 4f)
                reflectiveCurveToRelative(-9f, -1.79f, -9f, -4f)
                curveToRelative(0f, -1.61f, 2.14f, -2.99f, 5.22f, -3.63f)
                curveToRelative(-0.47f, -0.78f, -1.01f, -1.52f, -1.18f, -2.74f)
                curveToRelative(-4.15f, 1.1f, -7.04f, 3.54f, -7.04f, 6.37f)
                curveToRelative(0f, 3.87f, 5.37f, 7f, 12f, 7f)
                reflectiveCurveToRelative(12f, -3.13f, 12f, -7f)
                curveToRelative(0f, -2.83f, -2.89f, -5.26f, -7.03f, -6.37f)
                close()
            }
        }.also { _WaterDrop = it}
