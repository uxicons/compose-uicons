package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TruckContainer: ImageVector? = null

val Icons.Bs.TruckContainer: ImageVector
    get() = _TruckContainer ?: UXIcon(name = "TruckContainer") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13f, 4.5f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9.5f, 1f)
                horizontalLineToRelative(-6f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 4.5f)
                lineTo(0f, 15f)
                lineTo(13f, 15f)
                close()
                moveTo(10f, 12f)
                lineTo(8f, 12f)
                lineTo(8f, 6f)
                lineTo(5f, 6f)
                verticalLineToRelative(6f)
                lineTo(3f, 12f)
                lineTo(3f, 4.5f)
                arcTo(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.5f, 4f)
                horizontalLineToRelative(6f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.5f, 0.5f)
                close()
                moveTo(24f, 13.15f)
                arcToRelative(5.5f, 5.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.28f, -1.74f)
                lineTo(22.38f, 7.39f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19.06f, 5f)
                lineTo(15f, 5f)
                lineTo(15f, 17f)
                lineTo(0f, 17f)
                verticalLineToRelative(3.5f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, 4.95f, 20f)
                horizontalLineToRelative(1.1f)
                arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, 4.9f, 0f)
                horizontalLineToRelative(6.1f)
                arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, 4.9f, 0f)
                lineTo(24f, 20f)
                close()
                moveTo(19.06f, 8f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.47f, 0.34f)
                lineToRelative(1.34f, 4.02f)
                arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.13f, 0.79f)
                lineTo(21f, 13.5f)
                lineTo(18f, 13.5f)
                lineTo(18f, 8f)
                close()
            }
        }.also { _TruckContainer = it}
