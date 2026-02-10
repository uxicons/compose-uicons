package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ShirtTankTop: ImageVector? = null

val Icons.Tr.ShirtTankTop: ImageVector
    get() = _ShirtTankTop ?: UXIcon(name = "ShirtTankTop") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19.56f, 8.33f)
                curveToRelative(-0.99f, -0.8f, -1.56f, -2.06f, -1.56f, -3.47f)
                lineTo(18f, 0.5f)
                curveToRelative(0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f)
                reflectiveCurveToRelative(-0.5f, 0.22f, -0.5f, 0.5f)
                verticalLineToRelative(2.5f)
                curveToRelative(0f, 2.76f, -2.24f, 5f, -5f, 5f)
                reflectiveCurveToRelative(-5f, -2.24f, -5f, -5f)
                lineTo(7f, 0.46f)
                curveToRelative(0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f)
                reflectiveCurveToRelative(-0.5f, 0.22f, -0.5f, 0.5f)
                verticalLineToRelative(4.39f)
                curveToRelative(0f, 1.41f, -0.57f, 2.68f, -1.56f, 3.47f)
                curveToRelative(-0.91f, 0.73f, -1.44f, 1.76f, -1.44f, 2.83f)
                verticalLineToRelative(8.35f)
                curveToRelative(0f, 2.48f, 2.02f, 4.5f, 4.5f, 4.5f)
                horizontalLineToRelative(9f)
                curveToRelative(2.48f, 0f, 4.5f, -2.02f, 4.5f, -4.5f)
                verticalLineToRelative(-8.35f)
                curveToRelative(0f, -1.06f, -0.52f, -2.09f, -1.44f, -2.83f)
                close()
                moveTo(20f, 19.5f)
                curveToRelative(0f, 1.93f, -1.57f, 3.5f, -3.5f, 3.5f)
                lineTo(7.5f, 23f)
                curveToRelative(-1.93f, 0f, -3.5f, -1.57f, -3.5f, -3.5f)
                verticalLineToRelative(-8.35f)
                curveToRelative(0f, -0.76f, 0.39f, -1.5f, 1.06f, -2.04f)
                curveToRelative(0.92f, -0.74f, 1.55f, -1.79f, 1.8f, -3f)
                curveToRelative(1.05f, 1.73f, 2.96f, 2.89f, 5.13f, 2.89f)
                reflectiveCurveToRelative(4.08f, -1.16f, 5.13f, -2.89f)
                curveToRelative(0.26f, 1.21f, 0.88f, 2.26f, 1.8f, 3f)
                curveToRelative(0.68f, 0.54f, 1.06f, 1.29f, 1.06f, 2.05f)
                verticalLineToRelative(8.35f)
                close()
            }
        }.also { _ShirtTankTop = it}
