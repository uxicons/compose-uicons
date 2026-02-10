package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _EnvelopeMarker: ImageVector? = null

val Icons.Rs.EnvelopeMarker: ImageVector
    get() = _EnvelopeMarker ?: UXIcon(name = "EnvelopeMarker") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15f, 0f)
                lineTo(15f, 8.95f)
                arcToRelative(2.05f, 2.05f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.33f, 1.6f)
                lineTo(19.5f, 9.61f)
                lineToRelative(1.17f, 0.94f)
                arcTo(2.05f, 2.05f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 8.95f)
                lineTo(24f, 0f)
                close()
                moveTo(21.92f, 8.99f)
                lineTo(19.5f, 7.05f)
                lineTo(17f, 8.95f)
                lineTo(17f, 2f)
                horizontalLineToRelative(4.99f)
                close()
                moveTo(22f, 13f)
                horizontalLineToRelative(2f)
                lineTo(24f, 24f)
                lineTo(0f, 24f)
                lineTo(0f, 6f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 3f)
                lineTo(13f, 3f)
                lineTo(13f, 5f)
                lineTo(3f, 5f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 6f)
                verticalLineToRelative(0.24f)
                lineToRelative(7.88f, 7.88f)
                arcToRelative(3.07f, 3.07f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.24f, 0f)
                lineTo(15.24f, 13f)
                horizontalLineToRelative(2.83f)
                lineToRelative(-2.54f, 2.54f)
                arcToRelative(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -7.07f, 0f)
                lineTo(2f, 9.07f)
                lineTo(2f, 22f)
                lineTo(22f, 22f)
                close()
            }
        }.also { _EnvelopeMarker = it}
