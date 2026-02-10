package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Walker: ImageVector? = null

val Icons.Sr.Walker: ImageVector
    get() = _Walker ?: UXIcon(name = "Walker") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22f, 18.18f)
                verticalLineTo(5f)
                curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
                horizontalLineToRelative(-5.2f)
                curveToRelative(-2.1f, 0f, -3.98f, 1.32f, -4.7f, 3.29f)
                lineTo(0.06f, 22.66f)
                curveToRelative(-0.19f, 0.52f, 0.08f, 1.09f, 0.6f, 1.28f)
                curveToRelative(0.11f, 0.04f, 0.23f, 0.06f, 0.34f, 0.06f)
                curveToRelative(0.41f, 0f, 0.79f, -0.25f, 0.94f, -0.66f)
                lineToRelative(4.49f, -12.34f)
                horizontalLineToRelative(13.57f)
                verticalLineToRelative(7.18f)
                curveToRelative(-1.16f, 0.41f, -2f, 1.51f, -2f, 2.82f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                reflectiveCurveToRelative(3f, -1.35f, 3f, -3f)
                curveToRelative(0f, -1.3f, -0.84f, -2.4f, -2f, -2.82f)
                close()
                moveTo(7.16f, 9f)
                lineToRelative(1.83f, -5.03f)
                curveToRelative(0.43f, -1.18f, 1.56f, -1.98f, 2.82f, -1.98f)
                horizontalLineToRelative(5.2f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                verticalLineToRelative(4f)
                horizontalLineTo(7.16f)
                close()
            }
        }.also { _Walker = it}
