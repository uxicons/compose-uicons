package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _EnvelopePlus: ImageVector? = null

val Icons.Rs.EnvelopePlus: ImageVector
    get() = _EnvelopePlus ?: UXIcon(name = "EnvelopePlus") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 10f)
                horizontalLineToRelative(2f)
                verticalLineTo(24f)
                horizontalLineTo(0f)
                verticalLineTo(6f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 3f)
                horizontalLineTo(14f)
                verticalLineTo(5f)
                horizontalLineTo(3f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 6f)
                verticalLineToRelative(0.24f)
                lineToRelative(7.88f, 7.88f)
                arcToRelative(3.07f, 3.07f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.24f, 0f)
                lineTo(18.24f, 10f)
                horizontalLineToRelative(2.83f)
                lineToRelative(-5.54f, 5.54f)
                arcToRelative(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -7.07f, 0f)
                lineTo(2f, 9.07f)
                verticalLineTo(22f)
                horizontalLineTo(22f)
                close()
                moveTo(21f, 3f)
                verticalLineTo(0f)
                horizontalLineTo(19f)
                verticalLineTo(3f)
                horizontalLineTo(16f)
                verticalLineTo(5f)
                horizontalLineToRelative(3f)
                verticalLineTo(8f)
                horizontalLineToRelative(2f)
                verticalLineTo(5f)
                horizontalLineToRelative(3f)
                verticalLineTo(3f)
                close()
            }
        }.also { _EnvelopePlus = it}
