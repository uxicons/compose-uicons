package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _AutoReply: ImageVector? = null

val Icons.Sr.AutoReply: ImageVector
    get() = _AutoReply ?: UXIcon(name = "AutoReply") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10f, 18f)
                curveToRelative(0f, 0.34f, 0.03f, 0.67f, 0.07f, 1f)
                horizontalLineToRelative(-2.29f)
                lineToRelative(-4.48f, 2.67f)
                curveToRelative(-0.63f, 0.42f, -1.48f, 0.45f, -2.16f, 0.08f)
                curveToRelative(-0.7f, -0.38f, -1.14f, -1.1f, -1.14f, -1.89f)
                lineTo(-0.0f, 5f)
                curveTo(0f, 2.24f, 2.24f, 0f, 5f, 0f)
                horizontalLineToRelative(12f)
                curveToRelative(2.76f, 0f, 5f, 2.24f, 5f, 5f)
                verticalLineToRelative(6.08f)
                curveToRelative(-1.18f, -0.68f, -2.54f, -1.08f, -4f, -1.08f)
                curveToRelative(-4.41f, 0f, -8f, 3.59f, -8f, 8f)
                close()
                moveTo(24f, 18f)
                curveToRelative(0f, 3.31f, -2.69f, 6f, -6f, 6f)
                reflectiveCurveToRelative(-6f, -2.69f, -6f, -6f)
                reflectiveCurveToRelative(2.69f, -6f, 6f, -6f)
                reflectiveCurveToRelative(6f, 2.69f, 6f, 6f)
                close()
                moveTo(22f, 18f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-1.12f)
                curveToRelative(0f, -0.35f, -0.21f, -0.68f, -0.54f, -0.81f)
                curveToRelative(-0.33f, -0.14f, -0.7f, -0.06f, -0.96f, 0.19f)
                lineToRelative(-1.5f, 1.5f)
                curveToRelative(-0.69f, 0.69f, -0.69f, 1.8f, 0f, 2.48f)
                lineToRelative(1.5f, 1.5f)
                curveToRelative(0.25f, 0.25f, 0.63f, 0.33f, 0.96f, 0.19f)
                curveToRelative(0.33f, -0.14f, 0.54f, -0.46f, 0.54f, -0.81f)
                verticalLineToRelative(-1.12f)
                horizontalLineToRelative(3f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                close()
            }
        }.also { _AutoReply = it}
