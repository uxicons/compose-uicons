package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SensorOn: ImageVector? = null

val Icons.Rc.SensorOn: ImageVector
    get() = _SensorOn ?: UXIcon(name = "SensorOn") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(15.39f, 7.91f)
                curveToRelative(-0.12f, -0.03f, -3.02f, -0.84f, -6.43f, -0.84f)
                reflectiveCurveToRelative(-6.31f, 0.8f, -6.43f, 0.84f)
                curveToRelative(-0.33f, 0.09f, -0.59f, 0.35f, -0.69f, 0.67f)
                curveToRelative(-0.04f, 0.11f, -0.84f, 2.83f, -0.84f, 6.45f)
                curveToRelative(0f, 3.65f, 0.81f, 6.34f, 0.84f, 6.45f)
                curveToRelative(0.1f, 0.33f, 0.36f, 0.58f, 0.69f, 0.67f)
                curveToRelative(0.12f, 0.03f, 3.02f, 0.84f, 6.43f, 0.84f)
                reflectiveCurveToRelative(6.31f, -0.8f, 6.43f, -0.84f)
                curveToRelative(0.32f, -0.09f, 0.58f, -0.34f, 0.68f, -0.65f)
                curveToRelative(0.04f, -0.12f, 0.93f, -2.88f, 0.93f, -6.51f)
                curveToRelative(0f, -3.67f, -0.9f, -6.34f, -0.93f, -6.45f)
                curveToRelative(-0.1f, -0.31f, -0.36f, -0.55f, -0.68f, -0.64f)
                close()
                moveTo(14.32f, 20.37f)
                curveToRelative(-0.95f, 0.22f, -3.04f, 0.63f, -5.36f, 0.63f)
                curveToRelative(-2.3f, 0f, -4.39f, -0.41f, -5.35f, -0.63f)
                curveToRelative(-0.22f, -0.91f, -0.62f, -2.91f, -0.62f, -5.33f)
                curveToRelative(0f, -2.41f, 0.4f, -4.42f, 0.62f, -5.33f)
                curveToRelative(0.96f, -0.22f, 3.05f, -0.63f, 5.34f, -0.63f)
                curveToRelative(2.32f, 0f, 4.42f, 0.41f, 5.37f, 0.63f)
                curveToRelative(0.24f, 0.89f, 0.68f, 2.86f, 0.68f, 5.29f)
                reflectiveCurveToRelative(-0.45f, 4.45f, -0.68f, 5.37f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20.93f, 3.05f)
                curveToRelative(-1.32f, -1.32f, -3.15f, -2.05f, -5.16f, -2.05f)
                horizontalLineToRelative(-0.04f)
                curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -0.99f, 1.0f)
                curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1f, 1.0f)
                horizontalLineToRelative(0.03f)
                curveToRelative(1.47f, 0f, 2.8f, 0.52f, 3.74f, 1.46f)
                curveToRelative(0.97f, 0.97f, 1.49f, 2.34f, 1.49f, 3.86f)
                curveToRelative(-0.0f, 0.55f, 0.44f, 1.0f, 1f, 1.0f)
                curveToRelative(0.55f, 0f, 1.0f, -0.45f, 1f, -1.0f)
                curveToRelative(0.01f, -2.06f, -0.73f, -3.94f, -2.07f, -5.29f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(15.3f, 4.51f)
                horizontalLineToRelative(-0.02f)
                curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f)
                curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1f, 1.0f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.6f, -0.01f, 1.15f, 0.19f, 1.51f, 0.55f)
                curveToRelative(0.37f, 0.37f, 0.56f, 0.91f, 0.56f, 1.55f)
                curveToRelative(-0.0f, 0.55f, 0.48f, 1.0f, 1f, 1.0f)
                curveToRelative(0.55f, 0f, 1.0f, -0.45f, 1f, -1.0f)
                curveToRelative(0.01f, -1.18f, -0.4f, -2.23f, -1.15f, -2.98f)
                curveToRelative(-0.73f, -0.73f, -1.76f, -1.13f, -2.91f, -1.13f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(6.0f, 12.01f)
                moveToRelative(-1.0f, 0f)
                arcToRelative(1.0f, 1.0f, 0f, isMoreThanHalf = true, isPositiveArc = true, 1.99f, 0f)
                arcToRelative(1.0f, 1.0f, 0f, isMoreThanHalf = true, isPositiveArc = true, -1.99f, 0f)
            }
        }.also { _SensorOn = it}
