package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DocumentAutosave: ImageVector? = null

val Icons.Ss.DocumentAutosave: ImageVector
    get() = _DocumentAutosave ?: UXIcon(name = "DocumentAutosave") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(17.5f, 11f)
                curveToRelative(-3.59f, 0f, -6.5f, 2.91f, -6.5f, 6.5f)
                reflectiveCurveToRelative(2.91f, 6.5f, 6.5f, 6.5f)
                reflectiveCurveToRelative(6.5f, -2.91f, 6.5f, -6.5f)
                reflectiveCurveToRelative(-2.91f, -6.5f, -6.5f, -6.5f)
                close()
                moveTo(17.5f, 22f)
                curveToRelative(-1.37f, 0f, -2.58f, -0.63f, -3.4f, -1.6f)
                lineToRelative(-1.1f, 1.1f)
                verticalLineToRelative(-3f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(3f)
                lineToRelative(-1f, 1f)
                horizontalLineToRelative(0.01f)
                curveToRelative(0.46f, 0.6f, 1.17f, 1f, 1.99f, 1f)
                reflectiveCurveToRelative(1.53f, -0.4f, 1.99f, -1f)
                horizontalLineToRelative(2.24f)
                curveToRelative(-0.62f, 1.74f, -2.27f, 3f, -4.22f, 3f)
                close()
                moveTo(22f, 16.5f)
                curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                horizontalLineToRelative(-3f)
                lineToRelative(1f, -1f)
                horizontalLineToRelative(-0.01f)
                curveToRelative(-0.46f, -0.6f, -1.17f, -1f, -1.99f, -1f)
                reflectiveCurveToRelative(-1.53f, 0.4f, -1.99f, 1f)
                horizontalLineToRelative(-2.24f)
                curveToRelative(0.62f, -1.74f, 2.27f, -3f, 4.22f, -3f)
                curveToRelative(1.37f, 0f, 2.58f, 0.63f, 3.4f, 1.6f)
                lineToRelative(1.1f, -1.1f)
                verticalLineToRelative(3f)
                close()
                moveTo(15f, 0.59f)
                verticalLineToRelative(4.41f)
                horizontalLineToRelative(4.41f)
                close()
                moveTo(12.03f, 24f)
                horizontalLineToRelative(-12.03f)
                verticalLineToRelative(-21f)
                curveToRelative(0f, -1.66f, 1.34f, -3f, 3f, -3f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(2.38f)
                curveToRelative(-0.79f, -0.24f, -1.63f, -0.38f, -2.5f, -0.38f)
                curveToRelative(-4.69f, 0f, -8.5f, 3.81f, -8.5f, 8.5f)
                curveToRelative(0f, 2.61f, 1.18f, 4.94f, 3.03f, 6.5f)
                close()
            }
        }.also { _DocumentAutosave = it}
