package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _RotateExclamation: ImageVector? = null

val Icons.Ss.RotateExclamation: ImageVector
    get() = _RotateExclamation ?: UXIcon(name = "RotateExclamation") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(2f, 12f)
                lineTo(0f, 12f)
                curveTo(0f, 5.38f, 5.38f, 0f, 12f, 0f)
                curveToRelative(2.98f, 0f, 5.82f, 1.11f, 8f, 3.06f)
                lineTo(20f, 0f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(5f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(4.14f)
                curveToRelative(-1.87f, -1.9f, -4.43f, -3f, -7.14f, -3f)
                curveTo(6.49f, 2f, 2f, 6.49f, 2f, 12f)
                close()
                moveTo(22f, 12f)
                curveToRelative(0f, 5.51f, -4.49f, 10f, -10f, 10f)
                curveToRelative(-2.71f, 0f, -5.28f, -1.1f, -7.14f, -3f)
                horizontalLineToRelative(4.14f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-5f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-3.06f)
                curveToRelative(2.18f, 1.95f, 5.02f, 3.06f, 8f, 3.06f)
                curveToRelative(6.62f, 0f, 12f, -5.38f, 12f, -12f)
                horizontalLineToRelative(-2f)
                close()
                moveTo(13f, 5f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(10f)
                horizontalLineToRelative(2f)
                lineTo(13f, 5f)
                close()
                moveTo(11f, 19f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                close()
            }
        }.also { _RotateExclamation = it}
