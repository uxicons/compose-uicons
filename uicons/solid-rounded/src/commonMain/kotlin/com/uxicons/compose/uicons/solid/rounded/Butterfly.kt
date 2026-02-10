package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Butterfly: ImageVector? = null

val Icons.Sr.Butterfly: ImageVector
    get() = _Butterfly ?: UXIcon(name = "Butterfly") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.04f, 1.02f)
                curveTo(24.2f, 0.76f, 25.71f, 9.09f, 21.5f, 12.93f)
                arcTo(6.71f, 6.71f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16.8f, 15f)
                arcToRelative(9.82f, 9.82f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3.8f, -0.7f)
                lineTo(13f, 5.38f)
                curveTo(15.02f, 3.13f, 17.51f, 1.02f, 20.04f, 1.02f)
                close()
                moveTo(12f, 4f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -4f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 4f)
                close()
                moveTo(16.79f, 17f)
                arcTo(11.69f, 11.69f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 16f)
                lineToRelative(0f, 0f)
                lineToRelative(0f, 0f)
                curveToRelative(-2.1f, 1.11f, -7.2f, 1.78f, -10.21f, -1.02f)
                arcToRelative(6.61f, 6.61f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.45f, 5.14f)
                arcToRelative(4.02f, 4.02f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.3f, 2.57f)
                arcToRelative(3.91f, 3.91f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.35f, -0.13f)
                arcTo(16.37f, 16.37f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11f, 19.62f)
                lineTo(11f, 22f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 0f)
                lineTo(13f, 19.62f)
                arcToRelative(16.37f, 16.37f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.02f, 2.93f)
                arcToRelative(3.91f, 3.91f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.35f, 0.13f)
                arcToRelative(4.02f, 4.02f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.3f, -2.57f)
                arcToRelative(6.61f, 6.61f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.45f, -5.14f)
                arcTo(8.57f, 8.57f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16.79f, 17f)
                close()
                moveTo(7.21f, 15f)
                arcTo(9.84f, 9.84f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11f, 14.3f)
                lineTo(11f, 5.37f)
                curveTo(7.52f, 1.12f, 0.24f, -2.57f, 0.01f, 7.28f)
                arcToRelative(8.18f, 8.18f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.5f, 5.65f)
                arcTo(6.82f, 6.82f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.21f, 15f)
                close()
            }
        }.also { _Butterfly = it}
