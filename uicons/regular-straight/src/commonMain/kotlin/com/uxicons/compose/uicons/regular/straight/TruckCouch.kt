package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TruckCouch: ImageVector? = null

val Icons.Rs.TruckCouch: ImageVector
    get() = _TruckCouch ?: UXIcon(name = "TruckCouch") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 2f)
                horizontalLineToRelative(3f)
                verticalLineTo(0f)
                horizontalLineTo(21f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3f, 3f)
                verticalLineTo(16.27f)
                lineTo(3.34f, 20.99f)
                lineToRelative(-1.28f, -3.9f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.64f, -1.26f)
                lineToRelative(0.96f, -0.32f)
                lineToRelative(0.93f, 2.87f)
                lineTo(16.1f, 14.44f)
                lineToRelative(-0.92f, -2.84f)
                lineToRelative(0.82f, -0.27f)
                verticalLineTo(9.27f)
                arcToRelative(3.01f, 3.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.51f, 0.11f)
                lineToRelative(-0.93f, 0.31f)
                lineToRelative(-0.85f, -2.63f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.81f, -1.9f)
                lineTo(4.09f, 7.19f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.91f, 3.78f)
                lineToRelative(0.85f, 2.63f)
                lineToRelative(-0.97f, 0.32f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.15f, 17.72f)
                lineToRelative(1.28f, 3.89f)
                lineToRelative(-1.38f, 0.44f)
                lineToRelative(0.61f, 1.9f)
                lineToRelative(15.47f, -4.98f)
                arcTo(4.02f, 4.02f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20f, 24f)
                curveToRelative(5.27f, -0.14f, 5.27f, -7.86f, 0f, -8f)
                verticalLineTo(3f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21f, 2f)
                close()
                moveTo(4.14f, 9.59f)
                arcToRelative(1.01f, 1.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.6f, -0.51f)
                lineTo(10.55f, 7.05f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.26f, 0.63f)
                lineToRelative(1.78f, 5.5f)
                lineToRelative(-7.74f, 2.65f)
                lineTo(4.08f, 10.36f)
                arcTo(0.99f, 0.99f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.14f, 9.59f)
                close()
                moveTo(22f, 20f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4f, 0f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 22f, 20f)
                close()
            }
        }.also { _TruckCouch = it}
