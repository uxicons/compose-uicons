package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Pills: ImageVector? = null

val Icons.Bs.Pills: ImageVector
    get() = _Pills ?: UXIcon(name = "Pills") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(17f, 10f)
                curveToRelative(-3.86f, 0f, -7f, 3.14f, -7f, 7f)
                reflectiveCurveToRelative(3.14f, 7f, 7f, 7f)
                reflectiveCurveToRelative(7f, -3.14f, 7f, -7f)
                reflectiveCurveToRelative(-3.14f, -7f, -7f, -7f)
                close()
                moveTo(17f, 13f)
                curveToRelative(0.55f, 0f, 1.08f, 0.11f, 1.56f, 0.32f)
                lineToRelative(-5.24f, 5.24f)
                curveToRelative(-0.2f, -0.48f, -0.32f, -1.01f, -0.32f, -1.56f)
                curveToRelative(0f, -2.21f, 1.79f, -4f, 4f, -4f)
                close()
                moveTo(17f, 21f)
                curveToRelative(-0.55f, 0f, -1.08f, -0.11f, -1.56f, -0.32f)
                lineToRelative(5.24f, -5.24f)
                curveToRelative(0.2f, 0.48f, 0.32f, 1.01f, 0.32f, 1.56f)
                curveToRelative(0f, 2.21f, -1.79f, 4f, -4f, 4f)
                close()
                moveTo(6.5f, 21f)
                curveToRelative(-1.93f, 0f, -3.5f, -1.57f, -3.5f, -3.5f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(5.71f)
                curveToRelative(0.84f, -1.98f, 2.38f, -3.59f, 4.29f, -4.55f)
                verticalLineToRelative(-2.45f)
                curveToRelative(0f, -3.58f, -2.92f, -6.5f, -6.5f, -6.5f)
                reflectiveCurveTo(0f, 2.92f, 0f, 6.5f)
                verticalLineToRelative(11f)
                curveToRelative(0f, 3.58f, 2.92f, 6.5f, 6.5f, 6.5f)
                curveToRelative(1.36f, 0f, 2.63f, -0.42f, 3.68f, -1.15f)
                curveToRelative(-0.66f, -0.76f, -1.18f, -1.64f, -1.56f, -2.59f)
                curveToRelative(-0.59f, 0.46f, -1.32f, 0.74f, -2.12f, 0.74f)
                close()
                moveTo(6.5f, 3f)
                curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
                verticalLineToRelative(4f)
                lineTo(3f, 10.5f)
                verticalLineToRelative(-4f)
                curveToRelative(0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                close()
            }
        }.also { _Pills = it}
