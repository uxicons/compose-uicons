package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MessageArrowUpRight: ImageVector? = null

val Icons.Br.MessageArrowUpRight: ImageVector
    get() = _MessageArrowUpRight ?: UXIcon(name = "MessageArrowUpRight") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(18.5f, 0f)
            lineTo(5.5f, 0f)
            curveTo(2.47f, 0f, 0f, 2.47f, 0f, 5.5f)
            verticalLineToRelative(9f)
            curveToRelative(0f, 3.03f, 2.47f, 5.5f, 5.5f, 5.5f)
            horizontalLineToRelative(1.24f)
            lineToRelative(3.6f, 3.03f)
            curveToRelative(0.48f, 0.43f, 1.08f, 0.64f, 1.68f, 0.64f)
            curveToRelative(0.58f, 0f, 1.16f, -0.2f, 1.61f, -0.6f)
            lineToRelative(3.71f, -3.06f)
            horizontalLineToRelative(1.17f)
            curveToRelative(3.03f, 0f, 5.5f, -2.47f, 5.5f, -5.5f)
            lineTo(24f, 5.5f)
            curveToRelative(0f, -3.03f, -2.47f, -5.5f, -5.5f, -5.5f)
            close()
            moveTo(21f, 14.5f)
            curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
            horizontalLineToRelative(-1.71f)
            curveToRelative(-0.35f, 0f, -0.69f, 0.12f, -0.96f, 0.34f)
            lineToRelative(-3.83f, 3.17f)
            lineToRelative(-3.75f, -3.16f)
            curveToRelative(-0.27f, -0.23f, -0.61f, -0.35f, -0.97f, -0.35f)
            horizontalLineToRelative(-1.79f)
            curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
            lineTo(3.0f, 5.5f)
            curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
            horizontalLineToRelative(13f)
            curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
            verticalLineToRelative(9f)
            close()
            moveTo(17f, 7.0f)
            verticalLineToRelative(4.47f)
            curveToRelative(0f, 0.89f, -1.08f, 1.34f, -1.71f, 0.71f)
            lineToRelative(-1.18f, -1.18f)
            lineToRelative(-3.56f, 3.56f)
            curveToRelative(-0.29f, 0.29f, -0.68f, 0.44f, -1.06f, 0.44f)
            reflectiveCurveToRelative(-0.77f, -0.15f, -1.06f, -0.44f)
            curveToRelative(-0.59f, -0.59f, -0.59f, -1.53f, 0f, -2.12f)
            lineToRelative(3.56f, -3.56f)
            lineToRelative(-1.18f, -1.18f)
            curveToRelative(-0.63f, -0.63f, -0.18f, -1.71f, 0.71f, -1.71f)
            horizontalLineToRelative(4.47f)
            curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
            close()
        }
    }.also { _MessageArrowUpRight = it }
