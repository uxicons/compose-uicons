package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Sink: ImageVector? = null

val Icons.Sc.Sink: ImageVector
    get() = _Sink ?: UXIcon(name = "Sink") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22f, 12f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                verticalLineToRelative(0.5f)
                horizontalLineToRelative(-3.54f)
                curveToRelative(0.01f, -2.34f, 0.12f, -5.39f, 1.15f, -7.5f)
                curveToRelative(0.19f, -0.29f, 0.11f, -0.46f, 1.4f, -0.5f)
                curveToRelative(1.32f, 0f, 1.5f, 0.18f, 1.5f, 1.5f)
                curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                curveToRelative(0f, -2.99f, -1.51f, -4.5f, -4.5f, -4.5f)
                curveToRelative(-0.73f, -0.04f, -3.09f, 0.1f, -4.02f, 2.04f)
                curveToRelative(-1.37f, 2.71f, -1.51f, 6.28f, -1.52f, 8.96f)
                horizontalLineToRelative(-3.46f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                verticalLineToRelative(0.5f)
                horizontalLineToRelative(-2f)
                curveToRelative(-0.55f, -0.01f, -1.03f, 0.49f, -1.0f, 1.04f)
                curveToRelative(0.29f, 6.89f, 3.68f, 9.96f, 11.0f, 9.96f)
                reflectiveCurveToRelative(10.71f, -3.07f, 11.0f, -9.96f)
                curveToRelative(0.04f, -0.55f, -0.45f, -1.05f, -1.0f, -1.04f)
                close()
            }
        }.also { _Sink = it}
