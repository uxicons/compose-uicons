package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _EnvelopeMarker: ImageVector? = null

val Icons.Bs.EnvelopeMarker: ImageVector
    get() = _EnvelopeMarker ?: UXIcon(name = "EnvelopeMarker") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 15f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(9f)
                horizontalLineTo(0f)
                verticalLineTo(6.5f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.5f, 3f)
                horizontalLineTo(13f)
                verticalLineTo(6f)
                horizontalLineTo(3.5f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.5f, 0.5f)
                verticalLineToRelative(0.46f)
                lineToRelative(7.36f, 7.36f)
                arcToRelative(2.37f, 2.37f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.28f, 0f)
                lineToRelative(0.33f, -0.33f)
                arcTo(3.33f, 3.33f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16.36f, 15f)
                lineToRelative(0.85f, 0f)
                lineTo(15.76f, 16.44f)
                arcToRelative(5.32f, 5.32f, 0f, isMoreThanHalf = false, isPositiveArc = true, -7.52f, 0f)
                lineTo(3f, 11.2f)
                verticalLineTo(21f)
                horizontalLineTo(21f)
                close()
                moveTo(15f, 0f)
                verticalLineTo(11.65f)
                arcTo(1.35f, 1.35f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17.19f, 12.7f)
                lineTo(19.5f, 10.86f)
                lineTo(21.81f, 12.7f)
                arcTo(1.35f, 1.35f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 11.65f)
                verticalLineTo(0f)
                close()
            }
        }.also { _EnvelopeMarker = it}
