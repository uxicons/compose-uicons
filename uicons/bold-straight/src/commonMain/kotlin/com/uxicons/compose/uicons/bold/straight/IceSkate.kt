package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _IceSkate: ImageVector? = null

val Icons.Bs.IceSkate: ImageVector
    get() = _IceSkate ?: UXIcon(name = "IceSkate") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 19f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2f, 2f)
                horizontalLineTo(17f)
                verticalLineTo(18f)
                horizontalLineToRelative(5f)
                verticalLineTo(13.84f)
                arcToRelative(6.26f, 6.26f, 0f, isMoreThanHalf = false, isPositiveArc = false, -5.02f, -6.13f)
                lineTo(13.3f, 6.98f)
                arcToRelative(1.35f, 1.35f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.07f, -1.15f)
                lineToRelative(-0.4f, -2.9f)
                arcTo(3.41f, 3.41f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10.39f, 0.6f)
                arcTo(3.46f, 3.46f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.64f, 0.1f)
                lineTo(0f, 2.27f)
                verticalLineTo(18f)
                horizontalLineTo(4f)
                verticalLineToRelative(3f)
                horizontalLineTo(0f)
                verticalLineToRelative(3f)
                horizontalLineTo(19f)
                arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, -5f)
                close()
                moveTo(3f, 4.53f)
                lineTo(8.37f, 3.01f)
                arcToRelative(0.4f, 0.4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.32f, 0.06f)
                arcToRelative(0.39f, 0.39f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.17f, 0.26f)
                lineToRelative(0.23f, 1.65f)
                horizontalLineTo(7f)
                verticalLineToRelative(3f)
                horizontalLineTo(9.9f)
                arcToRelative(4.28f, 4.28f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.55f, 0.7f)
                lineToRelative(-1.24f, 2.1f)
                lineToRelative(2.59f, 1.52f)
                lineToRelative(1.35f, -2.3f)
                lineToRelative(3.25f, 0.65f)
                arcTo(3.26f, 3.26f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19f, 13.84f)
                verticalLineTo(15f)
                horizontalLineTo(3f)
                close()
                moveTo(7f, 18f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(3f)
                horizontalLineTo(7f)
                close()
            }
        }.also { _IceSkate = it}
