package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DiagramNext: ImageVector? = null

val Icons.Bs.DiagramNext: ImageVector
    get() = _DiagramNext ?: UXIcon(name = "DiagramNext") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 3f)
                verticalLineToRelative(7f)
                lineTo(13.5f, 10f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(3f)
                lineToRelative(-3.79f, 3.71f)
                curveToRelative(-0.39f, 0.39f, -1.02f, 0.39f, -1.41f, 0f)
                lineToRelative(-3.79f, -3.71f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-4f)
                lineTo(0f, 10f)
                lineTo(0f, 3f)
                curveTo(0f, 1.35f, 1.35f, 0f, 3f, 0f)
                lineTo(21f, 0f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                close()
                moveTo(16.29f, 17f)
                horizontalLineToRelative(4.71f)
                verticalLineToRelative(3.5f)
                curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                lineTo(3.5f, 21f)
                curveToRelative(-0.28f, 0f, -0.5f, -0.22f, -0.5f, -0.5f)
                verticalLineToRelative(-3.5f)
                lineTo(7.71f, 17f)
                lineToRelative(-3.07f, -3f)
                lineTo(0f, 14f)
                verticalLineToRelative(6.5f)
                curveToRelative(0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                lineTo(20.5f, 24f)
                curveToRelative(1.93f, 0f, 3.5f, -1.57f, 3.5f, -3.5f)
                verticalLineToRelative(-6.5f)
                horizontalLineToRelative(-4.64f)
                lineToRelative(-3.07f, 3f)
                close()
            }
        }.also { _DiagramNext = it}
