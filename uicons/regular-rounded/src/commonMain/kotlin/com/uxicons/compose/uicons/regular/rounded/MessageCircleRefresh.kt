package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MessageCircleRefresh: ImageVector? = null

val Icons.Rr.MessageCircleRefresh: ImageVector
    get() = _MessageCircleRefresh ?: UXIcon(name = "MessageCircleRefresh") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(18f, 7f)
                verticalLineToRelative(2.5f)
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
                close()
                moveTo(24f, 12f)
                curveToRelative(0f, 6.62f, -5.38f, 12f, -12f, 12f)
                horizontalLineToRelative(-7f)
                curveToRelative(-2.76f, 0f, -5f, -2.24f, -5f, -5f)
                verticalLineToRelative(-7f)
                curveToRelative(0f, -6.62f, 5.38f, -12f, 12f, -12f)
                reflectiveCurveToRelative(12f, 5.38f, 12f, 12f)
                close()
                moveTo(22f, 12f)
                curveToRelative(0f, -5.51f, -4.49f, -10f, -10f, -10f)
                reflectiveCurveToRelative(-10f, 4.49f, -10f, 10f)
                verticalLineToRelative(7f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                horizontalLineToRelative(7f)
                curveToRelative(5.51f, 0f, 10f, -4.49f, 10f, -10f)
                close()
            }
        }.also { _MessageCircleRefresh = it}
