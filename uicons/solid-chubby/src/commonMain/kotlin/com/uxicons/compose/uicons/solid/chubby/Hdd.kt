package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Hdd: ImageVector? = null

val Icons.Sc.Hdd: ImageVector
    get() = _Hdd ?: UXIcon(name = "Hdd") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(2.16f, 16f)
                curveToRelative(0.29f, 3.45f, 0.86f, 5.22f, 0.89f, 5.32f)
                curveToRelative(0.11f, 0.32f, 0.37f, 0.57f, 0.71f, 0.65f)
                curveToRelative(0.17f, 0.04f, 4.17f, 1.03f, 8.24f, 1.03f)
                reflectiveCurveToRelative(8.07f, -0.99f, 8.24f, -1.03f)
                curveToRelative(0.33f, -0.08f, 0.6f, -0.33f, 0.71f, -0.65f)
                curveToRelative(0.03f, -0.1f, 0.61f, -1.86f, 0.89f, -5.32f)
                close()
                moveTo(13.5f, 20.99f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                close()
                moveTo(17.5f, 21f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                close()
                moveTo(2.04f, 14f)
                curveToRelative(-0.02f, -0.63f, -0.04f, -1.29f, -0.04f, -2f)
                curveToRelative(0f, -6.09f, 1.01f, -9.19f, 1.05f, -9.32f)
                curveToRelative(0.11f, -0.32f, 0.37f, -0.57f, 0.71f, -0.65f)
                curveToRelative(0.17f, -0.04f, 4.17f, -1.03f, 8.24f, -1.03f)
                reflectiveCurveToRelative(8.07f, 0.99f, 8.24f, 1.03f)
                curveToRelative(0.33f, 0.08f, 0.6f, 0.33f, 0.71f, 0.65f)
                curveToRelative(0.04f, 0.13f, 1.05f, 3.23f, 1.05f, 9.32f)
                curveToRelative(0f, 0.71f, -0.01f, 1.37f, -0.04f, 2f)
                close()
            }
        }.also { _Hdd = it}
