package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DiagramLeanCanvas: ImageVector? = null

val Icons.Tr.DiagramLeanCanvas: ImageVector
    get() = _DiagramLeanCanvas ?: UXIcon(name = "DiagramLeanCanvas") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19.5f, 2f)
                lineTo(4.5f, 2f)
                curveTo(2.02f, 2f, 0f, 4.02f, 0f, 6.5f)
                verticalLineToRelative(11f)
                curveToRelative(0f, 2.48f, 2.02f, 4.5f, 4.5f, 4.5f)
                horizontalLineToRelative(15f)
                curveToRelative(2.48f, 0f, 4.5f, -2.02f, 4.5f, -4.5f)
                lineTo(24f, 6.5f)
                curveToRelative(0f, -2.48f, -2.02f, -4.5f, -4.5f, -4.5f)
                close()
                moveTo(23f, 6.5f)
                verticalLineToRelative(10.5f)
                horizontalLineToRelative(-4f)
                lineTo(19f, 3f)
                horizontalLineToRelative(0.5f)
                curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
                close()
                moveTo(15f, 17f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(-3f)
                close()
                moveTo(10f, 17f)
                lineTo(10f, 3f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(14f)
                horizontalLineToRelative(-4f)
                close()
                moveTo(6f, 17f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(-3f)
                close()
                moveTo(9f, 10f)
                horizontalLineToRelative(-3f)
                lineTo(6f, 3f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(7f)
                close()
                moveTo(18f, 10f)
                horizontalLineToRelative(-3f)
                lineTo(15f, 3f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(7f)
                close()
                moveTo(4.5f, 3f)
                horizontalLineToRelative(0.5f)
                verticalLineToRelative(14f)
                lineTo(1f, 17f)
                lineTo(1f, 6.5f)
                curveToRelative(0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                close()
                moveTo(1.04f, 18f)
                lineTo(11.5f, 18f)
                verticalLineToRelative(3f)
                lineTo(4.5f, 21f)
                curveToRelative(-1.76f, 0f, -3.22f, -1.31f, -3.46f, -3f)
                close()
                moveTo(19.5f, 21f)
                horizontalLineToRelative(-7f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(10.46f)
                curveToRelative(-0.24f, 1.69f, -1.7f, 3f, -3.46f, 3f)
                close()
            }
        }.also { _DiagramLeanCanvas = it}
