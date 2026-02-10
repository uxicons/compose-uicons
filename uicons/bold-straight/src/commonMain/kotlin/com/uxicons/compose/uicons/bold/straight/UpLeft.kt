package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UpLeft: ImageVector? = null

val Icons.Bs.UpLeft: ImageVector
    get() = _UpLeft ?: UXIcon(name = "UpLeft") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16.18f, 23.3f)
                lineTo(6.48f, 13.61f)
                lineTo(1f, 18.94f)
                verticalLineTo(4.41f)
                curveToRelative(0f, -0.91f, 0.36f, -1.76f, 1f, -2.41f)
                curveToRelative(0.64f, -0.64f, 1.5f, -1f, 2.4f, -1f)
                horizontalLineToRelative(14.55f)
                reflectiveCurveToRelative(-5.34f, 5.48f, -5.34f, 5.48f)
                lineToRelative(9.69f, 9.69f)
                lineToRelative(-7.12f, 7.12f)
                close()
                moveTo(6.52f, 9.39f)
                lineToRelative(9.66f, 9.66f)
                lineToRelative(2.88f, -2.88f)
                lineTo(9.39f, 6.51f)
                lineToRelative(2.45f, -2.51f)
                horizontalLineTo(4.41f)
                reflectiveCurveToRelative(0f, 0f, 0f, 0f)
                curveToRelative(-0.14f, 0f, -0.23f, 0.06f, -0.29f, 0.12f)
                curveToRelative(-0.05f, 0.05f, -0.12f, 0.15f, -0.12f, 0.28f)
                verticalLineToRelative(7.43f)
                reflectiveCurveToRelative(2.51f, -2.44f, 2.51f, -2.44f)
                close()
            }
        }.also { _UpLeft = it}
