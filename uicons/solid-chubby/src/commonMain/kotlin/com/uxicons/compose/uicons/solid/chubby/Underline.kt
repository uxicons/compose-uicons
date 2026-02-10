package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Underline: ImageVector? = null

val Icons.Sc.Underline: ImageVector
    get() = _Underline ?: UXIcon(name = "Underline") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19.38f, 20f)
                horizontalLineTo(4.62f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(14.76f)
                curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 18.43f)
                curveToRelative(6.29f, 0f, 7.52f, -4.53f, 7.52f, -12.34f)
                curveToRelative(0f, -1.37f, -0.06f, -2.63f, -0.18f, -3.75f)
                curveToRelative(-0.09f, -0.82f, -0.83f, -1.43f, -1.65f, -1.33f)
                curveToRelative(-0.82f, 0.09f, -1.42f, 0.82f, -1.33f, 1.65f)
                curveToRelative(0.11f, 1.01f, 0.16f, 2.17f, 0.16f, 3.43f)
                curveToRelative(0f, 9.34f, -2.09f, 9.34f, -4.52f, 9.34f)
                reflectiveCurveToRelative(-4.51f, 0f, -4.51f, -9.34f)
                curveToRelative(0f, -1.27f, 0.06f, -2.42f, 0.16f, -3.43f)
                curveToRelative(0.09f, -0.82f, -0.51f, -1.56f, -1.33f, -1.65f)
                curveToRelative(-0.83f, -0.09f, -1.56f, 0.51f, -1.65f, 1.33f)
                curveToRelative(-0.12f, 1.11f, -0.18f, 2.37f, -0.18f, 3.75f)
                curveToRelative(0f, 7.82f, 1.23f, 12.34f, 7.51f, 12.34f)
                close()
            }
        }.also { _Underline = it}
