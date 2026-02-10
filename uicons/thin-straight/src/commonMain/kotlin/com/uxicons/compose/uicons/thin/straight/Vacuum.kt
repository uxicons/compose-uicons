package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Vacuum: ImageVector? = null

val Icons.Ts.Vacuum: ImageVector
    get() = _Vacuum ?: UXIcon(name = "Vacuum") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 16.26f)
                verticalLineToRelative(-2.51f)
                curveToRelative(0f, -3.12f, -2.12f, -5.74f, -5f, -6.51f)
                verticalLineToRelative(-2.74f)
                curveToRelative(0f, -2.48f, -2.02f, -4.5f, -4.5f, -4.5f)
                horizontalLineToRelative(-2.56f)
                curveToRelative(-2.24f, 0f, -4.11f, 1.61f, -4.45f, 3.82f)
                lineToRelative(-2.92f, 19.18f)
                lineTo(0f, 23f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(5.43f)
                lineTo(8.48f, 3.97f)
                curveToRelative(0.26f, -1.72f, 1.72f, -2.97f, 3.46f, -2.97f)
                horizontalLineToRelative(2.56f)
                curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
                verticalLineToRelative(2.54f)
                curveToRelative(-0.25f, -0.03f, -0.5f, -0.04f, -0.75f, -0.04f)
                horizontalLineToRelative(-4.25f)
                verticalLineToRelative(17f)
                horizontalLineToRelative(7.72f)
                curveToRelative(1.82f, -0.12f, 3.28f, -1.65f, 3.28f, -3.5f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                reflectiveCurveToRelative(-3.5f, 1.57f, -3.5f, 3.5f)
                curveToRelative(0f, 0.98f, 0.41f, 1.86f, 1.06f, 2.5f)
                horizontalLineToRelative(-4.06f)
                verticalLineToRelative(-15f)
                horizontalLineToRelative(3.25f)
                curveToRelative(3.17f, 0f, 5.75f, 2.58f, 5.75f, 5.75f)
                verticalLineToRelative(1.85f)
                curveToRelative(0.36f, 0.18f, 0.69f, 0.4f, 1f, 0.65f)
                close()
                moveTo(18f, 20.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
                close()
            }
        }.also { _Vacuum = it}
