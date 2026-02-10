package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CloudRainbow: ImageVector? = null

val Icons.Rs.CloudRainbow: ImageVector
    get() = _CloudRainbow ?: UXIcon(name = "CloudRainbow") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13f, 24f)
                lineTo(4f, 24f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.96f, -7.88f)
                arcTo(5.11f, 5.11f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 15.5f)
                arcToRelative(5.49f, 5.49f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10.79f, -1.44f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13f, 24f)
                close()
                moveTo(4f, 18f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 4f)
                horizontalLineToRelative(9f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.06f, -6f)
                lineToRelative(-1.01f, 0f)
                lineToRelative(-0.1f, -0.89f)
                arcTo(3.49f, 3.49f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 15.5f)
                arcToRelative(3.43f, 3.43f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.22f, 1.16f)
                lineTo(5.69f, 18f)
                close()
                moveTo(19.38f, 16.13f)
                arcTo(6.11f, 6.11f, 0f, isMoreThanHalf = false, isPositiveArc = true, 24f, 14f)
                lineTo(24f, 12f)
                arcToRelative(8.11f, 8.11f, 0f, isMoreThanHalf = false, isPositiveArc = false, -5.74f, 2.39f)
                arcTo(6.91f, 6.91f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19.38f, 16.13f)
                close()
                moveTo(15.08f, 11.98f)
                curveToRelative(0.07f, 0.14f, 0.16f, 0.26f, 0.22f, 0.4f)
                arcToRelative(6.92f, 6.92f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.47f, 0.73f)
                arcTo(10.02f, 10.02f, 0f, isMoreThanHalf = false, isPositiveArc = true, 24f, 10f)
                lineTo(24f, 8f)
                arcTo(12.03f, 12.03f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15.08f, 11.98f)
                close()
                moveTo(7.98f, 8.03f)
                curveTo(8.16f, 8.01f, 8.33f, 8f, 8.5f, 8f)
                arcToRelative(7.41f, 7.41f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.87f, 0.25f)
                arcTo(17.98f, 17.98f, 0f, isMoreThanHalf = false, isPositiveArc = true, 24f, 2f)
                lineTo(24f, 0f)
                arcTo(19.98f, 19.98f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.99f, 8.03f)
                close()
                moveTo(12.31f, 9.07f)
                arcToRelative(7.47f, 7.47f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.57f, 1.25f)
                arcTo(13.93f, 13.93f, 0f, isMoreThanHalf = false, isPositiveArc = true, 24f, 6f)
                lineTo(24f, 4f)
                arcTo(15.91f, 15.91f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12.31f, 9.07f)
                close()
            }
        }.also { _CloudRainbow = it}
