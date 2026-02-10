package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowUpSquareTriangle: ImageVector? = null

val Icons.Ss.ArrowUpSquareTriangle: ImageVector
    get() = _ArrowUpSquareTriangle ?: UXIcon(name = "ArrowUpSquareTriangle") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(7.37f, 0.59f)
                lineToRelative(4.5f, 4.5f)
                lineToRelative(-1.41f, 1.41f)
                lineToRelative(-3.5f, -3.5f)
                lineTo(6.96f, 24f)
                horizontalLineToRelative(-2f)
                lineTo(4.96f, 3f)
                lineTo(1.46f, 6.5f)
                lineTo(0.04f, 5.09f)
                lineTo(4.54f, 0.59f)
                curveToRelative(0.76f, -0.76f, 2.07f, -0.76f, 2.83f, 0f)
                close()
                moveTo(23f, 1f)
                lineTo(14f, 1f)
                lineTo(14f, 10f)
                horizontalLineToRelative(9f)
                lineTo(23f, 1f)
                close()
                moveTo(18.5f, 12.9f)
                lineToRelative(-5.47f, 10.1f)
                horizontalLineToRelative(10.95f)
                lineToRelative(-5.47f, -10.1f)
                close()
            }
        }.also { _ArrowUpSquareTriangle = it}
