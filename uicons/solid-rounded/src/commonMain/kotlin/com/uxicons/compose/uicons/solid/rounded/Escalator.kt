package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Escalator: ImageVector? = null

val Icons.Sr.Escalator: ImageVector
    get() = _Escalator ?: UXIcon(name = "Escalator") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(8.5f, 0f)
                curveTo(9.88f, 0f, 11f, 1.12f, 11f, 2.5f)
                reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
                reflectiveCurveTo(7.12f, 0f, 8.5f, 0f)
                close()
                moveTo(9.04f, 22.58f)
                lineToRelative(11.32f, -9.58f)
                horizontalLineToRelative(0.13f)
                curveToRelative(1.93f, 0f, 3.5f, -1.57f, 3.5f, -3.5f)
                reflectiveCurveToRelative(-1.57f, -3.5f, -3.5f, -3.5f)
                horizontalLineToRelative(-1.67f)
                curveToRelative(-1.42f, 0f, -2.79f, 0.5f, -3.88f, 1.42f)
                lineTo(3.63f, 17f)
                horizontalLineToRelative(-0.13f)
                curveToRelative(-1.93f, 0f, -3.5f, 1.57f, -3.5f, 3.5f)
                reflectiveCurveToRelative(1.57f, 3.5f, 3.5f, 3.5f)
                horizontalLineToRelative(1.67f)
                curveToRelative(1.42f, 0f, 2.79f, -0.5f, 3.88f, -1.42f)
                close()
                moveTo(11.5f, 7.72f)
                curveToRelative(-0.61f, -1.03f, -1.72f, -1.73f, -3.0f, -1.73f)
                curveToRelative(-1.93f, 0f, -3.5f, 1.57f, -3.5f, 3.5f)
                verticalLineToRelative(3.73f)
                lineToRelative(6.5f, -5.5f)
                close()
            }
        }.also { _Escalator = it}
