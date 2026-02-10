package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Eraser: ImageVector? = null

val Icons.Tr.Eraser: ImageVector
    get() = _Eraser ?: UXIcon(name = "Eraser") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.5f, 22f)
                horizontalLineToRelative(-10.34f)
                lineToRelative(3.52f, -3.55f)
                curveToRelative(0.01f, -0.01f, 0.01f, -0.01f, 0.02f, -0.01f)
                curveToRelative(0.01f, -0.01f, 0.01f, -0.01f, 0.02f, -0.02f)
                lineToRelative(5.92f, -5.97f)
                curveToRelative(1.81f, -1.83f, 1.81f, -4.81f, -0.0f, -6.63f)
                lineToRelative(-3.4f, -3.43f)
                curveToRelative(-0.89f, -0.89f, -2.06f, -1.38f, -3.32f, -1.38f)
                horizontalLineToRelative(0f)
                curveToRelative(-1.25f, 0f, -2.43f, 0.49f, -3.31f, 1.38f)
                lineTo(1.36f, 13.62f)
                curveToRelative(-1.81f, 1.83f, -1.81f, 4.8f, 0f, 6.63f)
                lineToRelative(1.66f, 1.67f)
                curveToRelative(0.68f, 0.68f, 1.62f, 1.07f, 2.58f, 1.07f)
                horizontalLineToRelative(17.9f)
                curveToRelative(0.28f, 0f, 0.5f, -0.22f, 0.5f, -0.5f)
                reflectiveCurveToRelative(-0.22f, -0.5f, -0.5f, -0.5f)
                close()
                moveTo(13.31f, 3.09f)
                curveToRelative(0.7f, -0.7f, 1.62f, -1.09f, 2.61f, -1.09f)
                horizontalLineToRelative(0f)
                curveToRelative(0.98f, 0f, 1.91f, 0.39f, 2.61f, 1.09f)
                lineToRelative(3.4f, 3.43f)
                curveToRelative(1.43f, 1.44f, 1.43f, 3.79f, 0f, 5.23f)
                lineToRelative(-5.58f, 5.63f)
                lineTo(7.72f, 8.68f)
                lineToRelative(5.59f, -5.59f)
                close()
                moveTo(11.75f, 22f)
                horizontalLineToRelative(-6.15f)
                curveToRelative(-0.69f, 0f, -1.38f, -0.28f, -1.87f, -0.78f)
                lineToRelative(-1.66f, -1.67f)
                curveToRelative(-1.43f, -1.44f, -1.43f, -3.79f, 0f, -5.22f)
                lineToRelative(4.94f, -4.94f)
                lineToRelative(8.63f, 8.69f)
                lineToRelative(-3.89f, 3.92f)
                close()
            }
        }.also { _Eraser = it}
