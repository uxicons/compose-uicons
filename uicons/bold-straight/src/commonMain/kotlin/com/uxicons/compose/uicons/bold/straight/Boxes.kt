package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Boxes: ImageVector? = null

val Icons.Bs.Boxes: ImageVector
    get() = _Boxes ?: UXIcon(name = "Boxes") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15f, 15f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-3f)
                close()
                moveTo(24f, 13.5f)
                verticalLineToRelative(10.5f)
                lineTo(0f, 24f)
                lineTo(0f, 13.5f)
                curveToRelative(0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                horizontalLineToRelative(1.5f)
                lineTo(5f, 3.5f)
                curveToRelative(0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                horizontalLineToRelative(7f)
                curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
                verticalLineToRelative(6.5f)
                horizontalLineToRelative(1.5f)
                curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
                close()
                moveTo(8f, 10f)
                horizontalLineToRelative(8f)
                lineTo(16f, 3.5f)
                curveToRelative(0f, -0.28f, -0.23f, -0.5f, -0.5f, -0.5f)
                horizontalLineToRelative(-7f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.23f, -0.5f, 0.5f)
                verticalLineToRelative(6.5f)
                close()
                moveTo(3f, 21f)
                horizontalLineToRelative(7.5f)
                lineTo(10.5f, 13f)
                lineTo(3.5f, 13f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.23f, -0.5f, 0.5f)
                verticalLineToRelative(7.5f)
                close()
                moveTo(21f, 13.5f)
                curveToRelative(0f, -0.28f, -0.23f, -0.5f, -0.5f, -0.5f)
                horizontalLineToRelative(-7f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(7.5f)
                verticalLineToRelative(-7.5f)
                close()
                moveTo(5f, 15f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-3f)
                lineTo(5f, 15f)
                close()
                moveTo(10f, 8f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(3f)
                close()
            }
        }.also { _Boxes = it}
