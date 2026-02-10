package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UserSlash: ImageVector? = null

val Icons.Sr.UserSlash: ImageVector
    get() = _UserSlash ?: UXIcon(name = "UserSlash") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.71f, 22.29f)
                lineTo(13.28f, 11.86f)
                curveToRelative(2.7f, -0.59f, 4.72f, -2.99f, 4.72f, -5.86f)
                curveToRelative(0f, -3.31f, -2.69f, -6f, -6f, -6f)
                curveToRelative(-2.87f, 0f, -5.27f, 2.03f, -5.86f, 4.72f)
                lineTo(1.71f, 0.29f)
                curveTo(1.32f, -0.1f, 0.68f, -0.1f, 0.29f, 0.29f)
                reflectiveCurveTo(-0.1f, 1.32f, 0.29f, 1.71f)
                lineTo(22.29f, 23.71f)
                curveToRelative(0.2f, 0.2f, 0.45f, 0.29f, 0.71f, 0.29f)
                reflectiveCurveToRelative(0.51f, -0.1f, 0.71f, -0.29f)
                curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0f, -1.41f)
                close()
                moveTo(9.98f, 14.24f)
                lineToRelative(9.76f, 9.76f)
                horizontalLineTo(4f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                curveToRelative(0f, -4.27f, 2.99f, -7.84f, 6.98f, -8.76f)
                close()
            }
        }.also { _UserSlash = it}
