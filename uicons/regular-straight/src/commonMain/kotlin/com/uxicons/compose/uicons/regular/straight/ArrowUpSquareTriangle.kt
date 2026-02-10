package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowUpSquareTriangle: ImageVector? = null

val Icons.Rs.ArrowUpSquareTriangle: ImageVector
    get() = _ArrowUpSquareTriangle ?: UXIcon(name = "ArrowUpSquareTriangle") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(7.42f, 0.59f)
                lineToRelative(4.5f, 4.5f)
                lineToRelative(-1.41f, 1.41f)
                lineToRelative(-3.5f, -3.5f)
                lineTo(7.0f, 24f)
                horizontalLineToRelative(-2f)
                lineTo(5.0f, 3f)
                lineTo(1.5f, 6.5f)
                lineTo(0.09f, 5.09f)
                lineTo(4.59f, 0.59f)
                curveToRelative(0.76f, -0.76f, 2.07f, -0.76f, 2.83f, 0f)
                close()
                moveTo(23f, 10f)
                lineTo(14f, 10f)
                lineTo(14f, 1f)
                horizontalLineToRelative(9f)
                lineTo(23f, 10f)
                close()
                moveTo(21f, 3f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(5f)
                lineTo(21f, 3f)
                close()
                moveTo(23.98f, 23f)
                lineTo(13.03f, 23f)
                lineToRelative(5.47f, -10.1f)
                lineToRelative(5.47f, 10.1f)
                close()
                moveTo(16.39f, 21f)
                horizontalLineToRelative(4.23f)
                lineToRelative(-2.12f, -3.9f)
                lineToRelative(-2.12f, 3.9f)
                close()
            }
        }.also { _ArrowUpSquareTriangle = it}
