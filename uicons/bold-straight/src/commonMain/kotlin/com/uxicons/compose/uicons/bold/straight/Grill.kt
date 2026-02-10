package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Grill: ImageVector? = null

val Icons.Bs.Grill: ImageVector
    get() = _Grill ?: UXIcon(name = "Grill") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 7.5f)
                verticalLineTo(6f)
                horizontalLineTo(0f)
                verticalLineTo(7.5f)
                arcToRelative(11.4f, 11.4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.69f, 9.76f)
                lineTo(2.32f, 24f)
                horizontalLineTo(5.68f)
                lineToRelative(2.76f, -5.52f)
                arcTo(12.29f, 12.29f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10.5f, 18.9f)
                verticalLineTo(24f)
                horizontalLineToRelative(3f)
                verticalLineTo(18.9f)
                arcToRelative(12.29f, 12.29f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.06f, -0.42f)
                lineTo(18.32f, 24f)
                horizontalLineToRelative(3.35f)
                lineToRelative(-3.37f, -6.74f)
                arcTo(11.4f, 11.4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 7.5f)
                close()
                moveTo(12f, 16f)
                arcTo(8.89f, 8.89f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.14f, 9f)
                horizontalLineTo(20.86f)
                arcTo(8.89f, 8.89f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 16f)
                close()
                moveTo(13.5f, 4f)
                horizontalLineToRelative(-3f)
                verticalLineTo(0f)
                horizontalLineToRelative(3f)
                close()
                moveTo(19f, 4f)
                horizontalLineTo(16f)
                verticalLineTo(0f)
                horizontalLineToRelative(3f)
                close()
                moveTo(8f, 4f)
                horizontalLineTo(5f)
                verticalLineTo(0f)
                horizontalLineTo(8f)
                close()
            }
        }.also { _Grill = it}
