package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Envelope: ImageVector? = null

val Icons.Br.Envelope: ImageVector
    get() = _Envelope ?: UXIcon(name = "Envelope") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(18.5f, 1f)
            lineTo(5.5f, 1f)
            arcTo(5.51f, 5.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 6.5f)
            verticalLineToRelative(11f)
            arcTo(5.51f, 5.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.5f, 23f)
            horizontalLineToRelative(13f)
            arcTo(5.51f, 5.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 17.5f)
            lineTo(24f, 6.5f)
            arcTo(5.51f, 5.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18.5f, 1f)
            close()
            moveTo(18.5f, 4f)
            arcToRelative(2.48f, 2.48f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.64f, 0.63f)
            lineToRelative(-6.5f, 6.5f)
            arcToRelative(2.37f, 2.37f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3.28f, 0f)
            lineToRelative(-6.5f, -6.5f)
            arcTo(2.48f, 2.48f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.5f, 4f)
            close()
            moveTo(18.5f, 20f)
            lineTo(5.5f, 20f)
            arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 17.5f)
            lineTo(3f, 8.02f)
            lineToRelative(5.24f, 5.24f)
            arcToRelative(5.32f, 5.32f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.52f, 0f)
            lineTo(21f, 8.02f)
            lineTo(21f, 17.5f)
            arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18.5f, 20f)
            close()
        }
    }.also { _Envelope = it }
