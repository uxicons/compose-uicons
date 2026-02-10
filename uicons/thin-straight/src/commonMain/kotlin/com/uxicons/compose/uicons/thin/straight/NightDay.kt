package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _NightDay: ImageVector? = null

val Icons.Ts.NightDay: ImageVector
    get() = _NightDay ?: UXIcon(name = "NightDay") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.95f, 0.75f)
                lineTo(0.75f, 23.95f)
                lineToRelative(-0.71f, -0.71f)
                lineTo(23.25f, 0.05f)
                lineToRelative(0.71f, 0.71f)
                close()
                moveTo(4.56f, 13.73f)
                lineToRelative(-2.42f, 2.42f)
                lineToRelative(0.71f, 0.71f)
                lineToRelative(3.11f, -3.11f)
                lineToRelative(-0.35f, -0.35f)
                curveToRelative(-1.04f, -1.04f, -1.61f, -2.42f, -1.61f, -3.89f)
                reflectiveCurveToRelative(0.57f, -2.85f, 1.61f, -3.89f)
                curveToRelative(2.15f, -2.15f, 5.63f, -2.15f, 7.78f, 0f)
                lineToRelative(0.35f, 0.35f)
                lineToRelative(3.11f, -3.11f)
                lineToRelative(-0.71f, -0.71f)
                lineToRelative(-2.42f, 2.42f)
                curveToRelative(-1.08f, -0.93f, -2.39f, -1.41f, -3.73f, -1.52f)
                lineTo(10f, 0f)
                horizontalLineToRelative(-1f)
                lineTo(9f, 3.04f)
                curveToRelative(-1.33f, 0.1f, -2.63f, 0.62f, -3.71f, 1.54f)
                lineTo(2.85f, 2.15f)
                lineToRelative(-0.71f, 0.71f)
                lineToRelative(2.42f, 2.42f)
                curveToRelative(-0.9f, 1.05f, -1.44f, 2.34f, -1.54f, 3.72f)
                lineTo(0.0f, 8.99f)
                lineToRelative(-0.0f, 1f)
                lineToRelative(3.05f, 0.01f)
                curveToRelative(0.1f, 1.38f, 0.62f, 2.68f, 1.52f, 3.73f)
                close()
                moveTo(23.07f, 10.36f)
                lineToRelative(0.77f, -0.36f)
                lineToRelative(-0.69f, -0.49f)
                curveToRelative(-1.1f, -0.79f, -2.37f, -1.26f, -3.69f, -1.43f)
                lineToRelative(-0.93f, 0.93f)
                curveToRelative(1.18f, 0.01f, 2.32f, 0.3f, 3.35f, 0.87f)
                curveToRelative(-2.08f, 1.32f, -3.38f, 3.64f, -3.38f, 6.12f)
                reflectiveCurveToRelative(1.3f, 4.81f, 3.38f, 6.12f)
                curveToRelative(-1.03f, 0.58f, -2.19f, 0.88f, -3.38f, 0.88f)
                curveToRelative(-3.85f, 0f, -6.98f, -3.12f, -7.0f, -6.97f)
                lineToRelative(-0.94f, 0.94f)
                curveToRelative(0.48f, 3.95f, 3.85f, 7.03f, 7.93f, 7.03f)
                curveToRelative(1.68f, 0f, 3.28f, -0.52f, 4.65f, -1.5f)
                lineToRelative(0.69f, -0.49f)
                lineToRelative(-0.77f, -0.36f)
                curveToRelative(-2.17f, -1.03f, -3.58f, -3.25f, -3.58f, -5.64f)
                reflectiveCurveToRelative(1.4f, -4.61f, 3.58f, -5.64f)
                close()
            }
        }.also { _NightDay = it}
