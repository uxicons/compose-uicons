package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Biking: ImageVector? = null

val Icons.Bs.Biking: ImageVector
    get() = _Biking ?: UXIcon(name = "Biking") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(4.5f, 23f)
                arcTo(4.5f, 4.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 9f, 18.5f)
                arcTo(4.5f, 4.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.5f, 23f)
                close()
                moveTo(4.5f, 17f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, 6f, 18.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.5f, 17f)
                close()
                moveTo(19.5f, 23f)
                arcTo(4.5f, 4.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 24f, 18.5f)
                arcTo(4.5f, 4.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19.5f, 23f)
                close()
                moveTo(19.5f, 17f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, 21f, 18.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19.5f, 17f)
                close()
                moveTo(13.5f, 14.22f)
                lineTo(10.14f, 11.86f)
                arcTo(0.49f, 0.49f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10f, 11.53f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.16f, -0.38f)
                lineTo(12.05f, 9.1f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.66f, 0.05f)
                lineTo(15.93f, 12f)
                lineTo(20f, 12f)
                lineTo(20f, 9f)
                lineTo(17.07f, 9f)
                lineTo(14.8f, 7f)
                arcToRelative(3.49f, 3.49f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4.81f, -0.09f)
                lineTo(8.08f, 8.99f)
                arcToRelative(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.14f, 5.19f)
                lineTo(10.5f, 15.78f)
                lineTo(10.5f, 20f)
                horizontalLineToRelative(3f)
                close()
                moveTo(16.5f, 1f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, 19f, 3.5f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16.5f, 1f)
                close()
            }
        }.also { _Biking = it}
