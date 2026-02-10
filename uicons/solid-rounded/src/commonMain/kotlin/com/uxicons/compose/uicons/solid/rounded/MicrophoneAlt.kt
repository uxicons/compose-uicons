package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MicrophoneAlt: ImageVector? = null

val Icons.Sr.MicrophoneAlt: ImageVector
    get() = _MicrophoneAlt ?: UXIcon(name = "MicrophoneAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9.34f, 10.79f)
                arcToRelative(6.18f, 6.18f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.55f, -8.28f)
                lineToRelative(0.63f, -0.63f)
                arcToRelative(6.18f, 6.18f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8.27f, -0.54f)
                arcToRelative(5.95f, 5.95f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.15f, 4.34f)
                arcToRelative(6.01f, 6.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.75f, 4.5f)
                lineToRelative(-1f, 1f)
                arcToRelative(6.02f, 6.02f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4.25f, 1.76f)
                quadToRelative(-0.13f, 0f, -0.26f, -0.01f)
                arcTo(5.95f, 5.95f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9.34f, 10.79f)
                close()
                moveTo(18.76f, 16f)
                arcToRelative(5.21f, 5.21f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.71f, 1.53f)
                arcTo(15.14f, 15.14f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.27f, 22f)
                horizontalLineTo(3.12f)
                arcToRelative(1.12f, 1.12f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.79f, -1.91f)
                lineToRelative(0.7f, -0.7f)
                arcToRelative(7.18f, 7.18f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.6f, -2.09f)
                lineToRelative(3.05f, -3.05f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.81f, 12.08f)
                arcToRelative(7.57f, 7.57f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.08f, -1.73f)
                lineTo(3.7f, 13.38f)
                arcToRelative(7.17f, 7.17f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.09f, 4.6f)
                lineToRelative(-0.7f, 0.7f)
                arcTo(3.12f, 3.12f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.12f, 24f)
                horizontalLineToRelative(1.15f)
                arcToRelative(17.13f, 17.13f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12.19f, -5.05f)
                arcTo(3.24f, 3.24f, 0f, isMoreThanHalf = false, isPositiveArc = true, 22f, 21.24f)
                verticalLineTo(23f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 0f)
                verticalLineTo(21.24f)
                arcTo(5.25f, 5.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18.76f, 16f)
                close()
            }
        }.also { _MicrophoneAlt = it}
