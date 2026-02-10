package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TruckLoading: ImageVector? = null

val Icons.Rr.TruckLoading: ImageVector
    get() = _TruckLoading ?: UXIcon(name = "TruckLoading") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 16f)
                verticalLineTo(5f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, -3f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -2f)
                arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, -5f, 5f)
                verticalLineTo(16.28f)
                lineToRelative(-2.73f, 0.91f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.16f, -1f)
                lineToRelative(-1.55f, -5.1f)
                arcTo(3.01f, 3.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9.79f, 9.14f)
                lineToRelative(-6.7f, 2.13f)
                arcTo(3.01f, 3.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.13f, 15f)
                lineToRelative(1.63f, 5.37f)
                arcToRelative(2.97f, 2.97f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.46f, 0.83f)
                lineToRelative(-2.54f, 0.84f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.63f, 1.9f)
                lineTo(16.1f, 19.02f)
                arcTo(4.02f, 4.02f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19.97f, 24f)
                curveTo(25.23f, 23.86f, 25.25f, 16.17f, 20f, 16f)
                close()
                moveTo(4.66f, 19.75f)
                lineTo(3.04f, 14.42f)
                arcTo(1.01f, 1.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.7f, 13.18f)
                lineToRelative(6.7f, -2.13f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.25f, 0.64f)
                lineTo(13.2f, 16.79f)
                lineToRelative(0.01f, 0.03f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.51f, 1.22f)
                lineToRelative(-6.89f, 2.3f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.66f, 19.75f)
                close()
                moveTo(19.97f, 22f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -4f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19.97f, 22f)
                close()
                moveTo(10.05f, 14f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9.4f, 15.26f)
                lineToRelative(-2.46f, 0.79f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.61f, -1.91f)
                lineToRelative(2.46f, -0.78f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10.05f, 14f)
                close()
            }
        }.also { _TruckLoading = it}
