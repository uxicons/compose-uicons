package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Banjo: ImageVector? = null

val Icons.Ts.Banjo: ImageVector
    get() = _Banjo ?: UXIcon(name = "Banjo") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21.15f, 6f)
                lineToRelative(2.86f, -2.85f)
                lineTo(20.86f, -0.0f)
                lineToRelative(-2.86f, 2.85f)
                verticalLineToRelative(2.44f)
                lineToRelative(-5.57f, 5.57f)
                curveToRelative(-1.32f, -1.16f, -3.05f, -1.86f, -4.93f, -1.86f)
                curveToRelative(-4.14f, 0f, -7.5f, 3.36f, -7.5f, 7.5f)
                reflectiveCurveToRelative(3.36f, 7.5f, 7.5f, 7.5f)
                reflectiveCurveToRelative(7.5f, -3.36f, 7.5f, -7.5f)
                curveToRelative(0f, -1.89f, -0.7f, -3.62f, -1.86f, -4.93f)
                lineToRelative(5.57f, -5.57f)
                horizontalLineToRelative(2.44f)
                close()
                moveTo(19f, 3.26f)
                lineToRelative(1.85f, -1.85f)
                lineToRelative(1.73f, 1.74f)
                lineToRelative(-1.86f, 1.85f)
                horizontalLineToRelative(-1.73f)
                verticalLineToRelative(-1.74f)
                close()
                moveTo(7.5f, 23f)
                curveToRelative(-3.58f, 0f, -6.5f, -2.92f, -6.5f, -6.5f)
                reflectiveCurveToRelative(2.92f, -6.5f, 6.5f, -6.5f)
                reflectiveCurveToRelative(6.5f, 2.92f, 6.5f, 6.5f)
                reflectiveCurveToRelative(-2.92f, 6.5f, -6.5f, 6.5f)
                close()
                moveTo(4.35f, 15.65f)
                lineToRelative(4f, 4f)
                lineToRelative(-0.71f, 0.71f)
                lineToRelative(-4f, -4f)
                lineToRelative(0.71f, -0.71f)
                close()
            }
        }.also { _Banjo = it}
