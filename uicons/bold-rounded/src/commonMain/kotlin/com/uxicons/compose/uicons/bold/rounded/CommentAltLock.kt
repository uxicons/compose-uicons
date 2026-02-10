package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CommentAltLock: ImageVector? = null

val Icons.Br.CommentAltLock: ImageVector
    get() = _CommentAltLock ?: UXIcon(name = "CommentAltLock") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(3f, 12f)
            horizontalLineToRelative(4f)
            curveToRelative(1.66f, 0f, 3f, -1.34f, 3f, -3f)
            verticalLineToRelative(-2f)
            curveToRelative(0f, -1.11f, -0.61f, -2.06f, -1.5f, -2.58f)
            verticalLineToRelative(-0.92f)
            curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
            reflectiveCurveToRelative(-3.5f, 1.57f, -3.5f, 3.5f)
            verticalLineToRelative(0.92f)
            curveToRelative(-0.89f, 0.52f, -1.5f, 1.48f, -1.5f, 2.58f)
            verticalLineToRelative(2f)
            curveToRelative(0f, 1.66f, 1.34f, 3f, 3f, 3f)
            close()
            moveTo(4f, 3.5f)
            curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
            reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
            verticalLineToRelative(0.5f)
            horizontalLineToRelative(-2f)
            close()
            moveTo(5f, 6.5f)
            curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
            reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
            reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
            reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
            close()
            moveTo(24f, 12.32f)
            verticalLineToRelative(6.18f)
            curveToRelative(0f, 3.03f, -2.47f, 5.5f, -5.5f, 5.5f)
            horizontalLineToRelative(-5.47f)
            curveToRelative(-5.71f, 0f, -10.54f, -3.13f, -12.33f, -7.98f)
            curveToRelative(-0.29f, -0.78f, 0.11f, -1.64f, 0.89f, -1.93f)
            curveToRelative(0.78f, -0.29f, 1.64f, 0.11f, 1.93f, 0.89f)
            curveToRelative(1.35f, 3.66f, 5.08f, 6.02f, 9.51f, 6.02f)
            horizontalLineToRelative(5.47f)
            curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
            verticalLineToRelative(-6.18f)
            curveToRelative(0f, -2.6f, -1.07f, -5.12f, -2.95f, -6.89f)
            curveToRelative(-1.77f, -1.68f, -4.07f, -2.54f, -6.48f, -2.42f)
            curveToRelative(-0.82f, 0.03f, -1.53f, -0.59f, -1.57f, -1.42f)
            curveToRelative(-0.04f, -0.83f, 0.59f, -1.53f, 1.42f, -1.57f)
            curveToRelative(3.24f, -0.17f, 6.33f, 0.98f, 8.7f, 3.24f)
            curveToRelative(2.47f, 2.34f, 3.88f, 5.65f, 3.88f, 9.07f)
            close()
        }
    }.also { _CommentAltLock = it }
