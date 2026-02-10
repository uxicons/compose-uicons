package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LocationArrow: ImageVector? = null

val Icons.Ts.LocationArrow: ImageVector
    get() = _LocationArrow ?: UXIcon(name = "LocationArrow") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(1.64f, 8.19f)
                horizontalLineToRelative(0f)
                curveToRelative(-1.35f, 0.49f, -1.77f, 1.74f, -1.6f, 2.76f)
                reflectiveCurveToRelative(1.0f, 2.05f, 2.44f, 2.05f)
                horizontalLineToRelative(8.52f)
                verticalLineToRelative(8.52f)
                curveToRelative(0f, 1.44f, 1.03f, 2.26f, 2.05f, 2.44f)
                curveToRelative(0.15f, 0.03f, 0.3f, 0.04f, 0.45f, 0.04f)
                curveToRelative(0.91f, 0f, 1.89f, -0.48f, 2.31f, -1.64f)
                lineTo(23.85f, 0.17f)
                lineTo(1.64f, 8.19f)
                close()
                moveTo(14.87f, 22.02f)
                curveToRelative(-0.31f, 0.86f, -1.08f, 1.05f, -1.64f, 0.95f)
                curveToRelative(-0.56f, -0.1f, -1.22f, -0.54f, -1.22f, -1.45f)
                verticalLineToRelative(-9.52f)
                lineTo(2.48f, 12.0f)
                curveToRelative(-0.92f, 0f, -1.35f, -0.66f, -1.45f, -1.22f)
                reflectiveCurveToRelative(0.09f, -1.33f, 0.95f, -1.64f)
                lineTo(22.18f, 1.83f)
                lineToRelative(-7.31f, 20.19f)
                close()
            }
        }.also { _LocationArrow = it}
