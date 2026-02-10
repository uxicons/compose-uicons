package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _GripVertical: ImageVector? = null

val Icons.Bs.GripVertical: ImageVector
    get() = _GripVertical ?: UXIcon(name = "GripVertical") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19.5f, 0f)
                horizontalLineToRelative(-6.5f)
                verticalLineToRelative(24f)
                horizontalLineToRelative(6.5f)
                curveToRelative(1.93f, 0f, 3.5f, -1.57f, 3.5f, -3.5f)
                lineTo(23f, 3.5f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                close()
                moveTo(20f, 20.5f)
                curveToRelative(0f, 0.28f, -0.23f, 0.5f, -0.5f, 0.5f)
                horizontalLineToRelative(-3.5f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(3.5f)
                close()
                moveTo(20f, 14f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(4f)
                close()
                moveTo(16f, 7f)
                lineTo(16f, 3f)
                horizontalLineToRelative(3.5f)
                curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                verticalLineToRelative(3.5f)
                horizontalLineToRelative(-4f)
                close()
                moveTo(1f, 3.5f)
                verticalLineToRelative(17f)
                curveToRelative(0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                horizontalLineToRelative(6.5f)
                lineTo(11f, 0f)
                horizontalLineToRelative(-6.5f)
                curveTo(2.57f, 0f, 1f, 1.57f, 1f, 3.5f)
                close()
                moveTo(8f, 21f)
                horizontalLineToRelative(-3.5f)
                curveToRelative(-0.28f, 0f, -0.5f, -0.22f, -0.5f, -0.5f)
                verticalLineToRelative(-3.5f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(4f)
                close()
                moveTo(8f, 14f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(4f)
                close()
                moveTo(8f, 7f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-3.5f)
                curveToRelative(0f, -0.28f, 0.23f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(3.5f)
                verticalLineToRelative(4f)
                close()
            }
        }.also { _GripVertical = it}
