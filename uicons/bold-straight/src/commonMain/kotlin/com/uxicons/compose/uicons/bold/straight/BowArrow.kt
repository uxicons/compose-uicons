package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BowArrow: ImageVector? = null

val Icons.Bs.BowArrow: ImageVector
    get() = _BowArrow ?: UXIcon(name = "BowArrow") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 0f)
                horizontalLineTo(17f)
                verticalLineTo(3f)
                horizontalLineToRelative(1.88f)
                lineTo(16.46f, 5.42f)
                arcTo(11.66f, 11.66f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.13f, 6.41f)
                lineTo(0.07f, 7.47f)
                lineToRelative(7.17f, 7.17f)
                lineTo(4.88f, 17f)
                horizontalLineTo(0f)
                verticalLineToRelative(3f)
                horizontalLineTo(1.88f)
                lineTo(0.03f, 21.85f)
                lineToRelative(2.12f, 2.12f)
                lineTo(4f, 22.12f)
                verticalLineTo(24f)
                horizontalLineTo(7f)
                verticalLineTo(19.12f)
                lineToRelative(2.36f, -2.36f)
                lineToRelative(7.17f, 7.17f)
                lineToRelative(1.06f, -1.06f)
                arcToRelative(11.66f, 11.66f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.99f, -15.34f)
                lineTo(21f, 5.12f)
                verticalLineTo(7f)
                horizontalLineToRelative(3f)
                verticalLineTo(3f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21f, 0f)
                close()
                moveTo(4.4f, 7.56f)
                arcToRelative(8.67f, 8.67f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9.92f, 0f)
                lineTo(9.36f, 12.52f)
                close()
                moveTo(16.44f, 19.6f)
                lineToRelative(-4.96f, -4.96f)
                lineToRelative(4.96f, -4.96f)
                arcTo(8.67f, 8.67f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16.44f, 19.6f)
                close()
            }
        }.also { _BowArrow = it}
