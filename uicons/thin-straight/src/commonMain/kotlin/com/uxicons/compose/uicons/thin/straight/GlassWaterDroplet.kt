package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _GlassWaterDroplet: ImageVector? = null

val Icons.Ts.GlassWaterDroplet: ImageVector
    get() = _GlassWaterDroplet ?: UXIcon(name = "GlassWaterDroplet") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(1.21f, 0f)
                lineToRelative(1.78f, 21.7f)
                curveToRelative(0.11f, 1.29f, 1.2f, 2.29f, 2.49f, 2.29f)
                horizontalLineToRelative(12.9f)
                curveToRelative(1.31f, 0f, 2.38f, -0.98f, 2.49f, -2.28f)
                lineTo(22.79f, 0f)
                lineTo(1.21f, 0f)
                close()
                moveTo(21.7f, 1f)
                lineToRelative(-1.38f, 15.7f)
                curveToRelative(-0.41f, 0.2f, -0.86f, 0.3f, -1.32f, 0.3f)
                curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                horizontalLineToRelative(-1f)
                curveToRelative(0f, 1.65f, -1.35f, 3f, -3f, 3f)
                reflectiveCurveToRelative(-3f, -1.35f, -3f, -3f)
                horizontalLineToRelative(-1f)
                curveToRelative(0f, 1.65f, -1.35f, 3f, -3f, 3f)
                curveToRelative(-0.49f, 0f, -0.98f, -0.12f, -1.41f, -0.35f)
                lineTo(2.3f, 1f)
                horizontalLineToRelative(19.4f)
                close()
                moveTo(19.88f, 21.63f)
                curveToRelative(-0.07f, 0.78f, -0.71f, 1.37f, -1.5f, 1.37f)
                lineTo(5.49f, 23f)
                curveToRelative(-0.77f, 0f, -1.43f, -0.6f, -1.5f, -1.38f)
                lineToRelative(-0.32f, -3.85f)
                curveToRelative(0.42f, 0.15f, 0.87f, 0.22f, 1.32f, 0.22f)
                curveToRelative(1.5f, 0f, 2.82f, -0.83f, 3.5f, -2.06f)
                curveToRelative(0.68f, 1.23f, 2.0f, 2.06f, 3.5f, 2.06f)
                reflectiveCurveToRelative(2.82f, -0.83f, 3.5f, -2.06f)
                curveToRelative(0.68f, 1.23f, 2.0f, 2.06f, 3.5f, 2.06f)
                curveToRelative(0.42f, 0f, 0.83f, -0.07f, 1.22f, -0.19f)
                lineToRelative(-0.34f, 3.82f)
                close()
                moveTo(12.0f, 11f)
                curveToRelative(1.65f, 0f, 3f, -1.35f, 3f, -3f)
                curveToRelative(0f, -1.83f, -2.39f, -4.11f, -2.66f, -4.37f)
                lineToRelative(-0.34f, -0.32f)
                lineToRelative(-0.34f, 0.32f)
                curveToRelative(-0.27f, 0.25f, -2.66f, 2.54f, -2.66f, 4.37f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                close()
                moveTo(12.0f, 4.7f)
                curveToRelative(0.77f, 0.79f, 2f, 2.28f, 2f, 3.3f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                reflectiveCurveToRelative(-2f, -0.9f, -2f, -2f)
                curveToRelative(0f, -1.01f, 1.23f, -2.5f, 2f, -3.3f)
                close()
            }
        }.also { _GlassWaterDroplet = it}
