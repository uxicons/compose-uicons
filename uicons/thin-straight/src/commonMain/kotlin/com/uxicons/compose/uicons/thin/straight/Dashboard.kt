package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Dashboard: ImageVector? = null

val Icons.Ts.Dashboard: ImageVector
    get() = _Dashboard ?: UXIcon(name = "Dashboard") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 1f)
                curveTo(5.38f, 1f, 0f, 6.38f, 0f, 13f)
                curveToRelative(0f, 3.91f, 1.95f, 7.62f, 5.21f, 9.91f)
                lineToRelative(0.13f, 0.09f)
                horizontalLineToRelative(13.32f)
                lineToRelative(0.13f, -0.09f)
                curveToRelative(3.27f, -2.29f, 5.21f, -6.0f, 5.21f, -9.91f)
                curveToRelative(0f, -6.62f, -5.38f, -12f, -12f, -12f)
                close()
                moveTo(18.34f, 22f)
                lineTo(5.66f, 22f)
                curveToRelative(-2.88f, -2.08f, -4.66f, -5.52f, -4.66f, -9f)
                curveTo(1f, 6.93f, 5.93f, 2f, 12f, 2f)
                reflectiveCurveToRelative(11f, 4.93f, 11f, 11f)
                curveToRelative(0f, 3.48f, -1.78f, 6.92f, -4.66f, 9f)
                close()
                moveTo(17.97f, 7.74f)
                lineToRelative(-0.71f, -0.71f)
                lineToRelative(-4.25f, 4.25f)
                curveToRelative(-0.3f, -0.18f, -0.65f, -0.28f, -1.01f, -0.28f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                reflectiveCurveToRelative(0.9f, 2f, 2f, 2f)
                reflectiveCurveToRelative(2f, -0.9f, 2f, -2f)
                curveToRelative(0f, -0.37f, -0.1f, -0.72f, -0.28f, -1.01f)
                lineToRelative(4.25f, -4.25f)
                close()
                moveTo(12f, 14f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                close()
                moveTo(7.05f, 8.05f)
                curveToRelative(-2.73f, 2.73f, -2.73f, 7.17f, 0f, 9.9f)
                lineToRelative(-0.71f, 0.71f)
                curveToRelative(-3.12f, -3.12f, -3.12f, -8.2f, 0f, -11.31f)
                curveToRelative(2.5f, -2.5f, 6.26f, -2.99f, 9.26f, -1.48f)
                lineToRelative(-0.75f, 0.75f)
                curveToRelative(-2.57f, -1.14f, -5.69f, -0.67f, -7.8f, 1.44f)
                close()
                moveTo(17.66f, 18.66f)
                lineToRelative(-0.71f, -0.71f)
                curveToRelative(2.1f, -2.11f, 2.58f, -5.23f, 1.44f, -7.8f)
                lineToRelative(0.75f, -0.75f)
                curveToRelative(1.51f, 3f, 1.02f, 6.76f, -1.48f, 9.26f)
                close()
            }
        }.also { _Dashboard = it}
