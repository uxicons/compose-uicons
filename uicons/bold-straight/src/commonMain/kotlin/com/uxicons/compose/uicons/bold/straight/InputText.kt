package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _InputText: ImageVector? = null

val Icons.Bs.InputText: ImageVector
    get() = _InputText ?: UXIcon(name = "InputText") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(8.88f, 7.18f)
                curveToRelative(-1.31f, -0.55f, -2.65f, 0.22f, -2.94f, 1.46f)
                lineToRelative(-1.94f, 8.36f)
                horizontalLineToRelative(2.05f)
                lineToRelative(0.47f, -2.02f)
                horizontalLineToRelative(2.96f)
                lineToRelative(0.47f, 2.02f)
                horizontalLineToRelative(2.05f)
                lineToRelative(-1.92f, -8.29f)
                curveToRelative(-0.15f, -0.66f, -0.57f, -1.27f, -1.2f, -1.53f)
                close()
                moveTo(6.99f, 12.98f)
                lineToRelative(0.9f, -3.89f)
                curveToRelative(0.01f, -0.05f, 0.06f, -0.09f, 0.11f, -0.09f)
                reflectiveCurveToRelative(0.1f, 0.04f, 0.11f, 0.09f)
                lineToRelative(0.9f, 3.89f)
                horizontalLineToRelative(-2.03f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20.5f, 2f)
                lineTo(3.5f, 2f)
                curveToRelative(-1.93f, 0f, -3.5f, 1.57f, -3.5f, 3.5f)
                verticalLineToRelative(16.5f)
                horizontalLineToRelative(24f)
                lineTo(24f, 5.5f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                close()
                moveTo(21f, 19f)
                lineTo(3f, 19f)
                lineTo(3f, 5.5f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(17f)
                curveToRelative(0.28f, 0f, 0.5f, 0.23f, 0.5f, 0.5f)
                verticalLineToRelative(13.5f)
                close()
            }
        }.also { _InputText = it}
