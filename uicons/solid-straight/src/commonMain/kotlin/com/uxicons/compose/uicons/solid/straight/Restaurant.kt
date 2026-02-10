package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Restaurant: ImageVector? = null

val Icons.Ss.Restaurant: ImageVector
    get() = _Restaurant ?: UXIcon(name = "Restaurant") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13f, 12.41f)
                lineTo(1.45f, 23.98f)
                lineTo(0.03f, 22.56f)
                lineTo(11.59f, 11f)
                lineToRelative(-0.71f, -0.71f)
                arcToRelative(3.0f, 3.0f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -4.24f)
                lineTo(16.95f, -0.02f)
                lineToRelative(1.41f, 1.41f)
                lineTo(12.29f, 7.46f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 1.42f)
                lineTo(13f, 9.59f)
                lineToRelative(6.77f, -6.78f)
                lineToRelative(1.41f, 1.42f)
                lineTo(14.41f, 11f)
                lineToRelative(0.71f, 0.71f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.41f, 0f)
                lineTo(22.6f, 5.63f)
                lineTo(24.01f, 7.05f)
                lineToRelative(-6.07f, 6.07f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4.24f, 0f)
                close()
                moveTo(6.14f, 13.62f)
                lineToRelative(2.69f, -2.69f)
                arcToRelative(4.94f, 4.94f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.33f, -4.9f)
                lineTo(3.34f, 0.57f)
                arcTo(1.95f, 1.95f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.01f, 1.95f)
                arcTo(10.98f, 10.98f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.34f, 7.24f)
                arcTo(23.64f, 23.64f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6.14f, 13.62f)
                close()
                moveTo(15.82f, 16f)
                arcToRelative(4.96f, 4.96f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.75f, -0.83f)
                lineToRelative(-1.7f, 1.7f)
                arcToRelative(11.31f, 11.31f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.42f, 0.97f)
                lineToRelative(5.75f, 6.11f)
                lineToRelative(1.46f, -1.37f)
                lineToRelative(-6.54f, -6.88f)
                arcTo(4.98f, 4.98f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15.82f, 16f)
                close()
            }
        }.also { _Restaurant = it}
