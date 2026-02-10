package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Walker: ImageVector? = null

val Icons.Rs.Walker: ImageVector
    get() = _Walker ?: UXIcon(name = "Walker") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22f, 18.17f)
                verticalLineTo(3f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                horizontalLineToRelative(-8.59f)
                curveToRelative(-1.27f, 0f, -2.41f, 0.81f, -2.83f, 2.0f)
                lineTo(0.06f, 23.33f)
                lineToRelative(1.89f, 0.67f)
                lineToRelative(4.59f, -12.99f)
                horizontalLineToRelative(13.47f)
                verticalLineToRelative(7.17f)
                curveToRelative(-1.16f, 0.41f, -2f, 1.52f, -2f, 2.83f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                reflectiveCurveToRelative(3f, -1.35f, 3f, -3f)
                curveToRelative(0f, -1.3f, -0.84f, -2.42f, -2f, -2.83f)
                close()
                moveTo(7.24f, 9f)
                lineToRelative(2.24f, -6.33f)
                curveToRelative(0.14f, -0.4f, 0.52f, -0.67f, 0.94f, -0.67f)
                horizontalLineToRelative(8.59f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                verticalLineToRelative(6f)
                horizontalLineTo(7.24f)
                close()
            }
        }.also { _Walker = it}
