package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UserPen: ImageVector? = null

val Icons.Sc.UserPen: ImageVector
    get() = _UserPen ?: UXIcon(name = "UserPen") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(9.5f, 12f)
                curveToRelative(-3.75f, 0f, -5.5f, -1.75f, -5.5f, -5.5f)
                reflectiveCurveToRelative(1.75f, -5.5f, 5.5f, -5.5f)
                reflectiveCurveToRelative(5.5f, 1.75f, 5.5f, 5.5f)
                reflectiveCurveToRelative(-1.75f, 5.5f, -5.5f, 5.5f)
                close()
                moveTo(22.12f, 11.85f)
                curveToRelative(-1.06f, -1.12f, -3.17f, -1.13f, -4.22f, -0.01f)
                lineToRelative(-5.42f, 5.42f)
                curveToRelative(-0.86f, 0.87f, -1.36f, 2.03f, -1.42f, 3.26f)
                lineToRelative(-0.06f, 1.44f)
                curveToRelative(-0.04f, 0.57f, 0.47f, 1.08f, 1.04f, 1.04f)
                lineToRelative(1.43f, -0.06f)
                curveToRelative(1.23f, -0.06f, 2.39f, -0.56f, 3.25f, -1.43f)
                lineToRelative(5.42f, -5.42f)
                curveToRelative(1.16f, -1.17f, 1.15f, -3.06f, -0.01f, -4.24f)
                close()
                moveTo(9.0f, 21.87f)
                lineTo(9.06f, 20.43f)
                curveToRelative(0.08f, -1.74f, 0.79f, -3.36f, 2.0f, -4.59f)
                lineToRelative(1.53f, -1.53f)
                curveToRelative(-0.91f, -0.21f, -1.94f, -0.31f, -3.1f, -0.31f)
                curveToRelative(-5.72f, 0f, -8.34f, 2.46f, -8.49f, 7.97f)
                curveToRelative(-0.01f, 0.27f, 0.1f, 0.53f, 0.28f, 0.72f)
                reflectiveCurveToRelative(0.45f, 0.3f, 0.72f, 0.3f)
                horizontalLineToRelative(7.17f)
                curveToRelative(-0.13f, -0.36f, -0.2f, -0.74f, -0.18f, -1.13f)
                close()
            }
        }.also { _UserPen = it}
