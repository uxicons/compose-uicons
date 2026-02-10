package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PumpMedical: ImageVector? = null

val Icons.Rr.PumpMedical: ImageVector
    get() = _PumpMedical ?: UXIcon(name = "PumpMedical") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.55f, 2.17f)
                lineToRelative(-0.73f, -0.49f)
                curveToRelative(-1.65f, -1.1f, -3.57f, -1.68f, -5.55f, -1.68f)
                horizontalLineToRelative(-4.78f)
                curveToRelative(-1.93f, 0f, -3.5f, 1.57f, -3.5f, 3.5f)
                verticalLineToRelative(2.79f)
                curveToRelative(-2.98f, 1.21f, -5f, 4.16f, -5f, 7.42f)
                verticalLineToRelative(5.29f)
                curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
                horizontalLineToRelative(6f)
                curveToRelative(2.76f, 0f, 5f, -2.24f, 5f, -5f)
                verticalLineToRelative(-5.29f)
                curveToRelative(0f, -3.26f, -2.02f, -6.21f, -5f, -7.42f)
                lineTo(15.0f, 2f)
                horizontalLineToRelative(2.27f)
                curveToRelative(1.58f, 0f, 3.12f, 0.47f, 4.44f, 1.34f)
                lineToRelative(0.73f, 0.49f)
                curveToRelative(0.46f, 0.3f, 1.08f, 0.18f, 1.39f, -0.28f)
                curveToRelative(0.31f, -0.46f, 0.18f, -1.08f, -0.28f, -1.39f)
                close()
                moveTo(11f, 3.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(0.5f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2.5f)
                close()
                moveTo(18f, 13.71f)
                verticalLineToRelative(5.29f)
                curveToRelative(0f, 1.65f, -1.35f, 3f, -3f, 3f)
                horizontalLineToRelative(-6f)
                curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                verticalLineToRelative(-5.29f)
                curveToRelative(0f, -2.59f, 1.7f, -4.92f, 4.15f, -5.71f)
                horizontalLineToRelative(3.7f)
                curveToRelative(2.45f, 0.79f, 4.15f, 3.12f, 4.15f, 5.71f)
                close()
                moveTo(15f, 14f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-2f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                close()
            }
        }.also { _PumpMedical = it}
