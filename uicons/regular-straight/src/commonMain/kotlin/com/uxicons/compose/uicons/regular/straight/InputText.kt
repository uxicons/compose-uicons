package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _InputText: ImageVector? = null

val Icons.Rs.InputText: ImageVector
    get() = _InputText ?: UXIcon(name = "InputText") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(8.88f, 7.18f)
                curveToRelative(-1.31f, -0.55f, -2.65f, 0.22f, -2.94f, 1.46f)
                lineToRelative(-1.94f, 8.36f)
                horizontalLineToRelative(2.05f)
                lineToRelative(0.46f, -2f)
                horizontalLineToRelative(2.97f)
                lineToRelative(0.46f, 2f)
                horizontalLineToRelative(2.05f)
                lineToRelative(-1.92f, -8.29f)
                curveToRelative(-0.15f, -0.66f, -0.57f, -1.27f, -1.2f, -1.53f)
                close()
                moveTo(6.98f, 13f)
                lineToRelative(0.91f, -3.91f)
                curveToRelative(0.01f, -0.05f, 0.06f, -0.09f, 0.11f, -0.09f)
                reflectiveCurveToRelative(0.1f, 0.04f, 0.11f, 0.09f)
                lineToRelative(0.91f, 3.91f)
                horizontalLineToRelative(-2.04f)
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
                moveTo(22f, 19f)
                lineTo(2f, 19f)
                lineTo(2f, 6f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(18f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                verticalLineToRelative(13f)
                close()
            }
        }.also { _InputText = it}
