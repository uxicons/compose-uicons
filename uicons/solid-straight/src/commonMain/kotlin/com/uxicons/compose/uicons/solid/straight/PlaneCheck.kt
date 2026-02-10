package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PlaneCheck: ImageVector? = null

val Icons.Ss.PlaneCheck: ImageVector
    get() = _PlaneCheck ?: UXIcon(name = "PlaneCheck") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(18f, 12f)
                curveToRelative(-3.31f, 0f, -6f, 2.69f, -6f, 6f)
                reflectiveCurveToRelative(2.69f, 6f, 6f, 6f)
                reflectiveCurveToRelative(6f, -2.69f, 6f, -6f)
                reflectiveCurveToRelative(-2.69f, -6f, -6f, -6f)
                close()
                moveTo(18.62f, 20.41f)
                curveToRelative(-0.38f, 0.38f, -0.88f, 0.59f, -1.41f, 0.59f)
                horizontalLineToRelative(-0.0f)
                curveToRelative(-0.53f, 0f, -1.04f, -0.21f, -1.41f, -0.59f)
                lineToRelative(-2.01f, -2.01f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(2.01f, 2.01f)
                lineToRelative(3.62f, -3.62f)
                lineToRelative(1.41f, 1.41f)
                close()
                moveTo(8f, 17.96f)
                verticalLineToRelative(-4.46f)
                lineToRelative(-8f, 2.85f)
                verticalLineToRelative(-3.35f)
                curveToRelative(0f, -1.1f, 0.6f, -2.11f, 1.56f, -2.63f)
                lineToRelative(6.44f, -3.93f)
                verticalLineToRelative(-3.44f)
                curveToRelative(0f, -1.66f, 1.34f, -3f, 3f, -3f)
                verticalLineToRelative(0.03f)
                curveToRelative(1.66f, 0f, 3f, 1.34f, 3f, 3f)
                verticalLineToRelative(3.44f)
                lineToRelative(6.39f, 3.9f)
                curveToRelative(-0.76f, -0.24f, -1.56f, -0.36f, -2.39f, -0.36f)
                curveToRelative(-4.41f, 0f, -8f, 3.59f, -8f, 8f)
                curveToRelative(0f, 1.36f, 0.34f, 2.64f, 0.94f, 3.76f)
                curveToRelative(-2.15f, 0.8f, -5.18f, 1.93f, -5.94f, 2.21f)
                verticalLineToRelative(-2.41f)
                curveToRelative(0f, -1.0f, 0.5f, -1.94f, 1.34f, -2.5f)
                lineToRelative(1.66f, -1.1f)
                close()
            }
        }.also { _PlaneCheck = it}
