package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _InputText: ImageVector? = null

val Icons.Tr.InputText: ImageVector
    get() = _InputText ?: UXIcon(name = "InputText") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19.5f, 3f)
                lineTo(4.5f, 3f)
                curveTo(2.02f, 3f, 0f, 5.02f, 0f, 7.5f)
                verticalLineToRelative(9f)
                curveToRelative(0f, 2.48f, 2.02f, 4.5f, 4.5f, 4.5f)
                horizontalLineToRelative(15f)
                curveToRelative(2.48f, 0f, 4.5f, -2.02f, 4.5f, -4.5f)
                lineTo(24f, 7.5f)
                curveToRelative(0f, -2.48f, -2.02f, -4.5f, -4.5f, -4.5f)
                close()
                moveTo(23f, 16.5f)
                curveToRelative(0f, 1.93f, -1.57f, 3.5f, -3.5f, 3.5f)
                lineTo(4.5f, 20f)
                curveToRelative(-1.93f, 0f, -3.5f, -1.57f, -3.5f, -3.5f)
                lineTo(1f, 7.5f)
                curveToRelative(0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                horizontalLineToRelative(15f)
                curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
                verticalLineToRelative(9f)
                close()
                moveTo(9.15f, 8.27f)
                curveToRelative(-0.17f, -0.76f, -0.81f, -1.27f, -1.6f, -1.27f)
                reflectiveCurveToRelative(-1.42f, 0.51f, -1.6f, 1.27f)
                lineToRelative(-1.94f, 8.11f)
                curveToRelative(-0.06f, 0.27f, 0.1f, 0.54f, 0.37f, 0.6f)
                curveToRelative(0.04f, 0.01f, 0.08f, 0.01f, 0.12f, 0.01f)
                curveToRelative(0.23f, 0f, 0.43f, -0.15f, 0.49f, -0.38f)
                lineToRelative(0.62f, -2.61f)
                horizontalLineToRelative(3.81f)
                lineToRelative(0.59f, 2.6f)
                curveToRelative(0.06f, 0.27f, 0.33f, 0.44f, 0.6f, 0.38f)
                curveToRelative(0.27f, -0.06f, 0.44f, -0.33f, 0.38f, -0.6f)
                lineToRelative(-1.84f, -8.12f)
                close()
                moveTo(5.85f, 13.01f)
                lineToRelative(1.08f, -4.51f)
                curveToRelative(0.08f, -0.37f, 0.38f, -0.5f, 0.62f, -0.5f)
                reflectiveCurveToRelative(0.54f, 0.13f, 0.62f, 0.5f)
                lineToRelative(1.02f, 4.51f)
                horizontalLineToRelative(-3.35f)
                close()
            }
        }.also { _InputText = it}
