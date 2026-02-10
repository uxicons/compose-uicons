package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CommentLock: ImageVector? = null

val Icons.Br.CommentLock: ImageVector
    get() = _CommentLock ?: UXIcon(name = "CommentLock") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(24f, 5.5f)
            lineToRelative(-0.0f, 15.76f)
            curveToRelative(0f, 1.1f, -0.65f, 2.09f, -1.66f, 2.52f)
            curveToRelative(-1.0f, 0.43f, -2.17f, 0.23f, -2.97f, -0.52f)
            lineToRelative(-3.46f, -3.26f)
            horizontalLineToRelative(-10.53f)
            curveToRelative(-2.51f, 0.0f, -4.7f, -1.7f, -5.33f, -4.12f)
            curveToRelative(-0.21f, -0.8f, 0.28f, -1.62f, 1.08f, -1.83f)
            curveToRelative(0.81f, -0.21f, 1.62f, 0.28f, 1.83f, 1.08f)
            curveToRelative(0.28f, 1.1f, 1.28f, 1.87f, 2.42f, 1.87f)
            horizontalLineToRelative(11.13f)
            curveToRelative(0.38f, 0f, 0.75f, 0.15f, 1.03f, 0.41f)
            lineToRelative(3.47f, 3.27f)
            lineToRelative(0.0f, -15.18f)
            curveToRelative(0f, -0.66f, -0.26f, -1.29f, -0.73f, -1.76f)
            curveToRelative(-0.47f, -0.47f, -1.1f, -0.73f, -1.76f, -0.73f)
            lineToRelative(-7f, 0.0f)
            curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
            reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
            lineToRelative(7f, -0.0f)
            curveToRelative(1.47f, 0f, 2.85f, 0.57f, 3.89f, 1.61f)
            reflectiveCurveToRelative(1.61f, 2.42f, 1.61f, 3.89f)
            close()
            moveTo(0f, 9f)
            verticalLineToRelative(-2f)
            curveToRelative(0f, -1.11f, 0.61f, -2.06f, 1.5f, -2.58f)
            verticalLineToRelative(-0.92f)
            curveToRelative(0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
            reflectiveCurveToRelative(3.5f, 1.57f, 3.5f, 3.5f)
            verticalLineToRelative(0.92f)
            curveToRelative(0.89f, 0.52f, 1.5f, 1.48f, 1.5f, 2.58f)
            verticalLineToRelative(2f)
            curveToRelative(0f, 1.66f, -1.34f, 3f, -3f, 3f)
            horizontalLineToRelative(-4f)
            curveToRelative(-1.66f, 0f, -3f, -1.34f, -3f, -3f)
            close()
            moveTo(4f, 4f)
            horizontalLineToRelative(2f)
            verticalLineToRelative(-0.5f)
            curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
            reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
            close()
            moveTo(3.5f, 8f)
            curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
            reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
            reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
            reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
            close()
        }
    }.also { _CommentLock = it }
