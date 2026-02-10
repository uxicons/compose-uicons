package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Kidneys: ImageVector? = null

val Icons.Sc.Kidneys: ImageVector
    get() = _Kidneys ?: UXIcon(name = "Kidneys") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(10.63f, 8.91f)
                curveToRelative(0.33f, 0.67f, 0.39f, 1.72f, 0.37f, 2.09f)
                verticalLineToRelative(10.5f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                verticalLineToRelative(-6.68f)
                curveToRelative(-0.46f, 0.11f, -0.95f, 0.18f, -1.5f, 0.18f)
                curveToRelative(-3.7f, 0f, -5.5f, -2.29f, -5.5f, -7f)
                reflectiveCurveToRelative(1.8f, -7f, 5.5f, -7f)
                curveToRelative(2.86f, 0f, 4.5f, 1.46f, 4.5f, 4f)
                curveToRelative(0f, 0.54f, -0.01f, 1.96f, -0.94f, 2.95f)
                curveToRelative(0.22f, 0.25f, 0.42f, 0.61f, 0.57f, 0.96f)
                close()
                moveTo(17.5f, 1f)
                curveToRelative(-2.86f, 0f, -4.5f, 1.46f, -4.5f, 4f)
                curveToRelative(0f, 0.54f, 0.01f, 1.96f, 0.94f, 2.95f)
                curveToRelative(-0.67f, 0.67f, -1.02f, 2.37f, -0.94f, 3.05f)
                verticalLineToRelative(10.5f)
                curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                verticalLineToRelative(-6.68f)
                curveToRelative(0.46f, 0.11f, 0.95f, 0.18f, 1.5f, 0.18f)
                curveToRelative(3.7f, 0f, 5.5f, -2.29f, 5.5f, -7f)
                reflectiveCurveToRelative(-1.8f, -7f, -5.5f, -7f)
                close()
            }
        }.also { _Kidneys = it}
