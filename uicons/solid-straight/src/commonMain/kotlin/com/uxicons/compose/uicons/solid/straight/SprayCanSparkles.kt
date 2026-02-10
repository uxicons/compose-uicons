package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SprayCanSparkles: ImageVector? = null

val Icons.Ss.SprayCanSparkles: ImageVector
    get() = _SprayCanSparkles ?: UXIcon(name = "SprayCanSparkles") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(15.67f, 1.67f)
                lineToRelative(0.83f, -1.67f)
                lineToRelative(0.83f, 1.67f)
                lineToRelative(1.67f, 0.83f)
                lineToRelative(-1.67f, 0.83f)
                lineToRelative(-0.83f, 1.67f)
                lineToRelative(-0.83f, -1.67f)
                lineToRelative(-1.67f, -0.83f)
                lineToRelative(1.67f, -0.83f)
                close()
                moveTo(19f, 5.5f)
                lineToRelative(1.67f, 0.83f)
                lineToRelative(0.83f, 1.67f)
                lineToRelative(0.83f, -1.67f)
                lineToRelative(1.67f, -0.83f)
                lineToRelative(-1.67f, -0.83f)
                lineToRelative(-0.83f, -1.67f)
                lineToRelative(-0.83f, 1.67f)
                lineToRelative(-1.67f, 0.83f)
                close()
                moveTo(18f, 11.5f)
                lineToRelative(1.67f, 0.83f)
                lineToRelative(0.83f, 1.67f)
                lineToRelative(0.83f, -1.67f)
                lineToRelative(1.67f, -0.83f)
                lineToRelative(-1.67f, -0.83f)
                lineToRelative(-0.83f, -1.67f)
                lineToRelative(-0.83f, 1.67f)
                lineToRelative(-1.67f, 0.83f)
                close()
                moveTo(12f, 2.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                horizontalLineToRelative(-3f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                verticalLineToRelative(3.5f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(-3.5f)
                close()
                moveTo(16f, 12.5f)
                verticalLineToRelative(11.5f)
                lineTo(0f, 24f)
                verticalLineToRelative(-11.5f)
                curveToRelative(0f, -2.48f, 2.02f, -4.5f, 4.5f, -4.5f)
                horizontalLineToRelative(7f)
                curveToRelative(2.48f, 0f, 4.5f, 2.02f, 4.5f, 4.5f)
                close()
                moveTo(12f, 16f)
                curveToRelative(0f, -2.21f, -1.79f, -4f, -4f, -4f)
                reflectiveCurveToRelative(-4f, 1.79f, -4f, 4f)
                reflectiveCurveToRelative(1.79f, 4f, 4f, 4f)
                reflectiveCurveToRelative(4f, -1.79f, 4f, -4f)
                close()
                moveTo(10f, 16f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                reflectiveCurveToRelative(-2f, -0.9f, -2f, -2f)
                reflectiveCurveToRelative(0.9f, -2f, 2f, -2f)
                reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
                close()
            }
        }.also { _SprayCanSparkles = it}
