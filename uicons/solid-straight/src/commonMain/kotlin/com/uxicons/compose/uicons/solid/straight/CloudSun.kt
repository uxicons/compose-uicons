package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CloudSun: ImageVector? = null

val Icons.Ss.CloudSun: ImageVector
    get() = _CloudSun ?: UXIcon(name = "CloudSun") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18f, 24f)
                horizontalLineTo(9f)
                arcToRelative(4.01f, 4.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.99f, -7.88f)
                curveToRelative(0.33f, -5.5f, 7.95f, -7.04f, 10.4f, -2.11f)
                curveTo(24.7f, 14.66f, 24.35f, 23.86f, 18f, 24f)
                close()
                moveTo(13.5f, 9f)
                arcToRelative(7.52f, 7.52f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.83f, 0.56f)
                lineToRelative(0f, -0.01f)
                arcToRelative(6.5f, 6.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.29f, -0.91f)
                lineToRelative(3.98f, -2.31f)
                lineTo(19.01f, 4.6f)
                lineToRelative(-3.97f, 2.31f)
                arcToRelative(6.54f, 6.54f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.96f, -0.95f)
                lineToRelative(2.31f, -3.96f)
                lineToRelative(-1.73f, -1f)
                lineToRelative(-2.3f, 3.96f)
                arcTo(6.46f, 6.46f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11f, 4.59f)
                verticalLineTo(0f)
                horizontalLineTo(9f)
                verticalLineTo(4.58f)
                arcToRelative(6.48f, 6.48f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.34f, 0.36f)
                lineTo(5.36f, 0.99f)
                lineTo(3.63f, 1.99f)
                lineToRelative(2.3f, 3.95f)
                arcToRelative(6.61f, 6.61f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.96f, 0.96f)
                lineTo(1f, 4.6f)
                lineTo(0f, 6.33f)
                lineToRelative(3.96f, 2.3f)
                arcTo(6.48f, 6.48f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.58f, 10f)
                horizontalLineTo(-1f)
                verticalLineToRelative(2f)
                horizontalLineTo(3.58f)
                arcToRelative(6.43f, 6.43f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.36f, 1.37f)
                lineTo(0f, 15.66f)
                lineTo(1.01f, 17.39f)
                lineToRelative(5.37f, -3.17f)
                arcTo(7.51f, 7.51f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13.5f, 9f)
                close()
            }
        }.also { _CloudSun = it}
