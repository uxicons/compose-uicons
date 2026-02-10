package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DiagramSuccessor: ImageVector? = null

val Icons.Bs.DiagramSuccessor: ImageVector
    get() = _DiagramSuccessor ?: UXIcon(name = "DiagramSuccessor") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 14f)
                verticalLineToRelative(7f)
                curveToRelative(0f, 1.65f, -1.35f, 3f, -3f, 3f)
                lineTo(3f, 24f)
                curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                verticalLineToRelative(-7f)
                lineTo(24f, 14f)
                close()
                moveTo(13f, 10f)
                lineTo(0f, 10f)
                lineTo(0f, 3.5f)
                curveTo(0f, 1.57f, 1.57f, 0f, 3.5f, 0f)
                horizontalLineToRelative(6f)
                curveToRelative(1.76f, 0f, 3.22f, 1.31f, 3.46f, 3f)
                horizontalLineToRelative(4.54f)
                curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(2.5f)
                lineToRelative(-3.16f, 3.65f)
                curveToRelative(-0.44f, 0.49f, -1.22f, 0.49f, -1.66f, 0f)
                lineToRelative(-3.18f, -3.65f)
                horizontalLineToRelative(2.5f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f)
                horizontalLineToRelative(-4.5f)
                verticalLineToRelative(4f)
                close()
                moveTo(10f, 3.5f)
                curveToRelative(0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f)
                lineTo(3.5f, 3f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                verticalLineToRelative(3.5f)
                horizontalLineToRelative(7f)
                lineTo(10f, 3.5f)
                close()
            }
        }.also { _DiagramSuccessor = it}
