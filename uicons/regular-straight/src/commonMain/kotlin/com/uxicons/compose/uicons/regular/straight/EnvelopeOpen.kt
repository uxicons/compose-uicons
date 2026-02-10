package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _EnvelopeOpen: ImageVector? = null

val Icons.Rs.EnvelopeOpen: ImageVector
    get() = _EnvelopeOpen ?: UXIcon(name = "EnvelopeOpen") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.77f, 8.39f)
                lineTo(15.54f, 1.46f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8.48f, 1.45f)
                lineTo(1.23f, 8.39f)
                arcTo(4.02f, 4.02f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 11.28f)
                verticalLineTo(24f)
                horizontalLineTo(24f)
                verticalLineTo(11.28f)
                arcTo(4.02f, 4.02f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22.77f, 8.39f)
                close()
                moveTo(9.88f, 2.88f)
                arcToRelative(3.06f, 3.06f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.26f, 0.02f)
                lineToRelative(6.75f, 6.46f)
                lineToRelative(-6.76f, 6.76f)
                arcToRelative(3.07f, 3.07f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4.24f, 0f)
                lineTo(3.12f, 9.36f)
                close()
                moveTo(22f, 22f)
                horizontalLineTo(2f)
                verticalLineTo(11.28f)
                curveToRelative(0f, -0.06f, 0.01f, -0.13f, 0.02f, -0.19f)
                lineToRelative(6.45f, 6.45f)
                arcToRelative(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.07f, 0f)
                lineToRelative(6.45f, -6.45f)
                curveToRelative(0.01f, 0.06f, 0.02f, 0.13f, 0.02f, 0.19f)
                close()
            }
        }.also { _EnvelopeOpen = it}
