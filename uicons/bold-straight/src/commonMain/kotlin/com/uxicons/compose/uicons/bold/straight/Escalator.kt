package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Escalator: ImageVector? = null

val Icons.Bs.Escalator: ImageVector
    get() = _Escalator ?: UXIcon(name = "Escalator") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(6f, 2.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
                close()
                moveTo(24f, 5f)
                verticalLineToRelative(9.0f)
                horizontalLineToRelative(-3.96f)
                reflectiveCurveToRelative(-10.47f, 8.72f, -10.47f, 8.72f)
                curveToRelative(-0.99f, 0.82f, -2.24f, 1.27f, -3.52f, 1.27f)
                lineTo(0f, 24f)
                verticalLineToRelative(-9f)
                horizontalLineToRelative(3.96f)
                lineToRelative(1.04f, -0.87f)
                verticalLineToRelative(-6.13f)
                curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                horizontalLineToRelative(3f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                verticalLineToRelative(0.3f)
                lineToRelative(2.43f, -2.02f)
                curveToRelative(0.99f, -0.82f, 2.24f, -1.27f, 3.52f, -1.27f)
                horizontalLineToRelative(6.05f)
                close()
                moveTo(21f, 8f)
                horizontalLineToRelative(-3.05f)
                curveToRelative(-0.58f, 0f, -1.15f, 0.21f, -1.6f, 0.58f)
                lineToRelative(-11.3f, 9.42f)
                horizontalLineToRelative(-2.04f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(3.05f)
                curveToRelative(0.58f, 0f, 1.15f, -0.21f, 1.6f, -0.58f)
                lineToRelative(11.3f, -9.42f)
                horizontalLineToRelative(2.04f)
                reflectiveCurveToRelative(0f, -3f, 0f, -3f)
                close()
            }
        }.also { _Escalator = it}
