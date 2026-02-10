package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Pepper: ImageVector? = null

val Icons.Rs.Pepper: ImageVector
    get() = _Pepper ?: UXIcon(name = "Pepper") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18.84f, 5.06f)
                curveTo(18.25f, 1.6f, 16.06f, 0f, 14f, 0f)
                lineTo(14f, 2f)
                curveToRelative(1.17f, 0f, 2.36f, 1.06f, 2.81f, 3.12f)
                arcTo(6.01f, 6.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 11f)
                curveToRelative(0f, 2.5f, -2.38f, 4f, -4.68f, 4f)
                curveToRelative(-3.47f, 0f, -4.63f, -2.8f, -4.99f, -5.15f)
                lineTo(2.2f, 9f)
                lineTo(0.36f, 9f)
                lineToRelative(-0.15f, 0.82f)
                arcTo(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = false, 24f, 12f)
                lineTo(24f, 11f)
                arcTo(6.01f, 6.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18.84f, 5.06f)
                close()
                moveTo(20.38f, 7.79f)
                arcToRelative(2.94f, 2.94f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4.76f, 0f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.76f, 0f)
                close()
                moveTo(22f, 12f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.45f, 14.98f)
                arcTo(6.37f, 6.37f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.32f, 17f)
                curveTo(11.06f, 17f, 14f, 14.36f, 14f, 11f)
                arcToRelative(3.99f, 3.99f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.34f, -1.62f)
                arcToRelative(4.94f, 4.94f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.31f, 0f)
                arcTo(3.99f, 3.99f, 0f, isMoreThanHalf = false, isPositiveArc = true, 22f, 11f)
                close()
            }
        }.also { _Pepper = it}
