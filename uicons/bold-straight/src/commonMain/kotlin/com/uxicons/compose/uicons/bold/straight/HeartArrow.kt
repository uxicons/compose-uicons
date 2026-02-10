package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HeartArrow: ImageVector? = null

val Icons.Bs.HeartArrow: ImageVector
    get() = _HeartArrow ?: UXIcon(name = "HeartArrow") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.56f, 19.44f)
                lineTo(19.4f, 17.28f)
                curveToRelative(1.93f, -2.12f, 3.6f, -4.66f, 3.6f, -7.12f)
                arcTo(5.97f, 5.97f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17.25f, 4f)
                arcTo(5.99f, 5.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13f, 5.93f)
                arcTo(5.99f, 5.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8.75f, 4f)
                arcToRelative(5.38f, 5.38f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.17f, 0.46f)
                lineTo(2.12f, 0f)
                lineTo(0f, 2.12f)
                lineTo(4.24f, 6.36f)
                arcTo(6.41f, 6.41f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 10.16f)
                curveToRelative(0f, 5.26f, 7.61f, 10.9f, 9.13f, 11.97f)
                lineToRelative(0.86f, 0.61f)
                lineToRelative(0.86f, -0.61f)
                arcToRelative(38.45f, 38.45f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.41f, -2.74f)
                lineToRelative(2.17f, 2.17f)
                lineTo(17f, 24f)
                horizontalLineToRelative(6f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1f, -1f)
                verticalLineTo(17f)
                close()
                moveTo(13f, 19.05f)
                curveToRelative(-3.61f, -2.73f, -7f, -6.48f, -7f, -8.89f)
                arcTo(2.98f, 2.98f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8.75f, 7f)
                curveToRelative(1.76f, 0f, 2.92f, 2.07f, 2.93f, 2.08f)
                lineTo(12.99f, 11.5f)
                lineToRelative(1.33f, -2.41f)
                curveTo(14.33f, 9.07f, 15.49f, 7f, 17.25f, 7f)
                arcTo(2.98f, 2.98f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20f, 10.16f)
                curveTo(20f, 12.57f, 16.61f, 16.32f, 13f, 19.05f)
                close()
            }
        }.also { _HeartArrow = it}
