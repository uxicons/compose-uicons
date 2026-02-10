package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UserPolice: ImageVector? = null

val Icons.Ss.UserPolice: ImageVector
    get() = _UserPolice ?: UXIcon(name = "UserPolice") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21f, 21f)
                verticalLineToRelative(3f)
                lineTo(3f, 24f)
                verticalLineToRelative(-3f)
                curveToRelative(0f, -2.28f, 1.5f, -4.23f, 3.68f, -4.82f)
                lineToRelative(5.32f, 5.32f)
                lineToRelative(5.32f, -5.32f)
                curveToRelative(2.17f, 0.59f, 3.68f, 2.55f, 3.68f, 4.82f)
                close()
                moveTo(18.0f, 9.15f)
                curveToRelative(-0.08f, 3.24f, -2.74f, 5.85f, -6.0f, 5.85f)
                reflectiveCurveToRelative(-5.92f, -2.61f, -6.0f, -5.85f)
                curveToRelative(1.07f, 0.36f, 3.07f, 0.85f, 6.0f, 0.85f)
                reflectiveCurveToRelative(4.93f, -0.49f, 6.0f, -0.85f)
                close()
                moveTo(13.7f, 0.21f)
                curveToRelative(-1.11f, -0.28f, -2.28f, -0.28f, -3.4f, 0f)
                lineToRelative(-6.3f, 1.79f)
                verticalLineToRelative(3f)
                lineToRelative(2f, 1f)
                verticalLineToRelative(1f)
                reflectiveCurveToRelative(2f, 1f, 6f, 1f)
                reflectiveCurveToRelative(6f, -1f, 6f, -1f)
                verticalLineToRelative(-1f)
                lineToRelative(2f, -1f)
                verticalLineToRelative(-3f)
                lineTo(13.7f, 0.21f)
                close()
                moveTo(14f, 4.07f)
                curveToRelative(0f, 1.51f, -1.46f, 2.22f, -1.91f, 2.4f)
                lineToRelative(-0.09f, 0.04f)
                lineToRelative(-0.09f, -0.04f)
                curveToRelative(-0.45f, -0.22f, -1.91f, -1.06f, -1.91f, -2.39f)
                verticalLineToRelative(-1.45f)
                curveToRelative(0f, -0.19f, 0.12f, -0.36f, 0.3f, -0.42f)
                lineToRelative(1.7f, -0.56f)
                lineToRelative(1.7f, 0.56f)
                curveToRelative(0.18f, 0.06f, 0.3f, 0.23f, 0.3f, 0.42f)
                verticalLineToRelative(1.45f)
                close()
            }
        }.also { _UserPolice = it}
