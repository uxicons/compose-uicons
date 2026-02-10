package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _InputText: ImageVector? = null

val Icons.Ss.InputText: ImageVector
    get() = _InputText ?: UXIcon(name = "InputText") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(8f, 9f)
                curveToRelative(-0.05f, 0f, -0.1f, 0.04f, -0.11f, 0.09f)
                lineToRelative(-0.91f, 3.91f)
                horizontalLineToRelative(2.04f)
                lineToRelative(-0.91f, -3.91f)
                curveToRelative(-0.01f, -0.05f, -0.06f, -0.09f, -0.11f, -0.09f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21f, 3f)
                lineTo(3f, 3f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(15f)
                horizontalLineToRelative(24f)
                lineTo(24f, 6f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                close()
                moveTo(9.95f, 17f)
                lineToRelative(-0.46f, -2f)
                horizontalLineToRelative(-2.97f)
                lineToRelative(-0.46f, 2f)
                horizontalLineToRelative(-2.05f)
                lineToRelative(1.94f, -8.36f)
                curveToRelative(0.29f, -1.24f, 1.62f, -2.01f, 2.94f, -1.46f)
                curveToRelative(0.63f, 0.26f, 1.05f, 0.87f, 1.2f, 1.53f)
                lineToRelative(1.92f, 8.29f)
                horizontalLineToRelative(-2.05f)
                close()
            }
        }.also { _InputText = it}
