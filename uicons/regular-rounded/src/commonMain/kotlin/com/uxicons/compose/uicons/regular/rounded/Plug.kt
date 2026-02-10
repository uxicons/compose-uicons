package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Plug: ImageVector? = null

val Icons.Rr.Plug: ImageVector
    get() = _Plug ?: UXIcon(name = "Plug") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22f, 7f)
                horizontalLineToRelative(-5f)
                lineTo(17f, 1f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(-6f)
                lineTo(9f, 1f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                verticalLineToRelative(6f)
                lineTo(2f, 7f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(3f)
                curveToRelative(0f, 4.62f, 3.51f, 8.45f, 8f, 8.94f)
                verticalLineToRelative(2.06f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-2.06f)
                curveToRelative(4.49f, -0.5f, 8f, -4.32f, 8f, -8.94f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(1f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                close()
                moveTo(19f, 12f)
                curveToRelative(0f, 3.86f, -3.14f, 7f, -7f, 7f)
                reflectiveCurveToRelative(-7f, -3.14f, -7f, -7f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(14f)
                verticalLineToRelative(3f)
                close()
            }
        }.also { _Plug = it}
