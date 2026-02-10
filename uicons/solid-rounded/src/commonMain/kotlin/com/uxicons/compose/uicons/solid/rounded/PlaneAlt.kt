package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PlaneAlt: ImageVector? = null

val Icons.Sr.PlaneAlt: ImageVector
    get() = _PlaneAlt ?: UXIcon(name = "PlaneAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.29f, 10.06f)
                arcTo(2.99f, 2.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21f, 9f)
                horizontalLineTo(17.58f)
                lineTo(13.31f, 1.55f)
                arcToRelative(2.88f, 2.88f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4.81f, -0.42f)
                arcToRelative(2.69f, 2.69f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.36f, 2.43f)
                lineTo(10.08f, 9f)
                horizontalLineTo(5.53f)
                lineTo(4.12f, 7.1f)
                arcTo(2.43f, 2.43f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.08f, 6f)
                horizontalLineToRelative(0f)
                arcTo(2.08f, 2.08f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.13f, 8.79f)
                lineTo(2f, 12f)
                lineTo(0.13f, 15.21f)
                arcTo(2.08f, 2.08f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.08f, 18f)
                horizontalLineToRelative(0f)
                arcToRelative(2.43f, 2.43f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.04f, -1.1f)
                lineTo(5.53f, 15f)
                horizontalLineToRelative(4.55f)
                lineToRelative(-1.94f, 5.45f)
                arcToRelative(2.69f, 2.69f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.36f, 2.43f)
                arcToRelative(2.88f, 2.88f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.81f, -0.42f)
                lineTo(17.58f, 15f)
                horizontalLineTo(21f)
                arcToRelative(3.01f, 3.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.29f, -4.94f)
                close()
            }
        }.also { _PlaneAlt = it}
