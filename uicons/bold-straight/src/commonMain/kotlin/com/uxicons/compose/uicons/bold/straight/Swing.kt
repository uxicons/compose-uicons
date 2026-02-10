package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Swing: ImageVector? = null

val Icons.Bs.Swing: ImageVector
    get() = _Swing ?: UXIcon(name = "Swing") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(4f, 2.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
                close()
                moveTo(17.5f, 5f)
                curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
                reflectiveCurveToRelative(-1.12f, -2.5f, -2.5f, -2.5f)
                reflectiveCurveToRelative(-2.5f, 1.12f, -2.5f, 2.5f)
                reflectiveCurveToRelative(1.12f, 2.5f, 2.5f, 2.5f)
                close()
                moveTo(24f, 9f)
                horizontalLineToRelative(-2.82f)
                lineToRelative(1f, 9f)
                horizontalLineToRelative(-2.17f)
                lineToRelative(-0.39f, 1.18f)
                lineToRelative(2.89f, 4.82f)
                horizontalLineToRelative(-3.69f)
                lineToRelative(-1.8f, -3.1f)
                lineToRelative(-0.93f, 3.1f)
                horizontalLineToRelative(-3.13f)
                lineToRelative(1.8f, -6f)
                horizontalLineToRelative(-1.43f)
                lineToRelative(1f, -9f)
                horizontalLineToRelative(-5.99f)
                lineToRelative(-0.59f, 5f)
                horizontalLineToRelative(4.25f)
                verticalLineToRelative(2.27f)
                lineToRelative(-2.09f, 5.75f)
                lineToRelative(-2.75f, -1.0f)
                lineToRelative(0.94f, 2.99f)
                horizontalLineToRelative(-3.15f)
                lineToRelative(-2.48f, -7.86f)
                lineToRelative(0.84f, -7.14f)
                lineTo(0f, 9f)
                lineTo(0f, 2f)
                lineTo(3f, 2f)
                lineTo(3f, 6f)
                lineTo(21f, 6f)
                lineTo(21f, 2f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(7f)
                close()
                moveTo(8.54f, 17f)
                horizontalLineToRelative(-2.65f)
                lineToRelative(1.23f, 3.9f)
                lineToRelative(1.42f, -3.9f)
                close()
                moveTo(18.16f, 9f)
                horizontalLineToRelative(-0.81f)
                lineToRelative(-0.67f, 6f)
                horizontalLineToRelative(2.15f)
                lineToRelative(-0.67f, -6f)
                close()
            }
        }.also { _Swing = it}
