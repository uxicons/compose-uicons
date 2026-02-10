package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TimeCheck: ImageVector? = null

val Icons.Tr.TimeCheck: ImageVector
    get() = _TimeCheck ?: UXIcon(name = "TimeCheck") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 1f)
                curveTo(5.93f, 1f, 1f, 5.93f, 1f, 12f)
                curveToRelative(0f, 5.91f, 4.62f, 10.74f, 10.52f, 10.99f)
                curveToRelative(0.28f, 0.01f, 0.49f, 0.24f, 0.48f, 0.52f)
                curveToRelative(-0.01f, 0.27f, -0.23f, 0.48f, -0.5f, 0.48f)
                horizontalLineToRelative(-0.02f)
                curveToRelative(-6.44f, -0.28f, -11.48f, -5.54f, -11.48f, -11.99f)
                curveTo(0f, 5.38f, 5.38f, 0f, 12f, 0f)
                reflectiveCurveToRelative(12f, 5.38f, 12f, 12f)
                curveToRelative(0f, 0.88f, -0.1f, 1.76f, -0.28f, 2.61f)
                curveToRelative(-0.06f, 0.27f, -0.32f, 0.44f, -0.6f, 0.38f)
                curveToRelative(-0.27f, -0.06f, -0.44f, -0.33f, -0.38f, -0.6f)
                curveToRelative(0.17f, -0.78f, 0.26f, -1.58f, 0.26f, -2.39f)
                curveToRelative(0f, -6.07f, -4.93f, -11f, -11f, -11f)
                close()
                moveTo(11.5f, 6.02f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                verticalLineToRelative(5.2f)
                lineToRelative(-3.77f, 2.35f)
                curveToRelative(-0.23f, 0.15f, -0.3f, 0.46f, -0.16f, 0.69f)
                curveToRelative(0.1f, 0.15f, 0.26f, 0.23f, 0.42f, 0.23f)
                curveToRelative(0.09f, 0f, 0.18f, -0.02f, 0.27f, -0.08f)
                lineToRelative(4f, -2.5f)
                curveToRelative(0.15f, -0.09f, 0.23f, -0.25f, 0.23f, -0.42f)
                verticalLineToRelative(-5.48f)
                curveToRelative(0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f)
                close()
                moveTo(23.93f, 17.07f)
                curveToRelative(-0.2f, -0.19f, -0.52f, -0.19f, -0.71f, 0.01f)
                lineToRelative(-5.23f, 5.45f)
                curveToRelative(-0.28f, 0.29f, -0.66f, 0.46f, -1.06f, 0.46f)
                horizontalLineToRelative(-0.02f)
                curveToRelative(-0.4f, 0f, -0.77f, -0.15f, -1.05f, -0.43f)
                lineToRelative(-2.73f, -2.69f)
                curveToRelative(-0.2f, -0.19f, -0.51f, -0.19f, -0.71f, 0.0f)
                curveToRelative(-0.19f, 0.2f, -0.19f, 0.51f, 0.01f, 0.71f)
                lineToRelative(2.73f, 2.69f)
                curveToRelative(0.47f, 0.47f, 1.09f, 0.72f, 1.76f, 0.72f)
                horizontalLineToRelative(0.04f)
                curveToRelative(0.67f, -0.01f, 1.3f, -0.28f, 1.77f, -0.77f)
                lineToRelative(5.23f, -5.46f)
                curveToRelative(0.19f, -0.2f, 0.19f, -0.52f, -0.01f, -0.71f)
                close()
            }
        }.also { _TimeCheck = it}
