package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _RectangleVerticalHistory: ImageVector? = null

val Icons.Bs.RectangleVerticalHistory: ImageVector
    get() = _RectangleVerticalHistory ?: UXIcon(name = "RectangleVerticalHistory") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20.5f, 0f)
                horizontalLineToRelative(-7f)
                curveToRelative(-1.93f, 0f, -3.5f, 1.57f, -3.5f, 3.5f)
                verticalLineToRelative(20.5f)
                horizontalLineToRelative(14f)
                lineTo(24f, 3.5f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                close()
                moveTo(21f, 21f)
                horizontalLineToRelative(-8f)
                lineTo(13f, 3.5f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(7f)
                curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                verticalLineToRelative(17.5f)
                close()
                moveTo(5f, 3f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(18f)
                horizontalLineToRelative(-3f)
                lineTo(5f, 3f)
                close()
                moveTo(0f, 6f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(12f)
                lineTo(0f, 18f)
                lineTo(0f, 6f)
                close()
            }
        }.also { _RectangleVerticalHistory = it}
