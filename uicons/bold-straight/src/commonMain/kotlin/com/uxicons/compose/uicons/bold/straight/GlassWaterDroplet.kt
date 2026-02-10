package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _GlassWaterDroplet: ImageVector? = null

val Icons.Bs.GlassWaterDroplet: ImageVector
    get() = _GlassWaterDroplet ?: UXIcon(name = "GlassWaterDroplet") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(1.01f, 0f)
                lineToRelative(1.71f, 20.79f)
                curveToRelative(0.15f, 1.8f, 1.68f, 3.21f, 3.49f, 3.21f)
                horizontalLineToRelative(11.46f)
                curveToRelative(1.83f, 0f, 3.33f, -1.37f, 3.49f, -3.19f)
                lineTo(22.99f, 0f)
                lineTo(1.01f, 0f)
                close()
                moveTo(19.71f, 3f)
                lineToRelative(-0.97f, 11f)
                horizontalLineToRelative(-2.34f)
                curveToRelative(-0.21f, 0.58f, -0.76f, 1f, -1.41f, 1f)
                reflectiveCurveToRelative(-1.2f, -0.42f, -1.41f, -1f)
                horizontalLineToRelative(-3.18f)
                curveToRelative(-0.21f, 0.58f, -0.76f, 1f, -1.41f, 1f)
                reflectiveCurveToRelative(-1.2f, -0.42f, -1.41f, -1f)
                horizontalLineToRelative(-2.42f)
                lineToRelative(-0.91f, -11f)
                horizontalLineToRelative(15.44f)
                close()
                moveTo(17.67f, 21f)
                lineTo(6.21f, 21f)
                curveToRelative(-0.26f, 0f, -0.48f, -0.2f, -0.5f, -0.46f)
                lineToRelative(-0.27f, -3.28f)
                curveToRelative(0.2f, -0.13f, 0.38f, -0.27f, 0.56f, -0.43f)
                curveToRelative(0.8f, 0.72f, 1.84f, 1.17f, 3f, 1.17f)
                reflectiveCurveToRelative(2.2f, -0.45f, 3f, -1.17f)
                curveToRelative(0.8f, 0.72f, 1.84f, 1.17f, 3f, 1.17f)
                reflectiveCurveToRelative(2.2f, -0.45f, 3f, -1.17f)
                curveToRelative(0.15f, 0.13f, 0.3f, 0.26f, 0.46f, 0.37f)
                lineToRelative(-0.29f, 3.35f)
                curveToRelative(-0.02f, 0.26f, -0.24f, 0.46f, -0.5f, 0.46f)
                close()
                moveTo(9.0f, 9f)
                curveToRelative(0f, -2f, 3f, -4.8f, 3f, -4.8f)
                curveToRelative(0f, 0f, 3f, 2.8f, 3f, 4.8f)
                curveToRelative(0f, 1.66f, -1.34f, 3f, -3f, 3f)
                reflectiveCurveToRelative(-3f, -1.34f, -3f, -3f)
                close()
            }
        }.also { _GlassWaterDroplet = it}
