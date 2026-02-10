package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SteeringWheel: ImageVector? = null

val Icons.Tr.SteeringWheel: ImageVector
    get() = _SteeringWheel ?: UXIcon(name = "SteeringWheel") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24.0f, 11.72f)
                curveToRelative(-0.15f, -6.49f, -5.47f, -11.72f, -12.0f, -11.72f)
                reflectiveCurveTo(0.15f, 5.23f, 0.0f, 11.72f)
                curveToRelative(-0.01f, 0.02f, -0.03f, 0.24f, -0.0f, 0.32f)
                curveToRelative(0.02f, 6.6f, 5.4f, 11.96f, 12.0f, 11.96f)
                reflectiveCurveToRelative(11.97f, -5.36f, 12.0f, -11.96f)
                curveToRelative(0.03f, -0.08f, 0.01f, -0.3f, -0.0f, -0.32f)
                close()
                moveTo(12f, 1f)
                curveToRelative(4.34f, 0f, 8.11f, 2.53f, 9.89f, 6.2f)
                lineToRelative(-8.1f, 1.62f)
                curveToRelative(-1.24f, 0.25f, -2.49f, 0.25f, -3.73f, 0f)
                lineToRelative(-7.97f, -1.59f)
                curveTo(3.88f, 3.54f, 7.65f, 1f, 12f, 1f)
                close()
                moveTo(1.01f, 12.51f)
                lineToRelative(4.55f, 0.91f)
                curveToRelative(1.02f, 0.2f, 1.89f, 0.85f, 2.39f, 1.77f)
                lineToRelative(0.62f, 1.15f)
                curveToRelative(0.28f, 0.51f, 0.42f, 1.09f, 0.42f, 1.67f)
                verticalLineToRelative(4.58f)
                curveToRelative(-4.46f, -1.26f, -7.77f, -5.28f, -7.99f, -10.08f)
                close()
                moveTo(10f, 22.82f)
                verticalLineToRelative(-4.82f)
                curveToRelative(0f, -0.74f, -0.19f, -1.49f, -0.54f, -2.14f)
                lineToRelative(-0.62f, -1.15f)
                curveToRelative(-0.64f, -1.18f, -1.76f, -2.01f, -3.07f, -2.27f)
                lineToRelative(-4.75f, -0.95f)
                curveToRelative(0.05f, -1.16f, 0.29f, -2.28f, 0.68f, -3.33f)
                lineToRelative(8.18f, 1.64f)
                curveToRelative(0.68f, 0.14f, 1.37f, 0.2f, 2.06f, 0.2f)
                reflectiveCurveToRelative(1.38f, -0.07f, 2.06f, -0.2f)
                lineToRelative(8.31f, -1.66f)
                curveToRelative(0.4f, 1.05f, 0.64f, 2.18f, 0.69f, 3.35f)
                lineToRelative(-4.75f, 0.95f)
                curveToRelative(-1.31f, 0.26f, -2.44f, 1.09f, -3.08f, 2.27f)
                lineToRelative(-0.62f, 1.15f)
                curveToRelative(-0.35f, 0.66f, -0.54f, 1.4f, -0.54f, 2.14f)
                verticalLineToRelative(4.82f)
                curveToRelative(-0.65f, 0.12f, -1.32f, 0.18f, -2f, 0.18f)
                reflectiveCurveToRelative(-1.35f, -0.06f, -2f, -0.18f)
                close()
                moveTo(15f, 22.58f)
                verticalLineToRelative(-4.58f)
                curveToRelative(0f, -0.58f, 0.15f, -1.16f, 0.42f, -1.67f)
                lineToRelative(0.62f, -1.15f)
                curveToRelative(0.5f, -0.92f, 1.37f, -1.56f, 2.39f, -1.77f)
                lineToRelative(4.55f, -0.91f)
                curveToRelative(-0.22f, 4.8f, -3.53f, 8.81f, -7.99f, 10.08f)
                close()
            }
        }.also { _SteeringWheel = it}
