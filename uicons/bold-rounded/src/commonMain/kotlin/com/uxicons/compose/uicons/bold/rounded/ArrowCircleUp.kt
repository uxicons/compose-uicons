package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowCircleUp: ImageVector? = null

val Icons.Br.ArrowCircleUp: ImageVector
    get() = _ArrowCircleUp ?: UXIcon(name = "ArrowCircleUp") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(12f, 24f)
            arcTo(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = false, 0f, 12f)
            arcTo(12.01f, 12.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 24f)
            close()
            moveTo(12f, 3f)
            arcToRelative(9f, 9f, 0f, isMoreThanHalf = true, isPositiveArc = true, -9f, 9f)
            arcTo(9.01f, 9.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 3f)
            close()
        }
        path(fill = SolidColor(Color.Black)) {
            moveTo(8.55f, 11.19f)
            lineTo(10.5f, 9.27f)
            verticalLineTo(17.5f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 0f)
            verticalLineTo(9.27f)
            lineToRelative(1.95f, 1.92f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, 2.1f, -2.14f)
            lineTo(14.45f, 6f)
            arcToRelative(3.52f, 3.52f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4.9f, 0f)
            lineToRelative(-3.1f, 3.05f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, 2.1f, 2.14f)
            close()
        }
    }.also { _ArrowCircleUp = it }
