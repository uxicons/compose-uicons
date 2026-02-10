package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TruckCouch: ImageVector? = null

val Icons.Rr.TruckCouch: ImageVector
    get() = _TruckCouch ?: UXIcon(name = "TruckCouch") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 16f)
                verticalLineTo(5f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, -3f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -2f)
                arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, -5f, 5f)
                verticalLineTo(16.28f)
                lineTo(3.16f, 21.23f)
                lineTo(2.1f, 18.05f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.27f, -2.53f)
                lineToRelative(0.03f, -0.01f)
                lineToRelative(0.39f, 1.16f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.54f, 1.25f)
                lineToRelative(7.74f, -2.65f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.25f, -2.53f)
                lineToRelative(-0.38f, -1.12f)
                lineToRelative(0.38f, -0.13f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.64f, -1.9f)
                lineToRelative(-0.38f, 0.13f)
                lineToRelative(-0.56f, -1.65f)
                arcToRelative(4.02f, 4.02f, 0f, isMoreThanHalf = false, isPositiveArc = false, -5.08f, -2.5f)
                lineTo(4.71f, 6.92f)
                arcToRelative(4.01f, 4.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.49f, 5.07f)
                lineToRelative(0.55f, 1.63f)
                lineToRelative(-0.02f, 0.01f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.2f, 18.68f)
                lineTo(1.26f, 21.86f)
                lineToRelative(-0.58f, 0.19f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.63f, 1.9f)
                lineToRelative(14.81f, -4.94f)
                arcTo(4.02f, 4.02f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20f, 24f)
                curveTo(25.27f, 23.86f, 25.27f, 16.14f, 20f, 16f)
                close()
                moveTo(5.35f, 8.81f)
                lineTo(9.31f, 7.46f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.54f, 1.25f)
                lineToRelative(1.58f, 4.67f)
                horizontalLineToRelative(0f)
                lineToRelative(-7.74f, 2.65f)
                lineToRelative(-1.58f, -4.68f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.35f, 8.81f)
                close()
                moveTo(20f, 22f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -4f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20f, 22f)
                close()
            }
        }.also { _TruckCouch = it}
