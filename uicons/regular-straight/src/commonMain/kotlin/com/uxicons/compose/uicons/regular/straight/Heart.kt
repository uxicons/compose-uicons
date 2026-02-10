package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Heart: ImageVector? = null

val Icons.Rs.Heart: ImageVector
    get() = _Heart ?: UXIcon(name = "Heart") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17.5f, 0.92f)
                arcToRelative(6.4f, 6.4f, 0f, isMoreThanHalf = false, isPositiveArc = false, -5.5f, 3.3f)
                arcTo(6.4f, 6.4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6.5f, 0.92f)
                arcTo(6.8f, 6.8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 7.97f)
                curveToRelative(0f, 6.78f, 10.96f, 14.6f, 11.42f, 14.93f)
                lineToRelative(0.58f, 0.41f)
                lineToRelative(0.58f, -0.41f)
                curveTo(13.04f, 22.57f, 24f, 14.74f, 24f, 7.97f)
                arcTo(6.8f, 6.8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17.5f, 0.92f)
                close()
                moveTo(12f, 20.85f)
                curveToRelative(-3.25f, -2.43f, -10f, -8.4f, -10f, -12.88f)
                arcToRelative(4.8f, 4.8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.5f, -5.05f)
                arcTo(4.8f, 4.8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11f, 7.97f)
                horizontalLineToRelative(2f)
                arcToRelative(4.8f, 4.8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.5f, -5.05f)
                arcTo(4.8f, 4.8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 22f, 7.97f)
                curveTo(22f, 12.45f, 15.25f, 18.42f, 12f, 20.85f)
                close()
            }
        }.also { _Heart = it}
