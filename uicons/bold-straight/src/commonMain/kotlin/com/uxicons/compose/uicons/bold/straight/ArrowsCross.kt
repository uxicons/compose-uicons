package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowsCross: ImageVector? = null

val Icons.Bs.ArrowsCross: ImageVector
    get() = _ArrowsCross ?: UXIcon(name = "ArrowsCross") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(8.46f, 10.59f)
                lineTo(0.04f, 2.16f)
                lineTo(2.16f, 0.04f)
                lineTo(10.59f, 8.46f)
                lineToRelative(-2.12f, 2.12f)
                close()
                moveTo(21f, 18.88f)
                lineToRelative(-5.47f, -5.47f)
                lineToRelative(-2.12f, 2.12f)
                lineToRelative(5.47f, 5.47f)
                horizontalLineToRelative(-3.88f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(6.5f)
                curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
                verticalLineToRelative(-6.5f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(3.88f)
                close()
                moveTo(21.5f, 0f)
                horizontalLineToRelative(-6.5f)
                lineTo(15f, 3f)
                horizontalLineToRelative(3.88f)
                lineTo(0.04f, 21.84f)
                lineToRelative(2.12f, 2.12f)
                lineTo(21f, 5.12f)
                verticalLineToRelative(3.88f)
                horizontalLineToRelative(3f)
                lineTo(24f, 2.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                close()
            }
        }.also { _ArrowsCross = it}
