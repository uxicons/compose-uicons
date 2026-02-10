package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _AirConditioner: ImageVector? = null

val Icons.Sc.AirConditioner: ImageVector
    get() = _AirConditioner ?: UXIcon(name = "AirConditioner") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 15.5f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                verticalLineToRelative(4.5f)
                curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                verticalLineToRelative(-4.5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(7.5f, 15.5f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                verticalLineToRelative(2.06f)
                curveToRelative(0f, 0.59f, -0.37f, 0.94f, -1f, 0.94f)
                curveToRelative(-0.74f, 0f, -1f, -0.52f, -1f, -1f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                curveToRelative(0f, 2.28f, 1.72f, 4f, 4f, 4f)
                reflectiveCurveToRelative(4f, -1.7f, 4f, -3.94f)
                verticalLineToRelative(-2.06f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21.5f, 17.5f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                curveToRelative(0f, 0.48f, -0.26f, 1f, -1f, 1f)
                curveToRelative(-0.63f, 0f, -1f, -0.35f, -1f, -0.94f)
                verticalLineToRelative(-2.06f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                verticalLineToRelative(2.06f)
                curveToRelative(0f, 2.25f, 1.72f, 3.94f, 4f, 3.94f)
                reflectiveCurveToRelative(4f, -1.72f, 4f, -4f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(2.99f, 13.78f)
                curveToRelative(0.17f, 0.03f, 4.22f, 0.68f, 9.01f, 0.68f)
                reflectiveCurveToRelative(8.84f, -0.65f, 9.01f, -0.68f)
                curveToRelative(0.31f, -0.05f, 0.58f, -0.24f, 0.73f, -0.52f)
                curveToRelative(0.05f, -0.1f, 1.26f, -2.44f, 1.26f, -5.56f)
                curveToRelative(0f, -3.14f, -1.21f, -5.46f, -1.26f, -5.56f)
                curveToRelative(-0.15f, -0.28f, -0.41f, -0.47f, -0.72f, -0.52f)
                curveToRelative(-0.17f, -0.03f, -4.22f, -0.62f, -9.01f, -0.62f)
                reflectiveCurveToRelative(-8.84f, 0.59f, -9.01f, 0.62f)
                curveToRelative(-0.31f, 0.05f, -0.58f, 0.24f, -0.73f, 0.52f)
                curveToRelative(-0.05f, 0.1f, -1.26f, 2.44f, -1.26f, 5.56f)
                curveToRelative(0f, 3.14f, 1.21f, 5.46f, 1.26f, 5.56f)
                curveToRelative(0.15f, 0.28f, 0.41f, 0.47f, 0.72f, 0.52f)
                close()
                moveTo(7f, 8f)
                horizontalLineToRelative(10f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                horizontalLineToRelative(-10f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                close()
            }
        }.also { _AirConditioner = it}
