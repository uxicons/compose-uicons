package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Boxes: ImageVector? = null

val Icons.Ts.Boxes: ImageVector
    get() = _Boxes ?: UXIcon(name = "Boxes") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15.5f, 15f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-1f)
                close()
                moveTo(24f, 13.5f)
                verticalLineToRelative(10.5f)
                lineTo(0f, 24f)
                lineTo(0f, 13.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(2.5f)
                lineTo(5f, 2.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(9f)
                curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
                lineTo(19f, 11f)
                horizontalLineToRelative(2.5f)
                curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
                close()
                moveTo(6f, 11f)
                horizontalLineToRelative(12f)
                lineTo(18f, 2.5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                lineTo(7.5f, 1f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                lineTo(6f, 11f)
                close()
                moveTo(1f, 23f)
                lineTo(11.5f, 23f)
                lineTo(11.5f, 12f)
                lineTo(2.5f, 12f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                verticalLineToRelative(9.5f)
                close()
                moveTo(23f, 13.5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                lineTo(12.5f, 12f)
                verticalLineToRelative(11f)
                horizontalLineToRelative(10.5f)
                lineTo(23f, 13.5f)
                close()
                moveTo(4.5f, 15f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-1f)
                lineTo(4.5f, 15f)
                close()
                moveTo(10f, 5f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(1f)
                close()
            }
        }.also { _Boxes = it}
