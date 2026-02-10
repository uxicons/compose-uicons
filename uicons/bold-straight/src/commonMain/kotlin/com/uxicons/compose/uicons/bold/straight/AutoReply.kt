package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _AutoReply: ImageVector? = null

val Icons.Bs.AutoReply: ImageVector
    get() = _AutoReply ?: UXIcon(name = "AutoReply") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17.5f, 11f)
                curveToRelative(-3.59f, 0f, -6.5f, 2.91f, -6.5f, 6.5f)
                reflectiveCurveToRelative(2.91f, 6.5f, 6.5f, 6.5f)
                reflectiveCurveToRelative(6.5f, -2.91f, 6.5f, -6.5f)
                reflectiveCurveToRelative(-2.91f, -6.5f, -6.5f, -6.5f)
                close()
                moveTo(21f, 19f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(3f)
                lineToRelative(-3.71f, -3.79f)
                curveToRelative(-0.39f, -0.39f, -0.39f, -1.02f, 0f, -1.41f)
                lineToRelative(3.71f, -3.79f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(3f)
                close()
                moveTo(9.14f, 19f)
                horizontalLineToRelative(-1.26f)
                reflectiveCurveToRelative(-5.48f, 2.92f, -5.48f, 2.92f)
                curveTo(1.23f, 22.29f, -0.01f, 21.36f, 0.01f, 20.13f)
                lineToRelative(-0.01f, -16.62f)
                curveTo(-0.04f, 1.63f, 1.62f, -0.03f, 3.5f, 0.01f)
                lineTo(18.5f, 0.0f)
                curveToRelative(1.88f, -0.04f, 3.54f, 1.62f, 3.5f, 3.5f)
                verticalLineToRelative(6.8f)
                curveToRelative(-0.9f, -0.56f, -1.91f, -0.96f, -3f, -1.16f)
                lineTo(19f, 3.5f)
                curveToRelative(-0.05f, -0.34f, -0.15f, -0.45f, -0.5f, -0.5f)
                horizontalLineToRelative(0f)
                lineToRelative(-15f, 0.0f)
                curveToRelative(-0.34f, 0.05f, -0.45f, 0.16f, -0.5f, 0.5f)
                lineToRelative(0.01f, 14.72f)
                lineToRelative(4.12f, -2.23f)
                horizontalLineToRelative(2.02f)
                curveToRelative(-0.09f, 0.49f, -0.14f, 0.99f, -0.14f, 1.5f)
                reflectiveCurveToRelative(0.05f, 1.01f, 0.14f, 1.5f)
                close()
            }
        }.also { _AutoReply = it}
