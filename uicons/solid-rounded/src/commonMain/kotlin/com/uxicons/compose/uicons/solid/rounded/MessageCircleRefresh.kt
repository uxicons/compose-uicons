package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MessageCircleRefresh: ImageVector? = null

val Icons.Sr.MessageCircleRefresh: ImageVector
    get() = _MessageCircleRefresh ?: UXIcon(name = "MessageCircleRefresh") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 0f)
                curveToRelative(-6.62f, 0f, -12f, 5.38f, -12f, 12f)
                verticalLineToRelative(7f)
                curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
                horizontalLineToRelative(7f)
                curveToRelative(6.62f, 0f, 12f, -5.38f, 12f, -12f)
                reflectiveCurveToRelative(-5.38f, -12f, -12f, -12f)
                close()
                moveTo(18f, 9.5f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                horizontalLineToRelative(-2.5f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(0.64f)
                curveToRelative(-0.72f, -0.63f, -1.64f, -1f, -2.64f, -1f)
                curveToRelative(-2.21f, 0f, -4f, 1.79f, -4f, 4f)
                reflectiveCurveToRelative(1.79f, 4f, 4f, 4f)
                curveToRelative(1.59f, 0f, 3.03f, -0.94f, 3.67f, -2.4f)
                curveToRelative(0.22f, -0.51f, 0.81f, -0.73f, 1.32f, -0.52f)
                curveToRelative(0.51f, 0.22f, 0.74f, 0.81f, 0.52f, 1.32f)
                curveToRelative(-0.96f, 2.19f, -3.11f, 3.6f, -5.5f, 3.6f)
                curveToRelative(-3.31f, 0f, -6f, -2.69f, -6f, -6f)
                reflectiveCurveToRelative(2.69f, -6f, 6f, -6f)
                curveToRelative(1.5f, 0f, 2.91f, 0.58f, 4f, 1.55f)
                verticalLineToRelative(-0.55f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                verticalLineToRelative(2.5f)
                close()
            }
        }.also { _MessageCircleRefresh = it}
