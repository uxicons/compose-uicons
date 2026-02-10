package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Theta: ImageVector? = null

val Icons.Tr.Theta: ImageVector
    get() = _Theta ?: UXIcon(name = "Theta") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 0f)
                curveTo(7.04f, 0f, 3f, 5.38f, 3f, 12f)
                reflectiveCurveToRelative(4.04f, 12f, 9f, 12f)
                reflectiveCurveToRelative(9f, -5.38f, 9f, -12f)
                reflectiveCurveTo(16.96f, 0f, 12f, 0f)
                close()
                moveTo(12f, 1f)
                curveToRelative(4.29f, 0f, 7.8f, 4.67f, 7.99f, 10.5f)
                lineTo(4.01f, 11.5f)
                curveToRelative(0.19f, -5.83f, 3.7f, -10.5f, 7.99f, -10.5f)
                close()
                moveTo(12f, 23f)
                curveToRelative(-4.29f, 0f, -7.8f, -4.67f, -7.99f, -10.5f)
                horizontalLineToRelative(15.98f)
                curveToRelative(-0.19f, 5.83f, -3.7f, 10.5f, -7.99f, 10.5f)
                close()
            }
        }.also { _Theta = it}
