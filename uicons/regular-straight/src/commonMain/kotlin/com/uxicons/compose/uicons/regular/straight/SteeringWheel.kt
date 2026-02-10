package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SteeringWheel: ImageVector? = null

val Icons.Rs.SteeringWheel: ImageVector
    get() = _SteeringWheel ?: UXIcon(name = "SteeringWheel") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 0f)
                arcTo(12.01f, 12.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 12f)
                curveToRelative(0.6f, 15.9f, 23.4f, 15.89f, 24f, 0f)
                arcTo(12.01f, 12.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 0f)
                close()
                moveTo(12f, 2f)
                arcToRelative(10.01f, 10.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8.88f, 5.4f)
                lineToRelative(-7.05f, 1.41f)
                arcToRelative(9.64f, 9.64f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3.8f, 0f)
                lineTo(3.11f, 7.43f)
                arcTo(10.01f, 10.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 2f)
                close()
                moveTo(2.06f, 13.14f)
                lineToRelative(3.9f, 0.78f)
                arcToRelative(2.99f, 2.99f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.05f, 1.51f)
                lineToRelative(0.62f, 1.15f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9f, 18.01f)
                lineTo(9f, 21.54f)
                arcTo(10.03f, 10.03f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.06f, 13.14f)
                close()
                moveTo(11f, 21.95f)
                lineTo(11f, 18.01f)
                arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.6f, -2.38f)
                lineTo(9.77f, 14.48f)
                arcToRelative(4.99f, 4.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.42f, -2.52f)
                lineToRelative(-4.31f, -0.86f)
                arcToRelative(9.82f, 9.82f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.32f, -1.77f)
                lineToRelative(7.27f, 1.45f)
                arcToRelative(11.63f, 11.63f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.58f, 0f)
                lineToRelative(7.41f, -1.48f)
                arcToRelative(9.85f, 9.85f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.33f, 1.8f)
                lineToRelative(-4.31f, 0.86f)
                arcToRelative(4.99f, 4.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.42f, 2.52f)
                lineTo(13.6f, 15.63f)
                arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.6f, 2.38f)
                lineTo(13f, 21.95f)
                arcTo(10.13f, 10.13f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11f, 21.95f)
                close()
                moveTo(15f, 21.54f)
                lineTo(15f, 18.01f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.36f, -1.43f)
                lineToRelative(0.62f, -1.15f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.05f, -1.51f)
                lineToRelative(3.9f, -0.78f)
                arcTo(10.03f, 10.03f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15f, 21.54f)
                close()
            }
        }.also { _SteeringWheel = it}
