package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CommentAltLock: ImageVector? = null

val Icons.Ts.CommentAltLock: ImageVector
    get() = _CommentAltLock ?: UXIcon(name = "CommentAltLock") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(2.5f, 13f)
                horizontalLineToRelative(5f)
                curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
                verticalLineToRelative(-6.5f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                reflectiveCurveToRelative(-3f, 1.35f, -3f, 3f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(6.5f)
                curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
                close()
                moveTo(3f, 3f)
                curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-4f)
                close()
                moveTo(1f, 5f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(5.5f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                horizontalLineToRelative(-5f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                close()
                moveTo(24f, 12f)
                verticalLineToRelative(12f)
                horizontalLineToRelative(-12f)
                curveToRelative(-4.57f, 0f, -8.82f, -2.66f, -10.81f, -6.78f)
                curveToRelative(-0.44f, -0.91f, -0.75f, -1.87f, -0.94f, -2.85f)
                curveToRelative(0.35f, 0.21f, 0.73f, 0.37f, 1.14f, 0.47f)
                curveToRelative(0.18f, 0.66f, 0.4f, 1.31f, 0.71f, 1.94f)
                curveToRelative(1.83f, 3.78f, 5.71f, 6.22f, 9.91f, 6.22f)
                horizontalLineToRelative(11f)
                verticalLineToRelative(-11.0f)
                curveToRelative(0f, -6.07f, -4.93f, -11f, -11f, -11f)
                curveToRelative(-0.8f, 0f, -1.58f, 0.09f, -2.33f, 0.25f)
                curveToRelative(-0.12f, -0.32f, -0.27f, -0.63f, -0.45f, -0.92f)
                curveToRelative(0.9f, -0.21f, 1.82f, -0.34f, 2.78f, -0.34f)
                curveToRelative(6.62f, 0f, 12f, 5.38f, 12f, 12f)
                close()
                moveTo(4f, 8.5f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                close()
            }
        }.also { _CommentAltLock = it}
