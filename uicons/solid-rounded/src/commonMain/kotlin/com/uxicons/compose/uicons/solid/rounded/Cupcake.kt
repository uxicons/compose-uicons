package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Cupcake: ImageVector? = null

val Icons.Sr.Cupcake: ImageVector
    get() = _Cupcake ?: UXIcon(name = "Cupcake") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14f, 2f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4f, 0f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14f, 2f)
                close()
                moveTo(19.85f, 18.64f)
                arcTo(4.98f, 4.98f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 18.57f)
                arcToRelative(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4f, 0f)
                arcToRelative(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4f, 0f)
                arcToRelative(4.99f, 4.99f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3.85f, 0.06f)
                arcToRelative(5.3f, 5.3f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.63f, 0.36f)
                lineToRelative(0.16f, 0.88f)
                arcTo(4.99f, 4.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.6f, 24f)
                lineTo(16.4f, 24f)
                arcToRelative(4.99f, 4.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.92f, -4.12f)
                lineToRelative(0.16f, -0.88f)
                arcTo(5.27f, 5.27f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19.85f, 18.64f)
                close()
                moveTo(23.52f, 11.41f)
                arcTo(11.89f, 11.89f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15.2f, 4.38f)
                arcToRelative(4.01f, 4.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, -6.39f, 0f)
                arcToRelative(11.89f, 11.89f, 0f, isMoreThanHalf = false, isPositiveArc = false, -8.33f, 7.03f)
                arcTo(9.12f, 9.12f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 14.46f)
                arcTo(2.41f, 2.41f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.38f, 17f)
                curveToRelative(0.45f, 0f, 1.56f, -0.31f, 1.69f, -0.72f)
                arcTo(2.98f, 2.98f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 16.22f)
                arcToRelative(2.99f, 2.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 0f)
                arcToRelative(2.99f, 2.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 0f)
                arcToRelative(2.98f, 2.98f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.93f, 0.06f)
                curveToRelative(0.12f, 0.41f, 1.23f, 0.72f, 1.69f, 0.72f)
                arcTo(2.41f, 2.41f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 14.46f)
                arcTo(9.12f, 9.12f, 0f, isMoreThanHalf = false, isPositiveArc = false, 23.52f, 11.41f)
                close()
            }
        }.also { _Cupcake = it}
