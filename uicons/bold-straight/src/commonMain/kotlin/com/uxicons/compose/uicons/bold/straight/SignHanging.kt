package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SignHanging: ImageVector? = null

val Icons.Bs.SignHanging: ImageVector
    get() = _SignHanging ?: UXIcon(name = "SignHanging") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 3f)
                lineTo(24f, 0f)
                lineTo(3.5f, 0f)
                curveTo(1.57f, 0f, 0f, 1.57f, 0f, 3.5f)
                lineTo(0f, 24f)
                lineTo(3f, 24f)
                lineTo(3f, 3.5f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(4.5f)
                verticalLineToRelative(2.04f)
                curveToRelative(-1.69f, 0.24f, -3f, 1.7f, -3f, 3.46f)
                verticalLineToRelative(12.5f)
                lineTo(24f, 21f)
                lineTo(24f, 8.5f)
                curveToRelative(0f, -1.76f, -1.31f, -3.22f, -3f, -3.46f)
                lineTo(21f, 3f)
                horizontalLineToRelative(3f)
                close()
                moveTo(21f, 18f)
                lineTo(8f, 18f)
                lineTo(8f, 8.5f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(12f)
                curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                verticalLineToRelative(9.5f)
                close()
                moveTo(18f, 5f)
                horizontalLineToRelative(-7f)
                lineTo(11f, 3f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(2f)
                close()
            }
        }.also { _SignHanging = it}
