package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Swing: ImageVector? = null

val Icons.Ss.Swing: ImageVector
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
                moveTo(24f, 8f)
                horizontalLineToRelative(-3.64f)
                lineToRelative(1.5f, 10f)
                horizontalLineToRelative(-2.34f)
                lineToRelative(-0.44f, 1.37f)
                lineToRelative(2.7f, 4.63f)
                horizontalLineToRelative(-2.31f)
                lineToRelative(-2.55f, -4.37f)
                lineToRelative(-1.32f, 4.37f)
                horizontalLineToRelative(-2.09f)
                lineToRelative(1.8f, -6f)
                horizontalLineToRelative(-1.97f)
                lineToRelative(1.5f, -10f)
                horizontalLineToRelative(-6.68f)
                lineToRelative(-1.24f, 6f)
                horizontalLineToRelative(5.08f)
                verticalLineToRelative(1.71f)
                lineToRelative(-2.09f, 5.69f)
                lineToRelative(-1.83f, -0.81f)
                lineToRelative(1.6f, -4.59f)
                lineTo(4.15f, 16f)
                lineToRelative(2.5f, 8f)
                horizontalLineToRelative(-2.1f)
                lineToRelative(-2.17f, -6.69f)
                curveToRelative(-0.35f, -1.09f, -0.43f, -2.26f, -0.24f, -3.38f)
                lineToRelative(1.05f, -5.93f)
                lineTo(0f, 8f)
                lineTo(0f, 2f)
                lineTo(2f, 2f)
                lineTo(2f, 6f)
                lineTo(22f, 6f)
                lineTo(22f, 2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(6f)
                close()
            }
        }.also { _Swing = it}
