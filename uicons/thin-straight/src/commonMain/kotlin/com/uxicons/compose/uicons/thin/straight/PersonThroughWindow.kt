package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PersonThroughWindow: ImageVector? = null

val Icons.Ts.PersonThroughWindow: ImageVector
    get() = _PersonThroughWindow ?: UXIcon(name = "PersonThroughWindow") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(7.5f, 3f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                reflectiveCurveToRelative(1.12f, 2.5f, 2.5f, 2.5f)
                reflectiveCurveToRelative(2.5f, -1.12f, 2.5f, -2.5f)
                reflectiveCurveToRelative(-1.12f, -2.5f, -2.5f, -2.5f)
                close()
                moveTo(7.5f, 7f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                close()
                moveTo(21.5f, 0f)
                lineTo(2.5f, 0f)
                curveTo(1.12f, 0f, 0f, 1.12f, 0f, 2.5f)
                lineTo(0f, 21f)
                lineTo(11.85f, 21f)
                lineToRelative(1.33f, 3f)
                horizontalLineToRelative(1.09f)
                lineToRelative(-3.1f, -7f)
                horizontalLineToRelative(7.66f)
                lineToRelative(2.94f, 3f)
                horizontalLineToRelative(-7.09f)
                lineToRelative(0.44f, 1f)
                horizontalLineToRelative(8.87f)
                lineTo(24.0f, 2.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                close()
                moveTo(8.32f, 10.56f)
                curveToRelative(0.14f, -0.1f, 0.28f, -0.2f, 0.43f, -0.28f)
                lineToRelative(2.14f, -1.14f)
                lineToRelative(3.06f, 6.87f)
                horizontalLineToRelative(-3.22f)
                lineToRelative(-2.41f, -5.44f)
                close()
                moveTo(15.04f, 16f)
                lineToRelative(-3.27f, -7.34f)
                lineToRelative(3.27f, -1.74f)
                lineToRelative(2.46f, -3.92f)
                horizontalLineToRelative(-1.21f)
                lineToRelative(-1.94f, 3.15f)
                lineToRelative(-6.07f, 3.24f)
                curveToRelative(-0.96f, 0.51f, -1.7f, 1.35f, -2.09f, 2.37f)
                lineToRelative(-2.38f, 6.24f)
                horizontalLineToRelative(1.07f)
                lineToRelative(2.25f, -5.88f)
                curveToRelative(0.11f, -0.28f, 0.26f, -0.54f, 0.44f, -0.79f)
                lineToRelative(3.84f, 8.67f)
                lineTo(1f, 20.0f)
                lineTo(1f, 2.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                lineTo(21.5f, 1f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                lineTo(23f, 19.82f)
                lineToRelative(-3.75f, -3.83f)
                horizontalLineToRelative(-4.2f)
                close()
            }
        }.also { _PersonThroughWindow = it}
