package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _EarthAsia: ImageVector? = null

val Icons.Ss.EarthAsia: ImageVector
    get() = _EarthAsia ?: UXIcon(name = "EarthAsia") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 0f)
                curveTo(5.38f, 0f, 0f, 5.38f, 0f, 12f)
                reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
                reflectiveCurveToRelative(12f, -5.38f, 12f, -12f)
                reflectiveCurveTo(18.62f, 0f, 12f, 0f)
                close()
                moveTo(17f, 6.5f)
                lineToRelative(-1.15f, 2.77f)
                lineToRelative(-1.85f, -0.77f)
                lineToRelative(1.61f, -2.58f)
                lineToRelative(1.39f, 0.58f)
                close()
                moveTo(10f, 18f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-2f)
                lineToRelative(3f, 0.5f)
                verticalLineToRelative(1.5f)
                close()
                moveTo(8f, 15f)
                lineToRelative(-2f, -2.5f)
                lineToRelative(-2f, 1.5f)
                horizontalLineToRelative(-1.8f)
                curveToRelative(-0.13f, -0.65f, -0.2f, -1.31f, -0.2f, -2f)
                curveTo(2f, 6.49f, 6.49f, 2f, 12f, 2f)
                curveToRelative(1.12f, 0f, 2.21f, 0.19f, 3.21f, 0.53f)
                curveToRelative(-0.64f, 1.33f, -1.21f, 2.47f, -1.21f, 2.47f)
                lineToRelative(-2f, 0.5f)
                lineToRelative(-0.5f, 1.5f)
                lineToRelative(1.5f, 2f)
                lineToRelative(-1.5f, 2f)
                horizontalLineToRelative(-2f)
                lineToRelative(0.5f, 3f)
                lineToRelative(-2f, 1f)
                close()
                moveTo(12.06f, 16f)
                lineToRelative(-1.06f, -1.06f)
                lineToRelative(1.77f, -2.48f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(-2.12f, 2.12f)
                close()
                moveTo(18.73f, 19.39f)
                lineToRelative(-2.73f, -0.39f)
                lineToRelative(-1f, -2f)
                lineToRelative(1f, -2f)
                lineToRelative(2.5f, -0.5f)
                lineToRelative(1.5f, -1.5f)
                lineToRelative(1.78f, 1.07f)
                curveToRelative(-0.44f, 2.09f, -1.53f, 3.93f, -3.05f, 5.32f)
                close()
            }
        }.also { _EarthAsia = it}
