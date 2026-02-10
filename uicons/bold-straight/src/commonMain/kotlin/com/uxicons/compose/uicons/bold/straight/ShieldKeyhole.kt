package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ShieldKeyhole: ImageVector? = null

val Icons.Bs.ShieldKeyhole: ImageVector
    get() = _ShieldKeyhole ?: UXIcon(name = "ShieldKeyhole") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19.68f, 2.59f)
                lineTo(12f, 0.04f)
                lineToRelative(-7.68f, 2.54f)
                curveToRelative(-1.39f, 0.46f, -2.32f, 1.75f, -2.32f, 3.21f)
                verticalLineToRelative(6.16f)
                curveToRelative(0f, 6.52f, 6.85f, 10.45f, 8.95f, 11.5f)
                lineToRelative(0.98f, 0.49f)
                lineToRelative(1.02f, -0.41f)
                curveToRelative(2.12f, -0.85f, 9.04f, -4.21f, 9.04f, -11.58f)
                verticalLineToRelative(-6.16f)
                curveToRelative(0f, -1.46f, -0.93f, -2.75f, -2.32f, -3.21f)
                close()
                moveTo(19f, 11.96f)
                curveToRelative(0f, 5.26f, -5.03f, 7.89f, -6.93f, 8.7f)
                curveToRelative(-1.93f, -1.0f, -7.07f, -4.1f, -7.07f, -8.7f)
                verticalLineToRelative(-6.16f)
                curveToRelative(0f, -0.17f, 0.11f, -0.31f, 0.27f, -0.36f)
                lineToRelative(6.74f, -2.23f)
                lineToRelative(6.73f, 2.23f)
                curveToRelative(0.16f, 0.05f, 0.27f, 0.2f, 0.27f, 0.36f)
                verticalLineToRelative(6.16f)
                close()
                moveTo(14.5f, 9.5f)
                curveToRelative(0f, 0.82f, -0.39f, 1.54f, -1f, 2f)
                verticalLineToRelative(3.5f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-3.5f)
                curveToRelative(-0.61f, -0.46f, -1f, -1.18f, -1f, -2f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
                close()
            }
        }.also { _ShieldKeyhole = it}
