package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SquarePhoneHangup: ImageVector? = null

val Icons.Ts.SquarePhoneHangup: ImageVector
    get() = _SquarePhoneHangup ?: UXIcon(name = "SquarePhoneHangup") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12.06f, 8.5f)
                curveToRelative(-2.93f, 0.01f, -5.6f, 0.88f, -7.03f, 2.31f)
                curveToRelative(-0.67f, 0.67f, -1.03f, 1.54f, -1.03f, 2.45f)
                verticalLineToRelative(2.74f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(-3.02f)
                curveToRelative(0.92f, -0.36f, 2.03f, -0.58f, 3.0f, -0.57f)
                curveToRelative(0.95f, 0.01f, 2.07f, 0.22f, 3.0f, 0.57f)
                verticalLineToRelative(3.01f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(-2.74f)
                curveToRelative(0f, -0.92f, -0.37f, -1.79f, -1.03f, -2.45f)
                curveToRelative(-1.45f, -1.45f, -4.02f, -2.31f, -6.9f, -2.31f)
                close()
                moveTo(19f, 15f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-2.68f)
                curveToRelative(-1.12f, -0.48f, -2.8f, -0.9f, -4.0f, -0.91f)
                curveToRelative(-1.24f, -0.04f, -2.9f, 0.42f, -4.0f, 0.91f)
                verticalLineToRelative(2.67f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-1.74f)
                curveToRelative(0f, -0.65f, 0.26f, -1.27f, 0.74f, -1.75f)
                curveToRelative(1.23f, -1.23f, 3.63f, -2.0f, 6.26f, -2.02f)
                curveToRelative(2.63f, -0.02f, 4.98f, 0.74f, 6.26f, 2.02f)
                curveToRelative(0.48f, 0.48f, 0.74f, 1.1f, 0.74f, 1.75f)
                verticalLineToRelative(1.74f)
                close()
                moveTo(21.5f, 0f)
                lineTo(2.5f, 0f)
                curveTo(1.12f, 0f, 0f, 1.12f, 0f, 2.5f)
                verticalLineToRelative(21.5f)
                horizontalLineToRelative(24f)
                lineTo(24f, 2.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                close()
                moveTo(23f, 23f)
                lineTo(1f, 23f)
                lineTo(1f, 2.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(19f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(20.5f)
                close()
            }
        }.also { _SquarePhoneHangup = it}
