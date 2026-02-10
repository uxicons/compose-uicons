package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MessageCircleRefresh: ImageVector? = null

val Icons.Br.MessageCircleRefresh: ImageVector
    get() = _MessageCircleRefresh ?: UXIcon(name = "MessageCircleRefresh") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(12f, 0f)
            curveToRelative(-6.62f, 0f, -12f, 5.38f, -12f, 12f)
            verticalLineToRelative(6.5f)
            curveToRelative(0f, 3.03f, 2.47f, 5.5f, 5.5f, 5.5f)
            horizontalLineToRelative(6.5f)
            curveToRelative(6.62f, 0f, 12f, -5.38f, 12f, -12f)
            reflectiveCurveToRelative(-5.38f, -12f, -12f, -12f)
            close()
            moveTo(12f, 21f)
            horizontalLineToRelative(-6.5f)
            curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
            verticalLineToRelative(-6.5f)
            curveToRelative(0f, -4.96f, 4.04f, -9f, 9f, -9f)
            reflectiveCurveToRelative(9f, 4.04f, 9f, 9f)
            reflectiveCurveToRelative(-4.04f, 9f, -9f, 9f)
            close()
            moveTo(16.99f, 15.33f)
            curveToRelative(-1.12f, 1.67f, -2.98f, 2.67f, -4.99f, 2.67f)
            curveToRelative(-3.31f, 0f, -6f, -2.69f, -6f, -6f)
            reflectiveCurveToRelative(2.69f, -6f, 6f, -6f)
            curveToRelative(1.02f, 0f, 2.01f, 0.27f, 2.89f, 0.75f)
            lineToRelative(0.47f, -0.47f)
            curveToRelative(0.61f, -0.61f, 1.65f, -0.18f, 1.65f, 0.68f)
            verticalLineToRelative(3.06f)
            curveToRelative(0f, 0.54f, -0.44f, 0.98f, -0.98f, 0.98f)
            horizontalLineToRelative(-3.06f)
            curveToRelative(-0.86f, 0f, -1.29f, -1.04f, -0.68f, -1.65f)
            lineToRelative(0.29f, -0.29f)
            curveToRelative(-0.19f, -0.04f, -0.38f, -0.06f, -0.58f, -0.06f)
            curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
            reflectiveCurveToRelative(1.35f, 3f, 3f, 3f)
            curveToRelative(1.0f, 0f, 1.94f, -0.5f, 2.5f, -1.33f)
            curveToRelative(0.46f, -0.69f, 1.39f, -0.87f, 2.08f, -0.41f)
            curveToRelative(0.69f, 0.46f, 0.87f, 1.39f, 0.41f, 2.08f)
            close()
        }
    }.also { _MessageCircleRefresh = it }
