package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _AutoReply: ImageVector? = null

val Icons.Rs.AutoReply: ImageVector
    get() = _AutoReply ?: UXIcon(name = "AutoReply") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17f, 10f)
                curveToRelative(-3.86f, 0f, -7f, 3.14f, -7f, 7f)
                reflectiveCurveToRelative(3.14f, 7f, 7f, 7f)
                reflectiveCurveToRelative(7f, -3.14f, 7f, -7f)
                reflectiveCurveToRelative(-3.14f, -7f, -7f, -7f)
                close()
                moveTo(17f, 22f)
                curveToRelative(-2.76f, 0f, -5f, -2.24f, -5f, -5f)
                reflectiveCurveToRelative(2.24f, -5f, 5f, -5f)
                reflectiveCurveToRelative(5f, 2.24f, 5f, 5f)
                reflectiveCurveToRelative(-2.24f, 5f, -5f, 5f)
                close()
                moveTo(17f, 16f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(2.45f)
                lineToRelative(-2.69f, -2.69f)
                curveToRelative(-0.42f, -0.42f, -0.42f, -1.09f, 0f, -1.51f)
                lineToRelative(2.69f, -2.69f)
                verticalLineToRelative(2.43f)
                close()
                moveTo(8f, 17f)
                curveToRelative(0f, 0.69f, 0.08f, 1.36f, 0.23f, 2f)
                horizontalLineToRelative(-0.46f)
                lineToRelative(-4.48f, 2.67f)
                curveToRelative(-1.34f, 0.94f, -3.36f, -0.18f, -3.3f, -1.81f)
                lineTo(0.0f, 3f)
                curveTo(0f, 1.35f, 1.35f, 0f, 3f, 0f)
                lineTo(19f, 0f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                verticalLineToRelative(6.52f)
                curveToRelative(-0.62f, -0.41f, -1.29f, -0.74f, -2f, -0.99f)
                lineTo(20f, 3f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                lineTo(3f, 2f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                lineTo(2f, 19.86f)
                curveToRelative(-0.04f, 0.09f, 0.18f, 0.2f, 0.23f, 0.12f)
                lineToRelative(5.0f, -2.98f)
                horizontalLineToRelative(0.78f)
                close()
            }
        }.also { _AutoReply = it}
