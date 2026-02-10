package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MugMarshmallows: ImageVector? = null

val Icons.Ss.MugMarshmallows: ImageVector
    get() = _MugMarshmallows ?: UXIcon(name = "MugMarshmallows") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.01f, 13.95f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-3f)
                lineTo(1.01f, 7.95f)
                lineToRelative(-0.0f, 13.05f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                horizontalLineToRelative(12f)
                curveToRelative(1.65f, 0f, 3f, -1.35f, 3f, -3f)
                lineToRelative(0.0f, -1.05f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-6.0f)
                close()
                moveTo(21.01f, 17.95f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(1f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                verticalLineToRelative(4.0f)
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
                lineTo(3.0f, 2.0f)
                curveTo(3.0f, 0.9f, 3.9f, 0.0f, 5.0f, 0.0f)
                horizontalLineToRelative(4f)
                curveToRelative(0.11f, 0f, 0.21f, 0.01f, 0.31f, 0.03f)
                lineToRelative(-1.97f, 1.97f)
                curveToRelative(-1.08f, 1.08f, -1.4f, 2.63f, -0.98f, 4f)
                horizontalLineToRelative(-3.37f)
                close()
            }
        }.also { _MugMarshmallows = it}
