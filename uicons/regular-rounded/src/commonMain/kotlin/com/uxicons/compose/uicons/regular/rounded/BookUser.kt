package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BookUser: ImageVector? = null

val Icons.Rr.BookUser: ImageVector
    get() = _BookUser ?: UXIcon(name = "BookUser") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(11.5f, 6.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
                close()
                moveTo(9.9f, 13.86f)
                curveToRelative(0.47f, 0.29f, 1.09f, 0.14f, 1.37f, -0.34f)
                curveToRelative(0.56f, -0.92f, 1.63f, -1.52f, 2.72f, -1.52f)
                reflectiveCurveToRelative(2.16f, 0.6f, 2.72f, 1.52f)
                curveToRelative(0.19f, 0.31f, 0.52f, 0.48f, 0.86f, 0.48f)
                curveToRelative(0.18f, 0f, 0.35f, -0.05f, 0.52f, -0.14f)
                curveToRelative(0.47f, -0.29f, 0.62f, -0.9f, 0.34f, -1.37f)
                curveToRelative(-0.93f, -1.53f, -2.63f, -2.48f, -4.43f, -2.48f)
                reflectiveCurveToRelative(-3.5f, 0.95f, -4.43f, 2.48f)
                curveToRelative(-0.29f, 0.47f, -0.14f, 1.09f, 0.34f, 1.37f)
                close()
                moveTo(22f, 5f)
                verticalLineToRelative(14f)
                curveToRelative(0f, 2.76f, -2.24f, 5f, -5f, 5f)
                lineTo(6f, 24f)
                curveToRelative(-2.21f, 0f, -4f, -1.79f, -4f, -4f)
                lineTo(2f, 5f)
                curveTo(2f, 2.24f, 4.24f, 0f, 7f, 0f)
                horizontalLineToRelative(10f)
                curveTo(19.76f, 0f, 22f, 2.24f, 22f, 5f)
                close()
                moveTo(17f, 2f)
                horizontalLineToRelative(-9f)
                verticalLineToRelative(14f)
                horizontalLineToRelative(12f)
                lineTo(20f, 5f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                close()
                moveTo(4f, 5f)
                verticalLineToRelative(11.56f)
                curveToRelative(0.59f, -0.34f, 1.27f, -0.56f, 2f, -0.56f)
                lineTo(6f, 2.18f)
                curveToRelative(-1.16f, 0.41f, -2f, 1.51f, -2f, 2.82f)
                close()
                moveTo(20f, 19f)
                verticalLineToRelative(-1f)
                lineTo(6f, 18f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                reflectiveCurveToRelative(0.9f, 2f, 2f, 2f)
                horizontalLineToRelative(11f)
                curveToRelative(1.65f, 0f, 3f, -1.35f, 3f, -3f)
                close()
            }
        }.also { _BookUser = it}
