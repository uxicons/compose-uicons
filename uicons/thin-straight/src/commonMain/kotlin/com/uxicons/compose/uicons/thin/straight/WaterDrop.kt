package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _WaterDrop: ImageVector? = null

val Icons.Ts.WaterDrop: ImageVector
    get() = _WaterDrop ?: UXIcon(name = "WaterDrop") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 4f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                reflectiveCurveToRelative(-0.9f, -2f, -2f, -2f)
                reflectiveCurveToRelative(-2f, 0.9f, -2f, 2f)
                reflectiveCurveToRelative(0.9f, 2f, 2f, 2f)
                close()
                moveTo(12f, 1f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                close()
                moveTo(10f, 14f)
                curveToRelative(0f, 0.9f, -0.75f, 1.35f, -1.46f, 1.48f)
                curveToRelative(-1.62f, 0.28f, -3.54f, 0.86f, -3.54f, 2.06f)
                curveToRelative(0f, 1.6f, 3.61f, 2.46f, 7f, 2.46f)
                reflectiveCurveToRelative(7f, -0.86f, 7f, -2.46f)
                curveToRelative(0f, -1.19f, -1.88f, -1.77f, -3.48f, -2.05f)
                curveToRelative(-0.73f, -0.1f, -1.52f, -0.55f, -1.52f, -1.49f)
                curveToRelative(0f, -0.57f, 0.33f, -1.05f, 0.75f, -1.65f)
                curveToRelative(0.56f, -0.81f, 1.25f, -1.81f, 1.25f, -3.35f)
                curveToRelative(0f, -2.21f, -1.79f, -4f, -4f, -4f)
                reflectiveCurveToRelative(-4f, 1.79f, -4f, 4f)
                curveToRelative(-0.09f, 2.36f, 1.72f, 3.21f, 2f, 5f)
                close()
                moveTo(12f, 6f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                curveToRelative(0.06f, 2.21f, -1.91f, 2.97f, -2f, 5f)
                curveToRelative(0f, 1.29f, 0.96f, 2.29f, 2.36f, 2.48f)
                curveToRelative(2.01f, 0.36f, 2.64f, 0.9f, 2.64f, 1.06f)
                curveToRelative(0f, 0.37f, -2.06f, 1.46f, -6f, 1.46f)
                reflectiveCurveToRelative(-6f, -1.08f, -6f, -1.46f)
                curveToRelative(0f, -0.16f, 0.64f, -0.72f, 2.72f, -1.08f)
                curveToRelative(1.39f, -0.25f, 2.28f, -1.22f, 2.28f, -2.47f)
                curveToRelative(-0.1f, -2.03f, -2.06f, -2.79f, -2f, -5f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                close()
                moveTo(24f, 17.5f)
                curveToRelative(0f, 3.58f, -5.38f, 6.5f, -12f, 6.5f)
                reflectiveCurveToRelative(-12f, -2.92f, -12f, -6.5f)
                curveToRelative(0f, -2.52f, 2.67f, -4.71f, 6.57f, -5.79f)
                curveToRelative(0.15f, 0.34f, 0.32f, 0.65f, 0.48f, 0.92f)
                curveToRelative(-3.52f, 0.94f, -6.05f, 2.81f, -6.05f, 4.86f)
                curveToRelative(0f, 2.93f, 5.14f, 5.5f, 11f, 5.5f)
                reflectiveCurveToRelative(11f, -2.57f, 11f, -5.5f)
                curveToRelative(0f, -2.05f, -2.52f, -3.92f, -6.05f, -4.86f)
                curveToRelative(0.17f, -0.28f, 0.33f, -0.58f, 0.48f, -0.92f)
                curveToRelative(3.89f, 1.08f, 6.57f, 3.26f, 6.57f, 5.79f)
                close()
            }
        }.also { _WaterDrop = it}
