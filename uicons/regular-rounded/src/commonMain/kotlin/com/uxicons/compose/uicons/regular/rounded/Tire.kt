package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Tire: ImageVector? = null

val Icons.Rr.Tire: ImageVector
    get() = _Tire ?: UXIcon(name = "Tire") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 0f)
                arcTo(12.01f, 12.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 12f)
                curveToRelative(0.6f, 15.9f, 23.4f, 15.89f, 24f, 0f)
                arcTo(12.01f, 12.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 0f)
                close()
                moveTo(12f, 22f)
                arcTo(10.01f, 10.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 12f)
                curveTo(2.5f, -1.25f, 21.5f, -1.25f, 22f, 12f)
                arcTo(10.01f, 10.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 22f)
                close()
                moveTo(12f, 4f)
                arcToRelative(8.01f, 8.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, -8f, 8f)
                curveToRelative(0.38f, 10.59f, 15.63f, 10.59f, 16f, 0f)
                arcTo(8.01f, 8.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 4f)
                close()
                moveTo(11.17f, 13.09f)
                arcToRelative(4.19f, 4.19f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.14f, -0.81f)
                arcToRelative(4.25f, 4.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.3f, -0.76f)
                arcTo(3.59f, 3.59f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 10.65f)
                arcToRelative(3.59f, 3.59f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.27f, 0.86f)
                arcToRelative(4.25f, 4.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.3f, 0.76f)
                arcToRelative(4.19f, 4.19f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.14f, 0.81f)
                arcTo(4.11f, 4.11f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11.17f, 13.09f)
                close()
                moveTo(17.12f, 8.87f)
                lineToRelative(-1.93f, 0.77f)
                arcTo(1.6f, 1.6f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13f, 8.16f)
                lineTo(13f, 6.08f)
                arcTo(6.02f, 6.02f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17.12f, 8.87f)
                close()
                moveTo(11f, 6.08f)
                lineTo(11f, 8.16f)
                arcTo(1.6f, 1.6f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8.81f, 9.65f)
                lineTo(6.88f, 8.87f)
                arcTo(6.02f, 6.02f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11f, 6.08f)
                close()
                moveTo(6f, 12f)
                arcToRelative(6.03f, 6.03f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.14f, -1.27f)
                lineToRelative(1.7f, 0.68f)
                arcToRelative(2.13f, 2.13f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.91f, 3.25f)
                lineToRelative(-1.1f, 1.46f)
                arcTo(5.98f, 5.98f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6f, 12f)
                close()
                moveTo(9.25f, 17.33f)
                lineTo(10.4f, 15.8f)
                arcToRelative(2.06f, 2.06f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.2f, 0f)
                lineToRelative(1.15f, 1.53f)
                arcTo(6.04f, 6.04f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9.25f, 17.33f)
                close()
                moveTo(16.35f, 16.13f)
                lineTo(15.69f, 15.26f)
                lineTo(15.25f, 14.67f)
                arcToRelative(2.13f, 2.13f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.91f, -3.25f)
                lineToRelative(1.7f, -0.68f)
                arcTo(6.03f, 6.03f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16.35f, 16.13f)
                close()
            }
        }.also { _Tire = it}
