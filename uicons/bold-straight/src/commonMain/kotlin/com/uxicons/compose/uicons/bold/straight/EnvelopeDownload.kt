package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _EnvelopeDownload: ImageVector? = null

val Icons.Bs.EnvelopeDownload: ImageVector
    get() = _EnvelopeDownload ?: UXIcon(name = "EnvelopeDownload") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17f, 8f)
                lineTo(17f, 0f)
                horizontalLineToRelative(3f)
                lineTo(20f, 8f)
                horizontalLineToRelative(4f)
                lineToRelative(-4.69f, 4.64f)
                arcToRelative(1.22f, 1.22f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.73f, 0f)
                lineTo(13f, 8f)
                close()
                moveTo(21f, 21f)
                lineTo(3f, 21f)
                lineTo(3f, 11.2f)
                lineToRelative(5.24f, 5.24f)
                arcToRelative(5.32f, 5.32f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.52f, 0f)
                lineToRelative(1.58f, -1.58f)
                arcToRelative(3.19f, 3.19f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.39f, -0.8f)
                lineToRelative(-1.02f, -1.03f)
                lineToRelative(-1.3f, 1.3f)
                arcToRelative(2.37f, 2.37f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3.28f, 0f)
                lineTo(3f, 6.96f)
                lineTo(3f, 6.5f)
                arcTo(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.5f, 6f)
                lineTo(15f, 6f)
                lineTo(15f, 3f)
                lineTo(3.5f, 3f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 6.5f)
                lineTo(0f, 24f)
                lineTo(24f, 24f)
                lineTo(24f, 10.6f)
                lineToRelative(-3f, 2.97f)
                close()
            }
        }.also { _EnvelopeDownload = it}
