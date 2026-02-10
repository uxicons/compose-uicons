package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MicrophoneAlt: ImageVector? = null

val Icons.Ss.MicrophoneAlt: ImageVector
    get() = _MicrophoneAlt ?: UXIcon(name = "MicrophoneAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 21.24f)
                verticalLineTo(24f)
                horizontalLineTo(22f)
                verticalLineTo(21.24f)
                arcToRelative(3.24f, 3.24f, 0f, isMoreThanHalf = false, isPositiveArc = false, -5.54f, -2.29f)
                lineToRelative(-3f, 3f)
                arcTo(6.95f, 6.95f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8.52f, 24f)
                horizontalLineTo(3.12f)
                arcTo(3.12f, 3.12f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.91f, 18.67f)
                lineToRelative(0.31f, -0.31f)
                arcToRelative(2.69f, 2.69f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.57f, -2.96f)
                lineToRelative(6f, -6f)
                arcToRelative(7.58f, 7.58f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.08f, 1.72f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.71f, 2.09f)
                lineTo(5.59f, 19.21f)
                arcToRelative(2.68f, 2.68f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.96f, 0.57f)
                lineToRelative(-0.3f, 0.3f)
                arcTo(1.12f, 1.12f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.12f, 22f)
                horizontalLineTo(8.52f)
                arcToRelative(4.97f, 4.97f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.54f, -1.47f)
                lineToRelative(3f, -3f)
                arcTo(5.24f, 5.24f, 0f, isMoreThanHalf = false, isPositiveArc = true, 24f, 21.24f)
                close()
                moveTo(15f, 12f)
                arcTo(6f, 6f, 0f, isMoreThanHalf = true, isPositiveArc = false, 9f, 6f)
                arcTo(6f, 6f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15f, 12f)
                close()
            }
        }.also { _MicrophoneAlt = it}
