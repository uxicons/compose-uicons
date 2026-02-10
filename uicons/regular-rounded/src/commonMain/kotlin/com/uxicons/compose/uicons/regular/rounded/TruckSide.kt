package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TruckSide: ImageVector? = null

val Icons.Rr.TruckSide: ImageVector
    get() = _TruckSide ?: UXIcon(name = "TruckSide") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 5f)
                lineTo(16.9f, 5f)
                arcTo(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 1f)
                lineTo(5f, 1f)
                arcTo(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 6f)
                verticalLineToRelative(9f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.06f, 3.88f)
                arcToRelative(3.5f, 3.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, 6.9f, 0.12f)
                horizontalLineToRelative(4.08f)
                arcToRelative(3.46f, 3.46f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.04f, 0.5f)
                arcToRelative(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7f, 0f)
                arcToRelative(3.4f, 3.4f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.06f, -0.62f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 15f)
                lineTo(24f, 10f)
                arcTo(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19f, 5f)
                close()
                moveTo(22f, 10f)
                verticalLineToRelative(1f)
                lineTo(17f, 11f)
                lineTo(17f, 7f)
                horizontalLineToRelative(2f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 22f, 10f)
                close()
                moveTo(2f, 15f)
                lineTo(2f, 6f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5f, 3f)
                horizontalLineToRelative(7f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 3f)
                lineTo(15f, 17f)
                lineTo(4f, 17f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 15f)
                close()
                moveTo(8f, 19.5f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3f, 0f)
                arcToRelative(1.42f, 1.42f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.09f, -0.5f)
                lineTo(7.91f, 19f)
                arcTo(1.42f, 1.42f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 19.5f)
                close()
                moveTo(17.5f, 21f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 19.5f)
                arcToRelative(1.41f, 1.41f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.09f, -0.5f)
                horizontalLineToRelative(2.81f)
                arcToRelative(1.41f, 1.41f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.09f, 0.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17.5f, 21f)
                close()
                moveTo(20f, 17f)
                lineTo(17f, 17f)
                lineTo(17f, 13f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(2f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20f, 17f)
                close()
            }
        }.also { _TruckSide = it}
