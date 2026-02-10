package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Hotdog: ImageVector? = null

val Icons.Ss.Hotdog: ImageVector
    get() = _Hotdog ?: UXIcon(name = "Hotdog") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 24f)
                arcToRelative(18.15f, 18.15f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8.44f, -1.94f)
                arcToRelative(4.5f, 4.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.89f, -8.12f)
                arcTo(9.32f, 9.32f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 15f)
                arcToRelative(9.32f, 9.32f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.56f, -1.06f)
                arcToRelative(4.5f, 4.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.89f, 8.12f)
                arcTo(18.15f, 18.15f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 24f)
                close()
                moveTo(13f, 1f)
                lineTo(11f, 1f)
                lineTo(11f, 6f)
                horizontalLineToRelative(2f)
                close()
                moveTo(17f, 1f)
                lineTo(15f, 1f)
                lineTo(15f, 5f)
                horizontalLineToRelative(2f)
                close()
                moveTo(9f, 1f)
                lineTo(7f, 1f)
                lineTo(7f, 4.99f)
                lineTo(9f, 4.99f)
                close()
                moveTo(1.19f, 13.13f)
                arcToRelative(6.51f, 6.51f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.12f, -1f)
                arcTo(7.4f, 7.4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 13f)
                arcToRelative(7.39f, 7.39f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.69f, -0.86f)
                arcToRelative(6.51f, 6.51f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.12f, 1f)
                curveToRelative(0.12f, -0.11f, 0.2f, -0.19f, 0.23f, -0.23f)
                arcTo(3.46f, 3.46f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22.93f, 8f)
                arcTo(3.52f, 3.52f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18f, 8.05f)
                arcTo(8.7f, 8.7f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 10f)
                arcTo(8.73f, 8.73f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6.02f, 8.07f)
                arcTo(3.51f, 3.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.1f, 7.96f)
                arcToRelative(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.14f, 4.95f)
                curveTo(1f, 12.95f, 1.07f, 13.03f, 1.19f, 13.13f)
                close()
            }
        }.also { _Hotdog = it}
