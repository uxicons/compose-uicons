package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TruckSide: ImageVector? = null

val Icons.Rs.TruckSide: ImageVector
    get() = _TruckSide ?: UXIcon(name = "TruckSide") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 5f)
                lineTo(17f, 5f)
                lineTo(17f, 4f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3f, -3f)
                lineTo(3f, 1f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 4f)
                lineTo(0f, 19f)
                lineTo(2.04f, 19f)
                arcTo(3.46f, 3.46f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 19.5f)
                arcToRelative(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7f, 0f)
                arcToRelative(3.46f, 3.46f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.04f, -0.5f)
                horizontalLineToRelative(6.08f)
                arcToRelative(3.46f, 3.46f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.04f, 0.5f)
                arcToRelative(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7f, 0f)
                arcToRelative(3.46f, 3.46f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.04f, -0.5f)
                lineTo(24f, 19f)
                lineTo(24f, 10f)
                arcTo(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19f, 5f)
                close()
                moveTo(19f, 7f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 3f)
                verticalLineToRelative(1f)
                lineTo(17f, 11f)
                lineTo(17f, 7f)
                close()
                moveTo(7f, 19.5f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3f, 0f)
                arcToRelative(1.42f, 1.42f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.09f, -0.5f)
                lineTo(6.91f, 19f)
                arcTo(1.42f, 1.42f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7f, 19.5f)
                close()
                moveTo(15f, 17f)
                lineTo(2f, 17f)
                lineTo(2f, 4f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 3f)
                lineTo(14f, 3f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, 1f)
                close()
                moveTo(20f, 19.5f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3f, 0f)
                arcToRelative(1.41f, 1.41f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.09f, -0.5f)
                horizontalLineToRelative(2.81f)
                arcTo(1.41f, 1.41f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20f, 19.5f)
                close()
                moveTo(17f, 17f)
                lineTo(17f, 13f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(4f)
                close()
            }
        }.also { _TruckSide = it}
