package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DropdownSelect: ImageVector? = null

val Icons.Tr.DropdownSelect: ImageVector
    get() = _DropdownSelect ?: UXIcon(name = "DropdownSelect") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19.5f, 0f)
                lineTo(4.5f, 0f)
                curveTo(2.02f, 0f, 0f, 2.02f, 0f, 4.5f)
                verticalLineToRelative(15f)
                curveToRelative(0f, 2.48f, 2.02f, 4.5f, 4.5f, 4.5f)
                horizontalLineToRelative(15f)
                curveToRelative(2.48f, 0f, 4.5f, -2.02f, 4.5f, -4.5f)
                lineTo(24f, 4.5f)
                curveToRelative(0f, -2.48f, -2.02f, -4.5f, -4.5f, -4.5f)
                close()
                moveTo(23f, 19.5f)
                curveToRelative(0f, 1.93f, -1.57f, 3.5f, -3.5f, 3.5f)
                lineTo(4.5f, 23f)
                curveToRelative(-1.93f, 0f, -3.5f, -1.57f, -3.5f, -3.5f)
                lineTo(1f, 4.5f)
                curveToRelative(0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                horizontalLineToRelative(15f)
                curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
                verticalLineToRelative(15f)
                close()
                moveTo(15.99f, 9f)
                horizontalLineToRelative(-7.98f)
                curveToRelative(-0.66f, 0f, -1.22f, 0.38f, -1.47f, 0.98f)
                curveToRelative(-0.25f, 0.6f, -0.12f, 1.27f, 0.34f, 1.73f)
                lineToRelative(3.7f, 3.7f)
                curveToRelative(0.39f, 0.39f, 0.9f, 0.58f, 1.41f, 0.58f)
                reflectiveCurveToRelative(1.02f, -0.2f, 1.41f, -0.58f)
                lineToRelative(3.7f, -3.7f)
                curveToRelative(0.46f, -0.46f, 0.6f, -1.13f, 0.34f, -1.73f)
                curveToRelative(-0.25f, -0.6f, -0.81f, -0.98f, -1.47f, -0.98f)
                close()
                moveTo(16.41f, 11.01f)
                lineToRelative(-3.7f, 3.7f)
                curveToRelative(-0.39f, 0.39f, -1.02f, 0.39f, -1.41f, 0f)
                lineToRelative(-3.7f, -3.7f)
                curveToRelative(-0.26f, -0.26f, -0.16f, -0.56f, -0.13f, -0.64f)
                curveToRelative(0.04f, -0.09f, 0.18f, -0.36f, 0.55f, -0.36f)
                horizontalLineToRelative(7.98f)
                curveToRelative(0.37f, 0f, 0.51f, 0.28f, 0.55f, 0.36f)
                curveToRelative(0.04f, 0.09f, 0.13f, 0.38f, -0.13f, 0.64f)
                close()
            }
        }.also { _DropdownSelect = it}
