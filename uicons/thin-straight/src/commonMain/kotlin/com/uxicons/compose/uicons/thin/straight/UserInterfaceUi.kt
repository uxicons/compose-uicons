package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UserInterfaceUi: ImageVector? = null

val Icons.Ts.UserInterfaceUi: ImageVector
    get() = _UserInterfaceUi ?: UXIcon(name = "UserInterfaceUi") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(13f, 7f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(6f)
                curveToRelative(0f, 2.21f, -1.79f, 4f, -4f, 4f)
                reflectiveCurveToRelative(-4f, -1.79f, -4f, -4f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(6f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                reflectiveCurveToRelative(3f, -1.35f, 3f, -3f)
                verticalLineToRelative(-6f)
                close()
                moveTo(17f, 17f)
                horizontalLineToRelative(1f)
                lineTo(18f, 7f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(10f)
                close()
                moveTo(24f, 2.5f)
                verticalLineToRelative(21.5f)
                lineTo(0f, 24f)
                lineTo(0f, 2.5f)
                curveTo(0f, 1.12f, 1.12f, 0f, 2.5f, 0f)
                horizontalLineToRelative(19f)
                curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
                close()
                moveTo(23f, 2.5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                lineTo(2.5f, 1f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                verticalLineToRelative(20.5f)
                horizontalLineToRelative(22f)
                lineTo(23f, 2.5f)
                close()
            }
        }.also { _UserInterfaceUi = it}
