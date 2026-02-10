package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Poo: ImageVector? = null

val Icons.Sr.Poo: ImageVector
    get() = _Poo ?: UXIcon(name = "Poo") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.11f, 14.48f)
                arcToRelative(4.01f, 4.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.46f, -6.12f)
                arcToRelative(2.9f, 2.9f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.27f, -2.03f)
                arcTo(3.17f, 3.17f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16.8f, 4f)
                horizontalLineToRelative(-0.94f)
                arcTo(6.78f, 6.78f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13.2f, 0.11f)
                arcToRelative(0.86f, 0.86f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.27f, 0.65f)
                arcTo(5.91f, 5.91f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10.5f, 4f)
                lineTo(7.2f, 4f)
                arcTo(3.17f, 3.17f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.08f, 6.34f)
                arcToRelative(2.9f, 2.9f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.27f, 2.03f)
                arcToRelative(4.01f, 4.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.46f, 6.12f)
                curveTo(-1.99f, 16.8f, -0.25f, 24.01f, 5.21f, 24f)
                lineTo(17.62f, 24f)
                curveTo(24.25f, 24.29f, 26.24f, 17.16f, 21.11f, 14.48f)
                close()
                moveTo(14.5f, 11f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 3f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14.5f, 11f)
                close()
                moveTo(9.5f, 11f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 3f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9.5f, 11f)
                close()
                moveTo(17.67f, 16.75f)
                arcToRelative(8.38f, 8.38f, 0f, isMoreThanHalf = false, isPositiveArc = true, -11.33f, 0f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.33f, -1.49f)
                arcToRelative(6.36f, 6.36f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8.67f, 0f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.33f, 1.49f)
                close()
            }
        }.also { _Poo = it}
