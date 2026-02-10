package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Broom: ImageVector? = null

val Icons.Ss.Broom: ImageVector
    get() = _Broom ?: UXIcon(name = "Broom") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.53f, 16.3f)
                arcToRelative(14.56f, 14.56f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.86f, -4.56f)
                arcToRelative(2.01f, 2.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.61f, -1.5f)
                lineTo(18.96f, 8.47f)
                lineToRelative(5.04f, -5.04f)
                lineToRelative(-1.43f, -1.43f)
                lineTo(17.51f, 7.06f)
                lineTo(15.31f, 4.9f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12.6f, 4.83f)
                arcToRelative(23.89f, 23.89f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.09f, 1.63f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(8.77f, 7.56f)
                arcTo(12.33f, 12.33f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6.23f, 8.69f)
                lineTo(0f, 10.52f)
                verticalLineToRelative(0.75f)
                arcTo(12.43f, 12.43f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.93f, 16f)
                lineToRelative(1.71f, -0.28f)
                arcToRelative(9.6f, 9.6f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.3f, -2.43f)
                lineToRelative(1.4f, 1.43f)
                arcToRelative(11.65f, 11.65f, 0f, isMoreThanHalf = false, isPositiveArc = true, -5.29f, 2.96f)
                lineToRelative(-1.16f, 0.19f)
                arcToRelative(12.91f, 12.91f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.5f, 2.92f)
                lineToRelative(2.03f, -0.75f)
                lineToRelative(1.4f, -0.7f)
                arcTo(9.54f, 9.54f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11.4f, 16.2f)
                lineToRelative(0.52f, -0.76f)
                lineToRelative(1.65f, 1.13f)
                lineToRelative(-0.52f, 0.76f)
                arcToRelative(11.54f, 11.54f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4.35f, 3.8f)
                lineToRelative(-1.55f, 0.77f)
                lineToRelative(-0.81f, 0.3f)
                arcTo(13.14f, 13.14f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13.01f, 24f)
                horizontalLineToRelative(1.24f)
                lineToRelative(0.26f, -0.18f)
                arcToRelative(16.5f, 16.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.14f, -5.58f)
                close()
            }
        }.also { _Broom = it}
