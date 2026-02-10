package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _WaterDrop: ImageVector? = null

val Icons.Sr.WaterDrop: ImageVector
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
                moveTo(16.68f, 11.75f)
                curveToRelative(-0.04f, 0.1f, -0.08f, 0.2f, -0.13f, 0.29f)
                curveToRelative(-0.32f, 0.68f, -0.01f, 1.49f, 0.7f, 1.72f)
                curveToRelative(2.27f, 0.72f, 3.75f, 1.91f, 3.75f, 3.24f)
                curveToRelative(0f, 2.21f, -4.03f, 4f, -9f, 4f)
                reflectiveCurveToRelative(-9f, -1.79f, -9f, -4f)
                curveToRelative(0f, -1.34f, 1.48f, -2.52f, 3.75f, -3.24f)
                curveToRelative(0.71f, -0.23f, 1.01f, -1.04f, 0.7f, -1.72f)
                curveToRelative(-0.04f, -0.09f, -0.09f, -0.19f, -0.12f, -0.29f)
                curveToRelative(-0.24f, -0.62f, -0.94f, -0.94f, -1.57f, -0.72f)
                curveToRelative(-3.45f, 1.23f, -5.75f, 3.44f, -5.75f, 5.97f)
                curveToRelative(0f, 3.87f, 5.37f, 7f, 12f, 7f)
                reflectiveCurveToRelative(12f, -3.13f, 12f, -7f)
                curveToRelative(0f, -2.53f, -2.3f, -4.74f, -5.75f, -5.97f)
                curveToRelative(-0.63f, -0.22f, -1.32f, 0.1f, -1.57f, 0.71f)
                close()
            }
        }.also { _WaterDrop = it}
