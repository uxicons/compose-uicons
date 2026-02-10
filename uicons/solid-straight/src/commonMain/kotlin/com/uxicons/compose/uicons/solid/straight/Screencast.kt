package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Screencast: ImageVector? = null

val Icons.Ss.Screencast: ImageVector
    get() = _Screencast ?: UXIcon(name = "Screencast") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(3f, 20.5f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                close()
                moveTo(0f, 14f)
                verticalLineToRelative(2f)
                curveToRelative(3.31f, 0f, 6f, 2.69f, 6f, 6f)
                horizontalLineToRelative(2f)
                curveToRelative(0f, -4.41f, -3.59f, -8f, -8f, -8f)
                close()
                moveTo(0.05f, 9f)
                verticalLineToRelative(2f)
                curveToRelative(6.04f, 0f, 10.95f, 4.93f, 10.95f, 11f)
                horizontalLineToRelative(2f)
                curveTo(13f, 14.83f, 7.19f, 9f, 0.05f, 9f)
                close()
                moveTo(21f, 2f)
                lineTo(3f, 2f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(0.05f)
                curveToRelative(8.24f, 0f, 14.95f, 6.73f, 14.95f, 15f)
                horizontalLineToRelative(9f)
                lineTo(24f, 5f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                close()
            }
        }.also { _Screencast = it}
