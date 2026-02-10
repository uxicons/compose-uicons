package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _EnvelopeMarker: ImageVector? = null

val Icons.Br.EnvelopeMarker: ImageVector
    get() = _EnvelopeMarker ?: UXIcon(name = "EnvelopeMarker") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(24f, 16.5f)
            verticalLineToRelative(2f)
            arcTo(5.51f, 5.51f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18.5f, 24f)
            horizontalLineTo(5.5f)
            arcTo(5.51f, 5.51f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 18.5f)
            verticalLineTo(8.5f)
            arcTo(5.51f, 5.51f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.5f, 3f)
            horizontalLineToRelative(6f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 3f)
            horizontalLineToRelative(-6f)
            arcTo(2.49f, 2.49f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.3f, 7.34f)
            lineToRelative(6.93f, 6.93f)
            arcToRelative(2.56f, 2.56f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.02f, 0.4f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 1.5f, 2.6f)
            arcToRelative(5.52f, 5.52f, 0f, isMoreThanHalf = false, isPositiveArc = true, -6.64f, -0.87f)
            lineTo(3f, 11.28f)
            verticalLineTo(18.5f)
            arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.5f, 21f)
            horizontalLineToRelative(13f)
            arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21f, 18.5f)
            verticalLineToRelative(-2f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 24f, 16.5f)
            close()
            moveTo(22f, 0f)
            horizontalLineTo(17f)
            arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2f, 2f)
            verticalLineToRelative(9.65f)
            arcToRelative(1.35f, 1.35f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.19f, 1.05f)
            lineTo(19.5f, 10.86f)
            lineToRelative(2.31f, 1.84f)
            arcTo(1.35f, 1.35f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 11.65f)
            verticalLineTo(2f)
            arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22f, 0f)
            close()
        }
    }.also { _EnvelopeMarker = it }
