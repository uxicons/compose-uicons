package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Comet: ImageVector? = null

val Icons.Rs.Comet: ImageVector
    get() = _Comet ?: UXIcon(name = "Comet") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(8.5f, 24f)
                curveToRelative(-2.27f, 0f, -4.4f, -0.88f, -6.01f, -2.49f)
                curveToRelative(-1.6f, -1.61f, -2.49f, -3.74f, -2.49f, -6.01f)
                curveTo(0f, 8.58f, 5.98f, 4.72f, 11.25f, 1.32f)
                lineTo(13f, 0.19f)
                lineTo(13f, 4.31f)
                curveTo(17.74f, 1.83f, 21.98f, 0.65f, 22.18f, 0.59f)
                lineToRelative(1.7f, -0.47f)
                lineToRelative(-0.47f, 1.7f)
                curveToRelative(-0.05f, 0.2f, -1.24f, 4.43f, -3.72f, 9.18f)
                horizontalLineToRelative(4.12f)
                lineToRelative(-1.13f, 1.75f)
                curveToRelative(-3.4f, 5.27f, -7.26f, 11.25f, -14.18f, 11.25f)
                close()
                moveTo(11f, 3.87f)
                curveTo(6.37f, 6.89f, 2f, 10.18f, 2f, 15.5f)
                curveToRelative(0f, 1.74f, 0.68f, 3.37f, 1.9f, 4.6f)
                curveToRelative(1.23f, 1.23f, 2.86f, 1.9f, 4.6f, 1.9f)
                curveToRelative(5.32f, 0f, 8.61f, -4.37f, 11.63f, -9f)
                horizontalLineToRelative(-3.86f)
                lineToRelative(0.86f, -1.5f)
                curveToRelative(1.85f, -3.23f, 3.1f, -6.47f, 3.77f, -8.4f)
                curveToRelative(-1.94f, 0.67f, -5.17f, 1.92f, -8.4f, 3.77f)
                lineToRelative(-1.5f, 0.86f)
                lineTo(11.0f, 3.87f)
                close()
                moveTo(9f, 19f)
                curveToRelative(-2.21f, 0f, -4f, -1.79f, -4f, -4f)
                reflectiveCurveToRelative(1.79f, -4f, 4f, -4f)
                reflectiveCurveToRelative(4f, 1.79f, 4f, 4f)
                reflectiveCurveToRelative(-1.79f, 4f, -4f, 4f)
                close()
                moveTo(9f, 13f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                reflectiveCurveToRelative(0.9f, 2f, 2f, 2f)
                reflectiveCurveToRelative(2f, -0.9f, 2f, -2f)
                reflectiveCurveToRelative(-0.9f, -2f, -2f, -2f)
                close()
            }
        }.also { _Comet = it}
