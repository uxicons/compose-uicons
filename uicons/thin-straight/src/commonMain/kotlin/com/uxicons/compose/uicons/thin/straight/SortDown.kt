package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SortDown: ImageVector? = null

val Icons.Ts.SortDown: ImageVector
    get() = _SortDown ?: UXIcon(name = "SortDown") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11.97f, 17f)
                curveToRelative(-0.56f, 0f, -1.1f, -0.24f, -1.48f, -0.66f)
                lineTo(2.87f, 8f)
                horizontalLineTo(21.08f)
                lineToRelative(-7.63f, 8.35f)
                curveToRelative(-0.37f, 0.41f, -0.91f, 0.65f, -1.47f, 0.65f)
                close()
                moveTo(5.13f, 9f)
                lineToRelative(6.1f, 6.67f)
                curveToRelative(0.38f, 0.43f, 1.09f, 0.42f, 1.47f, 0.0f)
                lineToRelative(6.11f, -6.67f)
                horizontalLineTo(5.13f)
                close()
            }
        }.also { _SortDown = it}
