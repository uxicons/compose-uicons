package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Pennant: ImageVector? = null

val Icons.Rr.Pennant: ImageVector
    get() = _Pennant ?: UXIcon(name = "Pennant") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.93f, 9.15f)
                lineTo(3.43f, 3.4f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = false, 1f, 3.73f)
                lineTo(1f, 23f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 0f)
                lineTo(3f, 20.74f)
                lineToRelative(18.95f, -5.89f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.02f, -5.7f)
                close()
                moveTo(1.03f, 3.75f)
                horizontalLineToRelative(0f)
                reflectiveCurveTo(1.03f, 3.75f, 1.03f, 3.75f)
                close()
                moveTo(21.34f, 12.94f)
                lineTo(3f, 18.64f)
                lineTo(3f, 5.36f)
                lineToRelative(18.32f, 5.69f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.02f, 1.89f)
                close()
            }
        }.also { _Pennant = it}
