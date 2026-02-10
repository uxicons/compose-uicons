package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Power: ImageVector? = null

val Icons.Sc.Power: ImageVector
    get() = _Power ?: UXIcon(name = "Power") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 8.28f)
                curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
                verticalLineTo(2.5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                verticalLineTo(6.78f)
                curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(18.44f, 3.09f)
                curveToRelative(-0.72f, -0.41f, -1.64f, -0.17f, -2.05f, 0.55f)
                curveToRelative(-0.41f, 0.72f, -0.17f, 1.64f, 0.55f, 2.05f)
                curveToRelative(1.15f, 0.66f, 2.68f, 2.08f, 2.68f, 6.67f)
                curveToRelative(0f, 6.36f, -2.92f, 7.64f, -7.62f, 7.64f)
                reflectiveCurveToRelative(-7.62f, -1.28f, -7.62f, -7.64f)
                curveToRelative(0f, -4.57f, 1.53f, -5.99f, 2.69f, -6.66f)
                curveToRelative(0.72f, -0.42f, 0.96f, -1.33f, 0.54f, -2.05f)
                curveToRelative(-0.42f, -0.72f, -1.33f, -0.96f, -2.05f, -0.54f)
                curveTo(2.74f, 4.74f, 1.38f, 7.76f, 1.38f, 12.36f)
                curveToRelative(0f, 9.54f, 6.06f, 10.64f, 10.62f, 10.64f)
                reflectiveCurveToRelative(10.62f, -1.1f, 10.62f, -10.64f)
                curveToRelative(0f, -4.61f, -1.37f, -7.64f, -4.18f, -9.27f)
                close()
            }
        }.also { _Power = it}
