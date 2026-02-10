package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _EnvelopeMarker: ImageVector? = null

val Icons.Ss.EnvelopeMarker: ImageVector
    get() = _EnvelopeMarker ?: UXIcon(name = "EnvelopeMarker") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.95f, 11f)
                arcToRelative(2.04f, 2.04f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.28f, -0.45f)
                lineTo(19.5f, 9.61f)
                lineToRelative(-1.17f, 0.94f)
                arcTo(2.05f, 2.05f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15f, 8.95f)
                verticalLineTo(0f)
                horizontalLineToRelative(9f)
                verticalLineTo(8.95f)
                arcTo(2.06f, 2.06f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21.95f, 11f)
                close()
                moveTo(12f, 15.42f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.12f, -0.88f)
                lineToRelative(1.73f, -1.73f)
                arcTo(4.08f, 4.08f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15.3f, 12.6f)
                arcTo(4.02f, 4.02f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13f, 8.95f)
                verticalLineTo(3f)
                horizontalLineTo(3f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.22f, 4.89f)
                lineToRelative(9.66f, 9.66f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 15.42f)
                close()
                moveTo(23.7f, 12.6f)
                arcToRelative(4.1f, 4.1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4.2f, -0.42f)
                lineToRelative(-0.11f, -0.07f)
                lineTo(15.54f, 15.96f)
                arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, -7.07f, 0f)
                lineTo(0f, 7.5f)
                verticalLineTo(24f)
                horizontalLineTo(24f)
                verticalLineTo(12.43f)
                curveTo(23.9f, 12.49f, 23.81f, 12.55f, 23.7f, 12.6f)
                close()
            }
        }.also { _EnvelopeMarker = it}
