package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Onion: ImageVector? = null

val Icons.Bs.Onion: ImageVector
    get() = _Onion ?: UXIcon(name = "Onion") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 13f)
                curveToRelative(0f, -5.72f, -4.58f, -8.62f, -8f, -9.66f)
                lineTo(16f, 0f)
                lineTo(8f, 0f)
                lineTo(8f, 3.34f)
                curveTo(4.7f, 4.35f, 0f, 7.24f, 0f, 13f)
                curveToRelative(0f, 4.71f, 3.32f, 7.66f, 9.23f, 8.34f)
                lineToRelative(-0.59f, 0.65f)
                lineTo(10.86f, 24f)
                lineTo(12f, 22.75f)
                lineTo(13.14f, 24f)
                lineToRelative(2.22f, -2.02f)
                lineToRelative(-0.59f, -0.65f)
                curveTo(20.68f, 20.66f, 24f, 17.71f, 24f, 13f)
                close()
                moveTo(11f, 4.95f)
                lineTo(11f, 3f)
                horizontalLineToRelative(2f)
                lineTo(13f, 4.97f)
                lineToRelative(0.26f, 0.38f)
                arcTo(17.37f, 17.37f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 14f)
                curveToRelative(0f, 2.32f, -0.82f, 3.74f, -2.43f, 4.26f)
                arcTo(11.56f, 11.56f, 0f, isMoreThanHalf = false, isPositiveArc = false, 14f, 15f)
                curveToRelative(0f, -6f, -2f, -8f, -2f, -8f)
                reflectiveCurveToRelative(-2f, 2f, -2f, 8f)
                arcToRelative(11.56f, 11.56f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.43f, 3.26f)
                curveTo(8.82f, 17.74f, 8f, 16.32f, 8f, 14f)
                curveToRelative(0f, -4.35f, 2.73f, -8.64f, 2.76f, -8.68f)
                close()
                moveTo(3f, 13f)
                arcTo(6.48f, 6.48f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6.42f, 7.31f)
                arcTo(18.42f, 18.42f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 14f)
                arcToRelative(9.41f, 9.41f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.52f, 3.22f)
                arcTo(4.54f, 4.54f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 13f)
                close()
                moveTo(18.48f, 17.22f)
                arcTo(9.41f, 9.41f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19f, 14f)
                arcToRelative(18.21f, 18.21f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.37f, -6.64f)
                arcTo(6.47f, 6.47f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21f, 13f)
                arcTo(4.54f, 4.54f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18.48f, 17.22f)
                close()
            }
        }.also { _Onion = it}
