package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _RectangleVerticalHistory: ImageVector? = null

val Icons.Ts.RectangleVerticalHistory: ImageVector
    get() = _RectangleVerticalHistory ?: UXIcon(name = "RectangleVerticalHistory") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21.5f, 0f)
                horizontalLineToRelative(-9f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                verticalLineToRelative(21.5f)
                horizontalLineToRelative(14f)
                lineTo(24f, 2.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                close()
                moveTo(23f, 23f)
                horizontalLineToRelative(-12f)
                lineTo(11f, 2.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(9f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(20.5f)
                close()
                moveTo(5f, 3f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(18f)
                horizontalLineToRelative(-1f)
                lineTo(5f, 3f)
                close()
                moveTo(0f, 6f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(12f)
                lineTo(0f, 18f)
                lineTo(0f, 6f)
                close()
            }
        }.also { _RectangleVerticalHistory = it}
