package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MapMarker: ImageVector? = null

val Icons.Bs.MapMarker: ImageVector
    get() = _MapMarker ?: UXIcon(name = "MapMarker") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10f, 8f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = true, 2f, 2f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10f, 8f)
                close()
                moveTo(7.97f, 24.06f)
                lineTo(0f, 21.61f)
                lineTo(0f, 12f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.03f, 8.54f)
                arcToRelative(7.99f, 7.99f, 0f, isMoreThanHalf = true, isPositiveArc = true, 15.81f, 1.03f)
                lineToRelative(1.69f, 0.56f)
                arcTo(3.49f, 3.49f, 0f, isMoreThanHalf = false, isPositiveArc = true, 24f, 13.48f)
                lineTo(24f, 24.11f)
                lineToRelative(-8.48f, -2.07f)
                close()
                moveTo(8.46f, 11.54f)
                lineTo(12f, 14.99f)
                lineToRelative(3.55f, -3.47f)
                arcToRelative(5f, 5f, 0f, isMoreThanHalf = true, isPositiveArc = false, -7.08f, 0.01f)
                close()
                moveTo(3f, 19.39f)
                lineToRelative(5.03f, 1.55f)
                lineToRelative(7.45f, -1.99f)
                lineTo(21f, 20.3f)
                lineTo(21f, 13.48f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.36f, -0.48f)
                lineToRelative(-1.93f, -0.65f)
                arcToRelative(8.03f, 8.03f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.05f, 1.3f)
                lineTo(12f, 19.19f)
                lineTo(6.36f, 13.67f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.24f, -1.61f)
                lineTo(3.76f, 11.57f)
                arcToRelative(0.54f, 0.54f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.54f, 0.02f)
                arcTo(0.49f, 0.49f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 12f)
                close()
            }
        }.also { _MapMarker = it}
