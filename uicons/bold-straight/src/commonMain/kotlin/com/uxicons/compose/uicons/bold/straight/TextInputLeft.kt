package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TextInputLeft: ImageVector? = null

val Icons.Bs.TextInputLeft: ImageVector
    get() = _TextInputLeft ?: UXIcon(name = "TextInputLeft") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 5.5f)
                lineTo(24f, 22f)
                lineTo(14f, 22f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(7f)
                lineTo(21f, 5.5f)
                curveToRelative(0f, -0.28f, -0.23f, -0.5f, -0.5f, -0.5f)
                horizontalLineToRelative(-6.5f)
                lineTo(14f, 2f)
                horizontalLineToRelative(6.5f)
                curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
                close()
                moveTo(0f, 5.5f)
                lineTo(0f, 22f)
                lineTo(3f, 22f)
                lineTo(3f, 2.05f)
                curveToRelative(-1.69f, 0.24f, -3f, 1.69f, -3f, 3.45f)
                close()
                moveTo(14f, 17f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-7f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-7f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(7f)
                close()
                moveTo(10f, 20.5f)
                lineTo(10f, 3.5f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(1.5f)
                lineTo(12f, 0f)
                horizontalLineToRelative(-1.5f)
                curveToRelative(-0.74f, 0f, -1.43f, 0.24f, -2f, 0.64f)
                curveToRelative(-0.57f, -0.4f, -1.26f, -0.64f, -2f, -0.64f)
                horizontalLineToRelative(-1.5f)
                lineTo(5f, 3f)
                horizontalLineToRelative(1.5f)
                curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                lineTo(7f, 20.5f)
                curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                horizontalLineToRelative(-1.5f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(1.5f)
                curveToRelative(0.74f, 0f, 1.43f, -0.24f, 2f, -0.64f)
                curveToRelative(0.57f, 0.4f, 1.26f, 0.64f, 2f, 0.64f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-1.5f)
                curveToRelative(-0.28f, 0f, -0.5f, -0.23f, -0.5f, -0.5f)
                close()
            }
        }.also { _TextInputLeft = it}
