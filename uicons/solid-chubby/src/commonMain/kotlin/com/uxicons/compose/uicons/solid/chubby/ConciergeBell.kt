package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ConciergeBell: ImageVector? = null

val Icons.Sc.ConciergeBell: ImageVector
    get() = _ConciergeBell ?: UXIcon(name = "ConciergeBell") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22.95f, 20.14f)
                curveToRelative(-0.2f, -0.8f, -1.01f, -1.3f, -1.82f, -1.09f)
                curveToRelative(-0.03f, 0.01f, -3.17f, 0.78f, -7.64f, 0.93f)
                verticalLineToRelative(-1.51f)
                curveToRelative(3.69f, -0.15f, 7.69f, -0.8f, 8.6f, -0.98f)
                curveToRelative(0.23f, -0.04f, 0.41f, -0.25f, 0.41f, -0.49f)
                curveToRelative(0f, -7.17f, -2.95f, -10.92f, -9f, -11.44f)
                verticalLineToRelative(-1.56f)
                horizontalLineToRelative(1.5f)
                curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                horizontalLineToRelative(-6f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(1.56f)
                curveToRelative(-6.05f, 0.51f, -9f, 4.27f, -9f, 11.44f)
                curveToRelative(0f, 0.24f, 0.17f, 0.45f, 0.41f, 0.49f)
                curveToRelative(0.91f, 0.18f, 4.9f, 0.82f, 8.6f, 0.98f)
                verticalLineToRelative(1.51f)
                curveToRelative(-4.45f, -0.15f, -7.6f, -0.92f, -7.64f, -0.93f)
                curveToRelative(-0.81f, -0.2f, -1.62f, 0.29f, -1.82f, 1.09f)
                reflectiveCurveToRelative(0.29f, 1.62f, 1.09f, 1.82f)
                curveToRelative(0.17f, 0.04f, 4.24f, 1.04f, 9.86f, 1.04f)
                reflectiveCurveToRelative(9.69f, -1.0f, 9.86f, -1.04f)
                curveToRelative(0.8f, -0.2f, 1.29f, -1.01f, 1.09f, -1.82f)
                close()
            }
        }.also { _ConciergeBell = it}
