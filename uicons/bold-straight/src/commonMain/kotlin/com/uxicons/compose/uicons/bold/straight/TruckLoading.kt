package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TruckLoading: ImageVector? = null

val Icons.Bs.TruckLoading: ImageVector
    get() = _TruckLoading ?: UXIcon(name = "TruckLoading") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.5f, 3f)
                lineTo(24f, 3f)
                lineTo(24f, 0f)
                lineTo(20.5f, 0f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17f, 3.5f)
                lineTo(17f, 16.36f)
                lineToRelative(-0.61f, 0.17f)
                lineTo(13.51f, 6.85f)
                lineTo(0.07f, 10.71f)
                lineTo(2.79f, 20.31f)
                lineTo(0.1f, 21.05f)
                lineToRelative(0.8f, 2.89f)
                lineToRelative(16.27f, -4.52f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, 20.5f, 17f)
                arcToRelative(3.43f, 3.43f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.5f, 0.04f)
                lineTo(20f, 3.5f)
                arcTo(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20.5f, 3f)
                close()
                moveTo(3.77f, 12.77f)
                lineToRelative(7.71f, -2.21f)
                lineTo(13.5f, 17.33f)
                lineTo(5.68f, 19.5f)
                close()
                moveTo(9.79f, 12.98f)
                lineTo(10.62f, 15.87f)
                lineTo(7.12f, 16.87f)
                lineTo(6.29f, 13.98f)
                close()
            }
        }.also { _TruckLoading = it}
