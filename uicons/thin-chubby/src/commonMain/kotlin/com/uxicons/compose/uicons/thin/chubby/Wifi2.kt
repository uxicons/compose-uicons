package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Wifi2: ImageVector? = null

val Icons.Tc.Wifi2: ImageVector
    get() = _Wifi2 ?: UXIcon(name = "Wifi2") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(18.86f, 9.61f)
                curveToRelative(-2.0f, -2.03f, -4.38f, -3.11f, -6.86f, -3.11f)
                reflectiveCurveToRelative(-4.85f, 1.07f, -6.86f, 3.11f)
                curveToRelative(-0.19f, 0.2f, -0.19f, 0.51f, 0.01f, 0.71f)
                curveToRelative(0.19f, 0.19f, 0.51f, 0.19f, 0.71f, -0.01f)
                curveToRelative(1.81f, -1.84f, 3.94f, -2.81f, 6.14f, -2.81f)
                reflectiveCurveToRelative(4.33f, 0.97f, 6.14f, 2.81f)
                curveToRelative(0.1f, 0.1f, 0.41f, 0.28f, 0.71f, 0.01f)
                curveToRelative(0.2f, -0.19f, 0.2f, -0.51f, 0.01f, -0.71f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 13.22f)
                curveToRelative(-1.41f, 0f, -2.12f, 0.72f, -2.12f, 2.14f)
                reflectiveCurveToRelative(0.71f, 2.14f, 2.12f, 2.14f)
                curveToRelative(1.43f, 0f, 2.12f, -0.7f, 2.12f, -2.14f)
                curveToRelative(0f, -1.42f, -0.71f, -2.14f, -2.12f, -2.14f)
                close()
                moveTo(12f, 16.5f)
                curveToRelative(-0.96f, 0f, -1.12f, -0.37f, -1.12f, -1.14f)
                reflectiveCurveToRelative(0.17f, -1.14f, 1.12f, -1.14f)
                curveToRelative(0.86f, 0f, 1.12f, 0.27f, 1.12f, 1.14f)
                curveToRelative(0f, 0.77f, -0.17f, 1.14f, -1.12f, 1.14f)
                close()
            }
        }.also { _Wifi2 = it}
