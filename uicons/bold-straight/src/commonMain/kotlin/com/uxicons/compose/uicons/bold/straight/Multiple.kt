package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Multiple: ImageVector? = null

val Icons.Bs.Multiple: ImageVector
    get() = _Multiple ?: UXIcon(name = "Multiple") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 8.96f)
                verticalLineToRelative(15.04f)
                lineTo(5f, 24f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(16f)
                lineTo(21f, 5.13f)
                curveToRelative(1.72f, 0.43f, 3f, 1.98f, 3f, 3.83f)
                close()
                moveTo(19f, 19f)
                lineTo(0f, 19f)
                lineTo(0f, 3.5f)
                curveTo(0f, 1.57f, 1.57f, 0f, 3.5f, 0f)
                horizontalLineToRelative(12f)
                curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
                verticalLineToRelative(15.5f)
                close()
                moveTo(16f, 3.5f)
                curveToRelative(0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f)
                lineTo(3.5f, 3f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                verticalLineToRelative(12.5f)
                horizontalLineToRelative(13f)
                lineTo(16f, 3.5f)
                close()
                moveTo(11f, 5f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-3f)
                close()
            }
        }.also { _Multiple = it}
