package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PersonThroughWindow: ImageVector? = null

val Icons.Ss.PersonThroughWindow: ImageVector
    get() = _PersonThroughWindow ?: UXIcon(name = "PersonThroughWindow") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10.84f, 20f)
                horizontalLineToRelative(2.19f)
                lineToRelative(1.78f, 4f)
                horizontalLineToRelative(-2.19f)
                lineToRelative(-1.78f, -4f)
                close()
                moveTo(10.6f, 9.86f)
                reflectiveCurveToRelative(-1.64f, 0.93f, -1.65f, 0.97f)
                lineToRelative(1.86f, 4.18f)
                horizontalLineToRelative(2.09f)
                lineToRelative(-2.29f, -5.14f)
                close()
                moveTo(24f, 20f)
                lineTo(13.03f, 20f)
                lineToRelative(-1.33f, -3f)
                horizontalLineToRelative(6.38f)
                lineToRelative(0.98f, 1f)
                horizontalLineToRelative(2.8f)
                lineToRelative(-2.94f, -3f)
                horizontalLineToRelative(-3.84f)
                lineToRelative(-2.71f, -6.09f)
                lineToRelative(3.01f, -1.61f)
                lineToRelative(2.79f, -4.31f)
                horizontalLineToRelative(-2.42f)
                lineToRelative(-1.75f, 2.77f)
                lineToRelative(-5.96f, 3.18f)
                curveToRelative(-1.06f, 0.57f, -1.89f, 1.5f, -2.32f, 2.63f)
                lineToRelative(-2.45f, 6.42f)
                horizontalLineToRelative(2.14f)
                lineToRelative(2.1f, -5.49f)
                lineToRelative(3.33f, 7.49f)
                lineTo(0f, 20f)
                lineTo(0f, 3f)
                curveTo(0f, 1.34f, 1.34f, 0f, 3f, 0f)
                lineTo(21f, 0f)
                curveToRelative(1.66f, 0f, 3f, 1.34f, 3f, 3f)
                lineTo(24f, 20f)
                close()
                moveTo(10f, 5.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                reflectiveCurveToRelative(-2.5f, 1.12f, -2.5f, 2.5f)
                reflectiveCurveToRelative(1.12f, 2.5f, 2.5f, 2.5f)
                reflectiveCurveToRelative(2.5f, -1.12f, 2.5f, -2.5f)
                close()
            }
        }.also { _PersonThroughWindow = it}
