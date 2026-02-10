package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SortAlt: ImageVector? = null

val Icons.Rs.SortAlt: ImageVector
    get() = _SortAlt ?: UXIcon(name = "SortAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.6f, 5.6f)
                lineToRelative(-2.6f, -2.6f)
                lineTo(18f, 24f)
                horizontalLineToRelative(-2f)
                lineTo(16f, 3f)
                lineToRelative(-2.57f, 2.57f)
                lineToRelative(-1.41f, -1.41f)
                lineTo(15.59f, 0.59f)
                curveToRelative(0.78f, -0.78f, 2.05f, -0.78f, 2.83f, 0f)
                lineToRelative(3.6f, 3.6f)
                lineToRelative(-1.41f, 1.41f)
                close()
                moveTo(8f, 21f)
                lineTo(8f, 0f)
                horizontalLineToRelative(-2f)
                lineTo(6f, 21f)
                lineToRelative(-2.59f, -2.59f)
                lineToRelative(-1.41f, 1.41f)
                lineToRelative(3.59f, 3.59f)
                curveToRelative(0.39f, 0.39f, 0.9f, 0.58f, 1.41f, 0.58f)
                reflectiveCurveToRelative(1.02f, -0.2f, 1.41f, -0.58f)
                lineToRelative(3.57f, -3.57f)
                lineToRelative(-1.41f, -1.41f)
                lineToRelative(-2.57f, 2.57f)
                close()
            }
        }.also { _SortAlt = it}
