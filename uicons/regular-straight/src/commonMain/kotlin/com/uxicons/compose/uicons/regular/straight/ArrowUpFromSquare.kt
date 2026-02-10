package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowUpFromSquare: ImageVector? = null

val Icons.Rs.ArrowUpFromSquare: ImageVector
    get() = _ArrowUpFromSquare ?: UXIcon(name = "ArrowUpFromSquare") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(6.73f, 7.68f)
                lineToRelative(-1.47f, -1.36f)
                lineTo(10.56f, 0.61f)
                curveToRelative(0.81f, -0.81f, 2.08f, -0.81f, 2.85f, -0.03f)
                lineToRelative(5.32f, 5.73f)
                lineToRelative(-1.47f, 1.36f)
                lineTo(13f, 3.08f)
                verticalLineToRelative(12.92f)
                horizontalLineToRelative(-2f)
                lineTo(11f, 3.03f)
                lineTo(6.73f, 7.68f)
                close()
                moveTo(21.84f, 6.08f)
                lineToRelative(-1.84f, 1.74f)
                verticalLineToRelative(14.18f)
                lineTo(4f, 22f)
                lineTo(4f, 7.8f)
                lineToRelative(-1.83f, -1.75f)
                curveToRelative(-0.1f, 0.3f, -0.17f, 0.61f, -0.17f, 0.94f)
                lineTo(2f, 24f)
                lineTo(22f, 24f)
                lineTo(22f, 7f)
                curveToRelative(0f, -0.32f, -0.06f, -0.63f, -0.16f, -0.92f)
                close()
            }
        }.also { _ArrowUpFromSquare = it}
