package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _AlarmClock: ImageVector? = null

val Icons.Sc.AlarmClock: ImageVector
    get() = _AlarmClock ?: UXIcon(name = "AlarmClock") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(3.81f, 6.32f)
                curveToRelative(0.62f, -1.11f, 1.59f, -1.88f, 2.87f, -2.29f)
                curveToRelative(0.79f, -0.26f, 1.22f, -1.1f, 0.96f, -1.89f)
                curveToRelative(-0.26f, -0.79f, -1.1f, -1.22f, -1.89f, -0.96f)
                curveToRelative(-1.99f, 0.65f, -3.57f, 1.92f, -4.56f, 3.68f)
                curveToRelative(-0.41f, 0.72f, -0.15f, 1.64f, 0.57f, 2.04f)
                curveToRelative(0.23f, 0.13f, 0.48f, 0.19f, 0.73f, 0.19f)
                curveToRelative(0.52f, 0f, 1.03f, -0.28f, 1.31f, -0.77f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22.81f, 4.85f)
                curveToRelative(-0.99f, -1.76f, -2.57f, -3.03f, -4.56f, -3.68f)
                curveToRelative(-0.79f, -0.25f, -1.63f, 0.17f, -1.89f, 0.96f)
                curveToRelative(-0.26f, 0.79f, 0.17f, 1.63f, 0.96f, 1.89f)
                curveToRelative(1.28f, 0.42f, 2.25f, 1.19f, 2.87f, 2.29f)
                curveToRelative(0.28f, 0.49f, 0.79f, 0.77f, 1.31f, 0.77f)
                curveToRelative(0.25f, 0f, 0.5f, -0.06f, 0.73f, -0.19f)
                curveToRelative(0.72f, -0.41f, 0.98f, -1.32f, 0.57f, -2.04f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19.42f, 18.3f)
                curveToRelative(0.72f, -1.29f, 1.12f, -2.92f, 1.15f, -4.87f)
                curveToRelative(-0.09f, -4.93f, -2.58f, -7.88f, -7.07f, -8.43f)
                verticalLineToRelative(-2.49f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                verticalLineToRelative(2.48f)
                curveToRelative(-4.55f, 0.53f, -7.07f, 3.56f, -7.07f, 8.43f)
                curveToRelative(0f, 1.93f, 0.4f, 3.56f, 1.15f, 4.87f)
                lineToRelative(-2.14f, 2.13f)
                curveToRelative(-0.59f, 0.58f, -0.59f, 1.53f, -0.0f, 2.12f)
                curveToRelative(0.29f, 0.29f, 0.68f, 0.44f, 1.06f, 0.44f)
                reflectiveCurveToRelative(0.77f, -0.15f, 1.06f, -0.44f)
                lineToRelative(2.06f, -2.05f)
                curveToRelative(1.38f, 0.95f, 3.19f, 1.47f, 5.39f, 1.48f)
                curveToRelative(2.23f, -0.01f, 4.03f, -0.51f, 5.4f, -1.46f)
                lineToRelative(2.04f, 2.03f)
                curveToRelative(0.29f, 0.29f, 0.68f, 0.44f, 1.06f, 0.44f)
                reflectiveCurveToRelative(0.77f, -0.15f, 1.06f, -0.44f)
                curveToRelative(0.58f, -0.59f, 0.58f, -1.54f, -0.0f, -2.12f)
                lineToRelative(-2.14f, -2.13f)
                close()
                moveTo(14.19f, 15.7f)
                curveToRelative(-0.2f, 0.2f, -0.46f, 0.3f, -0.72f, 0.3f)
                curveToRelative(-0.26f, 0f, -0.52f, -0.1f, -0.71f, -0.29f)
                lineToRelative(-1.47f, -1.45f)
                curveToRelative(-0.19f, -0.19f, -0.3f, -0.45f, -0.3f, -0.72f)
                verticalLineToRelative(-3.68f)
                curveToRelative(0f, -0.56f, 0.45f, -1.01f, 1.01f, -1.01f)
                reflectiveCurveToRelative(1.01f, 0.45f, 1.01f, 1.01f)
                verticalLineToRelative(3.26f)
                lineToRelative(1.17f, 1.16f)
                curveToRelative(0.4f, 0.39f, 0.4f, 1.03f, 0.01f, 1.43f)
                close()
            }
        }.also { _AlarmClock = it}
