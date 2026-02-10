package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LocationArrow: ImageVector? = null

val Icons.Bs.LocationArrow: ImageVector
    get() = _LocationArrow ?: UXIcon(name = "LocationArrow") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(2.17f, 7.63f)
                curveTo(0.64f, 8.19f, -0.23f, 9.69f, 0.05f, 11.29f)
                reflectiveCurveToRelative(1.61f, 2.71f, 3.23f, 2.71f)
                horizontalLineToRelative(6.72f)
                verticalLineToRelative(6.72f)
                curveToRelative(0f, 1.62f, 1.12f, 2.95f, 2.71f, 3.23f)
                curveToRelative(0.2f, 0.04f, 0.4f, 0.05f, 0.59f, 0.05f)
                curveToRelative(1.36f, 0f, 2.58f, -0.83f, 3.06f, -2.19f)
                lineTo(23.95f, 0.06f)
                lineTo(2.17f, 7.63f)
                close()
                moveTo(13.55f, 20.81f)
                curveToRelative(-0.03f, 0.08f, -0.09f, 0.22f, -0.31f, 0.18f)
                curveToRelative(-0.23f, -0.04f, -0.23f, -0.19f, -0.23f, -0.28f)
                verticalLineToRelative(-9.72f)
                lineTo(3.28f, 11.0f)
                curveToRelative(-0.08f, 0f, -0.24f, 0f, -0.28f, -0.23f)
                curveToRelative(-0.04f, -0.23f, 0.1f, -0.28f, 0.16f, -0.31f)
                lineToRelative(15.91f, -5.53f)
                lineToRelative(-5.53f, 15.88f)
                close()
            }
        }.also { _LocationArrow = it}
