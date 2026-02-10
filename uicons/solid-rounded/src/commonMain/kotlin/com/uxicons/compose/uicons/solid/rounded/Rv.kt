package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Rv: ImageVector? = null

val Icons.Sr.Rv: ImageVector
    get() = _Rv ?: UXIcon(name = "Rv") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(8f, 7f)
                lineTo(8f, 9f)
                lineTo(4f, 9f)
                lineTo(4f, 7f)
                close()
                moveTo(16f, 10f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(7.5f)
                arcToRelative(6.87f, 6.87f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.42f, -0.88f)
                lineTo(21.3f, 8f)
                lineTo(18f, 8f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 10f)
                close()
                moveTo(16f, 14f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(7f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1f, -1f)
                lineTo(24f, 14.59f)
                curveToRelative(0f, -0.2f, -0.02f, -0.4f, -0.04f, -0.59f)
                close()
                moveTo(14f, 19f)
                lineTo(4f, 19f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.71f, -0.29f)
                lineTo(2.05f, 17.46f)
                arcTo(6.95f, 6.95f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 12.52f)
                lineTo(0f, 6f)
                arcTo(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5f, 1f)
                lineTo(21f, 1f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 3f)
                lineTo(24f, 5f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1f, 1f)
                lineTo(18f, 6f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4f, 4f)
                close()
                moveTo(10f, 9f)
                lineTo(10f, 7f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 5f)
                lineTo(4f, 5f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 7f)
                lineTo(2f, 9f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 2f)
                lineTo(8f, 11f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10f, 9f)
                close()
                moveTo(4.06f, 21f)
                curveToRelative(-0.59f, 3.95f, 5.47f, 3.95f, 4.88f, 0f)
                close()
                moveTo(16.06f, 21f)
                curveToRelative(-0.59f, 3.95f, 5.47f, 3.95f, 4.88f, 0f)
                close()
            }
        }.also { _Rv = it}
