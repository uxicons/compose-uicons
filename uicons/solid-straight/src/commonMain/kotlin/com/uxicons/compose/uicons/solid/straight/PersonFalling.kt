package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PersonFalling: ImageVector? = null

val Icons.Ss.PersonFalling: ImageVector
    get() = _PersonFalling ?: UXIcon(name = "PersonFalling") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18.88f, 14f)
                horizontalLineToRelative(-4.69f)
                lineToRelative(-3.21f, -7.26f)
                lineToRelative(3.65f, -1.95f)
                lineToRelative(3.23f, -3.63f)
                lineToRelative(-1.49f, -1.33f)
                lineToRelative(-2.99f, 3.37f)
                lineToRelative(-6.43f, 3.43f)
                curveToRelative(-0.75f, 0.4f, -1.39f, 0.99f, -1.85f, 1.7f)
                lineTo(0.2f, 15.92f)
                lineToRelative(1.68f, 1.08f)
                lineToRelative(4.78f, -7.4f)
                lineToRelative(6.37f, 14.39f)
                horizontalLineToRelative(2.19f)
                lineToRelative(-3.54f, -8f)
                horizontalLineToRelative(6.37f)
                lineToRelative(3.67f, 3.74f)
                lineToRelative(1.43f, -1.4f)
                lineToRelative(-4.25f, -4.34f)
                close()
                moveTo(4f, 2.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
                close()
            }
        }.also { _PersonFalling = it}
