package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Clock: ImageVector? = null

val Icons.Tc.Clock: ImageVector
    get() = _Clock ?: UXIcon(name = "Clock") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12.0f, 1f)
                curveTo(4.95f, 1.04f, 1.03f, 5.03f, 1.03f, 11.99f)
                curveToRelative(0f, 7.03f, 3.82f, 10.97f, 10.98f, 11.01f)
                curveToRelative(7.15f, -0.04f, 10.84f, -3.74f, 10.97f, -11.01f)
                curveToRelative(-0.12f, -7.04f, -4.02f, -10.95f, -10.98f, -10.99f)
                close()
                moveTo(12.0f, 22f)
                curveToRelative(-6.59f, -0.04f, -9.85f, -3.31f, -9.98f, -10f)
                curveToRelative(0.12f, -6.59f, 3.48f, -9.96f, 9.97f, -10f)
                curveToRelative(4.47f, 0.03f, 9.84f, 1.79f, 9.98f, 9.99f)
                curveToRelative(-0.12f, 6.7f, -3.39f, 9.97f, -9.97f, 10.01f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(12.5f, 11.79f)
                verticalLineTo(7.38f)
                curveToRelative(0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f)
                reflectiveCurveToRelative(-0.5f, 0.22f, -0.5f, 0.5f)
                verticalLineToRelative(4.62f)
                curveToRelative(0f, 0.13f, 0.05f, 0.26f, 0.15f, 0.35f)
                lineToRelative(2.01f, 2.01f)
                curveToRelative(0.32f, 0.27f, 0.61f, 0.1f, 0.71f, 0f)
                curveToRelative(0.2f, -0.2f, 0.2f, -0.51f, 0f, -0.71f)
                lineToRelative(-1.86f, -1.86f)
                close()
            }
        }.also { _Clock = it}
