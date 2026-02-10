package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Swing: ImageVector? = null

val Icons.Rs.Swing: ImageVector
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
                horizontalLineToRelative(-3.34f)
                lineToRelative(1.5f, 10f)
                horizontalLineToRelative(-2.64f)
                lineToRelative(-0.44f, 1.37f)
                lineToRelative(2.7f, 4.63f)
                horizontalLineToRelative(-2.31f)
                lineToRelative(-2.55f, -4.37f)
                lineToRelative(-1.32f, 4.37f)
                horizontalLineToRelative(-2.09f)
                lineToRelative(1.8f, -6f)
                horizontalLineToRelative(-1.97f)
                lineToRelative(1.5f, -10f)
                horizontalLineToRelative(-5.65f)
                lineToRelative(-1.24f, 7f)
                horizontalLineToRelative(4.05f)
                verticalLineToRelative(1.71f)
                lineToRelative(-2.09f, 4.69f)
                lineToRelative(-1.83f, -0.81f)
                lineToRelative(1.6f, -3.59f)
                lineTo(4.37f, 17f)
                lineToRelative(2.28f, 7f)
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
                moveTo(7.15f, 8f)
                horizontalLineToRelative(-1.98f)
                lineToRelative(-1.07f, 6.28f)
                curveToRelative(-0.04f, 0.24f, -0.06f, 0.48f, -0.07f, 0.72f)
                horizontalLineToRelative(1.88f)
                lineToRelative(1.24f, -7f)
                close()
                moveTo(18.64f, 8f)
                horizontalLineToRelative(-1.78f)
                lineToRelative(-1.2f, 8f)
                horizontalLineToRelative(4.18f)
                lineToRelative(-1.2f, -8f)
                close()
            }
        }.also { _Swing = it}
