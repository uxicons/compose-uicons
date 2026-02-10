package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Taco: ImageVector? = null

val Icons.Ss.Taco: ImageVector
    get() = _Taco ?: UXIcon(name = "Taco") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14f, 6f)
                arcTo(10.01f, 10.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 16f)
                verticalLineToRelative(4f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2f, 0f)
                lineTo(2f, 16f)
                arcToRelative(7.99f, 7.99f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.9f, -3.69f)
                arcToRelative(17.51f, 17.51f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.71f, -2.53f)
                arcTo(9.96f, 9.96f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 16f)
                verticalLineToRelative(4f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 3f)
                lineTo(21f, 23f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, -3f)
                lineTo(24f, 16f)
                arcTo(10.01f, 10.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 14f, 6f)
                close()
                moveTo(16f, 20f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 1f, -1f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 20f)
                close()
                moveTo(18f, 17f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 1f, -1f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18f, 17f)
                close()
                moveTo(20f, 20f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 1f, -1f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20f, 20f)
                close()
                moveTo(4.29f, 8.98f)
                arcTo(8.6f, 8.6f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, 7f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.31f, 3.06f)
                arcToRelative(3.54f, 3.54f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.96f, -1.97f)
                arcToRelative(3.97f, 3.97f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.46f, 0f)
                arcTo(3.42f, 3.42f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17.5f, 1f)
                arcToRelative(3.51f, 3.51f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.19f, 2.06f)
                arcTo(4.01f, 4.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 24f, 7f)
                arcToRelative(8.6f, 8.6f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.29f, 1.98f)
                arcToRelative(11.96f, 11.96f, 0f, isMoreThanHalf = false, isPositiveArc = false, -19.43f, 0f)
                close()
            }
        }.also { _Taco = it}
