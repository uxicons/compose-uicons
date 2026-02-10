package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Screencast: ImageVector? = null

val Icons.Ts.Screencast: ImageVector
    get() = _Screencast ?: UXIcon(name = "Screencast") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 4.5f)
                verticalLineToRelative(17.5f)
                horizontalLineToRelative(-10f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(9f)
                lineTo(23f, 4.5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                lineTo(2.5f, 3f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                verticalLineToRelative(3.5f)
                lineTo(0f, 8f)
                verticalLineToRelative(-3.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(19f)
                curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
                close()
                moveTo(1f, 20f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                close()
                moveTo(0f, 15f)
                verticalLineToRelative(1f)
                curveToRelative(3.31f, 0f, 6f, 2.69f, 6f, 6f)
                horizontalLineToRelative(1f)
                curveToRelative(0f, -3.86f, -3.14f, -7f, -7f, -7f)
                close()
                moveTo(0.05f, 10f)
                verticalLineToRelative(1f)
                curveToRelative(6.04f, 0f, 10.95f, 4.93f, 10.95f, 11f)
                horizontalLineToRelative(1f)
                curveTo(12.0f, 15.38f, 6.64f, 10f, 0.05f, 10f)
                close()
            }
        }.also { _Screencast = it}
