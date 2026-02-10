package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowUpFromSquare: ImageVector? = null

val Icons.Bs.ArrowUpFromSquare: ImageVector
    get() = _ArrowUpFromSquare ?: UXIcon(name = "ArrowUpFromSquare") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(7.6f, 8.02f)
                lineToRelative(-2.21f, -2.03f)
                lineTo(10.19f, 0.78f)
                curveToRelative(1.02f, -1.02f, 2.6f, -1.02f, 3.58f, -0.04f)
                lineToRelative(4.84f, 5.25f)
                lineToRelative(-2.21f, 2.03f)
                lineToRelative(-2.9f, -3.15f)
                verticalLineToRelative(11.13f)
                horizontalLineToRelative(-3f)
                lineTo(10.5f, 4.87f)
                lineToRelative(-2.9f, 3.15f)
                close()
                moveTo(21.21f, 6.31f)
                lineToRelative(-2.23f, 2.06f)
                curveToRelative(0.01f, 0.04f, 0.03f, 0.09f, 0.03f, 0.14f)
                verticalLineToRelative(12.5f)
                lineTo(5f, 21f)
                lineTo(5f, 8.5f)
                curveToRelative(0f, -0.05f, 0.01f, -0.09f, 0.03f, -0.14f)
                lineToRelative(-2.23f, -2.06f)
                curveToRelative(-0.49f, 0.6f, -0.79f, 1.36f, -0.79f, 2.19f)
                verticalLineToRelative(15.5f)
                lineTo(22f, 24f)
                lineTo(22f, 8.5f)
                curveToRelative(0f, -0.83f, -0.3f, -1.59f, -0.79f, -2.19f)
                close()
            }
        }.also { _ArrowUpFromSquare = it}
