package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Theta: ImageVector? = null

val Icons.Rs.Theta: ImageVector
    get() = _Theta ?: UXIcon(name = "Theta") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 0f)
                curveTo(7.04f, 0f, 3f, 5.38f, 3f, 12f)
                reflectiveCurveToRelative(4.04f, 12f, 9f, 12f)
                reflectiveCurveToRelative(9f, -5.38f, 9f, -12f)
                reflectiveCurveTo(16.96f, 0f, 12f, 0f)
                close()
                moveTo(12f, 2f)
                curveToRelative(3.62f, 0f, 6.61f, 3.95f, 6.96f, 9f)
                lineTo(5.04f, 11f)
                curveToRelative(0.35f, -5.05f, 3.34f, -9f, 6.96f, -9f)
                close()
                moveTo(12f, 22f)
                curveToRelative(-3.62f, 0f, -6.61f, -3.95f, -6.96f, -9f)
                horizontalLineToRelative(13.93f)
                curveToRelative(-0.35f, 5.05f, -3.34f, 9f, -6.96f, 9f)
                close()
            }
        }.also { _Theta = it}
