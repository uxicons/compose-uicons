package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Hiking: ImageVector? = null

val Icons.Ss.Hiking: ImageVector
    get() = _Hiking ?: UXIcon(name = "Hiking") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 7f)
                verticalLineToRelative(3f)
                horizontalLineTo(16.62f)
                lineTo(15.45f, 7.66f)
                arcTo(2.98f, 2.98f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12.76f, 6f)
                horizontalLineTo(9.25f)
                lineToRelative(-1.36f, 6.99f)
                arcTo(2.99f, 2.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9.2f, 16.08f)
                lineTo(13f, 18.54f)
                verticalLineTo(24f)
                horizontalLineToRelative(2f)
                verticalLineTo(17.46f)
                lineToRelative(-2.27f, -1.47f)
                lineToRelative(1.29f, -6.7f)
                lineTo(15.38f, 12f)
                horizontalLineTo(19f)
                verticalLineTo(24f)
                horizontalLineToRelative(2f)
                verticalLineTo(7f)
                close()
                moveTo(7.96f, 17.64f)
                lineTo(6.87f, 24f)
                horizontalLineTo(8.91f)
                lineToRelative(0.85f, -5.17f)
                lineTo(8.12f, 17.76f)
                curveTo(8.06f, 17.72f, 8.01f, 17.68f, 7.96f, 17.64f)
                close()
                moveTo(5.93f, 12.61f)
                lineTo(7.08f, 6.68f)
                arcToRelative(7.68f, 7.68f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4.07f, 6.3f)
                arcTo(2.76f, 2.76f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.69f, 16f)
                arcToRelative(2.7f, 2.7f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.73f, -0.11f)
                arcTo(4.97f, 4.97f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.93f, 12.61f)
                close()
                moveTo(15.5f, 2.5f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 13f, 0f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15.5f, 2.5f)
                close()
            }
        }.also { _Hiking = it}
