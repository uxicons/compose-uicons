package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Terrace: ImageVector? = null

val Icons.Bs.Terrace: ImageVector
    get() = _Terrace ?: UXIcon(name = "Terrace") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.6f, 6.9f)
                lineTo(14.01f, 0.65f)
                arcToRelative(3.4f, 3.4f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4.01f, 0f)
                lineTo(1.4f, 6.9f)
                arcTo(3.42f, 3.42f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 9.66f)
                verticalLineTo(13f)
                horizontalLineTo(10.5f)
                verticalLineTo(24f)
                horizontalLineToRelative(3f)
                verticalLineTo(13f)
                horizontalLineTo(24f)
                verticalLineTo(9.66f)
                arcTo(3.42f, 3.42f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22.6f, 6.9f)
                close()
                moveTo(14f, 10f)
                horizontalLineTo(10f)
                verticalLineTo(8.97f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.05f, -0.22f)
                lineTo(12f, 4.85f)
                lineToRelative(1.95f, 3.9f)
                arcTo(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14f, 8.97f)
                close()
                moveTo(3f, 9.66f)
                arcToRelative(0.41f, 0.41f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.17f, -0.33f)
                lineToRelative(5.09f, -3.7f)
                lineTo(7.37f, 7.41f)
                arcTo(3.53f, 3.53f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7f, 8.97f)
                verticalLineTo(10f)
                horizontalLineTo(3f)
                close()
                moveTo(21f, 10f)
                horizontalLineTo(17f)
                verticalLineTo(8.97f)
                arcToRelative(3.53f, 3.53f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.37f, -1.56f)
                lineToRelative(-0.89f, -1.79f)
                lineToRelative(5.09f, 3.71f)
                arcTo(0.41f, 0.41f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21f, 9.66f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(5.5f, 19f)
                horizontalLineTo(3f)
                verticalLineTo(15f)
                horizontalLineTo(0f)
                verticalLineToRelative(9f)
                horizontalLineTo(3f)
                verticalLineTo(22f)
                horizontalLineTo(5f)
                verticalLineToRelative(2f)
                horizontalLineTo(8f)
                verticalLineTo(21.5f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.5f, 19f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 19f)
                horizontalLineTo(18.5f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 21.5f)
                verticalLineTo(24f)
                horizontalLineToRelative(3f)
                verticalLineTo(22f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(3f)
                verticalLineTo(15f)
                horizontalLineTo(21f)
                close()
            }
        }.also { _Terrace = it}
