package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _EarthAsia: ImageVector? = null

val Icons.Bs.EarthAsia: ImageVector
    get() = _EarthAsia ?: UXIcon(name = "EarthAsia") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(7f, 16f)
                lineToRelative(3f, 0.5f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-2f)
                close()
                moveTo(11f, 14.94f)
                lineToRelative(1.06f, 1.06f)
                lineToRelative(2.12f, -2.12f)
                lineToRelative(-1.41f, -1.41f)
                lineToRelative(-1.77f, 2.48f)
                close()
                moveTo(17f, 6.5f)
                lineToRelative(-1.39f, -0.58f)
                lineToRelative(-1.61f, 2.58f)
                lineToRelative(1.85f, 0.77f)
                lineToRelative(1.15f, -2.77f)
                close()
                moveTo(24f, 12f)
                curveToRelative(0f, 6.62f, -5.38f, 12f, -12f, 12f)
                reflectiveCurveTo(0f, 18.62f, 0f, 12f)
                reflectiveCurveTo(5.38f, 0f, 12f, 0f)
                reflectiveCurveToRelative(12f, 5.38f, 12f, 12f)
                close()
                moveTo(12f, 21f)
                curveToRelative(2.02f, 0f, 3.89f, -0.67f, 5.39f, -1.8f)
                lineToRelative(-1.4f, -0.2f)
                lineToRelative(-1f, -2f)
                lineToRelative(1f, -2f)
                lineToRelative(2.5f, -0.5f)
                lineToRelative(1.5f, -1.5f)
                lineToRelative(0.87f, 0.52f)
                curveToRelative(0.09f, -0.49f, 0.13f, -1.0f, 0.13f, -1.52f)
                curveToRelative(0f, -4.0f, -2.62f, -7.39f, -6.23f, -8.56f)
                curveToRelative(-0.44f, 0.9f, -0.77f, 1.56f, -0.77f, 1.56f)
                lineToRelative(-2f, 0.5f)
                lineToRelative(-0.5f, 1.5f)
                lineToRelative(1.5f, 2f)
                lineToRelative(-1.5f, 2f)
                horizontalLineToRelative(-2f)
                lineToRelative(0.5f, 3f)
                lineToRelative(-2f, 1f)
                lineToRelative(-2f, -2.5f)
                lineToRelative(-2f, 1.5f)
                horizontalLineToRelative(-0.78f)
                curveToRelative(0.91f, 4.0f, 4.5f, 7f, 8.78f, 7f)
                close()
            }
        }.also { _EarthAsia = it}
