package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Bike: ImageVector? = null

val Icons.Bs.Bike: ImageVector
    get() = _Bike ?: UXIcon(name = "Bike") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19.9f, 12.19f)
                arcTo(32.68f, 32.68f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18.4f, 5.34f)
                curveToRelative(0.34f, -0.12f, 0.7f, -0.25f, 1.02f, -0.33f)
                arcToRelative(0.41f, 0.41f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.32f, 0.02f)
                arcTo(1.32f, 1.32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20f, 6f)
                horizontalLineToRelative(3f)
                arcToRelative(4.08f, 4.08f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.44f, -3.35f)
                arcToRelative(3.33f, 3.33f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.92f, -0.54f)
                arcToRelative(21.72f, 21.72f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.76f, 1.02f)
                lineToRelative(-1.31f, 0.59f)
                lineToRelative(0.53f, 1.33f)
                curveToRelative(0.01f, 0.02f, 0.32f, 0.81f, 0.68f, 2.01f)
                lineToRelative(-3.9f, 3.21f)
                lineTo(8.62f, 7f)
                lineTo(10f, 7f)
                lineTo(10f, 4f)
                lineTo(3f, 4f)
                lineTo(3f, 7f)
                lineTo(4.38f, 7f)
                lineToRelative(5.18f, 5.18f)
                lineToRelative(-0.95f, 0.78f)
                arcToRelative(5.51f, 5.51f, 0f, isMoreThanHalf = true, isPositiveArc = false, 1.92f, 2.31f)
                lineToRelative(6.07f, -5f)
                curveToRelative(0.12f, 0.64f, 0.23f, 1.3f, 0.3f, 1.97f)
                arcToRelative(5.51f, 5.51f, 0f, isMoreThanHalf = true, isPositiveArc = false, 3f, -0.05f)
                close()
                moveTo(5.5f, 20f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 8f, 17.5f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.5f, 20f)
                close()
                moveTo(18.5f, 20f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 21f, 17.5f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18.5f, 20f)
                close()
            }
        }.also { _Bike = it}
