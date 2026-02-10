package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MusicFile: ImageVector? = null

val Icons.Tr.MusicFile: ImageVector
    get() = _MusicFile ?: UXIcon(name = "MusicFile") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(15.5f, 11f)
                horizontalLineToRelative(-1f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                verticalLineToRelative(2.01f)
                curveToRelative(-0.42f, -0.32f, -0.94f, -0.51f, -1.5f, -0.51f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                reflectiveCurveToRelative(1.12f, 2.5f, 2.5f, 2.5f)
                reflectiveCurveToRelative(2.5f, -1.12f, 2.5f, -2.5f)
                verticalLineToRelative(-4f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(1f)
                curveToRelative(0.28f, 0f, 0.5f, -0.22f, 0.5f, -0.5f)
                reflectiveCurveToRelative(-0.22f, -0.5f, -0.5f, -0.5f)
                close()
                moveTo(10.5f, 19f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                close()
                moveTo(20.1f, 5.39f)
                lineToRelative(-3.48f, -3.48f)
                curveToRelative(-1.23f, -1.23f, -2.86f, -1.9f, -4.6f, -1.9f)
                horizontalLineToRelative(-5.51f)
                curveTo(4.02f, 0f, 2f, 2.02f, 2f, 4.5f)
                verticalLineToRelative(15f)
                curveToRelative(0f, 2.48f, 2.02f, 4.5f, 4.5f, 4.5f)
                horizontalLineToRelative(11f)
                curveToRelative(2.48f, 0f, 4.5f, -2.02f, 4.5f, -4.5f)
                verticalLineToRelative(-9.52f)
                curveToRelative(0f, -1.74f, -0.68f, -3.37f, -1.9f, -4.6f)
                close()
                moveTo(19.39f, 6.1f)
                curveToRelative(0.55f, 0.55f, 0.96f, 1.2f, 1.23f, 1.9f)
                horizontalLineToRelative(-5.12f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                lineTo(14f, 1.38f)
                curveToRelative(0.7f, 0.27f, 1.35f, 0.68f, 1.9f, 1.23f)
                lineToRelative(3.48f, 3.48f)
                close()
                moveTo(21f, 19.5f)
                curveToRelative(0f, 1.93f, -1.57f, 3.5f, -3.5f, 3.5f)
                lineTo(6.5f, 23f)
                curveToRelative(-1.93f, 0f, -3.5f, -1.57f, -3.5f, -3.5f)
                lineTo(3f, 4.5f)
                curveToRelative(0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                horizontalLineToRelative(5.51f)
                curveToRelative(0.34f, 0f, 0.66f, 0.04f, 0.98f, 0.1f)
                verticalLineToRelative(5.4f)
                curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
                horizontalLineToRelative(5.4f)
                curveToRelative(0.06f, 0.32f, 0.1f, 0.65f, 0.1f, 0.98f)
                verticalLineToRelative(9.52f)
                close()
            }
        }.also { _MusicFile = it}
