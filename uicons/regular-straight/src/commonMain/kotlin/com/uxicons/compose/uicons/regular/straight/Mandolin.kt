package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Mandolin: ImageVector? = null

val Icons.Rs.Mandolin: ImageVector
    get() = _Mandolin ?: UXIcon(name = "Mandolin") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22f, 6f)
                lineToRelative(2.0f, -2.82f)
                lineTo(20.82f, -0.0f)
                lineToRelative(-2.82f, 2.0f)
                lineToRelative(-0.32f, 2.91f)
                lineToRelative(-2.09f, 2.09f)
                horizontalLineToRelative(-7.09f)
                curveTo(3.81f, 7f, 0f, 10.81f, 0f, 15.5f)
                curveToRelative(0f, 2.27f, 0.88f, 4.41f, 2.49f, 6.01f)
                curveToRelative(1.61f, 1.6f, 3.74f, 2.49f, 6.01f, 2.49f)
                curveToRelative(4.69f, 0f, 8.5f, -3.81f, 8.5f, -8.5f)
                verticalLineToRelative(-7.09f)
                lineToRelative(2.09f, -2.09f)
                lineToRelative(2.91f, -0.32f)
                close()
                moveTo(15f, 15.5f)
                curveToRelative(0f, 3.58f, -2.92f, 6.5f, -6.5f, 6.5f)
                curveToRelative(-1.74f, 0f, -3.37f, -0.68f, -4.6f, -1.9f)
                curveToRelative(-1.23f, -1.23f, -1.9f, -2.86f, -1.9f, -4.6f)
                curveToRelative(0f, -3.58f, 2.92f, -6.5f, 6.5f, -6.5f)
                horizontalLineToRelative(5.09f)
                lineToRelative(-3.42f, 3.42f)
                curveToRelative(-0.49f, -0.27f, -1.06f, -0.42f, -1.66f, -0.42f)
                curveToRelative(-1.93f, 0f, -3.5f, 1.57f, -3.5f, 3.5f)
                reflectiveCurveToRelative(1.57f, 3.5f, 3.5f, 3.5f)
                reflectiveCurveToRelative(3.5f, -1.57f, 3.5f, -3.5f)
                curveToRelative(0f, -0.6f, -0.15f, -1.17f, -0.42f, -1.66f)
                lineToRelative(3.42f, -3.42f)
                verticalLineToRelative(5.09f)
                close()
                moveTo(10f, 15.5f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                close()
            }
        }.also { _Mandolin = it}
