package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _EnvelopeDownload: ImageVector? = null

val Icons.Sr.EnvelopeDownload: ImageVector
    get() = _EnvelopeDownload ?: UXIcon(name = "EnvelopeDownload") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14.75f, 6.29f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16.16f, 6.3f)
                lineTo(18f, 8.18f)
                lineTo(18f, 1f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 0f)
                lineTo(20f, 8.18f)
                lineTo(21.84f, 6.3f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.43f, 1.4f)
                lineTo(20.75f, 10.27f)
                arcTo(2.48f, 2.48f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19.01f, 11f)
                arcToRelative(0.04f, 0.04f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.02f, 0f)
                arcToRelative(2.46f, 2.46f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.74f, -0.72f)
                lineTo(14.73f, 7.7f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14.75f, 6.29f)
                close()
                moveTo(12f, 15.42f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.12f, -0.88f)
                lineToRelative(2.34f, -2.34f)
                arcToRelative(4.49f, 4.49f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.62f, -0.51f)
                lineTo(13.3f, 9.1f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.05f, -4.24f)
                curveTo(13.82f, 4.39f, 14.79f, 3.54f, 15.42f, 3f)
                lineTo(5f, 3f)
                arcTo(4.99f, 4.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.74f, 5.41f)
                lineToRelative(9.13f, 9.13f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 15.42f)
                close()
                moveTo(22.18f, 11.67f)
                arcToRelative(4.35f, 4.35f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3.64f, 1.29f)
                lineTo(15.54f, 15.96f)
                arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, -7.07f, 0f)
                lineTo(0.05f, 7.54f)
                curveTo(0.03f, 7.7f, 0f, 7.84f, 0f, 8f)
                lineTo(0f, 19f)
                arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 5f)
                lineTo(19f, 24f)
                arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, -5f)
                lineTo(24f, 9.81f)
                close()
            }
        }.also { _EnvelopeDownload = it}
