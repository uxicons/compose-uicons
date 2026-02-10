package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CrossCircle: ImageVector? = null

val Icons.Sr.CrossCircle: ImageVector
    get() = _CrossCircle ?: UXIcon(name = "CrossCircle", viewportWidth = 512f, viewportHeight = 512f) {
            path(fill = SolidColor(Color.Black)) {
                moveTo(256f, 0f)
                curveTo(114.61f, 0f, 0f, 114.61f, 0f, 256f)
                reflectiveCurveToRelative(114.61f, 256f, 256f, 256f)
                reflectiveCurveToRelative(256f, -114.61f, 256f, -256f)
                curveTo(511.85f, 114.68f, 397.32f, 0.15f, 256f, 0f)
                close()
                moveTo(341.33f, 311.19f)
                curveToRelative(8.67f, 7.98f, 9.23f, 21.48f, 1.25f, 30.14f)
                curveToRelative(-7.98f, 8.67f, -21.48f, 9.23f, -30.14f, 1.25f)
                curveToRelative(-0.43f, -0.4f, -0.85f, -0.82f, -1.25f, -1.25f)
                lineTo(256f, 286.17f)
                lineToRelative(-55.17f, 55.17f)
                curveToRelative(-8.48f, 8.19f, -21.98f, 7.95f, -30.17f, -0.52f)
                curveToRelative(-7.98f, -8.27f, -7.98f, -21.37f, 0f, -29.64f)
                lineTo(225.84f, 256f)
                lineToRelative(-55.17f, -55.17f)
                curveToRelative(-8.19f, -8.48f, -7.95f, -21.98f, 0.52f, -30.17f)
                curveToRelative(8.27f, -7.98f, 21.37f, -7.98f, 29.64f, 0f)
                lineTo(256f, 225.84f)
                lineToRelative(55.19f, -55.17f)
                curveToRelative(7.98f, -8.67f, 21.48f, -9.23f, 30.14f, -1.25f)
                curveToRelative(8.67f, 7.98f, 9.23f, 21.48f, 1.25f, 30.14f)
                curveToRelative(-0.4f, 0.43f, -0.82f, 0.85f, -1.25f, 1.25f)
                lineTo(286.17f, 256f)
                lineTo(341.33f, 311.19f)
                close()
            }
        }.also { _CrossCircle = it}
