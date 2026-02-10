package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Z: ImageVector? = null

val Icons.Tr.Z: ImageVector
    get() = _Z ?: UXIcon(name = "Z") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.49f, 24f)
                horizontalLineTo(5.58f)
                curveToRelative(-1.58f, 0f, -2.92f, -0.97f, -3.4f, -2.46f)
                curveToRelative(-0.48f, -1.48f, 0.02f, -3.03f, 1.29f, -3.95f)
                lineTo(19.94f, 5.61f)
                curveToRelative(1.1f, -0.8f, 1.2f, -1.99f, 0.93f, -2.84f)
                curveToRelative(-0.28f, -0.85f, -1.07f, -1.77f, -2.45f, -1.77f)
                horizontalLineTo(2.51f)
                curveToRelative(-0.65f, 0.01f, -0.65f, -1.01f, 0f, -1f)
                horizontalLineToRelative(15.91f)
                curveToRelative(1.58f, 0f, 2.92f, 0.97f, 3.4f, 2.46f)
                curveToRelative(0.48f, 1.48f, -0.02f, 3.03f, -1.29f, 3.95f)
                lineTo(4.06f, 18.39f)
                curveToRelative(-1.1f, 0.8f, -1.2f, 1.99f, -0.93f, 2.84f)
                curveToRelative(0.28f, 0.85f, 1.07f, 1.77f, 2.45f, 1.77f)
                horizontalLineToRelative(15.91f)
                curveToRelative(0.65f, -0.01f, 0.65f, 1.01f, 0f, 1f)
                close()
            }
        }.also { _Z = it}
