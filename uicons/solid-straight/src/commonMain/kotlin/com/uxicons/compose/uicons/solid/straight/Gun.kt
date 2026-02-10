package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Gun: ImageVector? = null

val Icons.Ss.Gun: ImageVector
    get() = _Gun ?: UXIcon(name = "Gun") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 4f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(2f)
                horizontalLineTo(0f)
                verticalLineTo(4f)
                horizontalLineTo(0f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                horizontalLineToRelative(0f)
                reflectiveCurveToRelative(17f, 0f, 17f, 0f)
                verticalLineTo(1f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(1f)
                close()
                moveTo(13.78f, 13.93f)
                curveToRelative(-0.19f, 0.63f, -0.78f, 1.07f, -1.44f, 1.07f)
                horizontalLineToRelative(-3.52f)
                lineToRelative(0.66f, -2f)
                horizontalLineToRelative(2.52f)
                verticalLineToRelative(-2f)
                horizontalLineTo(3.01f)
                curveToRelative(0.02f, 0.27f, 0.01f, 0.55f, -0.07f, 0.81f)
                lineTo(0f, 20.33f)
                verticalLineToRelative(1.67f)
                horizontalLineTo(6.5f)
                lineToRelative(1.66f, -5f)
                horizontalLineToRelative(4.18f)
                curveToRelative(1.56f, 0f, 2.9f, -1.0f, 3.35f, -2.49f)
                lineToRelative(1.05f, -3.51f)
                horizontalLineToRelative(-2.09f)
                lineToRelative(-0.88f, 2.93f)
                close()
            }
        }.also { _Gun = it}
