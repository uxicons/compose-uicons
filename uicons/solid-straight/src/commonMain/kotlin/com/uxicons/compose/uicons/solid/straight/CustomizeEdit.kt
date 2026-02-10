package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CustomizeEdit: ImageVector? = null

val Icons.Ss.CustomizeEdit: ImageVector
    get() = _CustomizeEdit ?: UXIcon(name = "CustomizeEdit") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(11f, 10.69f)
                curveToRelative(1.66f, 0f, 3f, 1.34f, 3f, 3f)
                reflectiveCurveToRelative(-1.34f, 3f, -3f, 3f)
                horizontalLineToRelative(-5f)
                reflectiveCurveToRelative(1f, -6f, 5f, -6f)
                close()
                moveTo(15.67f, 11.94f)
                lineToRelative(7.63f, -7.82f)
                curveToRelative(0.94f, -0.94f, 0.94f, -2.47f, 0.0f, -3.41f)
                curveToRelative(-0.94f, -0.94f, -2.47f, -0.94f, -3.41f, -0.0f)
                curveToRelative(-0.03f, 0.03f, -7.45f, 8.22f, -7.45f, 8.22f)
                curveToRelative(1.49f, 0.45f, 2.69f, 1.56f, 3.23f, 3.01f)
                close()
                moveTo(15.91f, 14.55f)
                curveToRelative(-0.41f, 2.35f, -2.45f, 4.14f, -4.91f, 4.14f)
                lineTo(3.64f, 18.69f)
                lineToRelative(0.39f, -2.33f)
                curveToRelative(0.43f, -2.59f, 2.13f, -6.79f, 5.8f, -7.54f)
                curveToRelative(0f, 0f, 4.24f, -4.68f, 5.28f, -5.82f)
                lineTo(3f, 3.0f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(15f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                horizontalLineToRelative(15f)
                curveToRelative(1.65f, 0f, 3f, -1.35f, 3f, -3f)
                verticalLineToRelative(-11.67f)
                lineToRelative(-5.09f, 5.21f)
                close()
            }
        }.also { _CustomizeEdit = it}
