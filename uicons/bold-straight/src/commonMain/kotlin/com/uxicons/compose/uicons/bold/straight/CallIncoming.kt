package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CallIncoming: ImageVector? = null

val Icons.Bs.CallIncoming: ImageVector
    get() = _CallIncoming ?: UXIcon(name = "CallIncoming") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14.3f, 14.92f)
                arcTo(10.7f, 10.7f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9.09f, 9.69f)
                lineToRelative(2.96f, -2.96f)
                lineTo(5.41f, 0.09f)
                lineTo(1.77f, 3.73f)
                arcTo(6.05f, 6.05f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 8.06f)
                curveTo(0f, 15.21f, 8.79f, 24f, 15.94f, 24f)
                arcToRelative(6.06f, 6.06f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.32f, -1.76f)
                lineTo(23.91f, 18.59f)
                lineToRelative(-6.64f, -6.64f)
                close()
                moveTo(18.15f, 20.11f)
                arcToRelative(3.08f, 3.08f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.2f, 0.89f)
                curveTo(10.95f, 21f, 3f, 13.93f, 3f, 8.06f)
                arcToRelative(3.08f, 3.08f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.89f, -2.2f)
                lineTo(5.41f, 4.33f)
                lineToRelative(2.4f, 2.4f)
                lineTo(5.54f, 9f)
                lineToRelative(0.37f, 0.92f)
                arcToRelative(13.94f, 13.94f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8.2f, 8.18f)
                lineToRelative(0.91f, 0.35f)
                lineToRelative(2.25f, -2.26f)
                lineToRelative(2.4f, 2.4f)
                close()
                moveTo(15f, 8f)
                lineTo(15f, 2.5f)
                lineToRelative(2.19f, 2.19f)
                lineTo(21.81f, 0.06f)
                lineToRelative(2.12f, 2.12f)
                lineTo(19.31f, 6.81f)
                lineTo(21.5f, 9f)
                lineTo(16f, 9f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15f, 8f)
                close()
            }
        }.also { _CallIncoming = it}
