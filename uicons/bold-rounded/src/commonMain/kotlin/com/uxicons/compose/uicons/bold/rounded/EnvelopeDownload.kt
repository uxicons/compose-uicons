package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _EnvelopeDownload: ImageVector? = null

val Icons.Br.EnvelopeDownload: ImageVector
    get() = _EnvelopeDownload ?: UXIcon(name = "EnvelopeDownload") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(24f, 15.5f)
            verticalLineToRelative(3f)
            arcTo(5.51f, 5.51f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18.5f, 24f)
            horizontalLineTo(5.5f)
            arcTo(5.51f, 5.51f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 18.5f)
            verticalLineTo(8.5f)
            arcTo(5.51f, 5.51f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.5f, 3f)
            horizontalLineToRelative(8f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 3f)
            horizontalLineToRelative(-8f)
            arcTo(2.49f, 2.49f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.3f, 7.34f)
            lineToRelative(6.93f, 6.93f)
            arcToRelative(2.56f, 2.56f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.54f, 0f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.12f, 2.12f)
            arcToRelative(5.53f, 5.53f, 0f, isMoreThanHalf = false, isPositiveArc = true, -7.78f, 0f)
            lineTo(3f, 11.28f)
            verticalLineTo(18.5f)
            arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.5f, 21f)
            horizontalLineToRelative(13f)
            arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21f, 18.5f)
            verticalLineToRelative(-3f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 24f, 15.5f)
            close()
            moveTo(14.82f, 8f)
            arcTo(1.16f, 1.16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 14f, 9.98f)
            lineToRelative(3.68f, 3.68f)
            arcToRelative(1.16f, 1.16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.64f, 0f)
            lineTo(23f, 9.98f)
            arcTo(1.16f, 1.16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22.18f, 8f)
            horizontalLineTo(20f)
            verticalLineTo(1.5f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3f, 0f)
            verticalLineTo(8f)
            close()
        }
    }.also { _EnvelopeDownload = it }
