package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SteeringWheel: ImageVector? = null

val Icons.Br.SteeringWheel: ImageVector
    get() = _SteeringWheel ?: UXIcon(name = "SteeringWheel") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(12f, 0f)
            arcTo(12.01f, 12.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 12f)
            curveToRelative(0.6f, 15.9f, 23.4f, 15.89f, 24f, 0f)
            arcTo(12.01f, 12.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 0f)
            close()
            moveTo(12f, 3f)
            arcToRelative(9.01f, 9.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8.31f, 5.54f)
            lineTo(14.02f, 9.79f)
            arcToRelative(10.71f, 10.71f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4.19f, 0f)
            lineTo(3.68f, 8.56f)
            arcTo(9.01f, 9.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 3f)
            close()
            moveTo(3.01f, 12.31f)
            lineToRelative(3.15f, 0.63f)
            arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.73f, 2.02f)
            lineToRelative(0.62f, 1.15f)
            arcToRelative(4.01f, 4.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.48f, 1.9f)
            verticalLineToRelative(2.76f)
            arcTo(9.02f, 9.02f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.01f, 12.31f)
            close()
            moveTo(14f, 20.78f)
            lineTo(14f, 18.01f)
            arcToRelative(4.01f, 4.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.48f, -1.9f)
            lineToRelative(0.62f, -1.15f)
            arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.73f, -2.02f)
            lineToRelative(3.15f, -0.63f)
            arcTo(9.02f, 9.02f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14f, 20.78f)
            close()
        }
    }.also { _SteeringWheel = it }
