package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CompressAlt: ImageVector? = null

val Icons.Rr.CompressAlt: ImageVector
    get() = _CompressAlt ?: UXIcon(name = "CompressAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(7.29f, 2.09f)
                lineTo(5.4f, 3.98f)
                lineTo(1.71f, 0.29f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.29f, 1.71f)
                lineTo(3.98f, 5.4f)
                lineTo(2.09f, 7.29f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.8f, 9f)
                horizontalLineTo(7.56f)
                arcTo(1.44f, 1.44f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9f, 7.56f)
                verticalLineTo(2.8f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.29f, 2.09f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.02f, 18.6f)
                lineToRelative(1.89f, -1.89f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21.2f, 15f)
                horizontalLineTo(16.44f)
                arcTo(1.44f, 1.44f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15f, 16.44f)
                verticalLineTo(21.2f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.71f, 0.71f)
                lineTo(18.6f, 20.02f)
                lineToRelative(3.69f, 3.69f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.41f, -1.41f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(16.44f, 9f)
                horizontalLineTo(21.2f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.71f, -1.71f)
                lineTo(20.02f, 5.4f)
                lineToRelative(3.69f, -3.69f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22.29f, 0.29f)
                lineTo(18.6f, 3.98f)
                lineTo(16.71f, 2.09f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15f, 2.8f)
                verticalLineTo(7.56f)
                arcTo(1.44f, 1.44f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16.44f, 9f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(7.56f, 15f)
                horizontalLineTo(2.8f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.71f, 1.71f)
                lineTo(3.98f, 18.6f)
                lineTo(0.29f, 22.29f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, 1.41f, 1.41f)
                lineTo(5.4f, 20.02f)
                lineToRelative(1.89f, 1.89f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9f, 21.2f)
                verticalLineTo(16.44f)
                arcTo(1.44f, 1.44f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.56f, 15f)
                close()
            }
        }.also { _CompressAlt = it}
