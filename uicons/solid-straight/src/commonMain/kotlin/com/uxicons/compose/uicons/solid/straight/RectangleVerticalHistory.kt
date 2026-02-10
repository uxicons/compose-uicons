package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _RectangleVerticalHistory: ImageVector? = null

val Icons.Ss.RectangleVerticalHistory: ImageVector
    get() = _RectangleVerticalHistory ?: UXIcon(name = "RectangleVerticalHistory") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 24f)
                horizontalLineToRelative(-14f)
                lineTo(10f, 3f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(8f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                verticalLineToRelative(21f)
                close()
                moveTo(7f, 3f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(18f)
                horizontalLineToRelative(2f)
                lineTo(7f, 3f)
                close()
                moveTo(2f, 6f)
                lineTo(0f, 6f)
                verticalLineToRelative(12f)
                horizontalLineToRelative(2f)
                lineTo(2f, 6f)
                close()
            }
        }.also { _RectangleVerticalHistory = it}
