package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Ball: ImageVector? = null

val Icons.Rr.Ball: ImageVector
    get() = _Ball ?: UXIcon(name = "Ball") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.5f, 17f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, 24f, 20.5f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20.5f, 17f)
                close()
                moveTo(20.5f, 22f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 22f, 20.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20.5f, 22f)
                close()
                moveTo(23.95f, 2.44f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -5.43f, -1.11f)
                lineTo(7.79f, 17.54f)
                arcTo(0.96f, 0.96f, 0f, isMoreThanHalf = true, isPositiveArc = true, 6.15f, 16.53f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = true, isPositiveArc = false, -5.11f, -3.15f)
                arcTo(6.96f, 6.96f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6.95f, 24f)
                arcToRelative(7.04f, 7.04f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.63f, -0.19f)
                arcToRelative(6.89f, 6.89f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.3f, -3.09f)
                lineTo(23.48f, 4.68f)
                arcTo(2.99f, 2.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, 23.95f, 2.44f)
                close()
                moveTo(11.19f, 19.64f)
                arcToRelative(4.96f, 4.96f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8.45f, -5.2f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 1.7f, 1.05f)
                arcTo(2.96f, 2.96f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9.47f, 18.62f)
                lineToRelative(4.78f, -7.22f)
                lineToRelative(1.67f, 1.1f)
                close()
                moveTo(21.83f, 3.56f)
                lineToRelative(-0.01f, 0.01f)
                lineToRelative(-4.8f, 7.25f)
                lineToRelative(-1.67f, -1.1f)
                lineToRelative(4.82f, -7.29f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.65f, 1.12f)
                close()
            }
        }.also { _Ball = it}
