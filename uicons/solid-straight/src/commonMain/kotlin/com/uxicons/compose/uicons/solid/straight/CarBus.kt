package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CarBus: ImageVector? = null

val Icons.Ss.CarBus: ImageVector
    get() = _CarBus ?: UXIcon(name = "CarBus") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18f, 5f)
                lineTo(2f, 5f)
                lineTo(2f, 4.18f)
                arcToRelative(3.01f, 3.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.69f, -2.7f)
                curveToRelative(3.28f, -1.9f, 9.34f, -1.89f, 12.62f, 0f)
                arcTo(3.01f, 3.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18f, 4.18f)
                close()
                moveTo(2f, 14f)
                verticalLineToRelative(5f)
                lineTo(4f, 19f)
                verticalLineToRelative(2f)
                lineTo(6f, 21f)
                lineTo(6f, 17f)
                arcToRelative(13.35f, 13.35f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.64f, -3f)
                close()
                moveTo(24f, 18f)
                verticalLineToRelative(4f)
                lineTo(22f, 22f)
                verticalLineToRelative(2f)
                lineTo(18f, 24f)
                lineTo(18f, 22f)
                lineTo(14f, 22f)
                verticalLineToRelative(2f)
                lineTo(10f, 24f)
                lineTo(10f, 22f)
                lineTo(8f, 22f)
                lineTo(8f, 18f)
                arcToRelative(11.03f, 11.03f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.19f, -2f)
                lineTo(23.81f, 16f)
                arcTo(11.03f, 11.03f, 0f, isMoreThanHalf = false, isPositiveArc = true, 24f, 18f)
                close()
                moveTo(12.01f, 18f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 2f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12.01f, 18f)
                close()
                moveTo(20.01f, 18f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 2f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20.01f, 18f)
                close()
                moveTo(10.06f, 10.85f)
                lineTo(8.85f, 13.77f)
                curveToRelative(-0.03f, 0.08f, -0.05f, 0.15f, -0.08f, 0.23f)
                lineTo(23.24f, 14f)
                curveToRelative(-0.03f, -0.08f, -0.05f, -0.15f, -0.08f, -0.23f)
                lineToRelative(-1.22f, -2.92f)
                arcTo(2.99f, 2.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19.17f, 9f)
                lineTo(12.83f, 9f)
                arcTo(2.99f, 2.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10.06f, 10.85f)
                close()
                moveTo(8.22f, 10.08f)
                arcTo(4.99f, 4.99f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12.83f, 7f)
                lineTo(2f, 7f)
                lineTo(2f, 8f)
                lineTo(0f, 8f)
                verticalLineToRelative(2f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 2f)
                lineTo(7.42f, 12f)
                close()
            }
        }.also { _CarBus = it}
