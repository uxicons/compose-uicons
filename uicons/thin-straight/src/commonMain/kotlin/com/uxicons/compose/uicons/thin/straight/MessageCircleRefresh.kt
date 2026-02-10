package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MessageCircleRefresh: ImageVector? = null

val Icons.Ts.MessageCircleRefresh: ImageVector
    get() = _MessageCircleRefresh ?: UXIcon(name = "MessageCircleRefresh") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(17f, 6f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(4f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(3.57f)
                curveToRelative(-0.79f, -1.81f, -2.56f, -3f, -4.57f, -3f)
                curveToRelative(-2.76f, 0f, -5f, 2.24f, -5f, 5f)
                reflectiveCurveToRelative(2.24f, 5f, 5f, 5f)
                curveToRelative(2.41f, 0f, 4.43f, -1.72f, 4.9f, -4f)
                horizontalLineToRelative(1.01f)
                curveToRelative(-0.48f, 2.83f, -2.94f, 5f, -5.91f, 5f)
                curveToRelative(-3.31f, 0f, -6f, -2.69f, -6f, -6f)
                reflectiveCurveToRelative(2.69f, -6f, 6f, -6f)
                curveToRelative(2.06f, 0f, 3.91f, 1.05f, 5f, 2.7f)
                close()
                moveTo(24f, 12f)
                curveToRelative(0f, 6.62f, -5.38f, 12f, -12f, 12f)
                horizontalLineToRelative(-12f)
                verticalLineToRelative(-12f)
                curveToRelative(0f, -6.62f, 5.38f, -12f, 12f, -12f)
                reflectiveCurveToRelative(12f, 5.38f, 12f, 12f)
                close()
                moveTo(23f, 12f)
                curveToRelative(0f, -6.07f, -4.93f, -11f, -11f, -11f)
                reflectiveCurveToRelative(-11f, 4.93f, -11f, 11f)
                verticalLineToRelative(11f)
                horizontalLineToRelative(11f)
                curveToRelative(6.07f, 0f, 11f, -4.93f, 11f, -11f)
                close()
            }
        }.also { _MessageCircleRefresh = it}
