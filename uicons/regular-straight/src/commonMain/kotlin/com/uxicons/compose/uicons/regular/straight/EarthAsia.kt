package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _EarthAsia: ImageVector? = null

val Icons.Rs.EarthAsia: ImageVector
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
                moveTo(12f, 22f)
                curveToRelative(2.59f, 0f, 4.95f, -0.99f, 6.73f, -2.61f)
                lineToRelative(-2.73f, -0.39f)
                lineToRelative(-1f, -2f)
                lineToRelative(1f, -2f)
                lineToRelative(2.5f, -0.5f)
                lineToRelative(1.5f, -1.5f)
                lineToRelative(1.78f, 1.07f)
                curveToRelative(0.14f, -0.67f, 0.22f, -1.36f, 0.22f, -2.07f)
                curveToRelative(0f, -4.39f, -2.84f, -8.13f, -6.79f, -9.47f)
                curveToRelative(-0.64f, 1.33f, -1.21f, 2.47f, -1.21f, 2.47f)
                lineToRelative(-2f, 0.5f)
                lineToRelative(-0.5f, 1.5f)
                lineToRelative(1.5f, 2f)
                lineToRelative(-1.5f, 2f)
                horizontalLineToRelative(-2f)
                lineToRelative(0.5f, 3f)
                lineToRelative(-2f, 1f)
                lineToRelative(-2f, -2.5f)
                lineToRelative(-2f, 1.5f)
                horizontalLineToRelative(-1.8f)
                curveToRelative(0.93f, 4.56f, 4.97f, 8f, 9.8f, 8f)
                close()
            }
        }.also { _EarthAsia = it}
