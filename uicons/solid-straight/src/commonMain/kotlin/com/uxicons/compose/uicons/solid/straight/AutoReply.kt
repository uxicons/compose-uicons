package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _AutoReply: ImageVector? = null

val Icons.Ss.AutoReply: ImageVector
    get() = _AutoReply ?: UXIcon(name = "AutoReply") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18f, 12f)
                curveToRelative(-3.31f, 0f, -6f, 2.69f, -6f, 6f)
                reflectiveCurveToRelative(2.69f, 6f, 6f, 6f)
                reflectiveCurveToRelative(6f, -2.69f, 6f, -6f)
                reflectiveCurveToRelative(-2.69f, -6f, -6f, -6f)
                close()
                moveTo(21f, 19f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(2.45f)
                lineToRelative(-2.69f, -2.69f)
                curveToRelative(-0.42f, -0.42f, -0.42f, -1.09f, 0f, -1.51f)
                lineToRelative(2.69f, -2.69f)
                verticalLineToRelative(2.43f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(2f)
                close()
                moveTo(10.07f, 19f)
                horizontalLineToRelative(-2.29f)
                lineToRelative(-4.48f, 2.67f)
                curveToRelative(-0.63f, 0.42f, -1.48f, 0.45f, -2.16f, 0.08f)
                curveToRelative(-0.7f, -0.38f, -1.14f, -1.1f, -1.14f, -1.89f)
                lineTo(-0.0f, 3f)
                curveTo(0f, 1.35f, 1.35f, 0f, 3f, 0f)
                lineTo(19f, 0f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                lineTo(22f, 11.08f)
                curveToRelative(-1.18f, -0.68f, -2.54f, -1.08f, -4f, -1.08f)
                curveToRelative(-4.42f, 0f, -8f, 3.58f, -8f, 8f)
                curveToRelative(0f, 0.34f, 0.03f, 0.67f, 0.07f, 1f)
                close()
            }
        }.also { _AutoReply = it}
