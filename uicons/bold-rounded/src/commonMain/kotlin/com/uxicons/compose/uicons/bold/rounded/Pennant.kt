package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Pennant: ImageVector? = null

val Icons.Br.Pennant: ImageVector
    get() = _Pennant ?: UXIcon(name = "Pennant") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(21.64f, 8.83f)
            lineTo(4.75f, 3.58f)
            arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, 1f, 4.5f)
            verticalLineToRelative(18f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 0f)
            lineTo(4f, 20.8f)
            lineTo(21.67f, 15.3f)
            arcToRelative(3.4f, 3.4f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.03f, -6.47f)
            close()
            moveTo(20.75f, 12.45f)
            lineTo(4f, 17.65f)
            lineTo(4f, 6.49f)
            lineToRelative(16.72f, 5.2f)
            arcToRelative(0.37f, 0.37f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.28f, 0.38f)
            arcTo(0.36f, 0.36f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20.75f, 12.45f)
            close()
        }
    }.also { _Pennant = it }
