package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _EnvelopeMarker: ImageVector? = null

val Icons.Sr.EnvelopeMarker: ImageVector
    get() = _EnvelopeMarker ?: UXIcon(name = "EnvelopeMarker") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.95f, 11f)
                arcToRelative(2.03f, 2.03f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.28f, -0.45f)
                lineTo(19.5f, 9.61f)
                lineToRelative(-1.17f, 0.94f)
                arcTo(2.05f, 2.05f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15f, 8.95f)
                verticalLineTo(2f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, -2f)
                horizontalLineToRelative(5f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 2f)
                verticalLineTo(8.95f)
                arcTo(2.06f, 2.06f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21.95f, 11f)
                close()
                moveTo(12f, 15.42f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.12f, -0.88f)
                lineTo(15.87f, 12.8f)
                arcTo(3.86f, 3.86f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13f, 8.95f)
                verticalLineTo(3f)
                horizontalLineTo(5f)
                arcTo(4.99f, 4.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.74f, 5.41f)
                lineToRelative(9.13f, 9.13f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 15.42f)
                close()
                moveTo(23.7f, 12.6f)
                arcToRelative(4.05f, 4.05f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4.2f, -0.42f)
                arcToRelative(0.92f, 0.92f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.12f, -0.05f)
                lineTo(15.54f, 15.96f)
                arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, -7.07f, 0f)
                lineTo(0.05f, 7.54f)
                curveTo(0.03f, 7.7f, 0f, 7.84f, 0f, 8f)
                verticalLineTo(19f)
                arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 5f)
                horizontalLineTo(19f)
                arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, -5f)
                verticalLineTo(12.43f)
                curveTo(23.9f, 12.49f, 23.81f, 12.55f, 23.7f, 12.6f)
                close()
            }
        }.also { _EnvelopeMarker = it}
