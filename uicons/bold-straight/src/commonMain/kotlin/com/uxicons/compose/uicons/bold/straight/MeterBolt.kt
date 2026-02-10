package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MeterBolt: ImageVector? = null

val Icons.Bs.MeterBolt: ImageVector
    get() = _MeterBolt ?: UXIcon(name = "MeterBolt") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(15f, 12f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(2.09f)
                lineToRelative(-1.67f, 2.91f)
                horizontalLineToRelative(-1.33f)
                close()
                moveTo(12f, 21f)
                curveToRelative(-4.96f, 0f, -9f, -4.04f, -9f, -9f)
                reflectiveCurveTo(7.04f, 3f, 12f, 3f)
                curveToRelative(4.11f, 0f, 7.58f, 2.78f, 8.65f, 6.55f)
                lineToRelative(3.32f, 1.9f)
                curveToRelative(-0.29f, -6.36f, -5.54f, -11.46f, -11.97f, -11.46f)
                curveTo(5.38f, 0f, 0f, 5.38f, 0f, 12f)
                reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
                curveToRelative(1.16f, 0f, 2.27f, -0.17f, 3.33f, -0.48f)
                lineToRelative(1.52f, -2.66f)
                curveToRelative(-0.45f, -0.13f, -0.88f, -0.34f, -1.25f, -0.61f)
                curveToRelative(-1.1f, 0.48f, -2.31f, 0.75f, -3.59f, 0.75f)
                close()
                moveTo(9f, 12f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(3f)
                close()
                moveTo(10.5f, 12f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(5f)
                close()
                moveTo(23.7f, 16.89f)
                curveToRelative(-0.35f, -0.55f, -0.95f, -0.88f, -1.6f, -0.88f)
                horizontalLineToRelative(-2.3f)
                lineToRelative(2.0f, -3.49f)
                lineToRelative(-2.6f, -1.49f)
                lineToRelative(-3.0f, 5.23f)
                curveToRelative(-0.3f, 0.59f, -0.27f, 1.28f, 0.08f, 1.85f)
                curveToRelative(0.35f, 0.56f, 0.95f, 0.9f, 1.62f, 0.9f)
                horizontalLineToRelative(2.3f)
                lineToRelative(-2.01f, 3.52f)
                lineToRelative(2.6f, 1.49f)
                lineToRelative(3.02f, -5.3f)
                curveToRelative(0.28f, -0.59f, 0.23f, -1.27f, -0.12f, -1.82f)
                close()
            }
        }.also { _MeterBolt = it}
