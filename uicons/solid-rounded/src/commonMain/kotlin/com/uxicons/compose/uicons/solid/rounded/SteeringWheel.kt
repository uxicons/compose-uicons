package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SteeringWheel: ImageVector? = null

val Icons.Sr.SteeringWheel: ImageVector
    get() = _SteeringWheel ?: UXIcon(name = "SteeringWheel") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 0f)
                arcTo(12.01f, 12.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 12f)
                curveToRelative(0.6f, 15.9f, 23.4f, 15.89f, 24f, 0f)
                arcTo(12.01f, 12.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 0f)
                close()
                moveTo(12f, 2f)
                arcToRelative(10.01f, 10.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9.3f, 6.34f)
                lineTo(14.02f, 9.79f)
                arcToRelative(10.71f, 10.71f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4.19f, 0f)
                lineTo(2.69f, 8.37f)
                arcTo(10.01f, 10.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 2f)
                close()
                moveTo(2f, 12.11f)
                lineTo(6.16f, 12.94f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.73f, 2.02f)
                lineToRelative(0.62f, 1.15f)
                arcToRelative(4.01f, 4.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.48f, 1.9f)
                lineTo(9.99f, 21.8f)
                arcTo(10.01f, 10.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.0f, 12.11f)
                close()
                moveTo(14f, 21.8f)
                lineTo(14f, 18.01f)
                arcToRelative(4.01f, 4.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.48f, -1.9f)
                lineToRelative(0.62f, -1.15f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.73f, -2.02f)
                lineTo(22f, 12.11f)
                arcTo(10.01f, 10.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14f, 21.8f)
                close()
            }
        }.also { _SteeringWheel = it}
