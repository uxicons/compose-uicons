package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _AutoReply: ImageVector? = null

val Icons.Rr.AutoReply: ImageVector
    get() = _AutoReply ?: UXIcon(name = "AutoReply") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(8.36f, 17.49f)
                curveToRelative(0.28f, 0.47f, 0.13f, 1.09f, -0.35f, 1.37f)
                lineToRelative(-4.71f, 2.81f)
                curveToRelative(-0.63f, 0.42f, -1.48f, 0.45f, -2.16f, 0.08f)
                curveToRelative(-0.7f, -0.38f, -1.14f, -1.1f, -1.14f, -1.89f)
                lineTo(0f, 5f)
                curveTo(0f, 2.24f, 2.24f, 0f, 5f, 0f)
                horizontalLineToRelative(12f)
                curveToRelative(2.76f, 0f, 5f, 2.24f, 5f, 5f)
                verticalLineToRelative(3f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-3f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                lineTo(5f, 2f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(14.86f)
                curveToRelative(-0.04f, 0.09f, 0.18f, 0.2f, 0.23f, 0.12f)
                lineToRelative(4.76f, -2.84f)
                curveToRelative(0.47f, -0.28f, 1.09f, -0.13f, 1.37f, 0.35f)
                close()
                moveTo(19f, 16f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-1.12f)
                curveToRelative(0.03f, -0.76f, -0.98f, -1.18f, -1.5f, -0.62f)
                lineToRelative(-1.5f, 1.5f)
                curveToRelative(-0.69f, 0.69f, -0.69f, 1.8f, 0f, 2.48f)
                lineToRelative(1.5f, 1.5f)
                curveToRelative(0.52f, 0.56f, 1.52f, 0.14f, 1.5f, -0.62f)
                verticalLineToRelative(-1.12f)
                horizontalLineToRelative(2f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                close()
                moveTo(24f, 17f)
                curveToRelative(0f, 3.86f, -3.14f, 7f, -7f, 7f)
                reflectiveCurveToRelative(-7f, -3.14f, -7f, -7f)
                reflectiveCurveToRelative(3.14f, -7f, 7f, -7f)
                reflectiveCurveToRelative(7f, 3.14f, 7f, 7f)
                close()
                moveTo(22f, 17f)
                curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
                reflectiveCurveToRelative(-5f, 2.24f, -5f, 5f)
                reflectiveCurveToRelative(2.24f, 5f, 5f, 5f)
                reflectiveCurveToRelative(5f, -2.24f, 5f, -5f)
                close()
            }
        }.also { _AutoReply = it}
