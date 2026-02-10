package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _InputText: ImageVector? = null

val Icons.Ts.InputText: ImageVector
    get() = _InputText ?: UXIcon(name = "InputText") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21.5f, 3f)
                lineTo(2.5f, 3f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                verticalLineToRelative(15.5f)
                horizontalLineToRelative(24f)
                lineTo(24f, 5.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                close()
                moveTo(23f, 20f)
                lineTo(1f, 20f)
                lineTo(1f, 5.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(19f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(14.5f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(7f, 7f)
                curveToRelative(-0.55f, 0f, -1.03f, 0.39f, -1.22f, 0.99f)
                lineToRelative(-2.78f, 9.02f)
                horizontalLineToRelative(1.05f)
                lineToRelative(0.95f, -3.09f)
                verticalLineToRelative(0.08f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-0.08f)
                lineToRelative(0.95f, 3.09f)
                horizontalLineToRelative(1.05f)
                lineToRelative(-2.78f, -9.02f)
                curveToRelative(-0.19f, -0.6f, -0.67f, -0.99f, -1.22f, -0.99f)
                close()
                moveTo(5.29f, 13f)
                lineToRelative(1.45f, -4.71f)
                curveToRelative(0.04f, -0.14f, 0.14f, -0.29f, 0.26f, -0.29f)
                reflectiveCurveToRelative(0.22f, 0.15f, 0.26f, 0.29f)
                lineToRelative(1.45f, 4.71f)
                horizontalLineToRelative(-3.43f)
                close()
            }
        }.also { _InputText = it}
