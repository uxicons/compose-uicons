package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SteeringWheel: ImageVector? = null

val Icons.Ts.SteeringWheel: ImageVector
    get() = _SteeringWheel ?: UXIcon(name = "SteeringWheel") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 0f)
                curveTo(5.38f, 0f, 0f, 5.38f, 0f, 12f)
                reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
                reflectiveCurveToRelative(12f, -5.38f, 12f, -12f)
                reflectiveCurveTo(18.62f, 0f, 12f, 0f)
                close()
                moveTo(12f, 1f)
                curveToRelative(4.35f, 0f, 8.12f, 2.54f, 9.9f, 6.21f)
                lineToRelative(-8.11f, 1.62f)
                curveToRelative(-1.24f, 0.25f, -2.49f, 0.25f, -3.73f, 0f)
                lineToRelative(-7.98f, -1.6f)
                curveTo(3.87f, 3.55f, 7.64f, 1f, 12f, 1f)
                close()
                moveTo(1.01f, 12.52f)
                lineToRelative(4.55f, 0.91f)
                curveToRelative(1.02f, 0.2f, 1.9f, 0.85f, 2.39f, 1.77f)
                lineToRelative(0.62f, 1.15f)
                curveToRelative(0.28f, 0.51f, 0.42f, 1.09f, 0.42f, 1.67f)
                verticalLineToRelative(4.57f)
                curveToRelative(-4.45f, -1.26f, -7.76f, -5.27f, -7.99f, -10.07f)
                close()
                moveTo(10f, 22.82f)
                verticalLineToRelative(-4.8f)
                curveToRelative(0f, -0.75f, -0.19f, -1.49f, -0.54f, -2.14f)
                lineToRelative(-0.62f, -1.15f)
                curveToRelative(-0.64f, -1.18f, -1.76f, -2.01f, -3.08f, -2.27f)
                lineToRelative(-4.75f, -0.95f)
                curveToRelative(0.05f, -1.16f, 0.29f, -2.28f, 0.68f, -3.33f)
                lineToRelative(8.18f, 1.64f)
                curveToRelative(0.68f, 0.14f, 1.37f, 0.2f, 2.06f, 0.2f)
                reflectiveCurveToRelative(1.38f, -0.07f, 2.06f, -0.2f)
                lineToRelative(8.31f, -1.66f)
                curveToRelative(0.39f, 1.05f, 0.63f, 2.18f, 0.69f, 3.35f)
                lineToRelative(-4.75f, 0.95f)
                curveToRelative(-1.31f, 0.26f, -2.44f, 1.09f, -3.07f, 2.27f)
                lineToRelative(-0.62f, 1.15f)
                curveToRelative(-0.35f, 0.66f, -0.54f, 1.4f, -0.54f, 2.14f)
                verticalLineToRelative(4.8f)
                curveToRelative(-0.65f, 0.12f, -1.32f, 0.18f, -2f, 0.18f)
                reflectiveCurveToRelative(-1.35f, -0.06f, -2f, -0.18f)
                close()
                moveTo(15f, 22.58f)
                verticalLineToRelative(-4.57f)
                curveToRelative(0f, -0.58f, 0.15f, -1.16f, 0.42f, -1.67f)
                lineToRelative(0.62f, -1.15f)
                curveToRelative(0.5f, -0.92f, 1.37f, -1.56f, 2.39f, -1.77f)
                lineToRelative(4.55f, -0.91f)
                curveToRelative(-0.22f, 4.8f, -3.54f, 8.8f, -7.99f, 10.07f)
                close()
            }
        }.also { _SteeringWheel = it}
