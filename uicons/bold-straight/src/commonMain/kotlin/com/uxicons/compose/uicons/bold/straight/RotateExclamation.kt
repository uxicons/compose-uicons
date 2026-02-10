package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _RotateExclamation: ImageVector? = null

val Icons.Bs.RotateExclamation: ImageVector
    get() = _RotateExclamation ?: UXIcon(name = "RotateExclamation") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(3f, 12f)
                lineTo(0f, 12f)
                curveTo(0f, 5.38f, 5.38f, 0f, 12f, 0f)
                curveToRelative(3.21f, 0f, 6.25f, 1.28f, 8.48f, 3.52f)
                lineToRelative(2.48f, -2.48f)
                verticalLineToRelative(5.83f)
                curveToRelative(0f, 0.63f, -0.51f, 1.15f, -1.15f, 1.15f)
                horizontalLineToRelative(-5.83f)
                lineToRelative(2.38f, -2.38f)
                curveToRelative(-1.67f, -1.67f, -3.96f, -2.64f, -6.36f, -2.64f)
                curveTo(7.04f, 3f, 3f, 7.04f, 3f, 12f)
                close()
                moveTo(21f, 12f)
                curveToRelative(0f, 4.96f, -4.04f, 9f, -9f, 9f)
                curveToRelative(-2.4f, 0f, -4.69f, -0.96f, -6.36f, -2.64f)
                lineToRelative(2.38f, -2.38f)
                lineTo(1.99f, 15.99f)
                curveToRelative(-0.53f, 0f, -0.95f, 0.43f, -0.95f, 0.95f)
                verticalLineToRelative(6.02f)
                lineToRelative(2.48f, -2.48f)
                curveToRelative(2.23f, 2.23f, 5.28f, 3.52f, 8.48f, 3.52f)
                curveToRelative(6.62f, 0f, 12f, -5.38f, 12f, -12f)
                horizontalLineToRelative(-3f)
                close()
                moveTo(13.5f, 6f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-7f)
                close()
                moveTo(10.5f, 18f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(3f)
                close()
            }
        }.also { _RotateExclamation = it}
