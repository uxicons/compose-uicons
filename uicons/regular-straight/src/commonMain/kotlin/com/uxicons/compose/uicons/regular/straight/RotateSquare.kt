package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _RotateSquare: ImageVector? = null

val Icons.Rs.RotateSquare: ImageVector
    get() = _RotateSquare ?: UXIcon(name = "RotateSquare") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21f, 0f)
                lineTo(3f, 0f)
                curveTo(1.35f, 0f, 0f, 1.35f, 0f, 3f)
                verticalLineToRelative(21f)
                horizontalLineToRelative(24f)
                lineTo(24f, 3f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                close()
                moveTo(22f, 22f)
                lineTo(2f, 22f)
                lineTo(2f, 3f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(18f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                verticalLineToRelative(19f)
                close()
                moveTo(17f, 5f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(4f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(3.0f)
                curveToRelative(-0.93f, -1.23f, -2.4f, -2f, -4.0f, -2f)
                curveToRelative(-2.41f, 0f, -4.43f, 1.72f, -4.9f, 4f)
                horizontalLineToRelative(-2.02f)
                curveToRelative(0.49f, -3.39f, 3.4f, -6f, 6.92f, -6f)
                curveToRelative(1.92f, 0f, 3.71f, 0.8f, 5f, 2.12f)
                verticalLineToRelative(-2.12f)
                close()
                moveTo(16.9f, 13f)
                horizontalLineToRelative(2.02f)
                curveToRelative(-0.49f, 3.39f, -3.4f, 6f, -6.92f, 6f)
                curveToRelative(-1.92f, 0f, -3.71f, -0.8f, -5f, -2.12f)
                verticalLineToRelative(2.12f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-4f)
                curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-3.0f)
                curveToRelative(0.93f, 1.23f, 2.4f, 2f, 4.0f, 2f)
                curveToRelative(2.41f, 0f, 4.43f, -1.72f, 4.9f, -4f)
                close()
            }
        }.also { _RotateSquare = it}
