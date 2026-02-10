package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TimeForward: ImageVector? = null

val Icons.Tr.TimeForward: ImageVector
    get() = _TimeForward ?: UXIcon(name = "TimeForward") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 6.5f)
                verticalLineToRelative(5.22f)
                lineToRelative(3.77f, 2.35f)
                curveToRelative(0.23f, 0.15f, 0.31f, 0.46f, 0.16f, 0.69f)
                curveToRelative(-0.1f, 0.15f, -0.26f, 0.23f, -0.42f, 0.23f)
                curveToRelative(-0.09f, 0f, -0.18f, -0.02f, -0.27f, -0.08f)
                lineToRelative(-4f, -2.5f)
                curveToRelative(-0.15f, -0.09f, -0.23f, -0.25f, -0.23f, -0.42f)
                verticalLineToRelative(-5.5f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                reflectiveCurveToRelative(0.5f, 0.22f, 0.5f, 0.5f)
                close()
                moveTo(17.5f, 8.5f)
                curveToRelative(0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                horizontalLineToRelative(4.5f)
                curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
                lineTo(24f, 3f)
                curveToRelative(0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f)
                reflectiveCurveToRelative(-0.5f, 0.22f, -0.5f, 0.5f)
                verticalLineToRelative(4.22f)
                curveTo(21.11f, 2.88f, 16.77f, 0f, 12f, 0f)
                curveTo(5.38f, 0f, 0f, 5.38f, 0f, 12f)
                reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
                curveToRelative(0.01f, 0f, 0.03f, 0f, 0.04f, 0f)
                horizontalLineToRelative(0.01f)
                curveToRelative(6.38f, -0.03f, 11.62f, -5.02f, 11.94f, -11.4f)
                curveToRelative(0.01f, -0.28f, -0.2f, -0.51f, -0.47f, -0.52f)
                curveToRelative(-0.28f, -0.03f, -0.51f, 0.2f, -0.52f, 0.47f)
                curveToRelative(-0.29f, 5.86f, -5.11f, 10.45f, -10.99f, 10.45f)
                curveToRelative(-6.07f, 0f, -11f, -4.93f, -11f, -11f)
                reflectiveCurveTo(5.93f, 1f, 12f, 1f)
                curveToRelative(4.51f, 0f, 8.6f, 2.81f, 10.24f, 7f)
                horizontalLineToRelative(-4.24f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                close()
            }
        }.also { _TimeForward = it}
