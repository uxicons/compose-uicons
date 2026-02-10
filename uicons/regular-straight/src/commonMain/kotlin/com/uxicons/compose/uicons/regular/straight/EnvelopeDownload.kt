package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _EnvelopeDownload: ImageVector? = null

val Icons.Rs.EnvelopeDownload: ImageVector
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
                moveTo(22.16f, 11.7f)
                curveToRelative(-0.05f, 0.05f, -0.11f, 0.09f, -0.16f, 0.13f)
                lineTo(22f, 22f)
                lineTo(2f, 22f)
                lineTo(2f, 9.07f)
                lineToRelative(6.46f, 6.47f)
                arcToRelative(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.07f, 0f)
                lineToRelative(2.62f, -2.62f)
                arcToRelative(4.39f, 4.39f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.92f, -0.9f)
                lineToRelative(-2.11f, 2.11f)
                arcToRelative(3.07f, 3.07f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4.24f, 0f)
                lineTo(2f, 6.24f)
                lineTo(2f, 6f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 5f)
                lineTo(14f, 5f)
                lineToRelative(2f, -2f)
                lineTo(3f, 3f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 6f)
                lineTo(0f, 24f)
                lineTo(24f, 24f)
                lineTo(24f, 9.85f)
                close()
            }
        }.also { _EnvelopeDownload = it}
