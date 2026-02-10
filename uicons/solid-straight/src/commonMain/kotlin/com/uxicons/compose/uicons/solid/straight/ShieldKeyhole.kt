package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ShieldKeyhole: ImageVector? = null

val Icons.Ss.ShieldKeyhole: ImageVector
    get() = _ShieldKeyhole ?: UXIcon(name = "ShieldKeyhole") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19.26f, 2.41f)
                lineTo(12f, 0.01f)
                lineToRelative(-7.26f, 2.41f)
                curveToRelative(-1.64f, 0.54f, -2.74f, 2.07f, -2.74f, 3.8f)
                verticalLineToRelative(5.75f)
                curveToRelative(0f, 6.57f, 7.01f, 10.58f, 9.15f, 11.65f)
                lineToRelative(0.81f, 0.4f)
                lineToRelative(0.84f, -0.34f)
                curveToRelative(2.16f, -0.87f, 9.21f, -4.29f, 9.21f, -11.72f)
                verticalLineToRelative(-5.75f)
                curveToRelative(0f, -1.73f, -1.1f, -3.25f, -2.74f, -3.8f)
                close()
                moveTo(13f, 11.79f)
                verticalLineToRelative(4.21f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-4.21f)
                curveToRelative(-0.88f, -0.39f, -1.5f, -1.27f, -1.5f, -2.29f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
                curveToRelative(0f, 1.02f, -0.62f, 1.91f, -1.5f, 2.29f)
                close()
            }
        }.also { _ShieldKeyhole = it}
