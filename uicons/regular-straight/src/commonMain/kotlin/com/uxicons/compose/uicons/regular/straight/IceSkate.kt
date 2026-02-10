package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _IceSkate: ImageVector? = null

val Icons.Rs.IceSkate: ImageVector
    get() = _IceSkate ?: UXIcon(name = "IceSkate") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 20f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2f, 2f)
                horizontalLineTo(16f)
                verticalLineTo(18f)
                horizontalLineToRelative(6f)
                verticalLineTo(14.1f)
                arcToRelative(6.01f, 6.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4.82f, -5.88f)
                lineTo(13.3f, 7.44f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.59f, -1.7f)
                lineTo(11.3f, 2.58f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.62f, 0.09f)
                lineTo(0f, 2.24f)
                verticalLineTo(18f)
                horizontalLineTo(5f)
                verticalLineToRelative(4f)
                horizontalLineTo(0f)
                verticalLineToRelative(2f)
                horizontalLineTo(20f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, -4f)
                close()
                moveTo(2f, 3.76f)
                lineTo(8.11f, 2.02f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.21f, 0.82f)
                lineTo(9.47f, 4f)
                horizontalLineTo(7f)
                verticalLineTo(6f)
                horizontalLineTo(9.73f)
                arcToRelative(3.96f, 3.96f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.24f, 0.92f)
                lineTo(7.63f, 8.34f)
                lineToRelative(1.04f, 1.71f)
                lineToRelative(2.47f, -1.5f)
                arcToRelative(3.96f, 3.96f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.85f, 0.54f)
                lineToRelative(-1.35f, 2.31f)
                lineToRelative(1.72f, 1.01f)
                lineTo(14f, 9.62f)
                lineToRelative(2.78f, 0.56f)
                arcTo(4.01f, 4.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20f, 14.1f)
                verticalLineTo(16f)
                horizontalLineTo(2f)
                close()
                moveTo(7f, 18f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(4f)
                horizontalLineTo(7f)
                close()
            }
        }.also { _IceSkate = it}
