package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MortarPestle: ImageVector? = null

val Icons.Bs.MortarPestle: ImageVector
    get() = _MortarPestle ?: UXIcon(name = "MortarPestle") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.27f, 4.27f)
                curveToRelative(0.98f, -0.98f, 0.98f, -2.56f, 0f, -3.54f)
                reflectiveCurveToRelative(-2.56f, -0.98f, -3.54f, 0f)
                lineToRelative(-6.0f, 7.27f)
                lineTo(0f, 8f)
                verticalLineToRelative(1.5f)
                curveToRelative(0f, 3.83f, 1.82f, 7.22f, 5.14f, 9.55f)
                curveToRelative(0f, 0f, 0.86f, 0.47f, 0.86f, 0.95f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(14f)
                verticalLineToRelative(-3f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                curveToRelative(0f, -0.49f, 0.86f, -0.95f, 0.86f, -0.95f)
                curveToRelative(3.31f, -2.33f, 5.14f, -5.72f, 5.14f, -9.55f)
                verticalLineToRelative(-1.5f)
                horizontalLineToRelative(-5.25f)
                lineToRelative(4.52f, -3.73f)
                close()
                moveTo(17.19f, 16.56f)
                curveToRelative(-1.27f, 0.75f, -1.82f, 1.67f, -2.04f, 2.44f)
                horizontalLineToRelative(-6.29f)
                curveToRelative(-0.23f, -0.77f, -0.78f, -1.69f, -2.04f, -2.44f)
                curveToRelative(-2.01f, -1.43f, -3.28f, -3.37f, -3.68f, -5.56f)
                horizontalLineToRelative(17.73f)
                curveToRelative(-0.4f, 2.19f, -1.67f, 4.13f, -3.68f, 5.56f)
                close()
            }
        }.also { _MortarPestle = it}
