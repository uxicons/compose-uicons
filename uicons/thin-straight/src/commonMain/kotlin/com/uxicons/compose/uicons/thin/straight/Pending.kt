package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Pending: ImageVector? = null

val Icons.Ts.Pending: ImageVector
    get() = _Pending ?: UXIcon(name = "Pending") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21.5f, 7f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(4.69f)
                curveToRelative(-2.02f, -3.09f, -5.47f, -5f, -9.19f, -5f)
                curveTo(5.93f, 1f, 1f, 5.93f, 1f, 12f)
                reflectiveCurveToRelative(4.93f, 11f, 11f, 11f)
                curveToRelative(0.05f, 0f, 1.38f, -0.07f, 1.97f, -0.18f)
                lineToRelative(0.18f, 0.98f)
                curveToRelative(-0.44f, 0.08f, -1.65f, 0.19f, -2.15f, 0.19f)
                curveTo(5.38f, 24f, 0f, 18.62f, 0f, 12f)
                reflectiveCurveTo(5.38f, 0f, 12f, 0f)
                curveToRelative(4.04f, 0f, 7.79f, 2.07f, 10f, 5.41f)
                lineTo(22f, 0.5f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(5f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                close()
                moveTo(19.1f, 20.4f)
                lineToRelative(0.65f, 0.76f)
                curveToRelative(0.53f, -0.45f, 1.02f, -0.95f, 1.47f, -1.48f)
                lineToRelative(-0.77f, -0.64f)
                curveToRelative(-0.41f, 0.48f, -0.86f, 0.94f, -1.35f, 1.35f)
                close()
                moveTo(15.81f, 22.32f)
                lineToRelative(0.35f, 0.94f)
                curveToRelative(0.65f, -0.24f, 1.28f, -0.54f, 1.88f, -0.89f)
                lineToRelative(-0.5f, -0.86f)
                curveToRelative(-0.55f, 0.32f, -1.13f, 0.6f, -1.73f, 0.81f)
                close()
                moveTo(23.0f, 12f)
                curveToRelative(0f, 0.64f, -0.06f, 1.28f, -0.16f, 1.9f)
                lineToRelative(0.98f, 0.17f)
                curveToRelative(0.12f, -0.68f, 0.18f, -1.38f, 0.18f, -2.08f)
                horizontalLineToRelative(-1f)
                close()
                moveTo(21.54f, 17.48f)
                lineToRelative(0.87f, 0.5f)
                curveToRelative(0.35f, -0.6f, 0.64f, -1.24f, 0.88f, -1.89f)
                lineToRelative(-0.94f, -0.34f)
                curveToRelative(-0.22f, 0.6f, -0.49f, 1.18f, -0.81f, 1.73f)
                close()
                moveTo(11.5f, 5.04f)
                verticalLineToRelative(7.28f)
                lineToRelative(5.24f, 3.15f)
                lineToRelative(0.51f, -0.86f)
                lineToRelative(-4.76f, -2.85f)
                verticalLineToRelative(-6.72f)
                horizontalLineToRelative(-1f)
                close()
            }
        }.also { _Pending = it}
