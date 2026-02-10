package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CarBuilding: ImageVector? = null

val Icons.Bs.CarBuilding: ImageVector
    get() = _CarBuilding ?: UXIcon(name = "CarBuilding") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 19.08f)
                arcToRelative(9.48f, 9.48f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.44f, -2.86f)
                lineToRelative(-1.19f, -3.77f)
                arcTo(3.48f, 3.48f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19.03f, 10f)
                lineTo(14.97f, 10f)
                arcToRelative(3.48f, 3.48f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.34f, 2.45f)
                lineToRelative(-1.19f, 3.77f)
                arcTo(9.47f, 9.47f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10f, 19.08f)
                lineTo(10f, 22f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(4f)
                lineTo(16f, 22f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(4f)
                lineTo(22f, 22f)
                horizontalLineToRelative(2f)
                close()
                moveTo(14.97f, 13f)
                horizontalLineToRelative(4.07f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.48f, 0.35f)
                lineTo(20.34f, 16f)
                horizontalLineToRelative(-6.69f)
                lineToRelative(0.83f, -2.65f)
                arcTo(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14.97f, 13f)
                close()
                moveTo(14.5f, 3f)
                lineTo(3.5f, 3f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.5f, 0.5f)
                lineTo(3f, 24f)
                lineTo(0f, 24f)
                lineTo(0f, 3.5f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.5f, 0f)
                horizontalLineToRelative(11f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18f, 3.5f)
                lineTo(18f, 8f)
                lineTo(15f, 8f)
                lineTo(15f, 3.5f)
                arcTo(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 14.5f, 3f)
                close()
                moveTo(5f, 5f)
                lineTo(8f, 5f)
                lineTo(8f, 8f)
                lineTo(5f, 8f)
                close()
                moveTo(5f, 10f)
                lineTo(8f, 10f)
                verticalLineToRelative(3f)
                lineTo(5f, 13f)
                close()
                moveTo(5f, 15f)
                lineTo(8f, 15f)
                verticalLineToRelative(3f)
                lineTo(5f, 18f)
                close()
                moveTo(5f, 20f)
                lineTo(8f, 20f)
                verticalLineToRelative(3f)
                lineTo(5f, 23f)
                close()
                moveTo(10f, 8f)
                lineTo(10f, 5f)
                horizontalLineToRelative(3f)
                lineTo(13f, 8f)
                close()
            }
        }.also { _CarBuilding = it}
