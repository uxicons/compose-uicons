package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TruckMoving: ImageVector? = null

val Icons.Rs.TruckMoving: ImageVector
    get() = _TruckMoving ?: UXIcon(name = "TruckMoving") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 12.65f)
                arcToRelative(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.26f, -1.58f)
                lineTo(22.41f, 7.05f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19.56f, 5f)
                lineTo(17f, 5f)
                lineTo(17f, 4f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3f, -3f)
                lineTo(3f, 1f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 4f)
                lineTo(0f, 19.5f)
                arcToRelative(3.52f, 3.52f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6f, 2.45f)
                arcTo(3.52f, 3.52f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 19.5f)
                lineTo(12f, 19f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(0.5f)
                arcToRelative(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7f, 0f)
                lineTo(22f, 19f)
                horizontalLineToRelative(2f)
                close()
                moveTo(19.56f, 7f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.95f, 0.68f)
                lineTo(21.61f, 11f)
                lineTo(17f, 11f)
                lineTo(17f, 7f)
                close()
                moveTo(2f, 4f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 3f)
                lineTo(14f, 3f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, 1f)
                lineTo(15f, 17f)
                lineTo(2f, 17f)
                close()
                moveTo(3.5f, 21f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 19.5f)
                lineTo(2f, 19f)
                lineTo(5f, 19f)
                verticalLineToRelative(0.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.5f, 21f)
                close()
                moveTo(10f, 19.5f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3f, 0f)
                lineTo(7f, 19f)
                horizontalLineToRelative(3f)
                close()
                moveTo(20f, 19.5f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3f, 0f)
                lineTo(17f, 19f)
                horizontalLineToRelative(3f)
                close()
                moveTo(17f, 17f)
                lineTo(17f, 13f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(4f)
                close()
            }
        }.also { _TruckMoving = it}
