package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _EnvelopePlus: ImageVector? = null

val Icons.Bs.EnvelopePlus: ImageVector
    get() = _EnvelopePlus ?: UXIcon(name = "EnvelopePlus") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 4f)
                verticalLineTo(7f)
                horizontalLineTo(20f)
                verticalLineToRelative(4f)
                horizontalLineTo(17f)
                verticalLineTo(7f)
                horizontalLineTo(13f)
                verticalLineTo(4f)
                horizontalLineToRelative(4f)
                verticalLineTo(0f)
                horizontalLineToRelative(3f)
                verticalLineTo(4f)
                close()
                moveTo(21f, 21f)
                horizontalLineTo(3f)
                verticalLineTo(11.2f)
                lineToRelative(5.24f, 5.24f)
                arcToRelative(5.32f, 5.32f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.52f, 0f)
                lineToRelative(2.46f, -2.46f)
                arcToRelative(8.46f, 8.46f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3.41f, -0.84f)
                lineToRelative(-1.17f, 1.17f)
                arcToRelative(2.37f, 2.37f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3.28f, 0f)
                lineTo(3f, 6.96f)
                verticalLineTo(6.5f)
                arcTo(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.5f, 6f)
                horizontalLineToRelative(6.53f)
                curveTo(10.02f, 5.83f, 10f, 5.67f, 10f, 5.5f)
                arcTo(8.5f, 8.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10.38f, 3f)
                horizontalLineTo(3.5f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 6.5f)
                verticalLineTo(24f)
                horizontalLineTo(24f)
                verticalLineTo(11.97f)
                arcToRelative(8.47f, 8.47f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3f, 1.65f)
                close()
            }
        }.also { _EnvelopePlus = it}
