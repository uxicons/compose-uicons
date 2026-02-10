package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _EnvelopeOpen: ImageVector? = null

val Icons.Ss.EnvelopeOpen: ImageVector
    get() = _EnvelopeOpen ?: UXIcon(name = "EnvelopeOpen") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(1.2f, 8.44f)
                lineTo(8.48f, 1.45f)
                arcToRelative(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.05f, 0.01f)
                lineToRelative(7.27f, 6.97f)
                lineToRelative(-8.68f, 8.69f)
                arcToRelative(3.07f, 3.07f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4.24f, 0f)
                close()
                moveTo(15.54f, 18.54f)
                arcToRelative(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -7.07f, 0f)
                lineTo(0.16f, 10.23f)
                arcTo(3.96f, 3.96f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 11.28f)
                lineTo(0f, 24f)
                lineTo(24f, 24f)
                lineTo(24f, 11.28f)
                arcToRelative(3.96f, 3.96f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.16f, -1.05f)
                close()
            }
        }.also { _EnvelopeOpen = it}
