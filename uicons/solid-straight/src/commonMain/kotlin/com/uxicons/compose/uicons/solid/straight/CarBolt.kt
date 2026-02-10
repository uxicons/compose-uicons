package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CarBolt: ImageVector? = null

val Icons.Ss.CarBolt: ImageVector
    get() = _CarBolt ?: UXIcon(name = "CarBolt") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17f, 21f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-3f)
                close()
                moveTo(3f, 24f)
                lineTo(7f, 24f)
                verticalLineToRelative(-3f)
                lineTo(3f, 21f)
                verticalLineToRelative(3f)
                close()
                moveTo(24f, 17.03f)
                verticalLineToRelative(1.97f)
                lineTo(0f, 19f)
                verticalLineToRelative(-1.97f)
                curveToRelative(0f, -1.36f, 0.12f, -2.71f, 0.35f, -4.03f)
                lineTo(6f, 13f)
                verticalLineToRelative(-2f)
                lineTo(0.78f, 11f)
                curveToRelative(0.19f, -0.72f, 0.4f, -1.43f, 0.66f, -2.13f)
                lineTo(3.58f, 2.98f)
                curveToRelative(0.43f, -1.18f, 1.56f, -1.98f, 2.82f, -1.98f)
                horizontalLineToRelative(11.2f)
                curveToRelative(1.26f, 0f, 2.39f, 0.79f, 2.82f, 1.98f)
                lineToRelative(2.14f, 5.89f)
                curveToRelative(0.26f, 0.7f, 0.47f, 1.41f, 0.66f, 2.13f)
                horizontalLineToRelative(-5.22f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(5.65f)
                curveToRelative(0.23f, 1.33f, 0.35f, 2.67f, 0.35f, 4.03f)
                close()
                moveTo(6f, 15f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2f)
                close()
                moveTo(14.81f, 9.85f)
                curveToRelative(-0.28f, -0.52f, -0.82f, -0.85f, -1.41f, -0.85f)
                horizontalLineToRelative(-2.12f)
                lineToRelative(1.78f, -3.29f)
                lineToRelative(-1.76f, -0.95f)
                lineToRelative(-2.22f, 4.16f)
                curveToRelative(-0.15f, 0.49f, -0.06f, 1.02f, 0.25f, 1.43f)
                reflectiveCurveToRelative(0.79f, 0.65f, 1.3f, 0.65f)
                horizontalLineToRelative(2.13f)
                lineToRelative(-1.53f, 3.07f)
                lineToRelative(1.79f, 0.89f)
                lineToRelative(1.76f, -3.53f)
                curveToRelative(0.29f, -0.48f, 0.3f, -1.08f, 0.04f, -1.58f)
                close()
                moveTo(20f, 15f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2f)
                close()
            }
        }.also { _CarBolt = it}
