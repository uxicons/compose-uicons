package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _EnvelopeOpen: ImageVector? = null

val Icons.Br.EnvelopeOpen: ImageVector
    get() = _EnvelopeOpen ?: UXIcon(name = "EnvelopeOpen") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(22.31f, 7.83f)
            lineToRelative(-6.54f, -6.27f)
            arcToRelative(5.32f, 5.32f, 0f, isMoreThanHalf = false, isPositiveArc = false, -7.5f, -0.02f)
            lineTo(1.69f, 7.83f)
            arcTo(5.53f, 5.53f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 11.8f)
            verticalLineToRelative(6.7f)
            arcTo(5.51f, 5.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.5f, 24f)
            horizontalLineToRelative(13f)
            arcTo(5.51f, 5.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 18.5f)
            verticalLineTo(11.8f)
            arcTo(5.53f, 5.53f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22.31f, 7.83f)
            close()
            moveTo(10.36f, 3.68f)
            arcToRelative(2.33f, 2.33f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.3f, 0.02f)
            lineToRelative(5.38f, 5.16f)
            lineToRelative(-5.28f, 5.41f)
            arcToRelative(2.56f, 2.56f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3.54f, 0f)
            lineTo(4.89f, 8.92f)
            close()
            moveTo(21f, 18.5f)
            arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18.5f, 21f)
            horizontalLineTo(5.5f)
            arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 18.5f)
            verticalLineTo(11.8f)
            arcToRelative(2.41f, 2.41f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.05f, -0.47f)
            lineToRelative(5.06f, 5.06f)
            arcToRelative(5.52f, 5.52f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.79f, -0.01f)
            lineToRelative(5.02f, -5.15f)
            arcTo(2.45f, 2.45f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21f, 11.8f)
            close()
        }
    }.also { _EnvelopeOpen = it }
