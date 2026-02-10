package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Dashboard: ImageVector? = null

val Icons.Rc.Dashboard: ImageVector
    get() = _Dashboard ?: UXIcon(name = "Dashboard") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 1.99f)
                curveTo(6.88f, 1.99f, 1f, 3.24f, 1f, 12.99f)
                curveToRelative(0f, 3.08f, 0.56f, 5.42f, 1.72f, 7.18f)
                curveToRelative(0.13f, 0.19f, 0.32f, 0.34f, 0.54f, 0.4f)
                curveToRelative(3.02f, 0.95f, 5.96f, 1.43f, 8.75f, 1.43f)
                reflectiveCurveToRelative(5.72f, -0.48f, 8.74f, -1.43f)
                curveToRelative(0.22f, -0.07f, 0.41f, -0.21f, 0.53f, -0.4f)
                curveToRelative(1.16f, -1.76f, 1.73f, -4.11f, 1.73f, -7.19f)
                curveTo(23f, 3.24f, 17.12f, 1.99f, 12f, 1.99f)
                close()
                moveTo(19.79f, 18.78f)
                curveToRelative(-2.67f, 0.81f, -5.35f, 1.23f, -7.79f, 1.23f)
                curveToRelative(-3.03f, 0f, -5.86f, -0.65f, -7.8f, -1.23f)
                curveToRelative(-0.81f, -1.4f, -1.2f, -3.29f, -1.2f, -5.79f)
                curveTo(3f, 5.52f, 6.6f, 3.99f, 12f, 3.99f)
                reflectiveCurveToRelative(9f, 1.53f, 9f, 9f)
                curveToRelative(0f, 2.49f, -0.4f, 4.39f, -1.22f, 5.79f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(17.42f, 9.68f)
                curveToRelative(0.41f, -0.36f, 0.46f, -1.0f, 0.09f, -1.41f)
                curveToRelative(-0.36f, -0.41f, -1.0f, -0.46f, -1.41f, -0.09f)
                lineToRelative(-4.19f, 3.68f)
                curveToRelative(-0.06f, -0.01f, -0.12f, -0.01f, -0.17f, -0.01f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.49f)
                lineToRelative(4.19f, -3.67f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 7.99f)
                curveToRelative(0.42f, 0f, 0.82f, 0.01f, 1.19f, 0.03f)
                curveToRelative(0.55f, 0.03f, 1.02f, -0.4f, 1.05f, -0.95f)
                curveToRelative(0.03f, -0.55f, -0.4f, -1.02f, -0.95f, -1.05f)
                curveToRelative(-0.4f, -0.02f, -0.83f, -0.03f, -1.29f, -0.03f)
                curveToRelative(-4.74f, 0f, -7f, 1.05f, -7f, 7f)
                curveToRelative(0f, 1.41f, 0.14f, 2.6f, 0.42f, 3.56f)
                curveToRelative(0.13f, 0.44f, 0.53f, 0.72f, 0.96f, 0.72f)
                curveToRelative(0.09f, 0f, 0.19f, -0.01f, 0.28f, -0.04f)
                curveToRelative(0.53f, -0.16f, 0.83f, -0.71f, 0.68f, -1.24f)
                curveToRelative(-0.23f, -0.77f, -0.34f, -1.78f, -0.34f, -2.99f)
                curveToRelative(0f, -4.51f, 1.01f, -5f, 5f, -5f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(18.0f, 12.09f)
                horizontalLineToRelative(-0.01f)
                curveToRelative(-0.55f, 0f, -1.0f, 0.44f, -1f, 0.99f)
                curveToRelative(-0.01f, 1.17f, -0.12f, 2.15f, -0.35f, 2.9f)
                curveToRelative(-0.16f, 0.53f, 0.14f, 1.09f, 0.67f, 1.24f)
                curveToRelative(0.1f, 0.03f, 0.19f, 0.04f, 0.29f, 0.04f)
                curveToRelative(0.43f, 0f, 0.83f, -0.28f, 0.96f, -0.71f)
                curveToRelative(0.28f, -0.94f, 0.42f, -2.1f, 0.43f, -3.46f)
                curveToRelative(0.0f, -0.55f, -0.44f, -1.0f, -0.99f, -1.0f)
                close()
            }
        }.also { _Dashboard = it}
