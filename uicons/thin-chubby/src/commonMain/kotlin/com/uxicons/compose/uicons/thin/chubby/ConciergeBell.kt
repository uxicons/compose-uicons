package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ConciergeBell: ImageVector? = null

val Icons.Tc.ConciergeBell: ImageVector
    get() = _ConciergeBell ?: UXIcon(name = "ConciergeBell") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22.42f, 21.01f)
                curveToRelative(-0.06f, 0.01f, -5.44f, 0.92f, -9.92f, 0.99f)
                verticalLineToRelative(-2.5f)
                curveToRelative(4.86f, -0.09f, 9.91f, -1.45f, 10.13f, -1.51f)
                curveToRelative(0.22f, -0.06f, 0.37f, -0.26f, 0.37f, -0.48f)
                curveToRelative(0f, -8.06f, -3.82f, -12.77f, -10.5f, -12.99f)
                verticalLineToRelative(-2.51f)
                horizontalLineToRelative(2.5f)
                curveToRelative(0.28f, 0f, 0.5f, -0.22f, 0.5f, -0.5f)
                reflectiveCurveToRelative(-0.22f, -0.5f, -0.5f, -0.5f)
                horizontalLineToRelative(-6f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                reflectiveCurveToRelative(0.22f, 0.5f, 0.5f, 0.5f)
                horizontalLineToRelative(2.5f)
                verticalLineToRelative(2.51f)
                curveToRelative(-6.68f, 0.22f, -10.5f, 4.93f, -10.5f, 12.99f)
                curveToRelative(0f, 0.23f, 0.15f, 0.42f, 0.37f, 0.48f)
                curveToRelative(0.22f, 0.06f, 5.27f, 1.42f, 10.13f, 1.51f)
                verticalLineToRelative(2.5f)
                curveToRelative(-4.48f, -0.07f, -9.86f, -0.98f, -9.92f, -0.99f)
                curveToRelative(-0.27f, -0.05f, -0.53f, 0.14f, -0.58f, 0.41f)
                curveToRelative(-0.05f, 0.27f, 0.14f, 0.53f, 0.41f, 0.58f)
                curveToRelative(0.06f, 0.01f, 5.93f, 1.01f, 10.58f, 1.01f)
                reflectiveCurveToRelative(10.53f, -1.0f, 10.58f, -1.01f)
                curveToRelative(0.27f, -0.05f, 0.46f, -0.3f, 0.41f, -0.58f)
                curveToRelative(-0.05f, -0.27f, -0.3f, -0.46f, -0.58f, -0.41f)
                close()
                moveTo(12f, 5.5f)
                curveToRelative(3.69f, 0f, 9.84f, 1.52f, 10.0f, 11.61f)
                curveToRelative(-1.31f, 0.33f, -5.86f, 1.39f, -10.0f, 1.39f)
                reflectiveCurveToRelative(-8.69f, -1.06f, -10.0f, -1.39f)
                curveToRelative(0.15f, -10.09f, 6.31f, -11.61f, 10.0f, -11.61f)
                close()
            }
        }.also { _ConciergeBell = it}
