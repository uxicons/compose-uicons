package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _EnvelopeDownload: ImageVector? = null

val Icons.Ss.EnvelopeDownload: ImageVector
    get() = _EnvelopeDownload ?: UXIcon(name = "EnvelopeDownload") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18f, 8.2f)
                lineTo(18f, 0f)
                horizontalLineToRelative(2f)
                lineTo(20f, 8.2f)
                lineToRelative(2.24f, -2.24f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(-2.91f, 2.91f)
                arcToRelative(2.47f, 2.47f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3.49f, 0f)
                lineTo(14.38f, 7.41f)
                lineTo(15.8f, 5.99f)
                close()
                moveTo(12f, 15.43f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.12f, -0.88f)
                lineToRelative(2.34f, -2.34f)
                arcToRelative(4.55f, 4.55f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.62f, -0.51f)
                lineTo(12.97f, 8.82f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -2.83f)
                lineTo(15.96f, 3f)
                lineTo(3f, 3f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.22f, 4.89f)
                lineToRelative(9.66f, 9.66f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 15.42f)
                close()
                moveTo(22.16f, 11.7f)
                arcToRelative(4.07f, 4.07f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3.62f, 1.26f)
                lineToRelative(-3f, 3.0f)
                arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, -7.07f, 0f)
                lineTo(0f, 7.5f)
                lineTo(0f, 24f)
                lineTo(24f, 24f)
                lineTo(24f, 9.85f)
                close()
            }
        }.also { _EnvelopeDownload = it}
