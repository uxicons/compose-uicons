package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ClipFile: ImageVector? = null

val Icons.Bs.ClipFile: ImageVector
    get() = _ClipFile ?: UXIcon(name = "ClipFile") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22f, 3.5f)
                verticalLineToRelative(20.5f)
                lineTo(2f, 24f)
                lineTo(2f, 3.5f)
                curveToRelative(0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                horizontalLineToRelative(3.04f)
                curveToRelative(-0.74f, 0.83f, -1.25f, 1.86f, -1.45f, 3f)
                horizontalLineToRelative(-1.59f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                verticalLineToRelative(17.5f)
                horizontalLineToRelative(14f)
                lineTo(19f, 3.5f)
                curveToRelative(0f, -0.07f, -0.02f, -0.14f, -0.04f, -0.2f)
                curveToRelative(-0.15f, -1.26f, -0.69f, -2.4f, -1.49f, -3.3f)
                horizontalLineToRelative(1.04f)
                curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
                close()
                moveTo(7f, 19f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(-3f)
                lineTo(7f, 16f)
                verticalLineToRelative(3f)
                close()
                moveTo(11f, 4f)
                curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
                verticalLineToRelative(7.5f)
                curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                reflectiveCurveToRelative(-0.5f, -0.22f, -0.5f, -0.5f)
                verticalLineToRelative(-7.5f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(7.5f)
                curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
                reflectiveCurveToRelative(2.5f, -1.12f, 2.5f, -2.5f)
                verticalLineToRelative(-7.5f)
                curveToRelative(0f, -2.21f, -1.79f, -4f, -4f, -4f)
                reflectiveCurveToRelative(-4f, 1.79f, -4f, 4f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-7f)
                close()
            }
        }.also { _ClipFile = it}
