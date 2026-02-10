package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MeterDroplet: ImageVector? = null

val Icons.Sc.MeterDroplet: ImageVector
    get() = _MeterDroplet ?: UXIcon(name = "MeterDroplet") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 1f)
                curveToRelative(-7.71f, 0f, -11f, 3.29f, -11f, 11f)
                reflectiveCurveToRelative(3.29f, 11f, 11f, 11f)
                curveToRelative(0.62f, 0f, 1.2f, -0.03f, 1.75f, -0.07f)
                curveToRelative(-1.08f, -1.16f, -1.75f, -2.72f, -1.75f, -4.43f)
                curveToRelative(0f, -3.71f, 3.79f, -7.13f, 4.55f, -7.78f)
                curveToRelative(0.16f, -0.14f, 0.34f, -0.25f, 0.52f, -0.35f)
                curveToRelative(-0.04f, -0.11f, -0.07f, -0.24f, -0.07f, -0.37f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                verticalLineToRelative(2f)
                curveToRelative(0f, 0.02f, -0.01f, 0.03f, -0.01f, 0.05f)
                curveToRelative(0.53f, 0.09f, 1.04f, 0.31f, 1.47f, 0.68f)
                curveToRelative(0.37f, 0.32f, 1.48f, 1.31f, 2.5f, 2.67f)
                curveToRelative(0.03f, -0.45f, 0.04f, -0.92f, 0.04f, -1.4f)
                curveToRelative(0f, -7.71f, -3.29f, -11f, -11f, -11f)
                close()
                moveTo(7f, 10f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                close()
                moveTo(11f, 10f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                close()
                moveTo(15f, 10f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                close()
                moveTo(18.5f, 23f)
                curveToRelative(-2.48f, 0f, -4.5f, -2.02f, -4.5f, -4.5f)
                curveToRelative(0f, -2.88f, 3.46f, -5.92f, 3.85f, -6.26f)
                curveToRelative(0.37f, -0.32f, 0.93f, -0.32f, 1.3f, 0f)
                curveToRelative(0.4f, 0.34f, 3.85f, 3.38f, 3.85f, 6.26f)
                curveToRelative(0f, 2.48f, -2.02f, 4.5f, -4.5f, 4.5f)
                close()
            }
        }.also { _MeterDroplet = it}
