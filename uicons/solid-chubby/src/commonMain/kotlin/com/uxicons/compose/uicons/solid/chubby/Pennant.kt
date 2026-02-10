package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Pennant: ImageVector? = null

val Icons.Sc.Pennant: ImageVector
    get() = _Pennant ?: UXIcon(name = "Pennant") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.55f, 10.76f)
                lineToRelative(-0.74f, -0.69f)
                curveToRelative(-3.36f, -3.17f, -7.45f, -5.32f, -11.91f, -6.28f)
                curveToRelative(0.01f, -0.12f, 0.02f, -0.25f, 0.02f, -0.38f)
                curveToRelative(0f, -1.46f, -0.94f, -2.4f, -2.39f, -2.4f)
                reflectiveCurveToRelative(-2.39f, 0.94f, -2.39f, 2.4f)
                curveToRelative(0f, 0.86f, 0.32f, 1.54f, 0.89f, 1.95f)
                verticalLineTo(21.5f)
                curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                verticalLineToRelative(-2.21f)
                curveToRelative(4.8f, -0.87f, 9.19f, -3.08f, 12.77f, -6.45f)
                lineToRelative(0.74f, -0.69f)
                curveToRelative(0.19f, -0.18f, 0.3f, -0.43f, 0.3f, -0.69f)
                reflectiveCurveToRelative(-0.11f, -0.51f, -0.3f, -0.69f)
                close()
            }
        }.also { _Pennant = it}
