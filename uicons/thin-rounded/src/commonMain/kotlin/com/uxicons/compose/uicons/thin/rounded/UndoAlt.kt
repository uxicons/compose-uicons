package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UndoAlt: ImageVector? = null

val Icons.Tr.UndoAlt: ImageVector
    get() = _UndoAlt ?: UXIcon(name = "UndoAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 11.5f)
                verticalLineToRelative(8.0f)
                curveToRelative(0f, 2.48f, -2.02f, 4.5f, -4.5f, 4.5f)
                horizontalLineTo(2.5f)
                curveToRelative(-0.28f, 0f, -0.5f, -0.22f, -0.5f, -0.5f)
                reflectiveCurveToRelative(0.22f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(17f)
                curveToRelative(1.93f, 0f, 3.5f, -1.57f, 3.5f, -3.5f)
                verticalLineToRelative(-8.0f)
                curveToRelative(0f, -0.94f, -0.36f, -1.81f, -1.02f, -2.48f)
                reflectiveCurveToRelative(-1.54f, -1.02f, -2.48f, -1.02f)
                horizontalLineToRelative(0f)
                lineToRelative(-18.4f, 0.0f)
                curveToRelative(0.07f, 0.2f, 0.18f, 0.4f, 0.34f, 0.56f)
                lineToRelative(4.6f, 4.6f)
                curveToRelative(0.2f, 0.2f, 0.2f, 0.51f, 0f, 0.71f)
                curveToRelative(-0.1f, 0.1f, -0.23f, 0.15f, -0.35f, 0.15f)
                reflectiveCurveToRelative(-0.26f, -0.05f, -0.35f, -0.15f)
                lineTo(0.73f, 9.27f)
                curveTo(0.25f, 8.79f, 0.01f, 8.15f, 0.0f, 7.52f)
                curveToRelative(0f, -0.01f, -0.0f, -0.01f, -0.0f, -0.01f)
                curveToRelative(0f, -0.01f, 0.0f, -0.01f, 0.0f, -0.01f)
                curveToRelative(0.0f, -0.64f, 0.25f, -1.27f, 0.73f, -1.75f)
                lineTo(5.33f, 1.14f)
                curveToRelative(0.2f, -0.2f, 0.51f, -0.2f, 0.71f, 0f)
                reflectiveCurveToRelative(0.2f, 0.51f, 0f, 0.71f)
                lineTo(1.44f, 6.44f)
                curveToRelative(-0.16f, 0.16f, -0.27f, 0.36f, -0.34f, 0.56f)
                lineToRelative(18.4f, -0.0f)
                horizontalLineToRelative(0f)
                curveToRelative(1.2f, 0f, 2.33f, 0.47f, 3.18f, 1.32f)
                curveToRelative(0.85f, 0.85f, 1.32f, 1.98f, 1.32f, 3.18f)
                close()
            }
        }.also { _UndoAlt = it}
