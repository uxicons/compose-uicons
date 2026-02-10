package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _InputText: ImageVector? = null

val Icons.Sr.InputText: ImageVector
    get() = _InputText ?: UXIcon(name = "InputText") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(7.19f, 9.1f)
                lineToRelative(0.89f, 3.9f)
                horizontalLineToRelative(-2.04f)
                lineToRelative(0.89f, -3.9f)
                curveToRelative(0.01f, -0.04f, 0.02f, -0.11f, 0.14f, -0.11f)
                reflectiveCurveToRelative(0.12f, 0.06f, 0.14f, 0.11f)
                close()
                moveTo(24f, 8f)
                verticalLineToRelative(8f)
                curveToRelative(0f, 2.76f, -2.24f, 5f, -5f, 5f)
                lineTo(5f, 21f)
                curveToRelative(-2.76f, 0f, -5f, -2.24f, -5f, -5f)
                verticalLineToRelative(-8f)
                curveTo(0f, 5.24f, 2.24f, 3f, 5f, 3f)
                horizontalLineToRelative(14f)
                curveToRelative(2.76f, 0f, 5f, 2.24f, 5f, 5f)
                close()
                moveTo(10.76f, 15.78f)
                lineToRelative(-1.62f, -7.12f)
                curveToRelative(-0.23f, -1.0f, -1.06f, -1.67f, -2.08f, -1.67f)
                reflectiveCurveToRelative(-1.86f, 0.67f, -2.08f, 1.67f)
                lineToRelative(-1.62f, 7.12f)
                curveToRelative(-0.12f, 0.54f, 0.21f, 1.07f, 0.75f, 1.2f)
                curveToRelative(0.54f, 0.13f, 1.07f, -0.21f, 1.2f, -0.75f)
                lineToRelative(0.28f, -1.22f)
                horizontalLineToRelative(2.96f)
                lineToRelative(0.28f, 1.22f)
                curveToRelative(0.1f, 0.46f, 0.52f, 0.78f, 0.97f, 0.78f)
                curveToRelative(0.07f, 0f, 0.15f, -0.01f, 0.22f, -0.03f)
                curveToRelative(0.54f, -0.12f, 0.88f, -0.66f, 0.75f, -1.2f)
                close()
            }
        }.also { _InputText = it}
