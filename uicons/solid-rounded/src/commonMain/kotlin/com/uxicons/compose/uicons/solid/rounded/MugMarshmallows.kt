package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MugMarshmallows: ImageVector? = null

val Icons.Sr.MugMarshmallows: ImageVector
    get() = _MugMarshmallows ?: UXIcon(name = "MugMarshmallows") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19.5f, 11.0f)
                horizontalLineToRelative(-0.5f)
                curveToRelative(0f, -1.66f, -1.35f, -3f, -3f, -3f)
                lineTo(4f, 8.0f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(8f)
                curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
                horizontalLineToRelative(8f)
                curveToRelative(2.41f, 0f, 4.43f, -1.72f, 4.9f, -4f)
                horizontalLineToRelative(0.6f)
                curveToRelative(1.93f, 0f, 3.5f, -1.57f, 3.5f, -3.5f)
                lineToRelative(0.0f, -2.0f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                close()
                moveTo(21f, 16.5f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                horizontalLineToRelative(-0.5f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(0.5f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                lineToRelative(-0.0f, 2.0f)
                close()
                moveTo(8.76f, 3.42f)
                lineToRelative(2.83f, -2.83f)
                curveToRelative(0.78f, -0.78f, 2.05f, -0.78f, 2.83f, 0f)
                lineToRelative(2.83f, 2.83f)
                curveToRelative(0.38f, 0.38f, 0.59f, 0.88f, 0.59f, 1.41f)
                curveToRelative(0f, 0.43f, -0.14f, 0.83f, -0.39f, 1.17f)
                horizontalLineToRelative(-8.88f)
                curveToRelative(-0.57f, -0.78f, -0.51f, -1.88f, 0.2f, -2.59f)
                close()
                moveTo(3.0f, 6.0f)
                reflectiveCurveToRelative(0f, 0f, 0f, 0f)
                lineTo(3.0f, 2f)
                curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                horizontalLineToRelative(4f)
                curveToRelative(0.11f, 0f, 0.21f, 0.01f, 0.31f, 0.03f)
                lineToRelative(-1.97f, 1.97f)
                curveToRelative(-1.08f, 1.08f, -1.4f, 2.63f, -0.98f, 4f)
                horizontalLineToRelative(-3.37f)
                close()
            }
        }.also { _MugMarshmallows = it}
