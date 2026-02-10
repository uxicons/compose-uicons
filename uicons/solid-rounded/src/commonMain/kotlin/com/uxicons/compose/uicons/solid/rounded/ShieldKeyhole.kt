package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ShieldKeyhole: ImageVector? = null

val Icons.Sr.ShieldKeyhole: ImageVector
    get() = _ShieldKeyhole ?: UXIcon(name = "ShieldKeyhole") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(18.57f, 2.13f)
                lineTo(12.31f, 0.05f)
                curveToRelative(-0.2f, -0.07f, -0.43f, -0.07f, -0.63f, 0f)
                lineToRelative(-6.26f, 2.08f)
                curveToRelative(-2.05f, 0.68f, -3.43f, 2.59f, -3.43f, 4.75f)
                verticalLineToRelative(5.17f)
                curveToRelative(0f, 6.56f, 7.0f, 10.58f, 9.15f, 11.65f)
                curveToRelative(0f, 0f, 0.47f, 0.31f, 0.85f, 0.31f)
                reflectiveCurveToRelative(0.79f, -0.24f, 0.79f, -0.24f)
                curveToRelative(2.16f, -0.87f, 9.21f, -4.28f, 9.21f, -11.72f)
                verticalLineToRelative(-5.17f)
                curveToRelative(0f, -2.16f, -1.38f, -4.07f, -3.43f, -4.75f)
                close()
                moveTo(13f, 11.79f)
                verticalLineToRelative(3.21f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-3.21f)
                curveToRelative(-0.88f, -0.39f, -1.5f, -1.27f, -1.5f, -2.29f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
                curveToRelative(0f, 1.02f, -0.62f, 1.91f, -1.5f, 2.29f)
                close()
            }
        }.also { _ShieldKeyhole = it}
