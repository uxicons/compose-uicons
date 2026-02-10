package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BookUser: ImageVector? = null

val Icons.Sr.BookUser: ImageVector
    get() = _BookUser ?: UXIcon(name = "BookUser") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(5f, 18f)
                horizontalLineToRelative(17f)
                verticalLineToRelative(1f)
                curveToRelative(0f, 2.76f, -2.24f, 5f, -5f, 5f)
                lineTo(5f, 24f)
                curveToRelative(-1.66f, 0f, -3f, -1.34f, -3f, -3f)
                reflectiveCurveToRelative(1.34f, -3f, 3f, -3f)
                close()
                moveTo(5f, 16f)
                horizontalLineToRelative(1f)
                lineTo(6f, 0.1f)
                curveTo(3.67f, 0.57f, 2f, 2.62f, 2f, 5f)
                verticalLineToRelative(12.03f)
                curveToRelative(0.7f, -0.53f, 1.52f, -0.86f, 2.4f, -0.96f)
                curveToRelative(0.2f, -0.04f, 0.4f, -0.06f, 0.6f, -0.06f)
                close()
                moveTo(22f, 5f)
                verticalLineToRelative(11f)
                horizontalLineToRelative(-14f)
                lineTo(8f, 0f)
                horizontalLineToRelative(9f)
                curveToRelative(2.76f, 0f, 5f, 2.24f, 5f, 5f)
                close()
                moveTo(12.92f, 5.5f)
                curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
                reflectiveCurveToRelative(2.5f, -1.12f, 2.5f, -2.5f)
                reflectiveCurveToRelative(-1.12f, -2.5f, -2.5f, -2.5f)
                reflectiveCurveToRelative(-2.5f, 1.12f, -2.5f, 2.5f)
                close()
                moveTo(19.86f, 11.48f)
                curveToRelative(-0.93f, -1.53f, -2.63f, -2.48f, -4.43f, -2.48f)
                reflectiveCurveToRelative(-3.5f, 0.95f, -4.43f, 2.48f)
                curveToRelative(-0.29f, 0.47f, -0.14f, 1.09f, 0.34f, 1.37f)
                curveToRelative(0.47f, 0.28f, 1.09f, 0.14f, 1.37f, -0.34f)
                curveToRelative(0.56f, -0.92f, 1.63f, -1.52f, 2.72f, -1.52f)
                reflectiveCurveToRelative(2.16f, 0.6f, 2.72f, 1.52f)
                curveToRelative(0.19f, 0.31f, 0.52f, 0.48f, 0.86f, 0.48f)
                curveToRelative(0.18f, 0f, 0.35f, -0.05f, 0.52f, -0.14f)
                curveToRelative(0.47f, -0.29f, 0.62f, -0.9f, 0.34f, -1.37f)
                close()
            }
        }.also { _BookUser = it}
