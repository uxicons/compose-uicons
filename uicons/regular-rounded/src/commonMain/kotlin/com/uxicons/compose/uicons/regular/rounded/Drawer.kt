package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Drawer: ImageVector? = null

val Icons.Rr.Drawer: ImageVector
    get() = _Drawer ?: UXIcon(name = "Drawer") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(17.5f, 0f)
                lineTo(6.5f, 0f)
                curveTo(4.02f, 0f, 2f, 2.02f, 2f, 4.5f)
                verticalLineToRelative(18.5f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(16f)
                verticalLineToRelative(3f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                lineTo(22f, 4.5f)
                curveToRelative(0f, -2.48f, -2.02f, -4.5f, -4.5f, -4.5f)
                close()
                moveTo(4f, 12f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(1f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(4f)
                lineTo(4f, 12f)
                close()
                moveTo(6.5f, 2f)
                horizontalLineToRelative(4.5f)
                verticalLineToRelative(1f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(4.5f)
                curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
                verticalLineToRelative(1.5f)
                lineTo(4f, 6f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                close()
                moveTo(4f, 18f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(1f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(4f)
                lineTo(4f, 18f)
                close()
            }
        }.also { _Drawer = it}
