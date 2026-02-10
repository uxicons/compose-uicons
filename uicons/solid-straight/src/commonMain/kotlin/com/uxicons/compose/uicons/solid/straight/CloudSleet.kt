package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CloudSleet: ImageVector? = null

val Icons.Ss.CloudSleet: ImageVector
    get() = _CloudSleet ?: UXIcon(name = "CloudSleet") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14.97f, 24f)
                lineToRelative(-1.85f, -0.77f)
                lineToRelative(2.35f, -5.62f)
                lineToRelative(1.84f, 0.77f)
                close()
                moveTo(13.05f, 18.39f)
                lineTo(11.21f, 17.61f)
                lineTo(8.86f, 23.23f)
                lineTo(10.71f, 24f)
                close()
                moveTo(8.77f, 18.39f)
                lineTo(6.92f, 17.61f)
                lineTo(4.57f, 23.23f)
                lineTo(6.42f, 24f)
                close()
                moveTo(24f, 12.5f)
                arcToRelative(7.51f, 7.51f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4.94f, 7.04f)
                lineToRelative(0.41f, -0.97f)
                arcTo(1.85f, 1.85f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17.77f, 16f)
                lineTo(6.76f, 16f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.84f, 1.23f)
                lineTo(3.86f, 19.75f)
                horizontalLineToRelative(0f)
                arcToRelative(5.54f, 5.54f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.59f, -9.7f)
                curveTo(-0.04f, 0.31f, 13.53f, -4.12f, 17.44f, 5.06f)
                arcTo(7.46f, 7.46f, 0f, isMoreThanHalf = false, isPositiveArc = true, 24f, 12.5f)
                close()
                moveTo(16f, 9f)
                lineTo(13.73f, 9f)
                lineToRelative(1.13f, -1.97f)
                lineToRelative(-1.73f, -1f)
                lineTo(12f, 7.99f)
                lineTo(10.88f, 6.03f)
                lineToRelative(-1.74f, 1f)
                lineTo(10.27f, 9f)
                lineTo(8f, 9f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2.27f)
                lineTo(9.14f, 12.97f)
                lineToRelative(1.74f, 0.99f)
                lineTo(12f, 12.01f)
                lineToRelative(1.12f, 1.96f)
                lineToRelative(1.73f, -0.99f)
                lineTo(13.73f, 11f)
                lineTo(16f, 11f)
                close()
            }
        }.also { _CloudSleet = it}
