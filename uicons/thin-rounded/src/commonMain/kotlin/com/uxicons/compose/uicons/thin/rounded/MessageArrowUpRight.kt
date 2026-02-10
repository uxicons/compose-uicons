package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MessageArrowUpRight: ImageVector? = null

val Icons.Tr.MessageArrowUpRight: ImageVector
    get() = _MessageArrowUpRight ?: UXIcon(name = "MessageArrowUpRight") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(17f, 8.5f)
                verticalLineToRelative(5f)
                curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                reflectiveCurveToRelative(-0.5f, -0.22f, -0.5f, -0.5f)
                verticalLineToRelative(-5f)
                curveToRelative(0f, -0.22f, -0.05f, -0.44f, -0.14f, -0.63f)
                lineToRelative(-7.01f, 6.98f)
                curveToRelative(-0.1f, 0.1f, -0.23f, 0.15f, -0.35f, 0.15f)
                curveToRelative(-0.13f, 0f, -0.26f, -0.05f, -0.35f, -0.15f)
                curveToRelative(-0.2f, -0.2f, -0.19f, -0.51f, 0.0f, -0.71f)
                lineToRelative(7.02f, -6.99f)
                curveToRelative(-0.2f, -0.1f, -0.43f, -0.16f, -0.67f, -0.16f)
                horizontalLineToRelative(-5f)
                curveToRelative(-0.28f, 0f, -0.5f, -0.22f, -0.5f, -0.5f)
                reflectiveCurveToRelative(0.22f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(5f)
                curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
                close()
                moveTo(24f, 3.5f)
                verticalLineToRelative(13f)
                curveToRelative(0f, 1.93f, -1.57f, 3.5f, -3.5f, 3.5f)
                horizontalLineToRelative(-3.53f)
                lineToRelative(-3.98f, 3.29f)
                curveToRelative(-0.28f, 0.24f, -0.63f, 0.37f, -0.98f, 0.37f)
                curveToRelative(-0.36f, 0f, -0.71f, -0.13f, -1.0f, -0.38f)
                lineToRelative(-3.9f, -3.28f)
                horizontalLineToRelative(-3.61f)
                curveToRelative(-1.93f, 0f, -3.5f, -1.57f, -3.5f, -3.5f)
                lineTo(0f, 3.5f)
                curveTo(0f, 1.57f, 1.57f, 0f, 3.5f, 0f)
                horizontalLineToRelative(17f)
                curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
                close()
                moveTo(23f, 3.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                lineTo(3.5f, 1f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                verticalLineToRelative(13f)
                curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
                horizontalLineToRelative(3.79f)
                curveToRelative(0.12f, 0f, 0.23f, 0.04f, 0.32f, 0.12f)
                lineToRelative(4.05f, 3.41f)
                curveToRelative(0.2f, 0.18f, 0.48f, 0.18f, 0.68f, 0.01f)
                lineToRelative(4.14f, -3.42f)
                curveToRelative(0.09f, -0.07f, 0.2f, -0.11f, 0.32f, -0.11f)
                horizontalLineToRelative(3.71f)
                curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
                lineTo(23f, 3.5f)
                close()
            }
        }.also { _MessageArrowUpRight = it}
