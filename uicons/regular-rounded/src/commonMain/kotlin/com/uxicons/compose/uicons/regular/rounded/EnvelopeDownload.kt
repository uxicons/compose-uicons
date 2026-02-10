package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _EnvelopeDownload: ImageVector? = null

val Icons.Rr.EnvelopeDownload: ImageVector
    get() = _EnvelopeDownload ?: UXIcon(name = "EnvelopeDownload") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14.73f, 7.7f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 1.43f, -1.4f)
                lineTo(18f, 8.18f)
                verticalLineTo(1f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 0f)
                verticalLineTo(8.18f)
                lineTo(21.84f, 6.3f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.43f, 1.4f)
                lineTo(20.75f, 10.27f)
                arcTo(2.48f, 2.48f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19.01f, 11f)
                arcToRelative(0.04f, 0.04f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.02f, 0f)
                arcToRelative(2.46f, 2.46f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.74f, -0.72f)
                close()
                moveTo(23f, 11f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1f, 1f)
                verticalLineToRelative(7f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3f, 3f)
                horizontalLineTo(5f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3f, -3f)
                verticalLineTo(9.07f)
                lineToRelative(6.46f, 6.46f)
                arcToRelative(5.03f, 5.03f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.06f, 0.01f)
                lineToRelative(1.88f, -1.83f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, -1.39f, -1.43f)
                lineToRelative(-1.89f, 1.84f)
                arcToRelative(3.07f, 3.07f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4.24f, 0f)
                lineTo(2.36f, 6.6f)
                arcTo(2.99f, 2.99f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5f, 5f)
                horizontalLineToRelative(7f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -2f)
                horizontalLineTo(5f)
                arcTo(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 8f)
                verticalLineTo(19f)
                arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 5f)
                horizontalLineTo(19f)
                arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, -5f)
                verticalLineTo(12f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 23f, 11f)
                close()
            }
        }.also { _EnvelopeDownload = it}
