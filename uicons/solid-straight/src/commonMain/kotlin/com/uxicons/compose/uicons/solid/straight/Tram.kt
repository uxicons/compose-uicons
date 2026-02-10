package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Tram: ImageVector? = null

val Icons.Ss.Tram: ImageVector
    get() = _Tram ?: UXIcon(name = "Tram") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13f, 2f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, 0f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13f, 2f)
                close()
                moveTo(10f, 5f)
                verticalLineTo(9f)
                horizontalLineTo(9f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(6f)
                verticalLineTo(9f)
                horizontalLineTo(12f)
                verticalLineTo(3f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = false, -2f, 2f)
                close()
                moveTo(21f, 9f)
                horizontalLineTo(17f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(7f)
                verticalLineTo(12f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21f, 9f)
                close()
                moveTo(0f, 24f)
                horizontalLineTo(24f)
                verticalLineTo(18f)
                horizontalLineTo(0f)
                close()
                moveTo(7f, 9f)
                horizontalLineTo(3f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3f, 3f)
                verticalLineToRelative(4f)
                horizontalLineTo(7f)
                close()
                moveTo(6.05f, 3.45f)
                lineTo(0f, 4.62f)
                verticalLineTo(6.69f)
                lineTo(6.8f, 5.37f)
                arcTo(3.95f, 3.95f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6.05f, 3.45f)
                close()
                moveTo(18.86f, 0.99f)
                arcToRelative(3.69f, 3.69f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.01f, 2.05f)
                lineToRelative(5.15f, -1f)
                verticalLineTo(0f)
                close()
            }
        }.also { _Tram = it}
