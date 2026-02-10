package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowCircleDown: ImageVector? = null

val Icons.Br.ArrowCircleDown: ImageVector
    get() = _ArrowCircleDown ?: UXIcon(name = "ArrowCircleDown") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(12f, 0f)
            arcTo(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = false, 24f, 12f)
            arcTo(12.01f, 12.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 0f)
            close()
            moveTo(12f, 21f)
            arcToRelative(9f, 9f, 0f, isMoreThanHalf = true, isPositiveArc = true, 9f, -9f)
            arcTo(9.01f, 9.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 21f)
            close()
        }
        path(fill = SolidColor(Color.Black)) {
            moveTo(15.45f, 12.81f)
            lineTo(13.5f, 14.73f)
            verticalLineTo(6.5f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3f, 0f)
            verticalLineToRelative(8.23f)
            lineTo(8.55f, 12.81f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, -2.1f, 2.14f)
            lineTo(9.55f, 18f)
            arcToRelative(3.52f, 3.52f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.9f, 0f)
            lineToRelative(3.1f, -3.05f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, -2.1f, -2.14f)
            close()
        }
    }.also { _ArrowCircleDown = it }
