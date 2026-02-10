package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Restaurant: ImageVector? = null

val Icons.Rs.Restaurant: ImageVector
    get() = _Restaurant ?: UXIcon(name = "Restaurant") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(1.34f, 7.24f)
                arcTo(10.98f, 10.98f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.01f, 1.95f)
                arcTo(1.95f, 1.95f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.34f, 0.57f)
                lineToRelative(5.15f, 5.49f)
                arcToRelative(4.98f, 4.98f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.48f, 2.11f)
                curveToRelative(0f, 0.11f, 0.03f, 0.22f, 0.03f, 0.33f)
                lineTo(2.01f, 2.08f)
                arcTo(8.96f, 8.96f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.09f, 6.27f)
                arcTo(22.46f, 22.46f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.56f, 12.2f)
                lineTo(6.14f, 13.62f)
                arcTo(23.64f, 23.64f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.34f, 7.24f)
                close()
                moveTo(12.91f, 15.33f)
                lineToRelative(-1.54f, 1.54f)
                arcToRelative(11.31f, 11.31f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.42f, 0.97f)
                lineToRelative(5.75f, 6.11f)
                lineToRelative(1.46f, -1.37f)
                lineToRelative(-6.47f, -6.9f)
                arcTo(8.12f, 8.12f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12.91f, 15.33f)
                close()
                moveTo(13.71f, 13.12f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.24f, 0f)
                lineTo(24.01f, 7.05f)
                lineTo(22.6f, 5.63f)
                lineToRelative(-6.07f, 6.07f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.41f, 0f)
                lineTo(14.41f, 11f)
                lineToRelative(6.77f, -6.78f)
                lineTo(19.77f, 2.81f)
                lineTo(13f, 9.59f)
                lineToRelative(-0.71f, -0.71f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -1.42f)
                lineToRelative(6.07f, -6.07f)
                lineTo(16.95f, -0.02f)
                lineTo(10.88f, 6.05f)
                arcToRelative(3.0f, 3.0f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 4.24f)
                lineToRelative(0.71f, 0.71f)
                lineTo(0.03f, 22.56f)
                lineToRelative(1.41f, 1.41f)
                lineTo(13f, 12.41f)
                close()
            }
        }.also { _Restaurant = it}
