package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PersonThroughWindow: ImageVector? = null

val Icons.Rs.PersonThroughWindow: ImageVector
    get() = _PersonThroughWindow ?: UXIcon(name = "PersonThroughWindow") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10f, 5.5f)
                curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
                reflectiveCurveToRelative(1.12f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
                close()
                moveTo(24f, 3f)
                lineTo(24f, 22f)
                horizontalLineToRelative(-7.88f)
                lineToRelative(-0.91f, -2f)
                horizontalLineToRelative(5.81f)
                lineToRelative(-2.94f, -3f)
                horizontalLineToRelative(-6.38f)
                lineToRelative(3.11f, 7f)
                horizontalLineToRelative(-2.19f)
                lineToRelative(-0.89f, -2f)
                lineTo(0f, 22f)
                lineTo(0f, 3f)
                curveTo(0f, 1.35f, 1.35f, 0f, 3f, 0f)
                lineTo(21f, 0f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                close()
                moveTo(10.8f, 15f)
                horizontalLineToRelative(2.09f)
                lineToRelative(-2.29f, -5.14f)
                reflectiveCurveToRelative(-1.66f, 0.89f, -1.68f, 0.9f)
                lineToRelative(1.89f, 4.24f)
                close()
                moveTo(18.92f, 15f)
                lineToRelative(3.08f, 3.14f)
                lineTo(22f, 3f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                lineTo(3f, 2f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                lineTo(2f, 20f)
                lineTo(10.84f, 20f)
                lineToRelative(-3.33f, -7.49f)
                lineToRelative(-2.1f, 5.49f)
                lineTo(3.27f, 18f)
                lineToRelative(2.45f, -6.42f)
                curveToRelative(0.43f, -1.13f, 1.25f, -2.06f, 2.32f, -2.63f)
                lineToRelative(5.96f, -3.18f)
                lineToRelative(1.21f, -1.77f)
                horizontalLineToRelative(2.42f)
                lineToRelative(-2.26f, 3.31f)
                lineToRelative(-3.01f, 1.61f)
                lineToRelative(2.71f, 6.09f)
                horizontalLineToRelative(3.84f)
                close()
            }
        }.also { _PersonThroughWindow = it}
