package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Tickets: ImageVector? = null

val Icons.Ts.Tickets: ImageVector
    get() = _Tickets ?: UXIcon(name = "Tickets") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(7.98f, 20.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
                verticalLineToRelative(0.5f)
                horizontalLineToRelative(3.52f)
                curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
                lineTo(19f, 2.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                horizontalLineToRelative(-3.52f)
                verticalLineToRelative(0.5f)
                curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
                verticalLineToRelative(-0.5f)
                horizontalLineToRelative(-3.48f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                verticalLineToRelative(16f)
                curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
                horizontalLineToRelative(3.48f)
                verticalLineToRelative(-0.5f)
                close()
                moveTo(4.5f, 20f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                lineTo(3f, 2.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(2.52f)
                curveToRelative(0.24f, 1.69f, 1.7f, 3f, 3.46f, 3f)
                reflectiveCurveToRelative(3.22f, -1.31f, 3.46f, -3f)
                horizontalLineToRelative(2.55f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(16f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                horizontalLineToRelative(-2.55f)
                curveToRelative(-0.24f, -1.69f, -1.7f, -3f, -3.46f, -3f)
                reflectiveCurveToRelative(-3.22f, 1.31f, -3.46f, 3f)
                horizontalLineToRelative(-2.52f)
                close()
                moveTo(22f, 5f)
                verticalLineToRelative(13.5f)
                curveToRelative(0f, 3.03f, -2.47f, 5.5f, -5.5f, 5.5f)
                lineTo(6f, 24f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(10.5f)
                curveToRelative(2.48f, 0f, 4.5f, -2.02f, 4.5f, -4.5f)
                lineTo(21f, 5f)
                horizontalLineToRelative(1f)
                close()
            }
        }.also { _Tickets = it}
