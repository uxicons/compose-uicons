package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HandSparkles: ImageVector? = null

val Icons.Ss.HandSparkles: ImageVector
    get() = _HandSparkles ?: UXIcon(name = "HandSparkles") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(5f, 6.5f)
                lineToRelative(-1.67f, 0.83f)
                lineToRelative(-0.83f, 1.67f)
                lineToRelative(-0.83f, -1.67f)
                lineToRelative(-1.67f, -0.83f)
                lineToRelative(1.67f, -0.83f)
                lineToRelative(0.83f, -1.67f)
                lineToRelative(0.83f, 1.67f)
                lineToRelative(1.67f, 0.83f)
                close()
                moveTo(20.5f, 24.0f)
                horizontalLineToRelative(3.5f)
                verticalLineToRelative(-3.5f)
                lineToRelative(-2.33f, 1.17f)
                lineToRelative(-1.17f, 2.33f)
                close()
                moveTo(24f, 4.5f)
                verticalLineToRelative(16.0f)
                lineToRelative(-2.33f, -1.17f)
                lineToRelative(-1.17f, -2.33f)
                lineToRelative(-1.17f, 2.33f)
                lineToRelative(-2.33f, 1.17f)
                lineToRelative(2.33f, 1.17f)
                lineToRelative(1.17f, 2.33f)
                horizontalLineToRelative(-12.5f)
                lineTo(0.65f, 16.41f)
                curveToRelative(-0.71f, -0.71f, -0.88f, -1.87f, -0.28f, -2.68f)
                curveToRelative(0.63f, -0.84f, 1.74f, -1.03f, 2.58f, -0.56f)
                curveToRelative(0.2f, 0.13f, 0.35f, 0.24f, 0.44f, 0.33f)
                lineToRelative(2.6f, 2.65f)
                lineTo(6f, 3.5f)
                curveToRelative(0f, -0.91f, 0.81f, -1.63f, 1.75f, -1.48f)
                curveToRelative(0.74f, 0.12f, 1.25f, 0.81f, 1.25f, 1.56f)
                verticalLineToRelative(8.42f)
                horizontalLineToRelative(2f)
                lineTo(11f, 1.5f)
                curveTo(11f, 0.67f, 11.67f, 0f, 12.5f, 0f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(10.5f)
                horizontalLineToRelative(2f)
                lineTo(16f, 2.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(9.5f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-7.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                close()
                moveTo(17.5f, 16.5f)
                lineToRelative(-2f, -1f)
                lineToRelative(-1f, -2f)
                lineToRelative(-1f, 2f)
                lineToRelative(-2f, 1f)
                lineToRelative(2f, 1f)
                lineToRelative(1f, 2f)
                lineToRelative(1f, -2f)
                lineToRelative(2f, -1f)
                close()
            }
        }.also { _HandSparkles = it}
