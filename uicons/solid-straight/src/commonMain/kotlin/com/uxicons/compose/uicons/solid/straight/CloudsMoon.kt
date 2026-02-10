package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CloudsMoon: ImageVector? = null

val Icons.Ss.CloudsMoon: ImageVector
    get() = _CloudsMoon ?: UXIcon(name = "CloudsMoon") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15.5f, 24f)
                horizontalLineToRelative(-8f)
                arcToRelative(3.51f, 3.51f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.44f, -6.69f)
                curveToRelative(-0.88f, -6.91f, 9.05f, -8.8f, 10.79f, -2.1f)
                arcTo(4.51f, 4.51f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15.5f, 24f)
                close()
                moveTo(2.06f, 19.7f)
                arcTo(5.5f, 5.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, 16.25f)
                arcToRelative(7.49f, 7.49f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.75f, -7.23f)
                lineTo(11.74f, 9f)
                curveTo(8.31f, 4.76f, 1.21f, 7.86f, 2.06f, 13.32f)
                arcToRelative(3.52f, 3.52f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 6.38f)
                close()
                moveTo(22.23f, 9.06f)
                arcToRelative(5.06f, 5.06f, 0f, isMoreThanHalf = false, isPositiveArc = true, -5.02f, -2.24f)
                horizontalLineToRelative(0f)
                arcToRelative(5.46f, 5.46f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.02f, -5.33f)
                lineTo(18.03f, 0f)
                horizontalLineTo(16.32f)
                arcToRelative(6.62f, 6.62f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.57f, 1.04f)
                arcTo(7.34f, 7.34f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9.46f, 5.28f)
                horizontalLineToRelative(0f)
                arcToRelative(7.46f, 7.46f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.82f, 2.45f)
                lineToRelative(0.22f, 0.32f)
                lineToRelative(0.94f, 1.56f)
                arcToRelative(7.43f, 7.43f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.03f, 4.11f)
                arcToRelative(6.39f, 6.39f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.83f, 0.52f)
                horizontalLineToRelative(0f)
                arcToRelative(7.23f, 7.23f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.96f, -3.77f)
                lineTo(24f, 8.86f)
                close()
            }
        }.also { _CloudsMoon = it}
