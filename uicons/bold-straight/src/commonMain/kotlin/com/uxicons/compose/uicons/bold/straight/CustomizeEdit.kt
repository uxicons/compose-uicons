package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CustomizeEdit: ImageVector? = null

val Icons.Bs.CustomizeEdit: ImageVector
    get() = _CustomizeEdit ?: UXIcon(name = "CustomizeEdit") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(18f, 12.35f)
                lineToRelative(3f, -3.05f)
                verticalLineToRelative(11.2f)
                curveToRelative(0f, 0.1f, -0.01f, 0.2f, -0.03f, 0.3f)
                curveToRelative(-0.16f, 1.79f, -1.64f, 3.2f, -3.47f, 3.2f)
                lineTo(3.5f, 24f)
                curveToRelative(-1.93f, 0f, -3.5f, -1.57f, -3.5f, -3.5f)
                lineTo(0f, 6.5f)
                curveToRelative(0f, -1.83f, 1.41f, -3.31f, 3.2f, -3.47f)
                curveToRelative(0.1f, -0.02f, 0.2f, -0.03f, 0.3f, -0.03f)
                horizontalLineToRelative(11.63f)
                lineToRelative(-2.7f, 3f)
                lineTo(3.5f, 6f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.23f, -0.5f, 0.5f)
                verticalLineToRelative(14f)
                curveToRelative(0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                horizontalLineToRelative(14f)
                curveToRelative(0.28f, 0f, 0.5f, -0.23f, 0.5f, -0.5f)
                verticalLineToRelative(-8.15f)
                close()
                moveTo(7.33f, 15.27f)
                horizontalLineToRelative(5f)
                curveToRelative(1.66f, 0f, 3f, -1.34f, 3f, -3f)
                reflectiveCurveToRelative(-1.34f, -3f, -3f, -3f)
                curveToRelative(-4f, 0f, -5f, 6f, -5f, 6f)
                close()
                moveTo(23.3f, 0.71f)
                curveToRelative(-0.94f, -0.94f, -2.47f, -0.94f, -3.41f, -0.0f)
                curveToRelative(-0.03f, 0.03f, -6.12f, 6.79f, -6.12f, 6.79f)
                curveToRelative(1.49f, 0.45f, 2.69f, 1.56f, 3.23f, 3.01f)
                lineToRelative(6.29f, -6.39f)
                curveToRelative(0.94f, -0.94f, 0.94f, -2.47f, 0.0f, -3.41f)
                close()
            }
        }.also { _CustomizeEdit = it}
