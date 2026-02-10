package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Grill: ImageVector? = null

val Icons.Rr.Grill: ImageVector
    get() = _Grill ?: UXIcon(name = "Grill") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.34f, 7.13f)
                arcTo(2.98f, 2.98f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21f, 6f)
                lineTo(3f, 6f)
                curveToRelative(-6.65f, 1.04f, -0.64f, 9.79f, 2.83f, 11.34f)
                lineTo(4.05f, 22.68f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, 1.9f, 0.63f)
                lineTo(7.65f, 18.2f)
                arcTo(12.33f, 12.33f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11f, 18.96f)
                lineTo(11f, 23f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 0f)
                lineTo(13f, 18.96f)
                arcToRelative(12.32f, 12.32f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.35f, -0.76f)
                lineToRelative(1.71f, 5.12f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, 1.9f, -0.63f)
                lineToRelative(-1.78f, -5.34f)
                curveTo(21.01f, 15.85f, 25.62f, 10.4f, 23.34f, 7.13f)
                close()
                moveTo(21.97f, 9.24f)
                curveTo(19.49f, 19.5f, 4.51f, 19.5f, 2.03f, 9.24f)
                arcTo(0.99f, 0.99f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 8f)
                lineTo(21f, 8f)
                arcTo(0.99f, 0.99f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21.97f, 9.24f)
                close()
                moveTo(11f, 3f)
                lineTo(11f, 1f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 0f)
                lineTo(13f, 3f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11f, 3f)
                close()
                moveTo(15f, 3f)
                lineTo(15f, 1f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 2f, 0f)
                lineTo(17f, 3f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15f, 3f)
                close()
                moveTo(7f, 3f)
                lineTo(7f, 1f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 9f, 1f)
                lineTo(9f, 3f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7f, 3f)
                close()
            }
        }.also { _Grill = it}
