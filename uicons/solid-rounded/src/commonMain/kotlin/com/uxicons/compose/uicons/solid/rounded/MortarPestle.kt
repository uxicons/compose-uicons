package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MortarPestle: ImageVector? = null

val Icons.Sr.MortarPestle: ImageVector
    get() = _MortarPestle ?: UXIcon(name = "MortarPestle") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20f, 23f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                horizontalLineTo(5f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                curveToRelative(0f, -0.28f, -0.3f, -0.73f, -0.64f, -1f)
                horizontalLineToRelative(13.29f)
                curveToRelative(-0.36f, 0.3f, -0.65f, 0.73f, -0.65f, 1f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                close()
                moveTo(3.04f, 18f)
                horizontalLineToRelative(17.93f)
                curveToRelative(1.46f, -1.55f, 2.5f, -3.38f, 2.94f, -5.28f)
                curveToRelative(0.21f, -0.92f, 0.0f, -1.86f, -0.58f, -2.59f)
                curveToRelative(-0.57f, -0.72f, -1.42f, -1.13f, -2.34f, -1.13f)
                horizontalLineTo(3f)
                curveToRelative(-0.92f, 0f, -1.77f, 0.41f, -2.34f, 1.13f)
                curveToRelative(-0.58f, 0.73f, -0.79f, 1.67f, -0.58f, 2.59f)
                curveToRelative(0.44f, 1.89f, 1.48f, 3.72f, 2.96f, 5.28f)
                close()
                moveTo(23.27f, 4.27f)
                lineToRelative(-3.31f, 2.73f)
                horizontalLineToRelative(-5.41f)
                lineTo(19.73f, 0.73f)
                curveToRelative(0.98f, -0.98f, 2.56f, -0.98f, 3.54f, 0f)
                reflectiveCurveToRelative(0.98f, 2.56f, 0f, 3.54f)
                close()
            }
        }.also { _MortarPestle = it}
