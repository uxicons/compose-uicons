package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Hotdog: ImageVector? = null

val Icons.Sr.Hotdog: ImageVector
    get() = _Hotdog ?: UXIcon(name = "Hotdog") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 6f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1f, -1f)
                lineTo(11f, 2f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 0f)
                lineTo(13f, 5f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 6f)
                close()
                moveTo(17f, 4f)
                lineTo(17f, 2f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2f, 0f)
                lineTo(15f, 4f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17f, 4f)
                close()
                moveTo(9f, 3.99f)
                lineTo(9f, 2f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7f, 2f)
                lineTo(7f, 3.99f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9f, 3.99f)
                close()
                moveTo(20.44f, 22.06f)
                curveToRelative(5.28f, -2.69f, 1.54f, -10.55f, -3.89f, -8.12f)
                arcTo(9.33f, 9.33f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 15f)
                arcToRelative(9.33f, 9.33f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4.56f, -1.06f)
                curveToRelative(-5.42f, -2.43f, -9.17f, 5.43f, -3.89f, 8.12f)
                curveTo(7.92f, 24.6f, 16.08f, 24.6f, 20.44f, 22.06f)
                close()
                moveTo(0.96f, 12.91f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6.01f, 8.06f)
                curveToRelative(2.56f, 2.55f, 9.49f, 2.51f, 11.98f, -0.01f)
                curveToRelative(3.42f, -3.28f, 8.32f, 1.86f, 4.81f, 5.08f)
                arcToRelative(6.51f, 6.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, -7.12f, -1f)
                arcTo(7.39f, 7.39f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 13f)
                arcToRelative(7.4f, 7.4f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3.69f, -0.86f)
                arcToRelative(6.5f, 6.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -7.12f, 1f)
                curveTo(1.07f, 13.03f, 0.99f, 12.95f, 0.96f, 12.91f)
                close()
            }
        }.also { _Hotdog = it}
