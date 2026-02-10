package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _NailClipper: ImageVector? = null

val Icons.Bs.NailClipper: ImageVector
    get() = _NailClipper ?: UXIcon(name = "NailClipper") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21.88f, 13.57f)
                lineToRelative(-8.95f, -9.84f)
                curveToRelative(0.05f, -0.91f, 0.13f, -2.83f, 0.16f, -3.73f)
                lineToRelative(-2.32f, 0.02f)
                lineToRelative(-0.45f, 0.57f)
                curveToRelative(-0.04f, 0.06f, -1.13f, 1.41f, -3.29f, 1.41f)
                reflectiveCurveToRelative(-3.24f, -1.35f, -3.28f, -1.39f)
                lineToRelative(-0.47f, -0.61f)
                horizontalLineToRelative(-2.33f)
                lineToRelative(0.91f, 19.07f)
                curveToRelative(0.13f, 2.76f, 2.4f, 4.92f, 5.17f, 4.92f)
                reflectiveCurveToRelative(5.03f, -2.16f, 5.17f, -4.92f)
                lineToRelative(0.11f, -2.23f)
                lineToRelative(3.3f, 3.0f)
                curveToRelative(1.75f, 1.59f, 4.45f, 1.53f, 6.13f, -0.15f)
                curveToRelative(1.68f, -1.68f, 1.74f, -4.37f, 0.15f, -6.12f)
                close()
                moveTo(9.2f, 18.93f)
                curveToRelative(-0.06f, 1.16f, -1.01f, 2.07f, -2.17f, 2.07f)
                reflectiveCurveToRelative(-2.11f, -0.91f, -2.17f, -2.07f)
                lineToRelative(-0.69f, -14.48f)
                curveToRelative(0.79f, 0.32f, 1.74f, 0.55f, 2.86f, 0.55f)
                reflectiveCurveToRelative(2.07f, -0.23f, 2.86f, -0.55f)
                close()
                moveTo(19.61f, 17.58f)
                curveToRelative(-0.54f, 0.55f, -1.42f, 0.56f, -1.99f, 0.05f)
                lineToRelative(-5.13f, -4.67f)
                lineToRelative(0.24f, -4.99f)
                lineToRelative(6.93f, 7.62f)
                curveToRelative(0.52f, 0.57f, 0.5f, 1.44f, -0.05f, 1.99f)
                close()
                moveTo(7.04f, 7f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                close()
            }
        }.also { _NailClipper = it}
