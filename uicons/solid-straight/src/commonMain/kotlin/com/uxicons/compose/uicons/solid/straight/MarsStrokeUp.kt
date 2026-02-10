package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MarsStrokeUp: ImageVector? = null

val Icons.Ss.MarsStrokeUp: ImageVector
    get() = _MarsStrokeUp ?: UXIcon(name = "MarsStrokeUp") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13f, 10.08f)
                verticalLineToRelative(-1.08f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-3f)
                verticalLineTo(3f)
                lineToRelative(2.5f, 2.5f)
                lineToRelative(1.41f, -1.41f)
                lineTo(13.41f, 0.59f)
                curveToRelative(-0.78f, -0.78f, -2.05f, -0.78f, -2.83f, 0f)
                lineToRelative(-3.5f, 3.5f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(2.5f, -2.5f)
                verticalLineTo(7f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(1.08f)
                curveToRelative(-3.39f, 0.49f, -6f, 3.4f, -6f, 6.92f)
                curveToRelative(0f, 3.86f, 3.14f, 7f, 7f, 7f)
                reflectiveCurveToRelative(7f, -3.14f, 7f, -7f)
                curveToRelative(0f, -3.52f, -2.61f, -6.43f, -6f, -6.92f)
                close()
            }
        }.also { _MarsStrokeUp = it}
