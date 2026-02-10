package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HoodCloak: ImageVector? = null

val Icons.Ts.HoodCloak: ImageVector
    get() = _HoodCloak ?: UXIcon(name = "HoodCloak") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 6f)
                curveToRelative(-3.86f, 0f, -7f, 3.14f, -7f, 7f)
                curveToRelative(0f, 5.68f, 6.43f, 10.59f, 6.7f, 10.8f)
                lineToRelative(0.3f, 0.23f)
                lineToRelative(0.3f, -0.23f)
                curveToRelative(0.27f, -0.21f, 6.7f, -5.11f, 6.7f, -10.8f)
                curveToRelative(0f, -3.86f, -3.14f, -7f, -7f, -7f)
                close()
                moveTo(12f, 22.76f)
                curveToRelative(-1.25f, -1.03f, -6f, -5.24f, -6f, -9.76f)
                curveToRelative(0f, -3.31f, 2.69f, -6f, 6f, -6f)
                reflectiveCurveToRelative(6f, 2.69f, 6f, 6f)
                curveToRelative(0f, 4.52f, -4.75f, 8.72f, -6f, 9.76f)
                close()
                moveTo(20.62f, 22.98f)
                horizontalLineToRelative(3.38f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-5.3f)
                lineToRelative(0.56f, -0.79f)
                curveToRelative(2.85f, -3.99f, 3.93f, -7.39f, 3.72f, -11.71f)
                horizontalLineToRelative(-0.02f)
                curveToRelative(-0.09f, -1.81f, -0.49f, -3.38f, -1.17f, -4.56f)
                curveToRelative(-0.39f, -0.67f, -0.83f, -1.55f, -0.8f, -2.49f)
                curveToRelative(0.04f, -1.32f, 0.56f, -2.65f, 0.93f, -3.44f)
                curveToRelative(-1.58f, -0.01f, -8.6f, 0.01f, -8.6f, 0.01f)
                curveToRelative(-0.73f, 0.01f, -1.38f, 0.01f, -1.88f, 0.04f)
                curveTo(5.9f, 1.31f, 1.33f, 5.86f, 1.04f, 11.39f)
                curveToRelative(-0.23f, 4.37f, 0.85f, 7.79f, 3.72f, 11.8f)
                lineToRelative(0.56f, 0.79f)
                lineTo(0f, 23.98f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(3.39f)
                curveTo(0.79f, 19.1f, -0.19f, 15.66f, 0.04f, 11.34f)
                curveTo(0.35f, 5.3f, 5.34f, 0.34f, 11.4f, 0.04f)
                curveToRelative(0.51f, -0.03f, 1.17f, -0.03f, 1.92f, -0.04f)
                horizontalLineToRelative(10.29f)
                reflectiveCurveToRelative(-0.44f, 0.75f, -0.44f, 0.75f)
                curveToRelative(-0.01f, 0.02f, -1.11f, 1.92f, -1.17f, 3.72f)
                curveToRelative(-0.02f, 0.68f, 0.34f, 1.4f, 0.66f, 1.95f)
                curveToRelative(0.75f, 1.29f, 1.19f, 2.99f, 1.3f, 4.92f)
                horizontalLineToRelative(0.02f)
                curveToRelative(0.23f, 4.32f, -0.75f, 7.76f, -3.35f, 11.64f)
                close()
            }
        }.also { _HoodCloak = it}
