package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Coffin: ImageVector? = null

val Icons.Tr.Coffin: ImageVector
    get() = _Coffin ?: UXIcon(name = "Coffin") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20.61f, 6.69f)
                lineToRelative(-1.52f, -3.75f)
                curveToRelative(-0.72f, -1.79f, -2.45f, -2.94f, -4.4f, -2.94f)
                horizontalLineToRelative(-5.34f)
                curveToRelative(-1.95f, 0f, -3.67f, 1.16f, -4.4f, 2.94f)
                lineToRelative(-1.52f, 3.75f)
                curveToRelative(-0.42f, 1.05f, -0.53f, 2.18f, -0.29f, 3.29f)
                lineToRelative(2.15f, 10.29f)
                curveToRelative(0.45f, 2.16f, 2.4f, 3.73f, 4.64f, 3.73f)
                horizontalLineToRelative(4.18f)
                curveToRelative(2.23f, 0f, 4.18f, -1.57f, 4.64f, -3.73f)
                lineToRelative(2.15f, -10.29f)
                curveToRelative(0.23f, -1.1f, 0.13f, -2.24f, -0.29f, -3.29f)
                close()
                moveTo(19.93f, 9.78f)
                lineToRelative(-2.15f, 10.29f)
                curveToRelative(-0.36f, 1.7f, -1.9f, 2.94f, -3.66f, 2.94f)
                horizontalLineToRelative(-4.18f)
                curveToRelative(-1.76f, 0f, -3.3f, -1.24f, -3.66f, -2.94f)
                lineToRelative(-2.15f, -10.29f)
                curveToRelative(-0.19f, -0.91f, -0.11f, -1.85f, 0.24f, -2.71f)
                lineToRelative(1.52f, -3.75f)
                curveToRelative(0.57f, -1.41f, 1.93f, -2.32f, 3.47f, -2.32f)
                horizontalLineToRelative(5.34f)
                curveToRelative(1.54f, 0f, 2.9f, 0.91f, 3.47f, 2.32f)
                lineToRelative(1.52f, 3.75f)
                curveToRelative(0.35f, 0.86f, 0.43f, 1.8f, 0.24f, 2.71f)
                close()
            }
        }.also { _Coffin = it}
