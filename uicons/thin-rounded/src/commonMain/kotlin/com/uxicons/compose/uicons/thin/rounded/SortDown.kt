package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SortDown: ImageVector? = null

val Icons.Tr.SortDown: ImageVector
    get() = _SortDown ?: UXIcon(name = "SortDown") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 17f)
                curveToRelative(-0.61f, 0f, -1.2f, -0.26f, -1.61f, -0.72f)
                lineTo(3.94f, 9.73f)
                curveToRelative(-0.45f, -0.49f, -0.56f, -1.17f, -0.3f, -1.77f)
                curveToRelative(0.26f, -0.6f, 0.83f, -0.97f, 1.49f, -0.97f)
                horizontalLineToRelative(13.75f)
                curveToRelative(0.65f, 0f, 1.22f, 0.37f, 1.49f, 0.97f)
                curveToRelative(0.26f, 0.6f, 0.15f, 1.27f, -0.29f, 1.75f)
                lineToRelative(-6.47f, 6.57f)
                curveToRelative(-0.4f, 0.44f, -0.98f, 0.7f, -1.6f, 0.7f)
                close()
                moveTo(5.13f, 8f)
                curveToRelative(-0.26f, 0f, -0.47f, 0.14f, -0.57f, 0.37f)
                curveToRelative(-0.1f, 0.23f, -0.06f, 0.49f, 0.11f, 0.67f)
                lineToRelative(6.45f, 6.55f)
                curveToRelative(0.48f, 0.53f, 1.3f, 0.52f, 1.75f, 0.02f)
                lineToRelative(6.48f, -6.58f)
                curveToRelative(0.16f, -0.17f, 0.2f, -0.43f, 0.1f, -0.66f)
                curveToRelative(-0.1f, -0.23f, -0.32f, -0.37f, -0.57f, -0.37f)
                horizontalLineTo(5.13f)
                close()
            }
        }.also { _SortDown = it}
